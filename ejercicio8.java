import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Recibir N números enteros hasta que se introduzca un 0
        int[] numeros = recibirNumeros(scanner);

        // b) Calcular la media de los elementos de un array
        double media = calcularMedia(numeros);

        // c) Calcular el mínimo de los elementos de un array
        int minimo = calcularMinimo(numeros);

        // d) Calcular el máximo de los elementos de un array
        int maximo = calcularMaximo(numeros);

        // Mostrar resultados
        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        scanner.close();
    }

    // Función para recibir N números enteros por teclado hasta que se introduzca un 0
    public static int[] recibirNumeros(Scanner scanner) {
        System.out.println("Introduce números enteros (introduce 0 para finalizar):");

        int capacidadInicial = 10; // Puedes ajustar este valor según tus necesidades
        int[] numeros = new int[capacidadInicial];
        int contador = 0;
        int numero;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            // Asegurar que hay suficiente espacio en el array
            if (contador == numeros.length) {
                numeros = redimensionarArray(numeros, contador * 2);
            }

            numeros[contador++] = numero;

        } while (numero != 0);

        // Redimensionar el array para eliminar los elementos no utilizados
        return redimensionarArray(numeros, contador);
    }

    // Función para calcular la media de los elementos de un array
    public static double calcularMedia(int[] array) {
        int suma = 0;

        for (int elemento : array) {
            suma += elemento;
        }

        return (double) suma / array.length;
    }

    // Función para calcular el mínimo de los elementos de un array
    public static int calcularMinimo(int[] array) {
        int minimo = array[0];

        for (int elemento : array) {
            if (elemento < minimo) {
                minimo = elemento;
            }
        }

        return minimo;
    }

    // Función para calcular el máximo de los elementos de un array
    public static int calcularMaximo(int[] array) {
        int maximo = array[0];

        for (int elemento : array) {
            if (elemento > maximo) {
                maximo = elemento;
            }
        }

        return maximo;
    }

    // Función para redimensionar un array a un nuevo tamaño
    public static int[] redimensionarArray(int[] array, int nuevoTamanio) {
        int[] nuevoArray = new int[nuevoTamanio];
        System.arraycopy(array, 0, nuevoArray, 0, Math.min(array.length, nuevoTamanio));
        return nuevoArray;
    }
}
