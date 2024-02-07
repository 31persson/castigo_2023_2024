import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        // Inicializar variables para el mínimo y el máximo
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        // Leer números hasta que se introduzca uno negativo
        int numero;
        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            // Actualizar mínimo y máximo si es necesario
            if (numero >= 0) {
                minimo = Math.min(minimo, numero);
                maximo = Math.max(maximo, numero);
            }

        } while (numero >= 0);

        // Mostrar resultados
        if (minimo != Integer.MAX_VALUE) {
            System.out.println("Mínimo: " + minimo);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        if (maximo != Integer.MIN_VALUE) {
            System.out.println("Máximo: " + maximo);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        scanner.close();
    }
}
