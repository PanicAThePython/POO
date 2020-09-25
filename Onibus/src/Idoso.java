public class Idoso extends Passageiro{

	private String rg;
	
	public Idoso(String rg, String nome, String telefone, int idade) {
		super(nome, telefone, idade);
		this.setRg(rg);
	}

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public float getTarifaInteira() {
		return 0;
	}
	
	@Override
	public void setIdade(int i) {
		if (i> 59) {
			super.setIdade(i);
		}
	}
}
