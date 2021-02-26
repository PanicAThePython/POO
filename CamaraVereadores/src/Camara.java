import java.util.ArrayList;

public class Camara {

	private String municipio;
	private ArrayList <Partido> partidos = new ArrayList<>();
	
	public Partido getPartido(int p) {
		for (Partido partido:partidos) {
			if (partido.getNumero() == p) {
				return partido;
			}
		}
		return null;
	}
	
	public Camara(String m) {
		this.setMunicipio(m);
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public void addPartido(Partido p) {
		partidos.add(p);
	}
	
	public int getTotProjApres() {
		int totProj = 0;
		for (Partido p: partidos) {
			totProj+= p.getTotProjApres();
		}
		return totProj;
	}
	
	public int getTotProjAprov() {
		int totProj = 0;
		for (Partido p: partidos) {
			totProj+= p.getTotProjAprov();
		}
		return totProj;
	}
	
	public Vereador getVereadorMenorDesempenho() {
		Vereador vereador = null;
		double desemp = 0;
		for(int i = 0; i < partidos.size(); i++) {
			for (int j = 0; j < partidos.get(i).getTamanhoLista(); j++) {
				if (desemp == 0 || desemp > partidos.get(i).getVereador(j).getDesempenho()) {
					desemp = partidos.get(i).getVereador(j).getDesempenho();
					vereador = partidos.get(i).getVereador(j);
				}
			}
		}
		return vereador;
	}
	
	public Vereador getVereadorMaisProjAprov() {
		Vereador vereador = null;
		int qtd = 0;
		for(int i = 0; i < partidos.size(); i++) {
			for (int j = 0; j < partidos.get(i).getTamanhoLista(); j++) {
				if (qtd == 0 || qtd > partidos.get(i).getVereador(j).getQtdProjAprov()) {
					qtd = partidos.get(i).getVereador(j).getQtdProjAprov();
					vereador = partidos.get(i).getVereador(j);
				}
			}
		}
		return vereador;
	}
	
	public double getDesempenhoMedioCamara() {
		double desemp = 0;
		int qtd = 0;
		for(int i = 0; i < partidos.size(); i++) {
			for (int j = 0; j < partidos.get(i).getTamanhoLista(); j++) {
				desemp += partidos.get(i).getVereador(j).getDesempenho();
				qtd++;
			}
		}
		return desemp/qtd;
	}
	
	public ArrayList <Vereador> getVereadoresAcimaMediaDesempenho() {
		ArrayList <Vereador> vs = new ArrayList<>();
		double desemp = getDesempenhoMedioCamara();
		for(int i = 0; i < partidos.size(); i++) {
			for (int j = 0; j < partidos.get(i).getTamanhoLista(); j++) {
				if (desemp < partidos.get(i).getVereador(j).getDesempenho()) {
					vs.add(partidos.get(i).getVereador(j));
				}
			}
		}
		return vs;
	}
}

