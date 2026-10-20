public class FabricaAerea extends AbsFabrica {
    protected String nomePassageiro;
    protected double valorTarifa;

    public FabricaAerea(String nomePassageiro, Double valorTarifa){
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    AbsPassagem fabricaPassagem(){
        return new PassagemAerea(nomePassageiro, valorTarifa);
    }
}