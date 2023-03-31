public class PratoArroz extends PratoDecorator {
    public PratoArroz(Prato prato){

        super(prato);
    }

    @Override
    public float getPrecoPrato() {
        return 5.0f;
    }

    public String getNomePrato(){
        return "Arroz";
    }
}
