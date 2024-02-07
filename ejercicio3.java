public class ejercicio3 {

    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        // Calcular los múltiplos de 5 entre 1 y 100
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);

        // Mostrar los múltiplos de 5
        System.out.println("Múltiplos de 5 entre " + begin + " y " + end + ":");
        mostrarArray(multiplosDe5);

        // Calcular la suma de los múltiplos de 5
        int suma = calcularSuma(multiplosDe5);

        // Mostrar la suma
        System.out.println("Suma de los múltiplos de 5: " + suma);
    }

    // Función para obtener los múltiplos de 5 en el rango [begin, end]
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidadMultiplos = (end - begin) / 5 + 1;
        int[] multiplosDe5 = new int[cantidadMultiplos];

        for (int i = 0; i < cantidadMultiplos; i++) {
            multiplosDe5[i] = begin + i * 5;
        }

        return multiplosDe5;
    }

    // Función para calcular la suma de los elementos de un array
    public static int calcularSuma(int[] array) {
        int suma = 0;

        for (int elemento : array) {
            suma += elemento;
        }

        return suma;
    }

    // Función para mostrar los elementos de un array
    public static void mostrarArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
