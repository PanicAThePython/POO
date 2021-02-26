
public class Avaliacao {

	private int qtdPagantes;
	private String opiniaoGeral;
	
	public Avaliacao(int qtd, String opi) {
		this.setQtdPagantes(qtd);
		this.setOpiniaoGeral(opi);
	}
	
	public int getQtdPagantes() {
		return qtdPagantes;
	}
	public void setQtdPagantes(int qtdPagantes) {
		if (qtdPagantes > -1) {
			this.qtdPagantes = qtdPagantes;
		}
		throw new IllegalArgumentException("Número de pagantes inválido.");
	}
	public String getOpiniaoGeral() {
		return opiniaoGeral;
	}
	public void setOpiniaoGeral(String opiniaoGeral) {
		if (opiniaoGeral.isEmpty()) {
			throw new IllegalArgumentException("Opiniao vazia.");
		}
		this.opiniaoGeral = opiniaoGeral;
	}
	
	
}
