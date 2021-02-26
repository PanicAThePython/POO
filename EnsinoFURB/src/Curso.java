import java.io.Serializable;

public class Curso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8074432783428099141L;
	private String sigla;
	private String nome;
	
	public Curso(String sigla, String nome) {
		this.setSigla(sigla);
		this.setNome(nome);
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		if (sigla.isEmpty() || sigla.length()!=3) {
			throw new IllegalArgumentException("Sigla vazia");
		}
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isEmpty()) {
			throw new IllegalArgumentException("Nome vazio");
		}
		this.nome = nome;
	}
	
	
}
