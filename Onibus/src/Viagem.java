import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Viagem {

	private String placa;
	private String motorista;
	private LocalDate data;
	private LocalTime hora;
	private int qtdPassageiros;
	private ArrayList <Passageiro> passageiros = new ArrayList<>();
	
	public Viagem(String p, String m, LocalDate d, LocalTime h) {
		this.setData(d);
		this.setHora(h);
		this.setMotorista(m);
		this.setPlaca(p);
	}
	
	public int getQtdPassageiros() {
		return this.qtdPassageiros;
	}
	
	public ArrayList <Passageiro> getLista(){
		return this.passageiros;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public boolean addPassageiro(Passageiro p) {
		passageiros.add(p);
		return true;
	}
	
	public float getValorTotal() {
		float valTot = 0;
		for (int i = 0; i < passageiros.size(); i++) {
			valTot+= passageiros.get(i).getTarifaInteira();
		}
		return valTot;
	}
	
}
