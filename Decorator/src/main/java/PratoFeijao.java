public class PratoFeijao extends PratoDecorator {
    public PratoFeijao(Prato prato){
        super(prato);
    }

    @Override
    public float getPrecoPrato() {
        return 10.0f;
    }

    public String getNomePrato(){
        return "Feijao";
    }
}
