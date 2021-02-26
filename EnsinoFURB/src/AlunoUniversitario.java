import java.io.Serializable;
import java.time.LocalDate;

public class AlunoUniversitario extends Aluno implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6011800242394723504L;
	private char formaIngresso;
	private Curso curso;
	
	public AlunoUniversitario(String nome, LocalDate data, char fi, Curso c) {
		super(nome, data);
		this.setFormaIngresso(fi);
		this.setCurso(curso);
	}

	// Destrutor
		protected void finalize() throws Throwable {
			System.out.println("Passando pelo destrutor de Aluno Universitário:"+this.getNome());
			super.finalize();  // chama o destrutor da superclasse
		}

		// Métodos

		public String getFormaIngresso() {
			switch (this.formaIngresso){
				case 'V' : return "Vestibular";
				case 'E' : return "ENEM";
				case 'S' : return "Seletivo especial";
				case 'T' : return "Transf. Externa";
				case 'I' : return "Transf. Interna";
				default  : return "Não identificado";
			}
		}

		public void setFormaIngresso(char formaDeIngresso) {
			//testar se a forma de ingresso é válida
			if ("VESTI".contains(String.valueOf(formaDeIngresso))) {
				this.formaIngresso = formaDeIngresso;
			}
			else {
				throw new IllegalArgumentException("Não entrou uma forma válida: V E S T I");
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
		return this.getNome()+" é aluna(o) universitária(o) do curso de "+ this.getCurso().getSigla()
				+"-"+this.getCurso().getNome()+", ingressando por "+ this.getFormaIngresso();
	}
	
	@Override
	public String toString() {
		return this.getNome()+" é aluna(o) universitária(o) do curso de ingressando por "+ this.getFormaIngresso();
	}
	
}
