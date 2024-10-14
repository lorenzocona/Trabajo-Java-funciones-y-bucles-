public class EJ3 {
    public static void main(String[] args) {
        String[] clientes = {
                "Vicente Ramon", "Elisabet Murillo", "Javier Pascual", "Natalia Criado", "Igor Nuñez"
        };

        double[] facturasPendientes = {450.75, 1200.50, 300.00, 800.00, 550.25};


        enviarFacturas(clientes, facturasPendientes);
    }


    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");


        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {

                System.out.println(clientes[i] + " - Factura pendiente: $" + facturasPendientes[i]);
            }
        }
    }
}
