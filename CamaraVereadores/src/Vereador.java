
public class Vereador {

	private String nome;
	private int qtdProjApres;
	private int qtdProjAprov;
	private Partido partido;
	
	public Vereador(String n) {
		this.setNome(n);
	}
	
	public double getDesempenho() {
		if (qtdProjApres>0) {
			int desemp = qtdProjApres/qtdProjAprov;
			if (qtdProjApres < 6) {
				return desemp*0.8;
			}
			else if (qtdProjApres < 11) {
				return desemp*1;
			}
			else if (qtdProjApres < 18) {
				return desemp*1.08;
			}
			else {
				return desemp*1.22;
			}
		}
		else {
			return 0;
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdProjApres() {
		return qtdProjApres;
	}
	public void setQtdProjApres(int qtdProjApres) {
		if (qtdProjApres > -1) {
			this.qtdProjApres = qtdProjApres;
		}
		throw new IllegalArgumentException("Número de projetos apresentados inválido!");
	}
	
	public int getQtdProjAprov() {
		return qtdProjAprov;
	}
	public void setQtdProjAprov(int qtdProjAprov) {
		if (qtdProjAprov > -1) {
			this.qtdProjAprov = qtdProjAprov;
		}
		throw new IllegalArgumentException("Número de projetos aprovados inválido!");
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	
}
