package Desafios.DesafiosPOO.SimuladorEstudiantesV2;

public class Main {
    public static void main(String[] args) {

        CodeChadsAcademy academia = new CodeChadsAcademy();

        // Crear alumnos
        Alumno a1 = new Alumno(0);
        a1.cargarNotasIniciales(100, 100, 100);
        a1.calcularNotasRestantes();

        Alumno a2 = new Alumno(1);
        a2.cargarNotasIniciales(30, 50, 100);
        a2.calcularNotasRestantes();

        Alumno a3 = new Alumno(2);
        a3.cargarNotasIniciales(90, 50, 70);
        a3.calcularNotasRestantes();

        Alumno a4 = new Alumno(3);
        a4.cargarNotasIniciales(50, 10, 20);
        a4.calcularNotasRestantes();

        // Agregar alumnos a la academia
        academia.agregarAlumno(a1);
        academia.agregarAlumno(a2);
        academia.agregarAlumno(a3);
        academia.agregarAlumno(a4);

        // Evaluar y mostrar resultados
        academia.evaluarAlumnos();
        academia.mostrarRanking();
    }
}