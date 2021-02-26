
public class Trabalho extends Avaliacao{
	
	private char conceito;

	public Trabalho(String desc, char conc) {
		super(desc);
		this.setConceito(conc);
	}

	@Override
	public float getNota() {
		switch (this.getConceito()) {
			case 'A': return 10f;
			case 'B': return 9f;
			case 'C': return 7.5f;
			case 'D': return 5f;
			case 'E': return 2f;
			default: return 0f;
		}
	}

	public char getConceito() {
		return conceito;
	}

	public void setConceito(char conceito) {
		if ("ABCDE".contains(String.valueOf(conceito))){
			this.conceito = conceito;
		}
		else {
			throw new IllegalArgumentException("Conceito inválido! Deve ser : A B C D ou E");
		}
	}

	public String toString() {
		return this.getDescricao()+" ("+this.getConceito()+")";
	}
}
