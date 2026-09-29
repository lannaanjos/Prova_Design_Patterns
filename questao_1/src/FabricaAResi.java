public class FabricaAResi extends AbsFabrica {
    protected String nome_segurado;
    protected Double valor_imovel;

    public FabricaAResi(String nome_segurado, Double valor_imovel){
        this.nome_segurado = nome_segurado;
        this.valor_imovel = valor_imovel;
    }

    @Override
    AbsApolice fabricaApolice(){
        return new ApoliceResi(nome_segurado, valor_imovel);
    }
}