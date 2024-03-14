package model;

import java.util.Date;

public class Contrato {
    Date fechaInicio;
    Date fechaFin;
    int jornada;
    int numeroContrato;
    double salario;
    Persona persona;

    public Contrato() {
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.jornada = 0;
        this.numeroContrato = 0;
        this.salario = 0.0;
        this.persona = new Persona();
    }

    public Contrato(Date fechaInicio, Date fechaFin, int jornada, int numeroContrato, double salario, Persona persona) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.jornada = jornada;
        this.numeroContrato = numeroContrato;
        this.salario = salario;
        this.persona = persona;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public int getJornada() {
        return jornada;
    }
    public void setJornada(int jornada) {
        this.jornada = jornada;
    }
    public int getNumeroContrato() {
        return numeroContrato;
    }
    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    
}
