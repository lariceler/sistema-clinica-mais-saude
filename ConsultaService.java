package com.clinica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaService {
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionarConsulta(String medico, String paciente, String data, String horario) {
        consultas.add(new Consulta(medico, paciente, data, horario));
    }

    public List<Consulta> listarPorMedicoEData(String medico, String data) {
        return consultas.stream()
                .filter(c -> c.getMedico().equals(medico) && c.getData().equals(data))
                .sorted(Comparator.comparing(Consulta::getHorario))
                .collect(Collectors.toList());
    }

    public String mensagemQuandoNaoHouverConsulta(String medico, String data) {
        if (listarPorMedicoEData(medico, data).isEmpty()) {
            return "Não há consultas para o período selecionado.";
        }
        return "Consultas encontradas.";
    }
}
