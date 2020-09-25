import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda {

	private ArrayList <DataAgenda> datas = new ArrayList<>();	
	private DataAgenda data;
	
	public DataAgenda getData() {
		return this.data;
	}
	
	public Compromisso getMenorCompromisso() {
		int menorTempo = 100;
		Compromisso menorComp = new Compromisso();
		for(int i = 0; i < datas.size(); i++) {
			if(menorTempo > datas.get(i).getLista().get(i).getTempo()) {
				menorTempo = datas.get(i).getLista().get(i).getTempo();
				menorComp = datas.get(i).getLista().get(i);
			}
		}
		return menorComp;
	}
	
	public boolean addDataAgenda(DataAgenda d) {
		for (int i = 0; i<datas.size(); i++) {
			if(d.getData().equals(datas.get(i).getData())) {
				return false;
			}
		}
		datas.add(d);
		return true;
	}
	
	public boolean buscarData(LocalDate d) {
		for (int i = 0; i < datas.size(); i++) {
			if(datas.get(i).getData() == d) {
				data = datas.get(i);
				return true;
			}
		}
		return false;
	}
}
