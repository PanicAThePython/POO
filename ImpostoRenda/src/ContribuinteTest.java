import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	final void testCaso01_GetImpostoAPagar_Renda_3000() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(3000);
		assertEquals(0, c.calcularImposto());
	}

	@Test
	final void testCaso02_GetImpostoAPagar_Renda_9000() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(9000);
		assertEquals(522, c.calcularImposto());
	}
	
	@Test
	final void testCaso03_GetImpostoAPagar_Renda_10000() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);
		assertEquals(1500, c.calcularImposto());
	}

	@Test
	final void testCaso04_GetImpostoAPagar_Renda_34911_73() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911.73);
		assertEquals(9600.72, c.calcularImposto(), 0.009);
	}
	@Test
	final void testCaso05_GetImpostoAPagar_Renda_818_5() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(200);
		c.setRendaAnual(-818.5);
		assertEquals(200, c.getRendaAnual());
	}

	@Test
	final void testCaso06_SetUF_RS() {
		Contribuinte c = new Contribuinte();
		c.setUf("RS");
		assertEquals("RS", c.getUf());
	}
	
	@Test
	final void testCaso07_SetUF_SC() {
		Contribuinte c = new Contribuinte();
		c.setUf("SC");
		assertEquals("SC", c.getUf());
	}
	@Test
	final void testCaso08_SetUF_PR() {
		Contribuinte c = new Contribuinte();
		c.setUf("PR");
		assertEquals("PR", c.getUf());
	}
	@Test
	final void testCaso09_SetUF_RJ() {
		Contribuinte c = new Contribuinte();
		c.setUf("RJ");
		assertEquals(null, c.getUf());
	}
	@Test
	final void testCaso10_SetUF_SP() {
		Contribuinte c = new Contribuinte();
		c.setUf("SP");
		assertEquals(null, c.getUf());
	}
}
