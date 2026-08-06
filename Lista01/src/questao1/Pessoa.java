package questao1;

public class Pessoa {
    double altura;
    double peso;

    double calcularIMC() {
        double imc = peso/(altura*altura);
        return imc;
    }
}
