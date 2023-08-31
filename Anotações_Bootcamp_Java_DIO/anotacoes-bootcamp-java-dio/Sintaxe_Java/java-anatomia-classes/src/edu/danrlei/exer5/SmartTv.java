package edu.danrlei.exer5;

public class SmartTv {
    boolean ligada = false;
    boolean desligada = true;
    int canal = 1;
    int volume = 25;

    //ligar e desligar
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        desligada = false;
    }

    //volume
    public void aumentarVolume(){
        volume ++; /*é o mesmo que "volume = volume + 1;" */
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --; /*é o mesmo que "volume = volume - 1;" */
        System.out.println("Diminuindo volume para: " + volume);
    }

    //mudar canal
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

}
