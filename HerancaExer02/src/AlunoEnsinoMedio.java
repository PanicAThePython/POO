import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno{

	public AlunoEnsinoMedio(String nome, LocalDate data, int ano) {
		super(nome, data);
		this.setAno(ano);
	}

	private int ano;
	
	public void setAno(int ano) {
		if (ano >= 1 & ano <=3) {
			this.ano = ano;
		}
	}
	
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public String mostrar() {
		return this.getNome()+", tem "+this.getIdade()+" anos e estuda no "+this.getAno()+"º ano do EM.";
	}
}
