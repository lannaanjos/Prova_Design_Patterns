public class FabricaFerroviaria extends AbsFabrica {
    protected String nomePassageiro;
    protected double valorTarifa;

    public FabricaFerroviaria(String nomePassageiro, Double valorTarifa){
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    AbsPassagem fabricaPassagem(){
        return new PassagemFerroviaria(nomePassageiro, valorTarifa);
    }
}