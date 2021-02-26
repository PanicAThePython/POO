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
			System.out.println("Passando pelo destrutor de Aluno Universit�rio:"+this.getNome());
			super.finalize();  // chama o destrutor da superclasse
		}

		// M�todos

		public String getFormaIngresso() {
			switch (this.formaIngresso){
				case 'V' : return "Vestibular";
				case 'E' : return "ENEM";
				case 'S' : return "Seletivo especial";
				case 'T' : return "Transf. Externa";
				case 'I' : return "Transf. Interna";
				default  : return "N�o identificado";
			}
		}

		public void setFormaIngresso(char formaDeIngresso) {
			//testar se a forma de ingresso � v�lida
			if ("VESTI".contains(String.valueOf(formaDeIngresso))) {
				this.formaIngresso = formaDeIngresso;
			}
			else {
				throw new IllegalArgumentException("N�o entrou uma forma v�lida: V E S T I");
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
		return this.getNome()+" � aluna(o) universit�ria(o) do curso de "+ this.getCurso().getSigla()
				+"-"+this.getCurso().getNome()+", ingressando por "+ this.getFormaIngresso();
	}
	
	@Override
	public String toString() {
		return this.getNome()+" � aluna(o) universit�ria(o) do curso de ingressando por "+ this.getFormaIngresso();
	}
	
}
