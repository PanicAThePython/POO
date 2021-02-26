import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Aluno {

	private String nome;
	private LocalDate dataNasc;
	
	public Aluno(String nome, LocalDate data) {
		this.setNome(nome);
		this.setDataNasc(data);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNasc() {
		return this.dataNasc;
	}
	
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public abstract String mostrar(); 
	
	public int getIdade() {
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
	    int idade = anoAtual - dataNasc.getYear();
	    return idade;
	}
}
