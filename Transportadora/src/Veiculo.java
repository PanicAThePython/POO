import java.time.LocalDate;
import java.util.HashMap;

public class Veiculo {

	private String placa;
	private String modelo;
	private LocalDate dataAq;
	private HashMap <Integer, Manutencao> manutencoes = new HashMap<>();
	
	public Veiculo(String p, String m, LocalDate d) {
		this.setPlaca(p);
		this.setModelo(m);
		this.setDataAq(d);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa.length() != 8){
            throw new IllegalArgumentException("Placa inválida");
        }
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public LocalDate getDataAq() {
		return dataAq;
	}
	public void setDataAq(LocalDate dataAq) {
		this.dataAq = dataAq;
	}
	
	public void addManutencao(Manutencao m) {
		if (!manutencoes.containsKey(m.getCodigo())) {
			manutencoes.put(m.getCodigo(), m);
		}
	}
	
	public int getQtdVezesServico(String descricao) {
		int tot = 0;
		for(Manutencao m: manutencoes.values()) {
			if (m.getDescricao().contentEquals(descricao)) {
				tot++;
			}
		}
		return tot;
	}
	
	public int compararIndices(Veiculo outro) {
		if (outro != null) {
			if (this.getIndiceSuct() > outro.getIndiceSuct()) {
				return 1;
			}
			else if (this.getIndiceSuct() == outro.getIndiceSuct()) {
				return 0;
			}
			else {
				return -1;
			}
		}
		return 404;
	}
	
	/**public float getCustoDiario(Integer cod) {
		float result = 0;
		for(Manutencao m: manutencoes.values()) {
			if (m.getCodigo() == cod) {
				result = (m.getCusto()/m.getDiasParado());
			}
		}
		return result;
	}**/
	
	public float getCustoMedio() {
		float tot = 0;
		for(Manutencao m: manutencoes.values()) {
			tot+=m.getCusto();
		}
		return tot/manutencoes.size();
	}
	
	public int getTotDiasManut() {
		int tot = 0;
		for(Manutencao m: manutencoes.values()) {
			tot+=m.getDiasParado();
		}
		return tot;
	}
	
	public float getIndiceSuct(){
		int manut = getTotDiasManut();
		if (manut < 21) {
			return 0f;
		}
		else if (manut < 51) {
			return 0.5f;
		}
		else if (manut < 81) {
			return 1f;
		}
		else if (manut < 121) {
			return 1.5f;
		}else {
			return 2f;
		}
	}
	
}
