import java.util.ArrayList;
import java.util.HashMap;

public class Votacao {

	private int votos[][] = new int[100][2];
	private ArrayList <Partido> nums = new ArrayList<>();
	HashMap <Partido, Candidato> candidaturas = new HashMap<>();
	private String cargo;
	private Candidato vencedor;
	private int index1 = 0;
	private int index2 = 0;
	
	public Votacao(String cargo) {
		this.setCargo(cargo);
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo() {
		return this.cargo;
	}
	
	private void setVencedor(Candidato c) {
		this.vencedor = c;
	}
	
	public Partido retornarPartido(int num) {
		for (Partido p: nums) {
			if (p.getNumero() == num) {
				return p;
			}
		}
		return null;
	}
	
	public boolean verificarExistenciaPartido(Partido numPartido) {
		for (Partido i: nums) {
			if (i.getNumero() == numPartido.getNumero()) {
				return true;
			}
		}
		return false;
	}
	
	public void addVoto(int codTitulo, Partido partido) {
		if (!verificarExistenciaPartido(partido)) {
			nums.add(partido);
		}
		votos[index1][index2] = codTitulo;
		index2++;
		votos[index1][index2] = partido.getNumero();
		index2 = 0;
		index1++;
	}
	
	public int getVotosDoPartido(int numPartido) {
		int qtd = 0;
		for (int i = 0; i < votos.length; i++) {
			for (int j = 0; j < votos[i].length; j++) {
				if (votos[i][j] == numPartido) {
					qtd++;
				}
			}
		}
		return qtd;
	}
	
	public int getPartidoPelosVotos(int qtdVotos) {
		int p = 0;
		for (int i = 0; i < votos.length; i++) {
			for (int j = 0; j < votos[i].length; j++) {
				if (votos[i][j] == qtdVotos) {
					p = votos[i][j];
				}
			}
		}
		return p;
	}
	
	public HashMap <Partido, Integer> getPontuacao() {
		HashMap <Partido, Integer> resposta = new HashMap<>();
		for (Partido partido: nums) {
			resposta.put(partido, getVotosDoPartido(partido.getNumero()));
		}
		return resposta;
	}
	
	public int getMaiorQtdVotos() {
		HashMap <Partido, Integer> resposta = getPontuacao();
		int maiorVoto = 0;
		for (Integer voto: resposta.values()) {
			if (voto > maiorVoto) {
				maiorVoto = voto;
			}
		}
		return maiorVoto;
	}
	
	public Candidato getVencedor() {
		int maior = getMaiorQtdVotos();
		int partidoNum = getPartidoPelosVotos(maior);
		Partido part = retornarPartido(partidoNum);
		Candidato winner = candidaturas.get(part);
		this.setVencedor(winner);
		return winner;
	}
	
}
