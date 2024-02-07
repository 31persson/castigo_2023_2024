import java.util.Scanner;

public class ejercicio9  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de los vectores
        int dimension = solicitarDimension(scanner);

        // Solicitar al usuario los elementos del primer vector
        int[] vector1 = solicitarVector(scanner, dimension);

        // Solicitar al usuario los elementos del segundo vector
        int[] vector2 = solicitarVector(scanner, dimension);

        // Calcular y mostrar el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    // Función para solicitar la dimensión de un vector al usuario
    public static int solicitarDimension(Scanner scanner) {
        System.out.print("Introduce la dimensión de los vectores: ");
        return scanner.nextInt();
    }

    // Función para solicitar los elementos de un vector al usuario
    public static int[] solicitarVector(Scanner scanner, int dimension) {
        int[] vector = new int[dimension];

        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma dimensión.");
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
