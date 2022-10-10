package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

public class GerenciadorClientes {
	private String connString = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private Connection conn;
	
	public GerenciadorClientes() throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL(connString);
		ods.setUser("rm93150");
		ods.setPassword("250604");
		
		conn = ods.getConnection();
		
	}
	public void inserir(Cliente c) throws SQLException {
		String sql = "INSERT INTO clientes(first_name, last_name) VALUES(?, ?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getNome());
			ps.setString(2, c.getSobrenome());
			ps.execute();
		}catch(SQLException e) {
			if(conn != null) {
				System.out.println("Erro na transação." + e.getStackTrace());
			}
		}finally {
			conn.close();
		}
}
		public List<Cliente> listar() throws SQLException{
			List<Cliente>  clientes = new ArrayList<Cliente>();
			
			String sql = "SELECT * FROM clientes";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(0);
				String nome = rs.getString(1);
				String sobrenome = rs.getString(2);
				
				clientes.add(new Cliente(id, nome, sobrenome));
				
			}
			return clientes;
		}
		public void excluir(int id) throws SQLException{
			String sql = "DELETE FROM clientes WHERE id = ?";
			
		 try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();		
			
		}catch(Exception e) {
			if(conn != null) {
				System.err.println("Erro na transação!" + e.getStackTrace());
				}
			}finally {
				conn.close();
			}
		}
		

public void atualizar(Cliente c) throws SQLException {
	String sql = "UPTADE clientes SET first_name - ?, last_name = ? WHERE id = ?";
	
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, c.getNome());
	ps.setString(2, c.getSobrenome());
	ps.setInt(3, c.getId());
	
	ps.execute();
	}

}











