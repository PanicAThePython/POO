
public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssistido;

	public Gafanhoto(String nome, int idade, char sexo, String login) {
		super(nome, idade, sexo);

	}
	public void verMaisUm() {
		this.totAssistido++;
	}
	
	public int getTotAssistido() {
		return totAssistido;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	
}
