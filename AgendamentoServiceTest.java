package com.clinica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgendamentoServiceTest {

    @Test
    void deveAgendarConsultaComSucesso() {
        AgendamentoService service = new AgendamentoService();

        boolean resultado = service.agendarConsulta("Larissa Almeida", "Dr. João", "10/05/2026", "10:00");

        assertTrue(resultado);
    }

    @Test
    void naoDevePermitirHorarioDuplicadoParaMesmoMedico() {
        AgendamentoService service = new AgendamentoService();

        service.agendarConsulta("Larissa Almeida", "Dr. João", "10/05/2026", "10:00");
        boolean resultado = service.agendarConsulta("Maria Silva", "Dr. João", "10/05/2026", "10:00");

        assertFalse(resultado);
    }

    @Test
    void naoDeveAgendarComCamposObrigatoriosVazios() {
        AgendamentoService service = new AgendamentoService();

        boolean resultado = service.agendarConsulta("", "Dr. João", "10/05/2026", "10:00");

        assertFalse(resultado);
    }
}
