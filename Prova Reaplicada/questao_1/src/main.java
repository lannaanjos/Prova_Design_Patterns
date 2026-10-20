public class main {
    public static void main(String[] args) {
        AbsFabrica fabricaAerea = new FabricaAerea("Lanna", 500.00);
        fabricaAerea.criar();

        AbsFabrica fabricaFerroviaria = new FabricaFerroviaria("Marcos", 400.00);
        fabricaFerroviaria.criar();

        AbsFabrica fabricaRodoviaria = new FabricaRodoviaria("Bruna", 800.00);
        fabricaRodoviaria.criar();
    }
}