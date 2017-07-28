package pizza;

public class Massa {
	char tamanho;
	char tipo_Massa;
	boolean borda;
	
	public char getTamanho() {
		return tamanho;
	}
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	public char getTipo_Massa() {
		return tipo_Massa;
	}
	public void setTipo_Massa(char tipo_Massa) {
		this.tipo_Massa = tipo_Massa;
	}
	public boolean isBorda() {
		return borda;
	}
	public void setBorda(boolean borda) {
		this.borda = borda;
	}
	
	public Massa(char tamanho, char tipo_Massa, boolean borda) {
		super();
		this.tamanho = tamanho;
		this.tipo_Massa = tipo_Massa;
		this.borda = borda;
	}
	
	public void selecionaMassa() {
		
	}
	
	
}
