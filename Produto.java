public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    
    public Produto(int umCodigo, double umPreco, String umNome) {
        umCodigo = codigo;
        umPreco = preco;
        umNome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return String.format("Nome: %s%n Codigo: %d%n Preco: %.2f%n");
    }
}
