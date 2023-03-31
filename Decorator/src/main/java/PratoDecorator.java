public abstract class PratoDecorator implements Prato {

    private Prato prato;
    public String ingredientes;

    public PratoDecorator(Prato prato){

        this.prato = prato;
    }

    public Prato getPrato() {

        return prato;
    }

    public void setPrato(Prato prato) {

        this.prato = prato;
    }

    public abstract float getPrecoPrato();

    @Override
    public float getPreco(){
        return this.prato.getPreco() + ( this.getPrecoPrato());
    }

    public abstract String getNomePrato();

    @Override
    public String getIngredientes() {
        return this.prato.getIngredientes() + "/" + this.getNomePrato();
    }

    public void setIngredientes(String ingredientes) {

        this.ingredientes = ingredientes;
    }

}
