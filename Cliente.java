public class Cliente {
    private String nome;
    private String codigo;

    public Cliente(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        return String.format("Nome: %s%n Codigo: %s", nome, codigo);
    }
}