public class EJ5 {
    public static void main(String[] args) {
        int[] calificaciones = {4, 5, 3, 5, 4, 2, 3, 5, 4, 5};

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        System.out.println("El promedio de satisfacción de los clientes es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int total = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            total += calificaciones[i];
        }

        return (double) total / calificaciones.length;
    }
}
