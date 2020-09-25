import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class IntermunicipalTest {
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Test
	void test_getValTot() {
		Intermunicipal im =new Intermunicipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		Idoso i = new Idoso("12345", "Edla", "78906543", 76);
		Estudante e = new Estudante("Natália", "32145678", 18, "FURB");
		Passageiro p = new Passageiro("Solange", "12345678", 55);
		im.addPassageiro(i);
		im.addPassageiro(e);
		im.addPassageiro(p);
		assertEquals(16.95, im.getValorTotal(), 0.000001); 
	}

}
