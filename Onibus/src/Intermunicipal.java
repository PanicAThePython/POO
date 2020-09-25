import java.time.LocalDate;
import java.time.LocalTime;

public class Intermunicipal extends Viagem{

	private int qtdPassageiros = 0;
	private int qtdMax = 20;
	
	public Intermunicipal(String p, String m, LocalDate d, LocalTime h) {
		super(p, m, d, h);
	}

	@Override
	public boolean addPassageiro(Passageiro p) {
		if (qtdPassageiros < qtdMax + 1) {
			super.addPassageiro(p);
			qtdPassageiros++;
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public float getValorTotal() {
		float valTot = 0;
		for (int i = 0; i < super.getLista().size(); i++) {
			valTot+= super.getLista().get(i).getTarifaInteira() + 3.15f;
		}
		return valTot;
	}
	
	public int getQtdPassageiros() {
		return this.qtdPassageiros;
	}

	public int getQtdMax() {
		return qtdMax;
	}
	
	
}
