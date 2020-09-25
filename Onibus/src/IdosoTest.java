import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IdosoTest {

	@Test
	void test_criarIdoso1() {
		Idoso i = new Idoso("123", "Edla", "12345678", 76);
		assertEquals(76, i.getIdade());
	}
	
	@Test
	void test_criarIdoso2() {
		Idoso i = new Idoso("123", "Edla", "12345678", 59);
		assertEquals(0, i.getIdade()); 
		//idade ficar como 0 caso a pessoa que está sendo cadastrada como idosa 
		//não tenha idade superior a 59 anos
	}
	
	@Test
	void test_getTarifa() {
		Idoso i = new Idoso("123", "Edla", "12345678", 76);
		assertEquals(0, i.getTarifaInteira());
	}

}
