public class FabricaChile extends AbsFabricaPais {
    private double valorPedido;

    public FabricaChile(double valorPedido){
        this.valorPedido = valorPedido;
    }

    @Override
    public AbsDocumentoFiscal criaDocumentoFiscal(){
        return new IVA(valorPedido);
    }

    @Override
    public AbsPagamento criaPagamento(){
        return new WebPay();
    }

    @Override
    public AbsComprovanteMatricula criaComprovante(){
        return new ComprovanteMatriculaCh();
    }
}