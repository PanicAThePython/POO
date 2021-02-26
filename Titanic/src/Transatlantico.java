import java.time.LocalDate;
import java.util.ArrayList;

public class Transatlantico extends Embarcacao{
	
	private String nome;
	private LocalDate dataInauguracao;
	private ArrayList<BoteSalvaVidas> botes = new ArrayList<>();
	
	public Transatlantico(String rc, int qtd, String nome, LocalDate data) {
		super(rc, qtd);
		this.setNome(nome);
		this.setDataInauguracao(data);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isEmpty()) {
			throw new IllegalArgumentException("Nome vazio!");
		}
		this.nome = nome;
	}

	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}
	public void setDataInauguracao(LocalDate dataInauguracao) {
		if (dataInauguracao.toString().isEmpty()) {
			throw new IllegalArgumentException("Data vazia!");
		}
		this.dataInauguracao = dataInauguracao;
	}

	
	public void addBote(BoteSalvaVidas bote) {
		botes.add(bote);
	}
	
	public void addBote(String rc, int qtd, boolean i, int remos, int coletes) {
		BoteSalvaVidas bote = new BoteSalvaVidas(rc, qtd, i, remos, coletes);
		botes.add(bote);
	}
	
	private int getCapacidadeBotes() {
		int total = 0;
		for (BoteSalvaVidas b: botes) {
			total+= b.getQtdPessoas();
		}
		return total;
	}
	
	private boolean verificaCapacidade() {
		if (this.getCapacidadeBotes() >= this.getQtdPessoas()) {
			return true;
		}
		return false;
	}
	
	private boolean verificaDataInauguracao() {
		if(this.getDataInauguracao().isAfter(LocalDate.now())) {
			return false;
		}
		return true;
	}
	
	@Override
	public String verificaSeguranca() {
		if (this.verificaCapacidade()) {
			return "Está em condições adequadas de segurança";
		}
		else {
			if(this.verificaDataInauguracao()) {
				return "CUIDADO: navio em perigo";
			}
			return "ALERTA: navio necessitando de mais botes!";
		}
	}
}
