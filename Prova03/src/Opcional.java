import java.io.Serializable;

public class Opcional implements Serializable{

	private String descricao;
	private float valor;
	
	public Opcional(String descricao, float valor) {
		this.setDescricao(descricao);
		this.setValor(valor);
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao.isEmpty() || descricao==null) {
			throw new IllegalArgumentException("Descrção vazia");
		}
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		if (valor> 0 ) {
			this.valor = valor;
		}
		else {
			throw new IllegalArgumentException("Valor inválido!");
		}
	}
}
