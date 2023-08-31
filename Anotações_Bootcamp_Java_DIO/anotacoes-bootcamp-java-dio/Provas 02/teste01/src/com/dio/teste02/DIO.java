package com.dio.teste02;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.io.IOException;
import java.util.Scanner;

public class DIO {
 
public static void main(String[] args) throws IOException {
  Scanner leitor = new Scanner(System.in);
  int cont = 0;
  double media = 0;
  double x;
  
     for (int i = 0;i<6;i++) { 		//aqui é porque queremos ler apenas 6 valores
         x = leitor.nextDouble(); 	//"x" lê os inputs
         if(x > 0){					//se "x/input" for maior que 0, media = media + x; e cont = cont + 1; 
             media += x; 
             cont++;
         }
     }
     
     media /=cont ;					//media = media / cont;
     System.out.println(cont + " valores positivos");
     System.out.println(String.format("%.1f", media));
 }
 
}