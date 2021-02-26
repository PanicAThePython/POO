import java.util.ArrayList;

public class Partido {

	private String nome;
	private int numero;
	private ArrayList <Candidato> candidatos = new ArrayList<>();;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}
	
	public void addCandidatos(Candidato c) {
		candidatos.add(c);
	}
	
	public ArrayList <Candidato> getCandidatosCargo(String cargo){
		ArrayList <Candidato> cand = new ArrayList<>();
		for (Candidato c: candidatos) {
			if (c.getCargo().contentEquals(cargo)) {
				cand.add(c);
			}
		}
		return cand;
	}
	
	public ArrayList <Candidato> getCandidatosPartido(Partido part){
		ArrayList <Candidato> cand = new ArrayList<>();
		for (Candidato c: candidatos) {
			if (c.getPartido().getNumero() == part.getNumero()) {
				cand.add(c);
			}
		}
		return cand;
	}
}
