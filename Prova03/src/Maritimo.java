import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Maritimo extends PacoteTuristico implements Serializable{

	private float valorNavio;
	private ArrayList<Opcional> opcoes = new ArrayList<>();
	
	public Maritimo(String desc, String id, float vn) {
		super(desc, id);
		this.setValorNavio(vn);
	}

	public float getValorNavio() {
		return valorNavio;
	}
	public void setValorNavio(float valorNavio) {
		this.valorNavio = valorNavio;
	}
	
	public float getValorTotalReais() {
		float total = this.getValorNavio();
		for (Opcional o: opcoes) {
			total+= o.getValor();
		}
		total = total * this.getValorDolar();
		return total;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Opcional o: opcoes) {
			if (opcoes.indexOf(o)< opcoes.size()-1) {
				s+= o.getDescricao()+",";
			}
		}
		return "Pacote marítimo "+this.getDescricao()+"("+this.getId()+") com "+s+" pelo valor de R$"+
		this.getValorTotalReais();
	}
	
	public void addOpcional(String d, float v) {
		Opcional o = new Opcional(d, v);
		opcoes.add(o);
	}
	
	public ArrayList<Opcional> quaisOpcionaisFaixa(float inf, float sup){
		ArrayList<Opcional> lista = new ArrayList<>();
		for (Opcional o: opcoes) {
			if ((o.getValor()*this.getValorDolar()) >= inf && (o.getValor()*this.getValorDolar())<=sup) {
				lista.add(o);
			}
		}
		return lista;
	}
}
