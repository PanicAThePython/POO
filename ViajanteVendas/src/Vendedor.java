import java.util.ArrayList;

public class Vendedor {

	private String nome;
	private ArrayList<Viagem> viagens = new ArrayList<>();
	
	public Vendedor(String n) {
		this.setNome(n);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addViagem(Viagem v) {
		viagens.add(v);
	}
	
	public float getTotVendas() {
		float tot = 0;
		for(Viagem v: viagens) {
			tot+=v.getValVendas();
		}
		return tot;
	}
	
	public float getTotKm() {
		float soma = 0;
		for(Viagem v: viagens) {
			soma+=v.getQuilometragem();
		}
		return soma;
	}
	
	public float getValAReceber() {
		float totKm = getTotKm();
		if (totKm < 801) {
			return totKm * 0.8f;
		}
		else if (totKm < 1601) {
			return totKm * 0.78f;
		}
		else {
			return totKm * 0.75f;
		}
	}
	
	public Viagem getViagemMenorKm() {
		float km = 0;
		Viagem viagem = null;
		for(Viagem v: viagens) {
			if(km == 0 || km > v.getQuilometragem()) {
				viagem = v;
			}
		}
		return viagem;
	}
}
