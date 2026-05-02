package com.clinica;

import java.util.HashSet;
import java.util.Set;

public class AgendamentoService {
    private Set<String> horariosOcupados = new HashSet<>();

    public boolean agendarConsulta(String paciente, String medico, String data, String horario) {
        if (paciente == null || paciente.isBlank() ||
            medico == null || medico.isBlank() ||
            data == null || data.isBlank() ||
            horario == null || horario.isBlank()) {
            return false;
        }

        String chave = medico + "-" + data + "-" + horario;

        if (horariosOcupados.contains(chave)) {
            return false;
        }

        horariosOcupados.add(chave);
        return true;
    }
}
