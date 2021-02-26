import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class BoteSalvaVidasTest {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Test
	void test_insuficienciaColetes() {
		BoteSalvaVidas b = new BoteSalvaVidas("1234", 30, true, 6, 28);
		
		assertEquals("Insuficiência de 2 coletes salva-vidas", b.verificaSeguranca());
	}
	
	@Test
	void test_boteOk() {
		BoteSalvaVidas b = new BoteSalvaVidas("1234", 30, true, 6, 34);
		
		assertEquals("Bote OK!", b.verificaSeguranca());
	}
	
	@Test
	void test_navioAlerta() {
		BoteSalvaVidas b1 = new BoteSalvaVidas("1234", 30, true, 6, 28);
		BoteSalvaVidas b2 = new BoteSalvaVidas("1234", 30, true, 6, 28);
		BoteSalvaVidas b3 = new BoteSalvaVidas("1234", 30, true, 6, 28);
		BoteSalvaVidas b4 = new BoteSalvaVidas("1234", 30, true, 6, 28);

		Transatlantico t = new Transatlantico("76868467", 200, "Titanic II", LocalDate.parse("12/12/2020", formatter));
		t.addBote(b1);
		t.addBote(b2);
		t.addBote(b3);
		t.addBote(b4);
		
		assertEquals("ALERTA: navio necessitando de mais botes!", t.verificaSeguranca());
	}
	
	@Test
	void test_navioPerigo() {
		BoteSalvaVidas b1 = new BoteSalvaVidas("1234", 30, true, 6, 28);
		BoteSalvaVidas b2 = new BoteSalvaVidas("1234", 30, true, 6, 28);
		BoteSalvaVidas b3 = new BoteSalvaVidas("1234", 30, true, 6, 28);
		BoteSalvaVidas b4 = new BoteSalvaVidas("1234", 30, true, 6, 28);

		Transatlantico t = new Transatlantico("76868467", 200, "Titanic II", LocalDate.parse("12/10/2020", formatter));
		t.addBote(b1);
		t.addBote(b2);
		t.addBote(b3);
		t.addBote(b4);
		
		assertEquals("CUIDADO: navio em perigo", t.verificaSeguranca());
	}
	@Test
	void test_navioOk() {
		BoteSalvaVidas b1 = new BoteSalvaVidas("1234", 40, true, 6, 52);
		BoteSalvaVidas b2 = new BoteSalvaVidas("1234", 40, true, 6, 40);
		BoteSalvaVidas b3 = new BoteSalvaVidas("1234", 100, true, 6, 110);
		BoteSalvaVidas b4 = new BoteSalvaVidas("1234", 30, true, 6, 45);

		Transatlantico t = new Transatlantico("76868467", 200, "Titanic II", LocalDate.parse("12/10/2020", formatter));
		t.addBote(b1);
		t.addBote(b2);
		t.addBote(b3);
		t.addBote(b4);
		
		assertEquals("Está em condições adequadas de segurança", t.verificaSeguranca());
	}
}
