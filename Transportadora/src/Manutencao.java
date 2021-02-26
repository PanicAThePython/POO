
public class Manutencao {

	private Integer codigo;
	private String descricao;
	private float custo;
	private int diasParado;
	
	public Manutencao(Integer codigo, float custo, int dias) {
		this.setCodigo(codigo);
		this.setCusto(custo);
		this.setDiasParado(dias);
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		if (codigo > -1) {
			this.codigo = codigo;
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		if (custo > 0) {
			this.custo = custo;
		}
	}
	
	public int getDiasParado() {
		return diasParado;
	}
	public void setDiasParado(int diasParado) {
		if (diasParado > 0) {
			this.diasParado = diasParado;
		}
	}
	 public float getCustoMedioDiario(){
	    return (this.custo / this.diasParado);
	}
}
