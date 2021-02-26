import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Residencial extends Telefone {

	private boolean conexInt;

	public Residencial(Cliente cliente, LocalDate data, String num, boolean conexInt) {

		super(cliente, data, num);

		this.setConexInt(conexInt);

	}

	public boolean isConexInt() {

		return conexInt;

	}

	public void setConexInt(boolean conexInt) {

		this.conexInt = conexInt;

	}
	

	@Override

	public float getCustoMensal() {

		return 15f;

	}
	
	@Override
	public String toString() {
		Endereco endereco = getCliente().getEndereco();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String conexaoStr = "";
		if (conexInt) {
			conexaoStr += "Sim";
		}
		else {
			conexaoStr += "Não";
		}
		String str = "Linha Residencial\nNúmero de Telefone: " + getNumero() + "\nData de Instalação: " + 
				getDataInst().format(formatter) + "\nConexão com Internet: " + conexaoStr + 
				"\nCusto mensal: R$" + getCustoMensal() + "\nNome do usuário: " + getCliente().getUsuario() + "\nEndereço: " + 
				endereco.getRua() + ", " + endereco.getNumero() + " - " +
				endereco.getCidade() + ", " + endereco.getUf();
		return str;
	}

}