
public abstract class Avaliacao {

	protected String descricao;
	
	public Avaliacao(String desc) {
		this.setDescricao(desc);
	}
	
	public abstract float getNota();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
