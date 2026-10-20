public class PassagemRodoviaria extends AbsPassagem {
    public PassagemRodoviaria(String nomePassageiro, Double valorTarifa){
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    double calcularTaxa(){ // 5%
        return (valorTarifa * 0.05);
    }

    @Override
    String listarDocumentosExigidos(){
        return "Identidade com foto e comprovante de reserva";
    }

    @Override
    String gerarResumo(){
        return String.format("Passagem Ferroviária | Nome: %s%nTaxa de embarque: R$ %.2f | Documentos exigidos: %s%n", nomePassageiro, calcularTaxa(), listarDocumentosExigidos());
    }

    
}