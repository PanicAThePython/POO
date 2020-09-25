import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class MunicipalTest {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Test
	void test_addPassageiro1() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		Passageiro p = new Passageiro("Solange", "12345678", 55);
		assertEquals(true, m.addPassageiro(p));
	}

	@Test
	void test_addPassageiro2() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		Estudante e = new Estudante("Natália", "32145678", 18, "FURB");
		assertEquals(true, m.addPassageiro(e));
	}
	@Test
	void test_addPassageiro3() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		Idoso i = new Idoso("12345", "Edla", "78906543", 76);
		assertEquals(true, m.addPassageiro(i));
	}

	@Test
	void test_qtdPassageiro() {
		Municipal m =new Municipal("123-yut", "José", LocalDate.parse("04/09/2020", formatter), LocalTime.parse("14:00:00"));
		Idoso i = new Idoso("12345", "Edla", "78906543", 76);
		Estudante e = new Estudante("Natália", "32145678", 18, "FURB");
		Passageiro p = new Passageiro("Solange", "12345678", 55);
		m.addPassageiro(i);
		m.addPassageiro(e);
		m.addPassageiro(p);
		assertEquals(3, m.getQtdPassageiros());
	}
}
