package org.observer;

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
        plantao.
    }
}
