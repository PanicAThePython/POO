import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {

	private ArrayList <Viagem> viagens = new ArrayList<>();
	
	public void addViagens(Viagem v) {
		this.viagens.add(v);
	}
	
	public ArrayList <Viagem> getLista(){
		return this.viagens;
	}
	
	public int getMaiorIdade() {
		int idade = 0;
		for (int i = 0; i < viagens.size(); i++) {
			for (int j = 0; j < viagens.get(i).getLista().size(); j++) {
				if (viagens.get(i).getLista().get(j).getIdade() > idade) {
					idade = viagens.get(i).getLista().get(j).getIdade();
				}
			}
		}
		return idade;
	}
	
	public ArrayList <String> getPassageirosMaisVelhos(){
		int idade = this.getMaiorIdade();
		//ArrayList <Passageiro> pass = this.ordernarLista();
		ArrayList <String> idosos = new ArrayList<>();
		for (int i = 0; i < viagens.size(); i++) {
			for (int j = 0; j < viagens.get(i).getLista().size(); j++) {
				if (viagens.get(i).getLista().get(j).getIdade() == idade) {
					idosos.add(viagens.get(i).getLista().get(j).getNome());
				}
			}
		}
		return idosos;
	}
	//olhar oq há de errado com a lógica de ordernar os nomes
	public ArrayList <Passageiro> ordernarLista(){
		ArrayList <Passageiro> idosos = new ArrayList<>();
		String[] alf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V","W", "X", "Y", "Z"};
		for (int i = 0; i < viagens.size(); i++) {
			for (int j = 0; j < viagens.get(i).getLista().size(); j++) {
				for (int k = 0; k < alf.length; k++) {
					if (viagens.get(i).getLista().get(j).getNome().startsWith(alf[k])) {
						idosos.add(viagens.get(i).getLista().get(j));
					}
				}
			}
		}
		return idosos;
	}
	
}
