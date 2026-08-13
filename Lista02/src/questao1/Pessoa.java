package questao1;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    double calcularIMC() {
        double imc = peso/(altura*altura);
        return imc;
    }

    public void mostrarPessoa() {
        System.out.println("Nome: " + getNome());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("IMC: " + calcularIMC());
    }
}
