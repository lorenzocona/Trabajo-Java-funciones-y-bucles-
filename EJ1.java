import java.util.Random;
public class EJ1 {
    public static void main(String[] args) {

        double[] ventas = new double[30];
        generarVentasAleatorias(ventas);


        double totalIngresos = calcularIngresosMensuales(ventas);


        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
    }
    public static void generarVentasAleatorias(double[] ventas) {
        Random rand = new Random();
        // Rellenar el arreglo con valores aleatorios entre 100 y 300.
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = 100 + (rand.nextDouble() * 200); // Ventas entre 100 y 300
        }
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        // Bucle para recorrer el arreglo y sumar las ventas diarias.
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }
}
