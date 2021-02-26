public class Cliente {
	private String usuario;
	private Endereco endereco;
	
	
	public Cliente(String usuario, Endereco endereco) throws IllegalArgumentException
	{
		this.setUsuario(usuario);
		this.setEndereco(endereco);
	}

	public Cliente() {}
	
	public String getUsuario()
	{
		return this.usuario;
	}
	
	public void setUsuario(String usuario) throws IllegalArgumentException
	{
		if (usuario == null)
			throw new IllegalArgumentException("Usuário nulo");
		
		if (usuario.equals(""))
			throw new IllegalArgumentException("Usuário vazio");
		
		this.usuario = usuario;
	}
	
	public Endereco getEndereco()
	{
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) throws IllegalArgumentException
	{
		if (endereco == null)
			throw new IllegalArgumentException("Endereco nulo");
		
		this.endereco = endereco;
	}
}
