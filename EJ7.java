public class EJ7 {
    public static void main(String[] args) {
        double[] compras = {450.00, 600.50, 700.00, 350.25, 520.80};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        double tasaDescuento = 0.15; // 15% de descuento
        System.out.println("Montos finales de las compras después de aplicar el descuento:");

        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double descuento = compras[i] * tasaDescuento;
                double montoConDescuento = compras[i] - descuento;

                System.out.println("Compra original: $" + compras[i] + " - Compra con descuento: $" + montoConDescuento);
            } else {
                System.out.println("Compra original: $" + compras[i] + " - No aplica descuento.");
            }
        }
    }
}
