package edu.danrlei.exer5;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume(); /*mudando o volume */
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Tv ligada : " + smartTv.ligada); /*status da TV */
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.ligar(); /*ligar e desligar */
        System.out.println("Novo status -> Tv ligada : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv desligada : " + smartTv.desligada);

        smartTv.mudarCanal(13); /*novo canal */
        System.out.println("Canal atual : " + smartTv.canal);
    }

}
