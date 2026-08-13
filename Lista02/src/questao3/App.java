package questao3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.print("Número da primeira conta: ");
        conta1.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.print("Titular da primeira conta: ");
        conta1.setTitular(sc.nextLine());

        System.out.print("Número da segunda conta: ");
        conta2.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.print("Titular da segunda conta: ");
        conta2.setTitular(sc.nextLine());

        conta1.depositar(1000.00);
        conta1.depositar(700.00);

        conta2.depositar(5000.00);

        conta2.sacar(3000.00);

        conta2.transferir(conta1, 1800.00);

        System.out.println("SALDOS FINAIS");
        System.out.printf("Conta 1: %s: R$ %.2f%n", conta1.getTitular(), conta1.getSaldo());

        System.out.printf("Conta 2: %s: R$ %.2f%n", conta2.getTitular(), conta2.getSaldo());

        sc.close();
    }
}