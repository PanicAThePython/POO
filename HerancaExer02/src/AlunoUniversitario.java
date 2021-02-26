import java.time.LocalDate;

public class AlunoUniversitario extends Aluno{

	public AlunoUniversitario(String nome, LocalDate data, char forma, Curso c) {
		super(nome, data);
		this.setFormaIngresso(forma);
		this.setCurso(c);
	}

	private char formaIngresso;
	private Curso curso;
	
	public char getFormaIngresso() {
		return formaIngresso;
	}
	public void setFormaIngresso(char formaIngresso) {
		if (formaIngresso == 'E' ||formaIngresso == 'V' || formaIngresso == 'T' || formaIngresso == 'I' || 
				formaIngresso == 'S') {
			this.formaIngresso = formaIngresso;
		}
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String mostrar() {
		return this.getNome()+", tem "+this.getIdade()+" anos. Ingressou através do/da "+ this.getFormaIngresso()+ " e está cursando "+
	this.getCurso().getSigla()+"-"+this.getCurso().getNome()+".";
	}
}
