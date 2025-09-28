package PracticoProgImperativa.NormieChad;

import java.util.Scanner;

/*
Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.

 */

public class CalculoDivisibilidad {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de divisibilidad");

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();    

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 + num2;

        String esDivisible = num1 % num2 == 0 ? "es divisible" : "no es divisible";

        System.out.println("El resultado es: " + resultado + " .El primer número " + esDivisible + " por el segundo número");

        sc.close();

    }
}
