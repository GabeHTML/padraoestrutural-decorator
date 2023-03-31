import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PratoTest {
    @Test
    void deveRetornarPrecoDoSorvete(){
        Prato prato = new PratoFarofa(3.00f);
        assertEquals(3.00f, prato.getPreco());
    }

    @Test
    void deveRetornarPrecoDoPratoArroz() {
        Prato prato = new PratoArroz(new PratoFarofa(3.00f));
        assertEquals(8.00f, prato.getPreco());
    }

    @Test
    void deveRetornarPrecoDoPratoFrango() {
        Prato prato = new PratoFrango(new PratoFarofa(3.00f));
        assertEquals(10.00f, prato.getPreco());
    }

    @Test
    void deveRetornarPrecoDoPratoFeijao() {
        Prato prato = new PratoFeijao(new PratoFarofa(3.00f));
        assertEquals(13.00f, prato.getPreco());
    }


    @Test
    void deveRetornarPrecoDoPratoArrozEFrango() {
        Prato prato = new PratoFrango(new PratoArroz(new PratoFarofa(3.00f)));
        assertEquals(15.00f, prato.getPreco());
    }

    @Test
    void deveRetornarPrecoDoPratoArrozEFeijao() {
        Prato prato = new PratoArroz(new PratoFeijao(new PratoFarofa(3.00f)));
        assertEquals(18.00f, prato.getPreco());
    }

    @Test
    void deveRetornarPrecoDoPratoFrangoEFeijao() {
        Prato prato = new PratoFrango(new PratoFeijao(new PratoFarofa(3.00f)));
        assertEquals(20.00f, prato.getPreco());
    }

    @Test
    void deveRetornarPrecoDoPratoFeijaoEArroz() {
        Prato prato = new PratoFrango(new PratoFeijao(new PratoArroz(new PratoFarofa(3.00f))));
        assertEquals(25.00f, prato.getPreco());
    }


    @Test
    void deveRetornarIngredientesDoPrato() {
        Prato prato = new PratoFarofa(3.00f);
        assertEquals("Farofa", prato.getIngredientes());
    }


    @Test
    void deveRetornarIngredientesDoPratoArroz() {
        Prato prato = new PratoArroz(new PratoFarofa(3.00f));
        assertEquals("Farofa e Arroz", prato.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoPratoFrango() {
        Prato prato = new PratoFrango(new PratoFarofa(3.00f));
        assertEquals("Farofa e Frango", prato.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoPratoFeijao() {
        Prato prato = new PratoFeijao(new PratoFarofa(3.00f));
        assertEquals("Farofa e Feijao", prato.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoPratoSorveteFrangoEArroz() {
        Prato prato = new PratoFrango(new PratoArroz(new PratoFarofa(3.00f)));
        assertEquals("Frango e Arroz", prato.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoPratoArrozEFeijao() {
        Prato prato = new PratoArroz(new PratoFeijao(new PratoFarofa(3.00f)));
        assertEquals("Arroz e Feijao", prato.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesDoPratoFranfoEFeijao() {
        Prato sorvete = new PratoFrango(new PratoFeijao(new PratoFarofa(3.00f)));
        assertEquals("Frango e Feijao", sorvete.getIngredientes());
    }

    @Test
    void deveRetornarIngredienteDoPratoFrangoFeijaoEArroz() {
        Prato prato = new PratoFrango(new PratoFeijao(new PratoArroz(new PratoFarofa(3.00f))));
        assertEquals("Morango, Chocolate e Baunilha", prato.getIngredientes());
    }
    
}
