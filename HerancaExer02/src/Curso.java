
public class Curso {

	private String nome;
	private String sigla;
	
	public Curso(String nome, String sigla) {
		this.setNome(nome);
		this.setSigla(sigla);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
