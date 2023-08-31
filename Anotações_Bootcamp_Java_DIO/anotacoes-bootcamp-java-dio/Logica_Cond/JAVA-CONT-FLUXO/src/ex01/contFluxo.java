package ex01;

public class contFluxo {
    
    public static void main(String[] args) {
        
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        /*switchNumero();
        switchFerias();*/
        
    }

    private static void ifFlecha() { /*esse efeito "flecha" deve ser evitado, sinal de mal projetado */

        int mes = 2;
        if (mes == 1) {
            System.out.println("janeiro");
        } else {
            if (mes == 2) {
                System.out.println("fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("março");
                } else {
                    if (mes == 4) {
                        System.out.println("abril");
                    }
                }
            }

        }

    }

    private static void ifSemFlecha() { /*mais recomendado que o exemplo acima */

        int mes = 3;
        if (mes == 1) {
            System.out.println("janeiro");
        } else if (mes == 2) {
            System.out.println("fevereiro");
        } else if (mes == 3) {
            System.out.println("março");
        } else if (mes == 4) {
            System.out.println("abril");
        }
    }

    private static void ifFerias() { /*não recomendado. preferível usar switch neste caso */
        
        String mes = "janeiro";
        if (mes == "janeiro" || mes == "abril" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes > mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxílio");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio");
        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }

    }

    private static void switchSemana() {
        
        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            default:
                System.out.println("valor indefinido");
                break;

        }
    }

}
