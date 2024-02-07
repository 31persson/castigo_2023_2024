public class ejercicio5 {

    public static void main(String[] args) {
        int n = 10; // Puedes ajustar este valor según tus necesidades

        // Obtener las tablas de multiplicar
        int[][] tablas = obtenerTablasMultiplicar(n);

        // Mostrar las tablas de multiplicar
        mostrarTablas(tablas);
    }

    // Función para obtener las tablas de multiplicar de los primeros N números
    public static int[][] obtenerTablasMultiplicar(int n) {
        int[][] tablas = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * j;
            }
        }

        return tablas;
    }

    // Función para mostrar las tablas de multiplicar
    public static void mostrarTablas(int[][] tablas) {
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del número " + (i + 1) + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println((i + 1) + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }
}
