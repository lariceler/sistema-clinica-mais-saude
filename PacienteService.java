package com.clinica;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    private List<Paciente> pacientes = new ArrayList<>();

    public boolean cadastrarPaciente(Paciente paciente) {
        if (paciente == null ||
            paciente.getNome() == null || paciente.getNome().isBlank() ||
            paciente.getCpf() == null || paciente.getCpf().isBlank() ||
            paciente.getDataNascimento() == null || paciente.getDataNascimento().isBlank() ||
            paciente.getEmail() == null || paciente.getEmail().isBlank() ||
            paciente.getTelefone() == null || paciente.getTelefone().isBlank()) {
            return false;
        }

        for (Paciente p : pacientes) {
            if (p.getCpf().equals(paciente.getCpf())) {
                return false;
            }
        }

        pacientes.add(paciente);
        return true;
    }

    public int totalPacientes() {
        return pacientes.size();
    }
}
