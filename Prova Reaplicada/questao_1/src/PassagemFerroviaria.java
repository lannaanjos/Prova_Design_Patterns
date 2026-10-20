public class PassagemFerroviaria extends AbsPassagem {
    public PassagemFerroviaria(String nomePassageiro, Double valorTarifa){
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    double calcularTaxa(){ // 3%
        return (valorTarifa * 0.03);
    }

    @Override
    String listarDocumentosExigidos(){
        return "Identidade com foto";
    }

    @Override
    String gerarResumo(){
        return String.format("Passagem Ferroviária | Nome: %s%nTaxa de embarque: R$ %.2f | Documentos exigidos: %s%n", nomePassageiro, calcularTaxa(), listarDocumentosExigidos());
    }

    
}