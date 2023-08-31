package com.projeto.no;

public class Main {

    public static void main(String[] args) {

        No<String> no1 = new No<>( "Conteúdo no1"); //aqui, para puxar o "conteudo", clicar em apóstofo ou aspas

        No<String> no2 = new No<>("Conteúdo no2");
        //fazendo o encademanto entre no1 e no2:
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteúdo no3");
        //fazendo o encademanto entre no2 e no3:
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo no4");
        //fazendo o encademanto entre no3 e no4:
        no3.setProximoNo(no4);

        //Assim no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("--------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }

}
