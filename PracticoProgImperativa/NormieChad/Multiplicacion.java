package PracticoProgImperativa.NormieChad;

/*
 * Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
 * 
 * 
 */

public class Multiplicacion {
    
    public static void main(String[] args) {
        
        double num1Real = 2.5;

        double num2Real = 4.6;

        double resultado1 = num1Real * num2Real;

        System.out.println("Resultado multiplicación de números reales: " + resultado1);

        int num1Entero = 5;
        int num2Entero = 6;

        int resultado2 = num1Entero + num2Entero;

        double resultadoIntReal = resultado1 + resultado2;

        System.out.println("Resultado multiplicación de números enteros: " + resultado2);
        System.out.println("Resultado de la suma de ambas multiplicaciones: " + resultadoIntReal); // Esto da un resultado real, si trato de guardar en una variable de tipo entera, me daría error.
    }
}
