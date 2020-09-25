public class PassageirosHora {

	private int[][][] matriz = new int[12][30][24];
	
	public void adicionarPassageiro(int mes, int dia, int hora) {
		this.matriz[mes-1][dia-1][hora]++;
	}
	
	public int getQtdPassageiros(int dia, int mes) {
		dia--;
		mes--;
		int qtd = 0;
		
		for (int h = 0; h < 31; h++) {
			qtd+=this.matriz[mes][dia][h];
		}
		
		return qtd;
	}
	public int getQtdPassageiros(int mes) {
		int qtd = 0;
		for (int dia = 1; dia < 31; dia++) {
			qtd+=this.getQtdPassageiros(dia, mes);
		}
		return qtd;
	}
	
	public int getMesMenorQtd() {
		int menorMes = 1;
		int qtdMenor = this.getQtdPassageiros(1);
		for (int i = 2; i < 13; i++) {
			int qtd = this.getQtdPassageiros(i);
			if (qtd < qtdMenor ) {
				qtdMenor = qtd;
				menorMes = i;
			}
		}
		return menorMes;
	}
	
	public int[] getPicoTransporte() {
		int diaM, mesM, horaM, qtdM;
		diaM = mesM = horaM = qtdM = 0;
		for (int m = 0; m < matriz.length; m++) {
			for (int d = 0; d < matriz[m].length; d++) {
				for (int h = 0; d < matriz[m][d].length; h++) {
					if (matriz[m][d][h] > qtdM) {
						qtdM = matriz[m][d][h];
						diaM = d;
						mesM = m;
						horaM = h;
					}
				}
			}
		}
		int[] retorno = {diaM+1, mesM+1, horaM, qtdM};
		return retorno;
	}
}
