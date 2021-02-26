
public class BoteSalvaVidas extends Embarcacao{
	
	private boolean inflavel;
	private int qtdRemos;
	private int qtdColetes;

	public BoteSalvaVidas(String rc, int qtd, boolean i, int remos, int coletes) {
		super(rc, qtd);
		this.setInflavel(i);
		this.setQtdRemos(remos);
		this.setQtdColetes(coletes);
	}

	public boolean isInflavel() {
		return inflavel;
	}
	public void setInflavel(boolean inflavel) {
		this.inflavel = inflavel;
	}

	public int getQtdRemos() {
		return qtdRemos;
	}
	public void setQtdRemos(int qtdRemos) {
		if (qtdRemos > -1) {
			this.qtdRemos = qtdRemos;
		}
		else {
			throw new IllegalArgumentException("A quantidade de remos deve ser positiva");
		}
	}

	public int getQtdColetes() {
		return qtdColetes;
	}
	public void setQtdColetes(int qtdColetes) {
		if (qtdColetes > -1) {
			this.qtdColetes = qtdColetes;
		}
		else {
			throw new IllegalArgumentException("A quantidade de coletes deve ser positiva");
		}
	}

	private boolean verificaColetes() {
		if(this.getQtdColetes() >= this.getQtdPessoas()) {
			return true;
		}
		return false;
	}

	@Override
	public String verificaSeguranca() {
		if(this.verificaColetes()) {
			return "Bote OK!";
		}
		return "Insuficiência de "+(this.getQtdPessoas()-this.getQtdColetes())+" coletes salva-vidas";
	}

}
