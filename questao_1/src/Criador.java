public class Criador {
    public static void main(String[] args){
        AbsFabrica fabricaAuto = new FabricaAAuto("Lanna", 75_000.00);
        AbsApolice auto = fabricaAuto.fabricaApolice();
        System.out.println(auto.geraResumo());


        AbsFabrica fabricaResi = new FabricaAResi("Arthur", 350_000.00);
        AbsApolice residencia = fabricaResi.fabricaApolice();
        System.out.println(residencia.geraResumo());

        AbsFabrica fabricaVida = new FabricaAVida("Bruna", 50_000.00);
        AbsApolice vida = fabricaVida.fabricaApolice();
        System.out.println(vida.geraResumo());
    }
}