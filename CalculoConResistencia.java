public class CalculoConResistencia extends Calculo {
    private final double k ;
    
    public CalculoConResistencia(Proyectil proyectil) {
        super(proyectil); 
        this.k = IO.readDouble("Ingrese el coeficiente de resistencia del aire (k):");
    }

    
    public double calcularX(double t) {
        double m = proyectil.getMasa();
        double v0x = proyectil.getV0_x();
        double x0 = proyectil.getPos0_x();

        return x0 + (m / k) * v0x * (1 - Math.exp(-k * t / m));
    }

    
    public double calcularZ(double t) {
        double m = proyectil.getMasa();
        double v0z = proyectil.getV0_z();
        double z0 = proyectil.getPos0_z();

        return z0 + (m * g / k) * (t + (m / k) * (1 - Math.exp(-k * t / m))) 
                   + (m / k) * v0z * (1 - Math.exp(-k * t / m));
    }

    
    public double calcularY(double t) {
        double m = proyectil.getMasa();
        double v0y = proyectil.getV0_y();
        double y0 = proyectil.getPos0_y();

        return y0 + (m / k) * v0y * (1 - Math.exp(-k * t / m));
    }
}

