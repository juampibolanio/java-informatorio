package PracticoProgImperativa.NormieChad;

/*
 * Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla.
El mensaje debe tener el siguiente formato:
“Mi nombre es “ {Nombre}
“Mi edad es” {Edad}

 */

public class NombreYEdad {
    
    public static void main(String[] args) {
        

        String nombre = "Juan Pablo";
        String apellido = "Bolanio";
        int edad = 19;

        System.out.println("Mi nombre es " + nombre + " " + apellido);
        System.out.println("Mi edad es: " + edad + " años");
    
    }
}
