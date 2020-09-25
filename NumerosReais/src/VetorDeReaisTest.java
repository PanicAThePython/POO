import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	final void testCaso01_dividir() {
		VetorDeReais vr1 = new VetorDeReais(3);
		vr1.setValor(2, 0);
		vr1.setValor(-1, 1);
		vr1.setValor(3.5, 2);
		VetorDeReais vr2 = new VetorDeReais(1);
		vr2.setValor(3, 0);
		assertNull(vr1.dividirReais(vr2));
	}
	@Test
	final void testCaso02_dividir() {
		VetorDeReais vr1 = new VetorDeReais(3);
		vr1.setValor(2, 0);
		vr1.setValor(-1, 1);
		vr1.setValor(3.5, 2);
		VetorDeReais vr2 = new VetorDeReais(3);
		vr2.setValor(3, 0);
		vr2.setValor(2, 1);
		vr2.setValor(1, 2);
		VetorDeReais vr3 = vr1.dividirReais(vr2);
		double resultado[] = {0.666666, -0.5, 3.5};
		assertEquals(vr3.getTamanho(), resultado.length);
		for(int i = 0; i < vr3.getTamanho(); i++) {
			assertEquals(vr3.getValor(i), resultado[i], 0.000001);
		}
	}

}
