import java.util.ArrayList;

public class Empresa {

	private ArrayList<Vendedor> vendedores = new ArrayList<>();
	
	public void addVendedor(Vendedor v) {
		vendedores.add(v);
	}
	
	public Vendedor getVendMenorKm() {
		float menor = 0;
		Vendedor vend = null;
		for(Vendedor v: vendedores) {
			if (menor == 0 || menor > v.getViagemMenorKm().getQuilometragem()) {
				menor = v.getViagemMenorKm().getQuilometragem();
				vend = v;
			}
		}
		return vend;
	}
	
	public Vendedor getVendMaiorValReceber() {
		float maior = 0;
		Vendedor vend = null;
		for(Vendedor v: vendedores) {
			if (maior == 0 || maior < v.getValAReceber()) {
				maior = v.getValAReceber();
				vend = v;
			}
		}
		return vend;
	}
	
	public Vendedor getVendMaiorValVendas() {
		float maior = 0;
		Vendedor vend = null;
		for(Vendedor v: vendedores) {
			if (maior == 0 || maior < v.getTotVendas()) {
				maior = v.getTotVendas();
				vend = v;
			}
		}
		return vend;
	}
	
}
