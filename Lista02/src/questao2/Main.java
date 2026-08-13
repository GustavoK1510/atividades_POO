package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.setNome(sc.nextLine());

        System.out.println("Digite o valor do produto: ");
        produto.setValor(sc.nextDouble());

        System.out.println("Digite a quantidade em estoque do produto: ");
        produto.repor(sc.nextInt());

        System.out.println("Valor do produto: "+ produto.getValor());

        produto.repor(-12);

        produto.vender(produto.getEstoque()+1);

        produto.setValor(-4.5);
    }
}
