//Natália Sens Weise
//Matheus Bailer Demmer

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class VeiculoTest {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Test
	void test_getQtdServicos() {
		Manutencao m1 = new Manutencao(1, 603.00f, 1);
		m1.setDescricao("troca do óleo");
		Manutencao m2 = new Manutencao(2, 603.00f, 1);
		m2.setDescricao("troca do óleo");
		Manutencao m3 = new Manutencao(3, 603.00f, 1);
		m3.setDescricao("troca do óleo");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);

		//assertEquals(3, v.getQtdServicos("troca do óleo"));
	}
	
	@Test
	void test_getQtdDiasParado() {
		Manutencao m1 = new Manutencao(4, 603.00f, 1);
		m1.setDescricao("troca para-brisa");
		Manutencao m2 = new Manutencao(8, 3002.00f, 18);
		m2.setDescricao("subtituicao do cardan");
		Manutencao m3 = new Manutencao(16, 89.00f, 2);
		m3.setDescricao("troca do filtro do ar-condicionado");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);

		//assertEquals(21, v.getQtdDiasParado());
	}
	
	@Test
	void test_getCustoMedio() {
		Manutencao m1 = new Manutencao(4, 603.00f, 1);
		m1.setDescricao("troca para-brisa");
		Manutencao m2 = new Manutencao(8, 3002.00f, 18);
		m2.setDescricao("subtituicao do cardan");
		Manutencao m3 = new Manutencao(16, 89.00f, 2);
		m3.setDescricao("troca do filtro do ar-condicionado");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);

		assertEquals(1231.33, v.getCustoMedio(),  0.1);
	}

	@Test
	void test_getIndSuc() {
		Manutencao m1 = new Manutencao(4, 603.00f, 1);
		m1.setDescricao("troca para-brisa");
		Manutencao m2 = new Manutencao(8, 3002.00f, 18);
		m2.setDescricao("subtituicao do cardan");
		Manutencao m3 = new Manutencao(16, 89.00f, 2);
		m3.setDescricao("troca do filtro do ar-condicionado");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);

		//assertEquals(0.5f, v.getIndiceSucateamento());
	}
	
	@Test
	void test_getCustoDiario() {
		Manutencao m1 = new Manutencao(1, 89.00f, 2);
		m1.setDescricao("subtituicao do filtro do ar-condicionado");
		
		
		assertEquals(44.5f, m1.getCustoMedioDiario());
	}
	
	@Test
	void test_comparaCom01() {
		Manutencao m1 = new Manutencao(4, 603.00f, 1);
		m1.setDescricao("troca para-brisa");
		Manutencao m2 = new Manutencao(8, 3002.00f, 18);
		m2.setDescricao("subtituicao do cardan");
		Manutencao m3 = new Manutencao(16, 89.00f, 2);
		m3.setDescricao("troca do filtro do ar-condicionado");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);
		
		Manutencao m4 = new Manutencao(4, 20134.00f, 30);
		m1.setDescricao("troca do sistema de ar-condicionado");
		Manutencao m5 = new Manutencao(5, 623.00f, 1);
		m2.setDescricao("troca para-brisa");

		Veiculo outro = new Veiculo("QIO-1984", "Picape", LocalDate.parse("10/09/2017", formatter));
		outro.addManutencao(m4);
		outro.addManutencao(m5);
		
		//assertEquals(0, v.comparaCom(outro));
	}
	
	@Test
	void test_comparaCom02() {
		Manutencao m1 = new Manutencao(4, 603.00f, 1);
		m1.setDescricao("troca para-brisa");
		Manutencao m2 = new Manutencao(8, 3002.00f, 18);
		m2.setDescricao("subtituicao do cardan");
		Manutencao m3 = new Manutencao(16, 89.00f, 2);
		m3.setDescricao("troca do filtro do ar-condicionado");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);
		
		Manutencao m4 = new Manutencao(4, 20134.00f, 60);
		m1.setDescricao("troca do sistema de ar-condicionado");
		Manutencao m5 = new Manutencao(5, 623.00f, 1);
		m2.setDescricao("troca para-brisa");

		Veiculo outro = new Veiculo("QIO-1984", "Picape", LocalDate.parse("10/09/2017", formatter));
		outro.addManutencao(m4);
		outro.addManutencao(m5);
		
		//assertEquals(-1, v.comparaCom(outro));
	}
	
	@Test
	void test_comparaCom03() {
		Manutencao m1 = new Manutencao(4, 603.00f, 1);
		m1.setDescricao("troca para-brisa");
		Manutencao m2 = new Manutencao(8, 3002.00f, 18);
		m2.setDescricao("subtituicao do cardan");
		Manutencao m3 = new Manutencao(16, 89.00f, 2);
		m3.setDescricao("troca do filtro do ar-condicionado");
		
		Veiculo v = new Veiculo("QWE-1234", "Picape", LocalDate.parse("10/09/2020", formatter));
		v.addManutencao(m1);
		v.addManutencao(m2);
		v.addManutencao(m3);
		
		Manutencao m4 = new Manutencao(4, 20134.00f, 5);
		m1.setDescricao("troca do sistema de ar-condicionado");
		Manutencao m5 = new Manutencao(5, 623.00f, 1);
		m2.setDescricao("troca para-brisa");

		Veiculo outro = new Veiculo("QIO-1984", "Picape", LocalDate.parse("10/09/2017", formatter));
		outro.addManutencao(m4);
		outro.addManutencao(m5);
		
		assertEquals(1, v.compararIndices(outro));
	}
}
