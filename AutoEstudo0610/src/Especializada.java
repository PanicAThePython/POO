import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Especializada extends Telefone {

	private int qtdOcor;

	public Especializada(Cliente cliente, LocalDate data, String num, int qtdOcor) {

		super(cliente, data, num);

		this.setQtdOcor(qtdOcor);

	}

	public int getQtdOcor() {

		return qtdOcor;

	}

	public void setQtdOcor(int qtdOcor) throws IllegalArgumentException {
		if (qtdOcor < 0) {
			throw new IllegalArgumentException("Erro no valor inserido em quantidade de ocorr�ncias");
		}
		this.qtdOcor = qtdOcor;

	}

	@Override

	public float getCustoMensal() {

		if (this.getQtdOcor() > 0 && this.getQtdOcor() < 1001) {

			return 50f;

		}

		else if (this.getQtdOcor() < 5001) {

			return 67.8f;

		}

		else if (this.getQtdOcor() < 10001) {

			return 98.5f;

		}

		else if (this.getQtdOcor() < 50001) {

			return 123.9f;

		}

		else {

			return 187.82f;

		}

	}

	@Override
	public String toString() {
		Endereco endereco = getCliente().getEndereco();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String str = "Linha Especializada\nN�mero de Telefone: " + getNumero() + "\nData de Instala��o: " + 
				getDataInst().format(formatter) + "\nQuantidade de ocorr�ncias: " + getQtdOcor() + 
				"\nCusto mensal: R$" + getCustoMensal() + "\nNome do usu�rio: " + getCliente().getUsuario() + "\nEndere�o: " + 
				endereco.getRua() + ", " + endereco.getNumero() + " - " +
				endereco.getCidade() + ", " + endereco.getUf();
		return str;
	}
	
	
}