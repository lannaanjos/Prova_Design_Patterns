public class PassagemAerea extends AbsPassagem {
    public PassagemAerea(String nomePassageiro, Double valorTarifa){
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    double calcularTaxa(){ // 8%
        return (valorTarifa * 0.08);
    }

    @Override
    String listarDocumentosExigidos(){
        return "Identidade com foto e bilhete eletrônico";
    }

    @Override
    String gerarResumo(){
        return String.format("Passagem Aérea | Nome: %s%nTaxa de embarque: R$ %.2f | Documentos exigidos: %s%n", nomePassageiro, calcularTaxa(), listarDocumentosExigidos());
    }

    
}