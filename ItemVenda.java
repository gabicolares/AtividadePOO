public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(int umaQtde, Produto umProd) {
        umaQtde = quantidade;
        umProd = prod;
    }

    public double getValor() {
        double val = quantidade * prod.getPreco();
        
        return val;
    }

    public String toString() {
        return String.format("Valor: %n");
    }


}