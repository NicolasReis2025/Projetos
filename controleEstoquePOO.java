package entities;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Deseja adicionar uma quantidade inicial: (s/n)");
        sc.nextLine();
        char resp = sc.nextLine().toLowerCase().charAt(0);
        Estoque dados;

        if(resp != 'n'){
            System.out.println("Quantidade inicial: ");
            int quantidadeInicial = sc.nextInt();
            dados = new Estoque(nomeProduto, valorProduto, quantidadeInicial);
            System.out.println(dados);
        }
        else{
            dados = new Estoque(nomeProduto, valorProduto);
        }

        System.out.println("Adicionar quantidade: ");
        int adicionarQuantidade = sc.nextInt();
        dados.adicionarProduto(adicionarQuantidade);

        System.out.println("Dados atualizados: ");
        System.out.println(dados);

        System.out.println();
        System.out.println("Remover quantidade: ");
        int removerQuantidade = sc.nextInt();
        dados.removerProduto(removerQuantidade);
        System.out.println("Dados atualizados: ");
        System.out.println(dados);

        sc.close();
    }
}
package entities;

public class Estoque{
    private String nomeProduto;
    private Double valorProduto;
    private int quantidadeProduto;

    public Estoque(String nomeProduto, double valorProduto, int quantidadeProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Estoque(String nomeProduto, Double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = 0;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public int adicionarProduto(int quantidade){
        return this.quantidadeProduto += quantidade;
    }

    public int removerProduto(int quantidade){
        return this.quantidadeProduto -= quantidade;
    }

    public double valorEstoque(){
        return valorProduto * quantidadeProduto;
    }

    public String toString(){
        return "Nome do produto: " + nomeProduto +
                "\nValor do produto: R$" + String.format("%.2f", valorProduto) +
                "\nQuantidade: " + quantidadeProduto +
                "\nValor de estoque: " + String.format("%.2f", valorEstoque());
    }
}
