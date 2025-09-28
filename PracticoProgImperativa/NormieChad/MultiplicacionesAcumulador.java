package PracticoProgImperativa.NormieChad;
/*
 * Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … +
Numero1*Numero2/15. El resultado mostrarlo por pantalla
 */

public class MultiplicacionesAcumulador {
    
    public static void main(String[] args) {
        
        int acumulador = 0;
        int num = 1;

        for (int i = 1; i < 16; i++) {
            
            acumulador += (i * num) / i;
            num++;
        }

        System.out.println("Resultado final: " + acumulador);

    }
}
