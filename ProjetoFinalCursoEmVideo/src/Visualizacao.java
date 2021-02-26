
public class Visualizacao {

	private Gafanhoto gafanhoto;
	private Video video;
	
	public Visualizacao(Gafanhoto g, Video v) {
		this.setGafanhoto(g);
		this.setVideo(v);
		this.getGafanhoto().verMaisUm();
		this.getVideo().setViews(this.getVideo().getViews() + 1);
	}
	
	public Gafanhoto getGafanhoto() {
		return gafanhoto;
	}
	public void setGafanhoto(Gafanhoto gafanhoto) {
		this.gafanhoto = gafanhoto;
	}

	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	

	public void avaliar() {
		this.getVideo().setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.getVideo().setAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem) {
		int tot = 0;
		if (porcentagem <= 20) {
			tot = 3;
		}
		else if (porcentagem <= 50) {
			tot = 5;
		}
		else if (porcentagem <= 90) {
			tot = 8;
		}
		else {
			tot = 10;
		}
		this.getVideo().setAvaliacao(tot);
	}
}
