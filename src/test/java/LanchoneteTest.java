import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanchoneteTest {
    @Test
    void devePreparaLancheArt() {
        FabricaAbstrata fabrica = new FabricaLanche();
        Lanchonete lanche1 = new Lanchonete(fabrica);
        assertEquals("Lanche artesanal pronto !", lanche1.PrepararLanche());
    }
    @Test
    void devePreparaLancheFra() {
        FabricaAbstrata fabrica = new FabricaLanche2();
        Lanchonete lanche2 = new Lanchonete(fabrica);
        assertEquals("Lanche Frango pronto !", lanche2.PrepararLanche());
    }
    @Test
    void devePreparaMolhoBar() {
        FabricaAbstrata fabrica = new FabricaLanche();
        Lanchonete molho1 = new Lanchonete(fabrica);
        assertEquals(" Barbecue pronto !", molho1.prepararMolho());
    }
    @Test
    void devePreparaMolhoMai() {
        FabricaAbstrata fabrica = new FabricaLanche2();
        Lanchonete molho2= new Lanchonete(fabrica);
        assertEquals("Maionese Temperada pronto !",  molho2.prepararMolho());
    }
}