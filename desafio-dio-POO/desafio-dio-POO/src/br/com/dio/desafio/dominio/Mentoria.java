package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo { //tudo que tem em "Conteudo", tem em mentoria. Mas nem tudo que tem em "Mentoria", tem em conteúdo.

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
