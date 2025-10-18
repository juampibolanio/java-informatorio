package Desafios.DesafiosPOO.SimuladorEstudiantesV2;

import java.util.*;

public class CodeChadsAcademy {

    private List<Alumno> alumnos = new ArrayList<>();

    // Agregar un alumno a la lista
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    // Evaluar cada alumno 
    public void evaluarAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println("\nEvaluando alumno " + a.getId() + ":");

            if (a.aproboTodas()) {
                System.out.println("→ Aprobaste todas. ¡Backend Sensei!");
            } else if (a.total() < 150) {
                System.out.println("→ No aprobaste ninguna. ¡Sos un clon de frontend!");
            } else {
                System.out.println("→ Algunas aprobadas. Sos un refactor en progreso.");
            }

            if (a.esProgresivo()) {
                System.out.println("→ ¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
            }

            System.out.println("→ Mayor variación entre pruebas: " + a.mayorVariacion() + " puntos");
            a.mostrarNotasOrdenadas();

            // Evaluación final por nivel
            int total = a.total();
            String nivel;
            if (total < 250)
                nivel = "Normie total!";
            else if (total < 350)
                nivel = "Soft Chad";
            else if (total < 450)
                nivel = "Chad";
            else
                nivel = "Stone Chad definitivo!!";

            System.out.println("→ Total: " + total + " puntos -> " + nivel);
        }
    }

    // Mostrar ranking general
    public void mostrarRanking() {
        if (alumnos.isEmpty())
            return;

        Alumno mejor = alumnos.get(0);
        Alumno masRegular = alumnos.get(0);
        Alumno peorTercera = alumnos.get(0);

        for (Alumno a : alumnos) {
            // Mejor promedio
            if (a.promedio() > mejor.promedio())
                mejor = a;

            // Más regular (menor diferencia entre su mayor y menor nota)
            int mayor = Arrays.stream(a.getNotas()).max().getAsInt();
            int menor = Arrays.stream(a.getNotas()).min().getAsInt();
            int dif = mayor - menor;

            int mejorDif = Arrays.stream(masRegular.getNotas()).max().getAsInt()
                    - Arrays.stream(masRegular.getNotas()).min().getAsInt();
            if (dif < mejorDif)
                masRegular = a;

            // Peor nota en la tercera prueba
            if (a.getNotas()[2] < peorTercera.getNotas()[2])
                peorTercera = a;
        }

        System.out.println("\n------------------------------");
        System.out.println("🏆 RANKING FINAL 🏆");
        System.out.println("------------------------------");
        System.out.println("→ Mejor promedio: Alumno " + mejor.getId() + " con " + mejor.promedio());
        System.out.println("→ Más regular: Alumno " + masRegular.getId());
        System.out.println("→ Peor en la tercera prueba: Alumno " + peorTercera.getId());
    }
}