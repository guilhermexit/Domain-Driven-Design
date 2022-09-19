package ddd;

public class ModeloTV001 extends TV implements ControleRemoto {
	
	private final String MODELO = "TV001";
	
	public ModeloTV001(int tamanho) {
		super(tamanho);
}
	public void ligar() {
		this.setLigado(true);
	}
	public void desligar() {
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
