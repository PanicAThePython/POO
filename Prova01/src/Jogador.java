
public class Jogador {

	private String nome;
	private String posicao;
	private float altura;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		}
	}
	
	
}
