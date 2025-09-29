/*
 * Promedio de edad: Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades
 */

public class PromedioEdad {
    
    public static void main(String[] args) {
        
        int edad1 = 12;
        String persona1 = "Juan";

        int edad2 = 15;
        String persona2 = "Pedro";

        double promedio = (edad1 + edad2) / 2;

        System.out.println("Nombre: " + persona1 + ". Tiene " + edad1 + " años");
        System.out.println("Nombre: " + persona2 + ". Tiene " + edad2 + " años");
        System.out.println("El promedio de sus edades es " + promedio);
    }
}
