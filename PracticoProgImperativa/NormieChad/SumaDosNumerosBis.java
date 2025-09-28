package PracticoProgImperativa.NormieChad;

import java.util.Scanner;

/*
Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
 */
public class SumaDosNumerosBis {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("- Suma de dos números");
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 + num2;

        String esPar = resultado % 2 == 0 ? "par" : "impar";


        System.out.println("El resultado es " + resultado + " y es " + esPar);
        sc.close();
    }
}
