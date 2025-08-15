import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<String> meses = new ArrayList<>(Arrays.asList(
                "janeiro", "fevereiro", "março", "abril", "maio",
                "junho", "julho", "agosto", "setembro", "outubro",
                "novembro", "dezembro"
        ));

        double total = 0.0;
        int contador = 0;

        for (String mes : meses) {
            System.out.println("Mês: " + mes);
            System.out.print("Valor gasto: R$");
            double gastoMes = sc.nextDouble();

            total += gastoMes;
            contador++;
            double mediaParcial = total / contador;

            System.out.printf("Total gasto até o momento: R$%.2f\n", total);
            System.out.printf("Quantidade de meses até o momento: %d\n", contador);
            System.out.printf("Média dos gastos: R$%.2f\n", mediaParcial);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        }

        double mediaFinal = total / meses.size();
        System.out.println("===== RESUMO ANUAL =====");
        System.out.printf("Total gasto no ano: R$%.2f\n", total);
        System.out.printf("Média mensal: R$%.2f\n", mediaFinal);

        sc.close();
    }
}

