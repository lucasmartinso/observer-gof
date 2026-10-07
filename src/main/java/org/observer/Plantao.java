package org.observer;

import java.util.Date;
import java.util.Observable;

public class Plantao extends Observable {
    private String turno;
    private Date horaInicio;
    private Date horaFim;
    private String especialidade;
    private Float valor;

    public Plantao(String turno, Date horaInicio, Date horaFim, String especialidade, Float valor) {
        this.turno = turno;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.especialidade = especialidade;
        this.valor = valor;
    }

    public void notificarVaga() {
        setChanged();
        notifyObservers();
    }

    public String toString() {
        return "Plantao{" +
                "turno= " + turno + '\'' +
                ", horaInicio= " + horaInicio + '\'' +
                ", horaInicio= " + horaFim +  '\'' +
                ", especialidade= " + especialidade + '\'' +
                ", valor= " + valor + '\'' +
                "}";
    }
}