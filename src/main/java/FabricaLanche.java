public class FabricaLanche implements FabricaAbstrata{
    @Override
    public Lanche criarLanche() {
        return new LancheArtesanal();
    }

    @Override
    public Molhos criarMolho() {
        return new MolhoBarbecue();
    }
}
