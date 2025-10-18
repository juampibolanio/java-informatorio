package Desafios.DesafiosPOO.SimuladorEstudiantesV2;

import java.util.Arrays;

public class Alumno {

    private int id;
    private int[] notas = new int[5];

    public Alumno(int id) {
        this.id = id;
    }

    // Cargar las primeras 3 notas
    public void cargarNotasIniciales(int n1, int n2, int n3) {
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
    }

    // Calcular notas 4 y 5
    public void calcularNotasRestantes() {
        // Nota 4
        if (notas[1] < 60) {
            notas[3] = 100;
        } else {
            notas[3] = notas[1];
        }

        // Nota 5
        if ((notas[0] + notas[2]) > 150) {
            notas[4] = 95;
        } else {
            notas[4] = 70;
        }
    }

    // Verificar si aprobó todas las pruebas
    public boolean aproboTodas() {
        for (int n : notas) {
            if (n <= 60) return false;
        }
        return true;
    }

    // Verificar si las notas son progresivas
    public boolean esProgresivo() {
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] <= notas[i - 1]) return false;
        }
        return true;
    }

    // Calcular la mayor variación entre dos pruebas consecutivas
    public int mayorVariacion() {
        int maxVar = 0;
        for (int i = 1; i < notas.length; i++) {
            int diff = Math.abs(notas[i] - notas[i - 1]);
            if (diff > maxVar) maxVar = diff;
        }
        return maxVar;
    }

    // Calcular total acumulado
    public int total() {
        int sum = 0;
        for (int n : notas) sum += n;
        return sum;
    }

    // Calcular promedio
    public double promedio() {
        return total() / (double) notas.length;
    }

    // Mostrar notas ordenadas de mayor a menor
    public void mostrarNotasOrdenadas() {
        int[] copia = notas.clone();
        Arrays.sort(copia);
        System.out.print("Alumno " + id + " notas ordenadas: ");
        for (int i = copia.length - 1; i >= 0; i--) {
            System.out.print(copia[i] + " ");
        }
        System.out.println();
    }

    public int[] getNotas() {
        return notas;
    }

    public int getId() {
        return id;
    }
}
