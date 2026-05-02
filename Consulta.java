package com.clinica;

public class Consulta {
    private String medico;
    private String paciente;
    private String data;
    private String horario;

    public Consulta(String medico, String paciente, String data, String horario) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }
}
