package br.com.dio.desafio.dominio;

import java.util.ArrayList;

public class Avaliacao {

    private ArrayList<String> questoes;
    private int nota;

    public Avaliacao(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean aprovado(){
        if (this.nota  < 7) return false;
        return true;
    }
}
