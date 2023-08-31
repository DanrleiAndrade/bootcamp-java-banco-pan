package edu.danrlei.exer4;

public class Operadores {
    
    public static void main(String[] args) {
 
        //concatenacao de palavras
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.print(nomeCompleto);

        //concatenacao de palavras ou caracteres e numeros
        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //operadores unarios
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);

        numero = - numero; //para deixar o valor da variavel negativo
        System.out.println(numero);

        numero = numero * -1; //para deixar o valor da variavel positivo
        System.out.println(numero);

        //incrementacao - Dica: "++" = "+ 1"; "--" = "- 1"
        int numeroCinco = 5;
        numeroCinco = numeroCinco + 2;
        System.out.println(numeroCinco);

        boolean variavelQualquer = true;
        System.out.println(!variavelQualquer); //colocar "!" antes do nome da variavel booleana, vai inverter o valor (true/false-yes/no)

            //outro modo - talvez o melhor - de inverter o valor da variavel booleana:
        boolean variavelQualquer2 = true;
        variavelQualquer2 = !variavelQualquer2;
        System.out.println(variavelQualquer2);

        //operador ternario
        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ?"verdadeiro" : "falso"; //"?" significa caso a condicao seja true
                                                        //":" siginifica caso a condicao seja false
        System.out.println(resultado);


        //relacionais
        
        String firstName = "Danrlei";
        String lastName = "Andrade";
        System.out.println(firstName.equals(lastName)); //para numeros se usa operadores numericos, para texto se usa ".equals()"

        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; 
        System.out.println("numero1 é igual a numero2? " +simNao);

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        simNao = numero1 != numero2; 
        System.out.println("numero1 é diferente a numero2? " +simNao);

        simNao = numero1 > numero2; 
        System.out.println("numero1 é maior a numero2? " +simNao);


        //operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){ /*se a condicao1 e a condicao2 forem true*/
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){ /*se a condicao1 ou a condicao2 for true */
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");


    }

    
}
