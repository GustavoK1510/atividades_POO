package questao3;

import questao3.Pessoa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa();
       Pessoa p3 = new Pessoa();

       System.out.println("Digite o peso da pessoa 1:");
       p1.peso = sc.nextDouble();

       System.out.println("Digite a altura da pessoa 1:");
       p1.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 2:");
        p2.peso = sc.nextDouble();

        System.out.println("Digite a altura da pessoa 2:");
        p2.altura = sc.nextDouble();

        System.out.println("Digite o peso da pessoa 3:");
        p3.peso = sc.nextDouble();

        System.out.println("Digite a altura da pessoa 3:");
        p3.altura = sc.nextDouble();

       double imc1 = p1.calcularIMC();
       double imc2 = p2.calcularIMC();
       double imc3 = p3.calcularIMC();

       System.out.println("IMC da pessoa 1: "+imc1);
       System.out.println("IMC da pessoa 2: "+imc2);
       System.out.println("IMC da pessoa 3: "+imc3);

       sc.close();

    }
}
