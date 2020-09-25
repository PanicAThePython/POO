import java.util.Arrays;

public class Obra {

	private String titulo;
	private String autor;
	private Parecer[] pareceres = new Parecer[3];
	private int index = 0;
	
	public Obra(String titulo, String autor) {
		setTitulo(titulo);
		setAutor(autor);
	}
	
	
	@Override
	public String toString() {
		return "Obra [titulo=" + titulo + ", autor=" + autor + ", pareceres=" + Arrays.toString(pareceres) + "]";
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Parecer[] getPareceres() {
		return pareceres;
	}
	public boolean setParecer(Parecer p) {
		if (index < 3) {
			pareceres[index] = p;
			index++;
			return true;
		}
		else {
			return false;
		}
	}
	
}
