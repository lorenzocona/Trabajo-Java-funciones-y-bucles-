public class EJ2 {
    public static void main(String[] args) {
        String[] productos = {
                "Camara", "Notebook", "Celular", "TV", "Auriculares",

        };
        int[] stocks = {10, 3, 15, 2, 6};

        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con menos de 5 unidades en stock:");

        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {

                System.out.println(productos[i] + " - Stock: " + stocks[i]);
            }
        }
    }
}
