package org.observer;

import java.util.Observable;
import java.util.Observer;

public class Medico implements Observer {
    private String nome;
    private String crm;
    private String ultimaNotificacao;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void participar(Plantao plantao) {
        plantao.addObserver(this);
    }

    public void update(Observable plantao, Object arg) {
        this.ultimaNotificacao = this.nome + ", vaga disponivel no " + plantao.toString();
    }
}
