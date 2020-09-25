import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstudanteTest {

	@Test
	void test_getTarifaEstudante() {
		Estudante e  = new Estudante("Natália", "12345678", 18, "FURB");
		assertEquals(2.5, e.getTarifaInteira());
	}

}
