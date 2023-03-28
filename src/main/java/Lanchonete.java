public class Lanchonete {
    private Lanche lanche;
    private Molhos molhos;

    public Lanchonete (FabricaAbstrata fabrica) {
        this.lanche = fabrica.criarLanche();
        this.molhos = fabrica.criarMolho();
    }

    public String PrepararLanche() {
        return this.lanche.ingrrediente();
    }

    public String prepararMolho() {
        return this.molhos.ingrrediente();
    }
}
