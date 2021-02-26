import java.time.LocalDate;

public class Evento {

	private String titulo;
	private double valor;
	private LocalDate data;
	private Avaliacao aval;
	
	public Evento(String t, double v, LocalDate d) {
		this.setTitulo(t);
		this.setValor(v);
		this.setData(d);
	}
	
	public Avaliacao getAval() {
		return aval;
	}
	public void setAval(Avaliacao aval) {
		this.aval = aval;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo.isEmpty()) {
			throw new IllegalArgumentException("Titulo vazio.");
		}
		this.titulo = titulo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor > -1) {
			this.valor = valor;
		}
		else {
			throw new IllegalArgumentException("Erro no valor");
		}
		
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		if (data==null) {
			throw new IllegalArgumentException("Data vazia.");
		}
		this.data = data;
	}
	
	public String exibir() {
		if (aval!=null) {
			return this.getClass().getName() +":"+this.getTitulo()+", no dia "+ this.getData()+
					"ingressos a "+this.getValor()+", teve" + this.getAval().getQtdPagantes()+"pagantes que acharam o evento "+
					this.getAval().getOpiniaoGeral();
		}
		else {
			return this.getClass().getName() +":"+this.getTitulo()+", no dia "+ this.getData()+
					"ingressos a "+this.getValor()+". Ainda não possui avaliação.";
		}
		
	}
	
	@Override
	public String toString() {
		return this.getTitulo();
	}
	
}
