public class ChadQuestRPG {
    
    public static void main(String[] args) {
        
        int[] puntosPorMision = new int[5];
        int total = 0;

        // ---- Completo el array y sumo el total de puntos ----
        puntosPorMision[0] = 50;
        puntosPorMision[1] = 80;
        puntosPorMision[2] = 90;
        puntosPorMision[3] = 100;
        puntosPorMision[4] = 0;

        for (int i = 0; i < puntosPorMision.length; i++) {
            total += puntosPorMision[i];
        }

        System.out.println("Puntos acumulados hasta ahora: " + total);

        // ---- Determinar si el jugador es CHAD. ----
        if (total > 300) {
            System.out.println("FELICIDADES. Sos un verdadero CHAD del RPG");
        } else {
            System.out.println("Te falta entrenamiento, joven aprendiz...");
        }


        // ---- Detectar misión con mayor puntaje ---- 
        int misionConMayorPuntaje = 0;
        int puntajeMayor = 0;

        for (int i = 0; i < puntosPorMision.length; i++) {
            
            if (puntosPorMision[i] > puntajeMayor) {
                puntajeMayor = puntosPorMision[i];
                misionConMayorPuntaje = i;
            }
        }

        System.out.println("Tu mejor desempeño fue en la misión " + misionConMayorPuntaje + " con " + puntajeMayor + " puntos.");

        // ---- Verificar si hay misiones fallidas ----
        int misionesFallidas = 0;

        for (int i = 0; i < puntosPorMision.length; i++) {
            if (puntosPorMision[i] == 0) {
                misionesFallidas++;
            }    
        }

        if (misionesFallidas < 0) {
            System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
        }
        
        // ---- Determinar si fue constante ----

        int misionConMasPuntaje = 0;
        int mayorPuntaje = 0;

        int misionConMenorPuntaje = 0;
        int menorPuntaje = 0;

        // Buscar la mision con mayor puntaje
        for (int i = 0; i < puntosPorMision.length; i++) {

            if (puntosPorMision[i] > mayorPuntaje) {
                misionConMasPuntaje = i;
                mayorPuntaje = puntosPorMision[i];
            }
        }

        // Buscar la mision con menor puntaje
        for (int i = 0; i < puntosPorMision.length; i++) {

            if (puntosPorMision[i] < mayorPuntaje) {
                misionConMenorPuntaje = i;
                menorPuntaje = puntosPorMision[i];
            }
        }

        if ((mayorPuntaje - menorPuntaje) < 20) {
            System.out.println("¡Ejecución constante! Sos el dueño de un arquitecto de software");
        }

        System.out.println("Mas puntaje " + puntosPorMision[misionConMasPuntaje]);
        System.out.println("Menos puntaje " + puntosPorMision[misionConMenorPuntaje]);

        // ---- Contar misiones mayores a 75 puntos
        int cantidadMisiones = 0;

        for (int i = 0; i < puntosPorMision.length; i++) {
            if (puntosPorMision[i] > 75) {
                cantidadMisiones++;
            }
        }

        
        if (cantidadMisiones >= 3) {
            System.out.println("Nivel desbloqueado: Mini Stone Chad");
        }

        // Mostrar resultados
        int puntajeAcumulado = 0;
        System.out.println("----------------------------------");
        for (int i = 0; i < puntosPorMision.length; i++) {
            System.out.println("Misión -> " + i);
            System.out.println("Puntaje -> " + puntosPorMision[i]);
            puntajeAcumulado += puntosPorMision[i];
            System.out.println("Puntaje acumulado -> " + puntajeAcumulado);
        }

        System.out.println("Puntaje total: " + puntajeAcumulado + " puntos.");
    }
}
