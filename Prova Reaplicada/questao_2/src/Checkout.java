public class Checkout {
    private AbsFabricaPais fabrica;

    public Checkout(AbsFabricaPais fabrica){
        this.fabrica = fabrica;
    }

    public void finalizarPedido(){
        AbsDocumentoFiscal documento = fabrica.criaDocumentoFiscal();
        AbsPagamento pagamento = fabrica.criaPagamento();
        AbsComprovanteMatricula comprovante = fabrica.criaComprovante();

        System.out.println(documento.descreverDocFiscal());
        System.out.println(pagamento.descreverPagamento());
        System.out.println(comprovante.informarComprovante());
    }
}