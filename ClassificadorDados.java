package entities;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> pesos = new ArrayList<>();

        int totalIdades = 0;
        double totalPeso = 0.0;

        System.out.println("Digite o numero de pessoas cadastradas: ");
        int quantidadepessoas = sc.nextInt();

        for(int i=0; i < quantidadepessoas; i++){
            System.out.println((i+1) + "# pessoa");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("idade: ");
            int idade = sc.nextInt();
            totalIdades += idade;

            System.out.print("peso: ");
            double peso = sc.nextDouble();
            totalPeso += peso;

            nomes.add(nome);
            idades.add(idade);
            pesos.add(peso);
        }

        int maiorIdade = idades.get(0);
        int posMaiorIdade = 0;

        int menorIdade = idades.get(0);
        int posMenorIdade = 0;

        double mediaIdade = (double) totalIdades / idades.size();

        for(int i=0; i < idades.size(); i++){
            if(idades.get(i) > maiorIdade){
                maiorIdade = idades.get(i);
                posMaiorIdade = i;
            }

            if(idades.get(i) < menorIdade){
                menorIdade = idades.get(i);
                posMenorIdade = i;
            }
        }
        System.out.println("==== RESULTADOS ====");
        System.out.printf("media do grupo de idade: %.2f anos de idade\n ", mediaIdade);
        System.out.println("Pessoa mais velha: ");
        System.out.printf("Nome: %s\nIdade: %d anos de idade\n", nomes.get(posMaiorIdade), maiorIdade);
        System.out.println();
        System.out.println("Pessoa mais nova: ");
        System.out.printf("Nome: %s\nIdade: %d anos de idade\n", nomes.get(posMenorIdade), menorIdade);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        double maiorPeso = Collections.max(pesos);
        int posMaiorPeso = pesos.indexOf(maiorPeso);

        double menorPeso = Collections.min(pesos);
        int posMenorPeso = pesos.indexOf(menorPeso);

        double mediaPeso = totalPeso / pesos.size();

        System.out.printf("Media do grupo de peso: %.2fkg\n", mediaPeso);
        System.out.println("Pessoa com o maior peso: ");
        System.out.printf("Nome: %s\nPeso: %.2fkg\n", nomes.get(posMaiorPeso), maiorPeso);
        System.out.println();
        System.out.println("Pessoa com o menor peso: ");
        System.out.printf("Nome: %s\nPeso: %.2fKg\n", nomes.get(posMenorPeso), menorPeso);
        
        sc.close();
    }
}
