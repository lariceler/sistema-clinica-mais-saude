package com.clinica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteServiceTest {

    @Test
    void deveCadastrarPacienteComSucesso() {
        PacienteService service = new PacienteService();

        boolean resultado = service.cadastrarPaciente(
                new Paciente("Larissa Almeida", "12345678900", "27/04/2004", "larissa@email.com", "61999999999")
        );

        assertTrue(resultado);
        assertEquals(1, service.totalPacientes());
    }

    @Test
    void naoDevePermitirCpfDuplicado() {
        PacienteService service = new PacienteService();

        service.cadastrarPaciente(
                new Paciente("Larissa Almeida", "12345678900", "27/04/2004", "larissa@email.com", "61999999999")
        );

        boolean resultado = service.cadastrarPaciente(
                new Paciente("Maria Silva", "12345678900", "10/05/2000", "maria@email.com", "61988888888")
        );

        assertFalse(resultado);
        assertEquals(1, service.totalPacientes());
    }

    @Test
    void naoDeveCadastrarPacienteComCampoObrigatorioVazio() {
        PacienteService service = new PacienteService();

        boolean resultado = service.cadastrarPaciente(
                new Paciente("", "12345678900", "27/04/2004", "larissa@email.com", "61999999999")
        );

        assertFalse(resultado);
    }
}
