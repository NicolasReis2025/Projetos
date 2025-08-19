package entities;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double resultado = 0.0;

        do{
            System.out.println(
                    "[1] Adição\n"+
                    "[2] Subtração\n" +
                    "[3] Multiplicação\n" +
                    "[4] Divisão\n" +
                    "[5] Sair"
            );
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            if(opcao == 5){
                break;
            }
            else{
                System.out.print("Digite um valor: ");
                int n1 = sc.nextInt();

                System.out.print("Digite outro valor: ");
                int n2 = sc.nextInt();

                switch(opcao){
                    case 1: {
                        resultado = n1 + n2;
                        System.out.printf("O resultado é %.2f\n", resultado);
                        break;
                    }
                    case 2: {
                        resultado = n1 - n2;
                        System.out.printf("O resultado é %.2f\n", resultado);
                        break;
                    }
                    case 3: {
                        resultado = n1 * n2;
                        System.out.printf("O resultado é %.2f\n", resultado);
                        break;
                    }
                    case 4: {
                        if(n2 != 0){
                            resultado = (double) n1 / n2;
                            System.out.printf("O resultado é %.2f\n", resultado);
                        }
                        else{
                            System.out.println("ERRO: divisão por zero");
                        }
                        break;
                    }
                    default:
                        System.out.println("Opção inválida! tente novamente.");
                }
            }
        } while(opcao != 5);

        System.out.println("Programa encerrado!");

        sc.close();
    }
}

