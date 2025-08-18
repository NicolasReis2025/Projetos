package entities;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> acimaMedia = new ArrayList<>();

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> acimaMediaPares = new ArrayList<>();

        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> acimaMediaImpares = new ArrayList<>();

        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;

        while(true){
            System.out.println("Digite um numero: [insira -1 para encerrar] ");
            int numero = sc.nextInt();
            if(numero == -1){
                System.out.println("programa encerrado! ");
                break;
            }
            else{
                numeros.add(numero);
                somaTotal += numero;

                if(numero % 2 == 0){
                    pares.add(numero);
                    somaPares += numero;
                }
                else{
                    impares.add(numero);
                    somaImpares += numero;
                }
            }
        }
        System.out.printf("Total de numeros inseridos: %d ->  %s\n",numeros.size(), numeros);

        if(numeros.size() > 0){
            double mediaTotal = (double) somaTotal / numeros.size();
            System.out.printf("Media dos numeros inseridos: %.2f\n", mediaTotal);
            for(int i: numeros){
                if(i > mediaTotal){
                    acimaMedia.add(i);
                }
            }
            if(acimaMedia.size() > 0){
                System.out.printf("Total de numeros acima da média: %d -> %s", acimaMedia.size(), acimaMedia);
        }
            else{
                System.out.println("Nenhum numero inserido está acima da média!");
            }
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        if(pares.size() > 0){
            double mediaPares = (double) somaPares / pares.size();
            System.out.printf("Total de numeros pares: %d -> %s\n", pares.size(), pares);
            System.out.printf("Media dos numeros pares: %.2f\n", mediaPares);
            for(int i: pares){
                if(i > mediaPares){
                    acimaMediaPares.add(i);
                }
            }
            if(acimaMediaPares.size() > 0){
                System.out.printf("Total de numeros pares acima da média: %d -> %s\n", acimaMediaPares.size(), acimaMediaPares);
            }
            else{
                System.out.println("Não foi inserido nenhum numero inserido está acima da média dos pares");
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        if(impares.size() > 0){
            double mediaImpares = (double) somaImpares / impares.size();
            System.out.printf("Total de numeros impares: %d -> %s\n",impares.size(), impares);
            System.out.printf("media dos numeros impares: %.2f\n", mediaImpares);
            for(int i: impares){
                if(i > mediaImpares){
                    acimaMediaImpares.add(i);
                }
            }
            if(acimaMediaImpares.size() > 0){
                System.out.printf("Total de numeros impares acima da média: %d -> %s\n", acimaMediaImpares.size(), acimaMediaImpares);
            }
            else{
                System.out.println("Nenhum numero impar inserido acima da média!");
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        sc.close();
    }
}
