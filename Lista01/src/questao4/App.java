package questao4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa();
       Pessoa p3 = new Pessoa();

       System.out.println("Digite o nome da primeira pessoa:");
       p1.nome = sc.nextLine();

       System.out.println("Digite o peso de " + p1.nome +":");
       p1.peso = sc.nextDouble();

       System.out.println("Digite a altura de " + p1.nome +":");
       p1.altura = sc.nextDouble();

        System.out.println("Digite o nome da segunda pessoa:");
        p2.nome = sc.nextLine();

        System.out.println("Digite o peso de " + p2.nome +":");
        p2.peso = sc.nextDouble();

        System.out.println("Digite a altura de " + p2.nome +":");
        p2.altura = sc.nextDouble();

        System.out.println("Digite o nome da terceira pessoa:");
        p3.nome = sc.nextLine();

        System.out.println("Digite o peso de " + p3.nome +":");
        p3.peso = sc.nextDouble();

        System.out.println("Digite a altura de " + p3.nome +":");
        p3.altura = sc.nextDouble();

       double imc1 = p1.calcularIMC();
       double imc2 = p2.calcularIMC();
       double imc3 = p3.calcularIMC();

       System.out.println("NOME: "+ p3.nome);
       System.out.println("PESO: "+ p3.peso);
       System.out.println("ALTURA: "+ p3.altura);
       System.out.println("IMC: "+ imc3);

        System.out.println("NOME: "+ p2.nome);
        System.out.println("PESO: "+ p2.peso);
        System.out.println("ALTURA: "+ p2.altura);
        System.out.println("IMC: "+ imc2);

        System.out.println("NOME: "+ p1.nome);
        System.out.println("PESO: "+ p1.peso);
        System.out.println("ALTURA: "+ p1.altura);
        System.out.println("IMC: "+ imc1);

       sc.close();

    }
}
