package com.dio.teste01;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("CARculadora - Danrlei Produções");
	    System.out.println("===============================");
	    
	    System.out.println("Digite o valor de fábrica: ");
	    int custoFabrica = scan.nextInt();
	    
	    System.out.println("Digite a porcentagem do distribuidor: ");
	    int porcentagemDistribuidor = scan.nextInt();
	    
	    System.out.println("Digite a porcentagem do imposto: ");
	    int porcentagemImposto = scan.nextInt();
	    
	    int valorDistribuidor;
	    int valorImposto;
	    int custoConsumidor;
	    
	    valorDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
	    valorImposto = (custoFabrica * porcentagemImposto) / 100;
	    custoConsumidor = custoFabrica + valorImposto + valorDistribuidor;
	    
	    System.out.println("O valor final do veículo para o consumidor será: " + custoConsumidor);
	    
		
	}
	
	/*==============RESPOSTA TESTE DIO============RESPOSTA TESTE DIO============
	 
	 import java.util.*;

	public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();
        
        int valorDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int valorImpostos = (custoFabrica * percentualImpostos) / 100;
        int precoFinal = custoFabrica + valorDistribuidor + valorImpostos;
        
        System.out.println(precoFinal);
    	}
	}
	 */
	 
}