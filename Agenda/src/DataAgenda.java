import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.HashMap;

public class DataAgenda {

	private LocalDate data;
	private String efemeridade;
	//private HashMap <LocalDate, Compromisso> compromisso = new HashMap<>();
	private ArrayList <Compromisso> lista = new ArrayList<>();
	
	public DataAgenda(LocalDate data, String ef) {
		this.setData(data);
		this.setEfemeridade(ef);
	}
	
	public boolean addCompromisso( Compromisso c) {
		for (int i = 0; i < lista.size(); i++) {
			if (c.getHora().equals(lista.get(i).getHora())) {
				return false;
			}
		}
		lista.add(c);
		return true;
	}
	
	public int getTempoMedio() {
		int tempoSomado = 0;
		for (int i = 0; i < lista.size(); i++) {
			tempoSomado+= lista.get(i).getTempo();
		}
		int resultado = tempoSomado/lista.size();
		return resultado;
	}
	
	public ArrayList<Compromisso> getCompromissosPrioridade(char priori) {
		ArrayList <Compromisso> listaPriori = new ArrayList<>();
		
		for (int i = 0; i < lista.size(); i ++) {
			if (lista.get(i).getPrioridade() == priori) {
				listaPriori.add(lista.get(i));
			}
		}
		return listaPriori;
	}
	
	public int getQtdCompromissosPrioridade(char priori) {
		ArrayList <Compromisso> listaPriori = this.getCompromissosPrioridade(priori);
		return listaPriori.size();
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getEfemeridade() {
		return efemeridade;
	}
	public void setEfemeridade(String efemeridade) {
		this.efemeridade = efemeridade;
	}
	
	public ArrayList <Compromisso> getLista() {
		return this.lista;
	}
}
