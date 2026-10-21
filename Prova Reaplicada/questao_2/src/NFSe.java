public class NFSe extends AbsDocumentoFiscal {
    private double valorPedido;

    public NFSe(double valorPedido){
        this.valorPedido = valorPedido;
    }

    private double calculaValor(){
        return valorPedido * 0.05;
    }

    @Override
    public String descreverDocFiscal(){
        return String.format("Documento fiscal: NFSe com ISS | Valor R$ %.2f", calculaValor());
    }
}