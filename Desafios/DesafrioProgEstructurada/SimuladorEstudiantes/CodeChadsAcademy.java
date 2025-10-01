package Desafios.DesafrioProgEstructurada.SimuladorEstudiantes;

public class CodeChadsAcademy {

    public static void main(String[] args) {

        // ------------ 1era Parte ------------------

        // Definir alumnos: 3 Filas y 5 columnas (4 estudiantes con 5 notas cada uno)
        int[][] notas = new int[4][5];

        // Cargar algunas notas
        // Alumno 0;
        notas[0][0] = 100;
        notas[0][1] = 100;
        notas[0][2] = 100;

        // Alumno 1;
        notas[1][0] = 30;
        notas[1][1] = 50;
        notas[1][2] = 100;

        // Alumno 2;
        notas[2][0] = 90;
        notas[2][1] = 50;
        notas[2][2] = 70;

        // Alumno 3;
        notas[3][0] = 50;
        notas[3][1] = 10;
        notas[3][2] = 20;

        // Calcular notas 4 y 5

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {

                // Calcular nota nro 4
                if (notas[i][1] < 60) {
                    notas[i][3] = 100;
                } else {
                    notas[i][3] = notas[i][1];
                }

                // Calcular nota nro 5
                if ((notas[i][0] + notas[i][2]) > 150) {
                    notas[i][4] = 95;
                } else {
                    notas[i][4] = 70;
                }
            }
        }

        // ------------ 2da Parte ------------------

        // Verificar si los alumnos aprobaron todos los exámenes
        int examenesAprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {

                if (notas[i][j] > 60) {
                    examenesAprobados++;
                }
            }

            if (examenesAprobados == 5) {
                System.out.println("Alumno nro: " + i + ". Aprobaste todas. ¡Backend Sensei!");
            } else if (examenesAprobados == 0) {
                System.out.println("Alumno nro: " + i + ". No aprobaste ninguna. ¡Sos un clon de frontend!");
            } else {
                System.out.println("Alumno nro: " + i + ". Algunas aprobadas. Sos un refactor en progreso.");
            }
            examenesAprobados = 0;
        }

        // Detectar la mayor variación entre dos pruebas consecutivas y en qué lugar
        // ocurrió
        for (int i = 0; i < notas.length; i++) {
            int mayorVariacion = 0;
            int lugarMayorVariacion = 0;

            for (int j = 1; j < notas[i].length; j++) {
                int variacion = Math.abs(notas[i][j] - notas[i][j - 1]);

                if (variacion > mayorVariacion) {
                    mayorVariacion = variacion;
                    lugarMayorVariacion = j;
                }
            }

            System.out.println("Alumno nro " + i + ". El mayor salto fue de "
                    + mayorVariacion + " puntos entre la prueba "
                    + (lugarMayorVariacion - 1) + " y la prueba "
                    + lugarMayorVariacion + ".");
        }

        // Verificar si el alumno mejora en cada prueba
        for (int i = 0; i < notas.length; i++) {
            boolean progresivo = true;

            for (int j = 1; j < notas[i].length; j++) {
                if (notas[i][j] <= notas[i][j - 1]) {
                    progresivo = false;
                    break;
                }
            }

            if (progresivo) {
                System.out.println("Alumno nro " + i + ": ¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
            }
        }

        // Imprimir notas de cada alumno ordenadas de mayor a menor
        for (int i = 0; i < notas.length; i++) {
            int[] notasAlumno = new int[notas[i].length];
            for (int j = 0; j < notas[i].length; j++) {
                notasAlumno[j] = notas[i][j];
            }

            for (int x = 0; x < notasAlumno.length - 1; x++) {
                for (int y = 0; y < notasAlumno.length - 1 - x; y++) {
                    if (notasAlumno[y] < notasAlumno[y + 1]) {
                        int temp = notasAlumno[y];
                        notasAlumno[y] = notasAlumno[y + 1];
                        notasAlumno[y + 1] = temp;
                    }
                }
            }

            System.out.print("Alumno nro " + i + " notas ordenadas: ");
            for (int nota : notasAlumno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

        // Evaluación final por nivel según el total acumulado
        for (int i = 0; i < notas.length; i++) {
            int total = 0;

            for (int j = 0; j < notas[i].length; j++) {
                total += notas[i][j];
            }

            String nivel;
            if (total < 250) {
                nivel = "Normie total !";
            } else if (total < 350) {
                nivel = "Soft Chad";
            } else if (total < 450) {
                nivel = "Chad";
            } else {
                nivel = "Stone Chad definitivo!! ";
            }

            System.out.println("Alumno nro " + i + " acumuló " + total + " puntos -> " + nivel);
        }

        // ------------ Ranking entre los alumnos ------------------

        int mejorPromedioIdx = 0;
        double mejorPromedio = 0.0;

        int masRegularIdx = 0;
        int menorDiferencia = 101; 

        int peorTerceraIdx = 0;
        int peorTerceraNota = 101;

        // Recorremos cada alumno
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            int mayor = notas[i][0]; 
            int menor = notas[i][0]; 

            // Recorrer notas
            for (int j = 0; j < notas[i].length; j++) {
                int nota = notas[i][j];
                suma += nota;

                if (nota > mayor)
                    mayor = nota;
                if (nota < menor)
                    menor = nota;
            }

            // Calcular promedio y diferencia
            double promedio = (double) suma / notas[i].length;
            int diferencia = mayor - menor;

            // Mejor promedio
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorPromedioIdx = i;
            }

            // Más regular
            if (diferencia < menorDiferencia) {
                menorDiferencia = diferencia;
                masRegularIdx = i;
            }

            // Peor en la tercera prueba 
            if (notas[i][2] < peorTerceraNota) {
                peorTerceraNota = notas[i][2];
                peorTerceraIdx = i;
            }
        }

        System.out.println("-> Mejor promedio: Alumno " + mejorPromedioIdx + " con promedio " + mejorPromedio);
        System.out.println("-> Más regular: Alumno " + masRegularIdx + " (diferencia " + menorDiferencia + " puntos)");
        System.out.println("-> Peor en la tercera prueba: Alumno " + peorTerceraIdx + " con nota " + peorTerceraNota);
    }

}
