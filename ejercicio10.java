import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la dimensión de la matriz cuadrada
        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Llamar a la función para crear e imprimir la matriz simétrica
        int[][] matriz = crearMatrizSimetrica(dimension);
        imprimirMatriz(matriz);

        scanner.close();
    }

    // Función para crear una matriz cuadrada simétrica con números aleatorios
    public static int[][] crearMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];

        // Bucle mejorado (for-each)
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = (int) (Math.random() * 10 + 1);
                matriz[i][j] = matriz[j][i] = numeroAleatorio;
            }
        }

        return matriz;
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
