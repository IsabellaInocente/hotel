package com.teste.entity;



import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservaTest {

	private Reserva reserva;
	private Hospede hospede;
	private Quarto quarto;

	@BeforeEach
	void setUp() {
// Arrange
		reserva = new Reserva(1L, hospede, quarto, LocalDate.of(2024,  9, 1), LocalDate.of(2024, 90, 10));
	}

	@Test
	void testId() {
// Act
		reserva.setId(2L);
// Assert
		Assertions.assertEquals(2L, reserva.getId(), "O ID deve ser igual ao valor atribuido");
	}

	@Test
	void teHospede() {
// Act
		reserva.setHospede(hospede);
// Assert
		Assertions.assertEquals("hospede", reserva.getHospede(), "O hospede deve ser igual ao valor atribuido");
	}

	@Test
	void testQuarto() {
// Act
		reserva.setQuarto(quarto);
// Assert
		Assertions.assertEquals(quarto, reserva.getQuarto(), "O quarto deve ser igual ao valor atribuido");
	}
	@Test
	void testCheckInData() {
// Act
		reserva.setCheckInData(LocalDate.of(2024,9, 1));
// Assert
		Assertions.assertEquals(LocalDate.of(2024, 9, 1), reserva.getCheckInData(),
				               "A data de check-in deve ser igual ao valor atribuido");
	}
	@Test
	void testCheckOutData() {
// Act
		reserva.setCheckOutData(LocalDate.of(2024,9, 1));
// Assert
		Assertions.assertEquals(LocalDate.of(2024, 9, 1), reserva.getCheckOutData(),
				               "A data de check-out deve ser igual ao valor atribuido");
	}

	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
// Act
		Reserva novaReserva = new Reserva(3L,hospede, quarto, LocalDate.of(2024, 9, 22), LocalDate.of(2024, 9, 25));
// Assertion
		Assertions.assertAll("novoReserva", () -> Assertions.assertEquals (3L, novaReserva.getId()),
				() -> Assertions.assertEquals(hospede, novaReserva.getHospede()),
				() -> Assertions.assertEquals(quarto, novaReserva.getQuarto()),
				() -> Assertions.assertEquals(LocalDate.of(2024, 9, 22), novaReserva.getCheckInData()),
				() -> Assertions.assertEquals(LocalDate.of(2024, 9, 25), novaReserva.getCheckOutData()));

	}
}
