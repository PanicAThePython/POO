public class Estudante extends Passageiro{

	private String escola;

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public Estudante(String n, String t, int i, String escola) {
		super(n, t, i);
		this.escola = escola;
	}
	
	@Override
	public float getTarifaInteira() {
		super.setTarifaInteira(super.getTarifaInteira()/2);
		return super.getTarifaInteira();
	}
}
