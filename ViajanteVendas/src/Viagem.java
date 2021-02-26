public class Viagem {

	private float quilometragem;
	private int qtdDias;
	private float valVendas;
	
	public Viagem(float km, int d, float v) {
		this.setQtdDias(d);
		this.setQuilometragem(km);
		this.setValVendas(v);
	}
	
	public float getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(float quilometragem) {
		if (quilometragem > -1) {
			this.quilometragem = quilometragem;
		}
	}
	public int getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(int qtdDias) {
		if (qtdDias > 0) {
			this.qtdDias = qtdDias;
		}
	}
	public float getValVendas() {
		return valVendas;
	}
	public void setValVendas(float valVendas) {
		if (valVendas > -1) {
			this.valVendas = valVendas;
		}
	}	
}
