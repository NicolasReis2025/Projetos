import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        while(true){
            System.out.print("Deseja adicionar um produto? (s/n)");
            char resp = sc.nextLine().toLowerCase().charAt(0);
            if(resp == 'n'){
                System.out.println("Programa encerrado!");
                break;
            }
            else{
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();

                System.out.print("Preço do produto: ");
                double precoProduto = sc.nextDouble();
                sc.nextLine();

                nomes.add(nomeProduto);
                precos.add(precoProduto);

                System.out.println("Produtos cadastrados: ");
                for(int i=0; i < nomes.size(); i++){
                    System.out.printf("Produto: %s - valor: R$%s\n", nomes.get(i), precos.get(i));
                }
            }
        }
        
        sc.close();
    }
}
