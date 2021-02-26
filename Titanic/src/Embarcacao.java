
public abstract class Embarcacao implements AtivoEmRisco{

	private String registroCapitania;
	private int qtdPessoas;
	
	public Embarcacao(String rc, int qtd) {
		this.setRegistroCapitania(rc);
		this.setQtdPessoas(qtd);
	}
	
	public String getRegistroCapitania() {
		return registroCapitania;
	}
	public void setRegistroCapitania(String registroCapitania) {
		this.registroCapitania = registroCapitania;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	public abstract String verificaSeguranca();
}
