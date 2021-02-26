import java.time.LocalDate;

public class ShowMusical extends Evento{
	
	private String nomeBanda;
	private String estiloMusical;
	
	public String getNomeBanda() {
		return nomeBanda;
	}
	public void setNomeBanda(String nomeBanda) {
		if (nomeBanda.isEmpty()) {
			throw new IllegalArgumentException("Nome de banda vazio.");
		}
		this.nomeBanda = nomeBanda;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		if (estiloMusical.isEmpty()) {
			throw new IllegalArgumentException("Estilo musical vazio.");
		}
		this.estiloMusical = estiloMusical;
	}

	public ShowMusical(String t, double v, LocalDate d, String nome, String estilo) {
		super(t, v, d);
		this.setNomeBanda(nome);
		this.setEstiloMusical(estilo);
	}

	@Override
	public String exibir() {
		if (this.getAval()!=null) {
			return this.getClass().getName()+": "+ this.getTitulo()+" de "+this.getEstiloMusical()+" de "+this.getNomeBanda()+
					" com ingressos a "+this.getValor()+", dia "+this.getData()+". Teve "+ this.getAval().getQtdPagantes()+
					" pagantes que acharam o evento "+this.getAval().getOpiniaoGeral();
		}else {
			return this.getClass().getName()+": "+ this.getTitulo()+" de "+this.getEstiloMusical()+" de "+this.getNomeBanda()+
					" com ingressos a "+this.getValor()+", dia "+this.getData()+". Não possui avaliação.";
		}
		
	}
}
