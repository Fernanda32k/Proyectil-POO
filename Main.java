// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        /*PlanoCartesiano plano = new PlanoCartesiano();

        // Simular trayectoria de proyectil
        for (double t = 0; t <= 5; t += 0.05) {
            double x = 2 * t;
            double y = 5 * t - 1 * t * t; // parábola
            if (y < 0) break;
            plano.marcarPunto(x, y);
        }

        plano.imprimir(); */


        Proyectil proyectil = new Proyectil();
        CalculosSinResistencia sr = new CalculosSinResistencia(proyectil);
        sr.calcularTrayectoria();
        sr.mostrarTrayectoria();

    }
}