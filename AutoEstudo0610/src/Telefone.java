import java.time.LocalDate;

public class Telefone {

	private Cliente cliente;
	private LocalDate dataInst;

	private String numero;

	public Telefone(Cliente cliente, LocalDate data, String num) {
		this.setCliente(cliente);
		this.setDataInst(data);

		this.setNumero(num);

	}

	public void setCliente(Cliente cliente) throws IllegalArgumentException {
		if (cliente == null)
			throw new IllegalArgumentException("Cliente inv�lido");

		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public LocalDate getDataInst() {

		return dataInst;

	}

	public void setDataInst(LocalDate dataInst) throws IllegalArgumentException {
		if (dataInst == null)
			throw new IllegalArgumentException("Data inv�lida.");

		this.dataInst = dataInst;

	}

	public String getNumero() {

		return numero;

	}

	public void setNumero(String numero) throws IllegalArgumentException {
		if (numero == null)
			throw new IllegalArgumentException("N�mero de telefone inv�lido.");

		if (numero.length() == 10) {

			this.numero = numero;
		}


		else {

			throw new IllegalArgumentException("O telefone deve ter 10 d�gitos");

		}

	}

	public float getCustoMensal() {

		return 0;

	}
}