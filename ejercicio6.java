public class ejercicio6 {

    public static void main(String[] args) {
        int n = 10; // Puedes ajustar este valor según tus necesidades

        // Obtener los N primeros números primos
        int[] numerosPrimos = obtenerPrimerosPrimos(n);

        // Mostrar los números primos
        mostrarNumerosPrimos(numerosPrimos);
    }

    // Función para obtener los N primeros números primos
    public static int[] obtenerPrimerosPrimos(int n) {
        int[] numerosPrimos = new int[n];
        int contador = 0;
        int numero = 2;

        while (contador < n) {
            if (esPrimo(numero)) {
                numerosPrimos[contador] = numero;
                contador++;
            }
            numero++;
        }

        return numerosPrimos;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para mostrar los números primos
    public static void mostrarNumerosPrimos(int[] numerosPrimos) {
        System.out.println("Los primeros " + numerosPrimos.length + " números primos son:");
        for (int primo : numerosPrimos) {
            System.out.print(primo + " ");
        }
    }
}
