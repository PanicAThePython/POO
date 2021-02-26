
public class Pessoa {

	protected String nome;
	protected int idade;
	protected char sexo;
	protected int experiencia;
	
	public Pessoa(String nome, int idade, char sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.experiencia = 0;
	}
	
	protected void ganharExperiencia() {
		this.experiencia++;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			throw new IllegalArgumentException("Nome vazio");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 0 ) {
			throw new IllegalArgumentException("Idade inválida");
		}
		this.idade = idade;
	}
	
	public int getExperiencia() {
		return this.experiencia;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'F' || sexo=='M') {
			this.sexo = sexo;
		}
		else {
			throw new IllegalArgumentException("Sexo inválido");
		}
	}
	
	
}
