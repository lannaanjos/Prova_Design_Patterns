public abstract class AbsPassagem{
    protected String nomePassageiro;
    protected Double valorTarifa;

    abstract double calcularTaxa();
    abstract String listarDocumentosExigidos();
    abstract String gerarResumo();
}