public class ejercicio1 {

    public static void main(String[] args) {
        // Definir variables con el mínimo espacio de memoria
        short diasEnAnio = 365;
        byte horasEnDia = 24;
        byte minutosEnHora = 60;
        byte segundosEnMinuto = 60;

        // Calcular el número de segundos en un año
        long segundosEnAnio = calcularSegundos(diasEnAnio, horasEnDia, minutosEnHora, segundosEnMinuto);

        // Mostrar el resultado
        System.out.println("Número de segundos en un año: " + segundosEnAnio);
    }

    // Función para calcular el número de segundos dados los componentes temporales
    public static long calcularSegundos(short dias, byte horas, byte minutos, byte segundos) {
        return (long) dias * horas * minutos * segundos;
    }
}
