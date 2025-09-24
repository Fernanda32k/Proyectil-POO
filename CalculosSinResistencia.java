public class CalculosSinResistencia extends Calculo {
    private double t_max;
    private double y_max;
    private double r_max;

    public CalculosSinResistencia(Proyectil proyectil) {
        super(proyectil);
        this.t_max=0.0;
        this.y_max=0.0;
        this.r_max=0.0;
    }

    // Metodo para calcular x(t)
    public double calcularX(double tiempo) {
        return proyectil.getPos0_x() + proyectil.getV0_x() * tiempo;
    }

    // Metodo para calcular z(t)
    public double calcularZ(double tiempo) {
        return proyectil.getPos0_z() + proyectil.getV0_z() * tiempo - 0.5 * g * Math.pow(tiempo, 2);
    }

    // Metodo para calcular y(t)
    public double calcularY(double tiempo) {
        return proyectil.getPos0_y() + proyectil.getV0_y() * tiempo;
    }

    // Método que calcula trayectoria.
    public void calcularTrayectoria() {
        for (int i = 0; i < t.length; i++) {
            x_t[i] = calcularX(t[i]);
            y_t[i] = calcularY(t[i]);
            z_t[i] = calcularZ(t[i]);
        }
    }

    public void calcularYAsignarT_max() {
        this.t_max = proyectil.getV0_z() / g;
    }
    
    public void calcularZmax() {
        this.y_max = Math.pow(proyectil.getV0_z(), 2) / (2 * g);
    }

    public void calcularYAsignarAlcanceR_max(){
        this.r_max = Math.pow(proyectil.getV0(),2)*Math.sin(proyectil.getTheta()*2) / g ;

    }

public void mostrarTrayectoria() {
String salida = "t          x(t)           y(t)           z(t)\n";

    for (int i = 0; i < t.length; i++) {
        salida += String.format("%.2f       %.2f        %.2f        %.2f\n",
                                t[i], x_t[i], y_t[i], z_t[i]);

        // detener cuando el proyectil toca el suelo (y <= 0)
        if (z_t[i] < 0) {
            break;
        }
    }

    IO.show(salida);
}

    public double getT_max() {
        return t_max;
    }

    public void setT_max(double t_max) {
        this.t_max = t_max;
    }

    public double getY_max() {
        return y_max;
    }

    public void setY_max(double y_max) {
        this.y_max = y_max;
    }

    public double getR_max() {
        return r_max;
    }

    public void setR_max(double r_max) {
        this.r_max = r_max;
    }


}


