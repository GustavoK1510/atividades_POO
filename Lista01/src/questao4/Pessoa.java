package questao4;

public class Pessoa {
    String nome;
    double altura;
    double peso;

    double calcularIMC() {
        double imc = peso/(altura*altura);
        return imc;
    }
}
