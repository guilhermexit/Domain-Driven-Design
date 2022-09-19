package ddd;

public class TV {
	private int tamanho;
	private int canal;
	private int volume;
	private boolean ligado;
	
	public TV(int t){
		tamanho = t;
		canal = 0;
		volume = 0;
		ligado = false;
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
}
