package com.projetovscode.nonovo;

public class NoNovo {

    private String conteudo;
    private NoNovo proximoNo;

    public NoNovo(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public NoNovo getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoNovo proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}


