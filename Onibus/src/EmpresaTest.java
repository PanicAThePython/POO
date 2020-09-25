import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EmpresaTest {
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Test
	void test_getMaiorIdade() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		Intermunicipal im =new Intermunicipal("167-yut", "Roger", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("19:00:00"));
		Viagem v = new Viagem("867-ykt", "Valeria", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("09:00:00"));
		Empresa empresa = new Empresa();
		
		Idoso i = new Idoso("12345", "Edla", "78906543", 76);
		Estudante e = new Estudante("Natália", "32145678", 18, "FURB");
		Passageiro p = new Passageiro("Solange", "12345678", 55);
		m.addPassageiro(i);
		m.addPassageiro(e);
		m.addPassageiro(p);
		
		im.addPassageiro(e);
		im.addPassageiro(p);
		
		v.addPassageiro(e);
		v.addPassageiro(p);
		
		empresa.addViagens(v);
		empresa.addViagens(m);
		empresa.addViagens(im);
		
		//ArrayList <Passageiro> resposta = new ArrayList<>();
		//resposta.add(i);
		
		assertEquals(76, empresa.getMaiorIdade());
	}
	
	@Test
	void test_ordenarLista() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		//Intermunicipal im =new Intermunicipal("167-yut", "Roger", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("19:00:00"));
		//Viagem v = new Viagem("867-ykt", "Valeria", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("09:00:00"));
		Empresa empresa = new Empresa();
		
		Idoso i = new Idoso("12345", "Edla", "78906543", 76);
		Estudante e = new Estudante("Natália", "32145678", 18, "FURB");
		Passageiro p = new Passageiro("Solange", "12345678", 55);
		
		m.addPassageiro(p);
		m.addPassageiro(e);
		m.addPassageiro(i);
		
		
		//empresa.addViagens(v);
		empresa.addViagens(m);
		//empresa.addViagens(im);
		
		ArrayList <Passageiro> resposta = new ArrayList<>();
		resposta.add(i);
		resposta.add(e);
		resposta.add(p);
		
		assertEquals(resposta, empresa.ordernarLista());
	}
	
	@Test
	void test_getPassVelhos() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		//Intermunicipal im =new Intermunicipal("167-yut", "Roger", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("19:00:00"));
		//Viagem v = new Viagem("867-ykt", "Valeria", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("09:00:00"));
		Empresa empresa = new Empresa();
		
		Idoso i = new Idoso("12345", "Edla", "78906543", 76);
		Estudante e = new Estudante("Natália", "32145678", 18, "FURB");
		Passageiro p = new Passageiro("Solange", "12345678", 55);
		
		m.addPassageiro(p);
		m.addPassageiro(e);
		m.addPassageiro(i);
		
		
		//empresa.addViagens(v);
		empresa.addViagens(m);
		//empresa.addViagens(im);
		
		ArrayList <Passageiro> resposta = new ArrayList<>();
		resposta.add(i);
		
		assertEquals(resposta, empresa.getPassageirosMaisVelhos());
	}

}
