package com.projeto.pilha;

public class No { //class Nó

    private int dado;
    private No refNO = null;

    //constructors
    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    //getters e setters

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNO() {
        return refNO;
    }

    public void setRefNO(No reNO) {
        this.refNO = reNO;
    }

    //to String

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
