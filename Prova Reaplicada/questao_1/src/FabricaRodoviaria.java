public class FabricaRodoviaria extends AbsFabrica {
    protected String nomePassageiro;
    protected double valorTarifa;

    public FabricaRodoviaria(String nomePassageiro, Double valorTarifa){
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    AbsPassagem fabricaPassagem(){
        return new PassagemRodoviaria(nomePassageiro, valorTarifa);
    }
}