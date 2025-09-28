package PracticoProgImperativa.NormieChad;

import java.util.Scanner;

/*

Suma de dos números: Se le solicita que guarden dos números enteros y los
sumen. El resultado mostrarlo por pantalla.

 */

public class SumaDosNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Suma de dos números ---");
        System.out.println("- Ingrese un número: ");
        int num1 = sc.nextInt();

        System.out.println("- Ingrese el segundo número: ");
        int num2 = sc.nextInt();
    
        System.out.println("- La suma es: " + (num1 + num2));
        sc.close();
        
    }
}
