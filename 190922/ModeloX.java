package ddd;

public class ModeloX extends TV implements ControleRemoto {
	private final String MODELO = "TV-X";
	
	public ModeloX(int tamanho) {
		super(tamanho);
}
	public void ligar() {
		this.setLigado(true);
}
	public void desligar() {
		System.out.println("Obrigado por utilizar!");
		this.setLigado(false);
}
	public void aumentarVolume(int vol) {
		this.setVolume(vol);
	}
	public void diminuirVolume(int vol) {
		this.setVolume(vol);
	}
	public void mudarCanal(int canal) {
		this.setCanal(canal);
	}
	
}
	

