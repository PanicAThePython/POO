import java.util.ArrayList;

public class Partido {

	private String nome;
	private int numero;
	private ArrayList <Vereador> vereadores = new ArrayList<>();
	
	public int getTamanhoLista() {
		return this.vereadores.size();
	}
	public Vereador getVereador(int index) {
		return this.vereadores.get(index);
	}
	
	public void addVereador(Vereador v) {
		vereadores.add(v);
		v.setPartido(this);
	}
	
	public int getTotProjApres() {
		int tot = 0;
		for (int i = 0; i < vereadores.size(); i++) {
			tot+=vereadores.get(i).getQtdProjApres();
		}
		return tot;
	}
	
	public int getTotProjAprov() {
		int tot = 0;
		for (int i = 0; i < vereadores.size(); i++) {
			tot+=vereadores.get(i).getQtdProjAprov();
		}
		return tot;
	}
	
	public double getMediaDesempenho() {
		int totMedia = 0;
		for (int i = 0; i < vereadores.size(); i++) {
			totMedia+=vereadores.get(i).getDesempenho();
		}
		return totMedia/vereadores.size();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
