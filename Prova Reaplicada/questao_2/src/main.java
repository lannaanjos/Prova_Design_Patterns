

public class main {
    public static void main(String[] args) {
        Checkout pedidoBrasil = new Checkout(new FabricaBrasil(800.00));
        pedidoBrasil.finalizarPedido();

        Checkout pedidoChile = new Checkout(new FabricaChile(700.00));
        pedidoChile.finalizarPedido();
    }
}