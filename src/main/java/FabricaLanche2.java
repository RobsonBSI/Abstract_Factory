public class FabricaLanche2 implements FabricaAbstrata{
    @Override
    public Lanche criarLanche() {
        return new LancheFrango();
    }

    @Override
    public Molhos criarMolho() {
        return new MolhoMaioneseTemperada();
    }
}
