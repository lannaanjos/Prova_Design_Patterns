public class ApoliceAuto extends AbsApolice {
    protected String nome_segurado;
    protected Double valor_veiculo;

    public ApoliceAuto(String nome_segurado, Double valor_veiculo){
        this.nome_segurado = nome_segurado;
        this.valor_veiculo = valor_veiculo;
    }

    @Override
    double calculaPremio(){
        return (valor_veiculo * 0.08)/12;
    }

    @Override
    String documentos_exigidos(){
        return "CNH e CRLV";
    }

    @Override
    String geraResumo(){
        return ("Apolice Auto:\nNome segurado" + nome_segurado + "Prêmio: R$ " + calculaPremio() + "Documentos exigidos: " + documentos_exigidos());
    }
}