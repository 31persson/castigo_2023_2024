import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Descomponer el número en factores primos
        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        // Mostrar el resultado
        System.out.print(numero + " = ");
        mostrarArray(factoresPrimos);

        scanner.close();
    }

    // Función para descomponer un número en factores primos y devolver un array con los factores
    public static int[] descomponerEnFactoresPrimos(int numero) {
        int[] factoresPrimos = new int[10]; // Puedes ajustar este tamaño según tus necesidades
        int indice = 0;

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos[indice++] = i;
                numero /= i;
            }
        }

        // Eliminar los elementos no utilizados en el array
        return copiarArray(factoresPrimos, indice);
    }

    // Función para copiar un array con un tamaño específico
    public static int[] copiarArray(int[] original, int nuevoTamanio) {
        int[] copia = new int[nuevoTamanio];
        System.arraycopy(original, 0, copia, 0, nuevoTamanio);
        return copia;
    }

    // Función para mostrar los elementos de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1 && array[i + 1] != 0) {
                System.out.print(" * ");
            }
        }
        System.out.println();
    }
}

