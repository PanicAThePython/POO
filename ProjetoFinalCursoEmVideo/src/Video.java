
public class Video implements AcoesVideo{
	
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String t) {
		this.setTitulo(t);
		this.setCurtidas(0);
		this.setViews(0);
		this.setReproduzindo(false);
	}

	@Override
	public void playVideo() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo.isEmpty()) {
			throw new IllegalArgumentException("Título vazio!!");
		}
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		if (avaliacao < 0) {
			throw new IllegalArgumentException("Avaliacao inválida!!");
		}
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		if (views < 0) {
			throw new IllegalArgumentException("View inválida!!");
		}
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		if (curtidas < 0) {
			throw new IllegalArgumentException("Curtida inválida!!");
		}
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	

}
