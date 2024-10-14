public class EJ4 {
    public static void main(String[] args) {

        String[] clientes = {
                "Juan Pérez", "María Gómez", "Carlos Sánchez", "Ana López", "Pedro Fernández"
        };

        int[] compras = {15, 6, 12, 3, 19};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes que califican para un 10% de descuento:");

        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Compras realizadas: " + compras[i] + " - ¡Aplica un 10% de descuento!");
            }
        }
    }
}
