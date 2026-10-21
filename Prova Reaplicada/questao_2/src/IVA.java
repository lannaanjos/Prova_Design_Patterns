public class IVA extends AbsDocumentoFiscal {
    private double valorPedido;

    public IVA(double valorPedido){
        this.valorPedido = valorPedido;
    }

    private double calculaValor(){
        return valorPedido * 0.19;
    }

    @Override
    public String descreverDocFiscal(){
        return String.format("Documento fiscal: IVA | Valor: R$ %.2f", calculaValor());
    }
}