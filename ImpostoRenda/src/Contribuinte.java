public class Contribuinte {
	
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	
	
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + this.getUf() + ", rendaAnual=" + rendaAnual + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if (uf =="RS" || uf == "SC" || uf=="PR") {
			this.uf = uf;
		}
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual > -1) {
			this.rendaAnual = rendaAnual;
		}
		
	}
	
	public double calcularImposto() {
		
		if (this.getRendaAnual()<=4000) {
			return this.getRendaAnual()*0;
		}
		else if(this.getRendaAnual()<=9000) {
			return this.getRendaAnual()*0.058;
		}
		else if(this.getRendaAnual()<=25000) {
			return this.getRendaAnual()*0.15;
		}
		else if(this.getRendaAnual()<=35000) {
			return this.getRendaAnual()*0.275;
		}
		else {
			return this.getRendaAnual()*0.3;
		}
	}
}
