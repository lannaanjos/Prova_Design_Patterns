public class FabricaBrasil extends AbsFabricaPais {
    private double valorPedido;

    public FabricaBrasil(double valorPedido){
        this.valorPedido = valorPedido;
    }

    @Override
    public AbsDocumentoFiscal criaDocumentoFiscal(){
        return new NFSe(valorPedido);
    }

    @Override
    public AbsPagamento criaPagamento(){
        return new Pix();
    }

    @Override
    public AbsComprovanteMatricula criaComprovante(){
        return new ComprovanteMatriculaBr();
    }
}