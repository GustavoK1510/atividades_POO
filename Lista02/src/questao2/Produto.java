package questao2;

public class Produto {
    private String nome;
    private double valor;
    private int estoque;

    Produto() {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
        else {
            System.out.println("Digite um valor positivo.");
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void vender(int quantidade) {
        if (quantidade < this.estoque) {
            this.estoque -= quantidade;
        }
        else {
            System.out.println("Quantidade insuficiente.");
        }
    }

    public void repor(int quantidade) {
        if (quantidade >=1) {
            this.estoque += quantidade;
        }
        else {
            System.out.println("Digite um valor positivo.");
        }
    }
}
