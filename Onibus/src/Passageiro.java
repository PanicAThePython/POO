public class Passageiro {

	private String nome;
	private String telefone;
	private int idade;
	private float tarifaInteira;
	
	public Passageiro(String n, String t, int i) {
		this.setIdade(i);
		this.setNome(n);
		this.setTelefone(t);
		this.setTarifaInteira(5);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;	
	}
	public float getTarifaInteira() {
		return tarifaInteira;
	}
	public void setTarifaInteira(float tarifaInteira) {
		this.tarifaInteira = tarifaInteira;
	}
	
	
}
