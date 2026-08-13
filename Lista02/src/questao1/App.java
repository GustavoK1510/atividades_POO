package questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        System.out.println("Digite o nome da primeira pessoa:");
        p1.setNome(sc.nextLine());

        System.out.println("Digite o peso de " + p1.getNome() +":");
        p1.setPeso(sc.nextDouble());

        System.out.println("Digite a altura de " + p1.getNome() +":");
        p1.setAltura(sc.nextDouble());

        System.out.println("Digite o nome da segunda pessoa:");
        p2.setNome(sc.nextLine());

        System.out.println("Digite o peso de " + p2.getNome() +":");
        p2.setPeso(sc.nextDouble());

        System.out.println("Digite a altura de " + p2.getNome() +":");
        p2.setAltura(sc.nextDouble());

        System.out.println("Digite o nome da terceira pessoa:");
        p3.setNome(sc.nextLine());

        System.out.println("Digite o peso de " + p3.getNome() +":");
        p3.setPeso(sc.nextDouble());

        System.out.println("Digite a altura de " + p3.getNome() +":");
        p3.setAltura(sc.nextDouble());

        p1.mostrarPessoa();
        p2.mostrarPessoa();
        p3.mostrarPessoa();

        sc.close();

    }
}
