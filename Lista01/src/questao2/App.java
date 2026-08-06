package questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

       System.out.println("Digite seu peso:");
       p1.peso = sc.nextDouble();

       System.out.println("Digite sua altura:");
       p1.altura = sc.nextDouble();

       double imc = p1.calcularIMC();
       System.out.println("IMC: "+imc);

       sc.close();

    }
}
