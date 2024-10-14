public class EJ8 {
    public static void main(String[] args) {
        String[] empleados = {
                "Jose", "Lucia", "Matias", "Sofia", "Roberto"
        };
        int[] horasTrabajadas = {40, 35, 45, 30, 50};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double tasaPorHora = 15.0; // Pago por hora trabajada
        System.out.println("Pago semanal de los empleados:");

        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * tasaPorHora;

            System.out.println(empleados[i] + " - Horas trabajadas: " + horasTrabajadas[i] + " - Pago semanal: $" + pagoSemanal);
        }
    }
}
