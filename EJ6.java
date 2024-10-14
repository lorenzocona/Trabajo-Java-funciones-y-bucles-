public class EJ6 {
    public static void main(String[] args) {
        double[] facturas = {100.00, 250.50, 320.75, 150.00, 200.80};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        double tasaImpuesto = 0.21; // 21% de impuesto
        System.out.println("Facturas con impuesto del 21%:");

        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * tasaImpuesto;
            double montoConImpuesto = facturas[i] + impuesto;

            System.out.println("Factura original: $" + facturas[i] + " - Factura con impuesto: $" + montoConImpuesto);
        }
    }
}
