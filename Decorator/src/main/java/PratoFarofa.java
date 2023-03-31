public class PratoFarofa implements Prato {
    public float preco;

    public PratoFarofa() {
    }
    public PratoFarofa(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {

        return preco;
    }

    @Override
    public String getIngredientes() {
        return "Farofa";
    }
}
