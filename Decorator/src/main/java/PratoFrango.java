public class PratoFrango extends PratoDecorator {
    public PratoFrango(Prato prato){

        super(prato);
    }

    @Override
    public float getPrecoPrato() {

        return 7.0f;
    }

    public String getNomePrato(){

        return "Frango";
    }

}
