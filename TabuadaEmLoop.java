import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" === GERADOR DE TABUADA === ")
        while(true){
            System.out.println("Digite um numero: [insira -1 para encerrar] ");
            int numero = sc.nextInt();

            if(numero == -1){
                System.out.println("Programa encerrado!");
                break;
            }
            else{
                for(int i=1; i < 11;i++){
                    System.out.printf("%d x %d = %d\n", numero, i, numero*i);
                }
            }
        }
        sc.close();
    }
}

