// Ejemplo de uso
public class Main {
    public static void main(String[] args) {


        Proyectil proyectil = new Proyectil(); //Solicita datos al usuario y calcula los restantes vo_x, vo_y vo_z
        CalculosSinResistencia sr = new CalculosSinResistencia(proyectil); //Instance objeto y inicializa tableros y atributos
        sr.calcularTrayectoria();   //Hace los calculos con las formulas
        sr.mostrarTrayectoria();   // Muestra los resultado hasta que encuentra un valor negativo

    }

}
