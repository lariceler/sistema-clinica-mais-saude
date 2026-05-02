package com.clinica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ConsultaServiceTest {

    @Test
    void deveListarConsultasDoMedicoPorData() {
        ConsultaService service = new ConsultaService();

        service.adicionarConsulta("Dr. João", "Larissa Almeida", "10/05/2026", "10:00");
        service.adicionarConsulta("Dra. Ana", "Maria Silva", "10/05/2026", "11:00");

        List<Consulta> consultas = service.listarPorMedicoEData("Dr. João", "10/05/2026");

        assertEquals(1, consultas.size());
        assertEquals("Larissa Almeida", consultas.get(0).getPaciente());
    }

    @Test
    void deveOrdenarConsultasPorHorario() {
        ConsultaService service = new ConsultaService();

        service.adicionarConsulta("Dr. João", "Paciente 2", "10/05/2026", "11:00");
        service.adicionarConsulta("Dr. João", "Paciente 1", "10/05/2026", "09:00");

        List<Consulta> consultas = service.listarPorMedicoEData("Dr. João", "10/05/2026");

        assertEquals("09:00", consultas.get(0).getHorario());
        assertEquals("11:00", consultas.get(1).getHorario());
    }

    @Test
    void deveInformarQuandoNaoHouverConsultas() {
        ConsultaService service = new ConsultaService();

        String mensagem = service.mensagemQuandoNaoHouverConsulta("Dr. João", "10/05/2026");

        assertEquals("Não há consultas para o período selecionado.", mensagem);
    }
}
