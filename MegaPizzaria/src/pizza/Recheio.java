package pizza;

public abstract class Recheio {
	String tipo;
	int qtd;
	float preco;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Recheio(String tipo, int qtd, float preco) {
		super();
		this.tipo = tipo;
		this.qtd = qtd;
		this.preco = preco;
	}
	
}
