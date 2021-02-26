import java.io.Serializable;
import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4636958453501866235L;
	private int ano;
	
	public AlunoEnsinoMedio(String nome, LocalDate data, int ano) {
		super(nome, data);
		this.setAno(ano);
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano > 0 && ano < 4) {
			this.ano = ano;
		}
		else {
			throw new IllegalArgumentException("Ano de EM inválido");
		}
	}

	@Override
	public String mostrar() {
		return this.getNome()+" está cursando o "+this.getAno()+"º do EM e tem "+ this.getIdade()+" anos.";
	}
	
	@Override
	public String toString() {
		return this.getNome()+" está cursando o "+this.getAno()+"º do EM e tem "+ this.getIdade()+" anos.";
	}
	
	// Destrutor
		protected void finalize() throws Throwable {
			System.out.println("Passando pelo destrutor de Aluno Ensino Médio:"+this.getNome());
			super.finalize();  // chama o destrutor da superclasse
		}
	
}
