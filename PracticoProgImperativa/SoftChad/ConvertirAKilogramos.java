/**
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego,
 * en
 * otro espacio de memoria realice la conversión de esas libras a kilogramos.
 * Utilice
 * una constante de los valores que no van a cambiar en esta conversión. Muestre
 * el
 * resultado por pantalla.
 */

public class ConvertirAKilogramos {

    public static void main(String[] args) {
        final double LIBRAS_POR_KILO = 2.20462;

        double num2 = 12.5;

        double resultado = num2 / LIBRAS_POR_KILO;

        System.out.print("Conversión: " + resultado);
    }

}
