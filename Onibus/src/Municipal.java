import java.time.LocalDate;
import java.time.LocalTime;

public class Municipal extends Viagem{
	
	private int qtdPassageiros = 0;
	private int qtdMax = 55;

	public Municipal(String p, String m, LocalDate d, LocalTime h) {
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
	
	public int getQtdPassageiros() {
		return this.qtdPassageiros;
	}
	
	public int getQtdMax() {
		return qtdMax;
	}
}
