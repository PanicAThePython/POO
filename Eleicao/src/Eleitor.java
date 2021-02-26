public class Eleitor {

	private String nome;
	private int idade;
	private char sexo;
	private String secaoEleitorial;
	private int codTitulo;
	private boolean obrigatoriedade;
	private Votacao v;
	private Candidato candidato;
	
	public Eleitor(String nome, int idade, char sexo, String se, int cod) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setSecaoEleitorial(se);
		this.setCodTitulo(cod);
	}

	public void votar(String cargo) {
		v.setCargo(cargo);
		v.addVoto(this.getCodTitulo(), candidato.getPartido());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if ((idade > 15 && idade < 18)||(idade >=60)) {
			this.idade = idade;
			this.setObrigatoriedade(false);
		}
		else if (idade >= 18 && idade < 60) {
			this.idade = idade;
			this.setObrigatoriedade(true);
		}
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		if (sexo == 'M' || sexo == 'F') {
			this.sexo = sexo;
		}
	}

	public String getSecaoEleitorial() {
		return secaoEleitorial;
	}
	public void setSecaoEleitorial(String secaoEleitorial) {
		this.secaoEleitorial = secaoEleitorial;
	}

	public int getCodTitulo() {
		return codTitulo;
	}
	public void setCodTitulo(int codTitulo) {
		this.codTitulo = codTitulo;
	}

	public boolean isObrigatoriedade() {
		return obrigatoriedade;
	}
	private void setObrigatoriedade(boolean obrigatoriedade) {
		this.obrigatoriedade = obrigatoriedade;
	}
	
}

