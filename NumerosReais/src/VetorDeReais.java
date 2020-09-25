public class VetorDeReais {
	
	private double[] vetor;
	
	public VetorDeReais(int numero) {
		this.vetor = new double[numero];
	}
	
	public double getValor(int posicao) {
		return this.vetor[posicao];
	}
	
	public void setValor(double valorNovo, int posicao) {
		this.vetor[posicao] = valorNovo;
	}

	public int getTamanho() {
		return this.vetor.length;
	}
	
	public int getQtdPares() {
		int cont = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			int num = (int) this.vetor[i];
			if (num%2==0) {
				cont++;
			}
		}
		return cont;
	}
	
	public VetorDeReais dividirReais(VetorDeReais outro) {
		if(this.getTamanho()!= outro.getTamanho()) {
			return null;
		}
		VetorDeReais novo = new VetorDeReais(this.vetor.length);
		double temp;
		for (int i = 0; i < this.vetor.length; i++) {
			temp = this.vetor[i]/outro.getValor(i);
			novo.setValor(temp, i);
		}
		return novo;
	}
	
	public double multiplicarReais(VetorDeReais outro) {
		double m = 0;
		if(this.getTamanho()!= outro.getTamanho()) {
			return m;
		}
		int tamanho = this.vetor.length - 1;
		for (int i = 0; i < this.vetor.length; i++) {
			m += this.vetor[i] + outro.getValor(tamanho);
			tamanho--;
		}
		return m;
	}
	
	public void inverterVetor() {
		double temp = 0;
		for (int i = 0, j = this.getTamanho()-1; i< j; i++, j-- ) {
			temp = this.vetor[i];
			this.vetor[i] = this.vetor[j];
			this.vetor[j] = temp;
		}
	}
	
	public double calcularMaiorDiferenca() {
		double diferenca = 0;
		double calc = 0;
		for (int i = 0, j = 1; j < this.getTamanho(); i++, j++) {
			calc = (vetor[i]-vetor[j]);
			if (calc < 0 ) {
				calc = calc * (-1);
			}
			if (calc > diferenca) {
				diferenca = calc;
			}
		}
		return diferenca;
	}
	
	public String toString() {
		String retorno = "[";
		for (int i = 0; i < this.getTamanho(); i++) {
			retorno += this.vetor[i] + ", ";
		}
		retorno =  retorno.substring(0, retorno.length()-2)+ "]";
		return retorno;
	}
}
