public class EJ9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.00, 250.50, 300.75, 150.00, 200.80};

        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        double tasaDescuento = 0.10; // 10% de descuento
        System.out.println("Precios finales después de aplicar el 10% de descuento:");

        for (int i = 0; i < preciosOriginales.length; i++) {
            double descuento = preciosOriginales[i] * tasaDescuento;
            double precioFinal = preciosOriginales[i] - descuento;

            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio final: $" + precioFinal);
        }
    }
}
