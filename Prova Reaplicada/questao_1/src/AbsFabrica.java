
public abstract class AbsFabrica {
    abstract AbsPassagem fabricaPassagem();

    public void criar(){
        AbsPassagem apolice = fabricaPassagem();
        System.out.println(apolice.gerarResumo());
    }
}