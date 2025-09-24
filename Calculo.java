public class Calculo {
    
    protected Proyectil proyectil;
    protected double[] t;
    protected double[] x_t; //Arrelgos donde se almacenan los puntos simulados
    protected double[] y_t;
    protected double[] z_t;
    protected static final double g = 9.81;   //ACELERACION GRAVITACIONAL
    protected static final double e = 2.71828; //NUMERO EULER

    public Calculo(Proyectil proyectil, double[] t, double[] x_t, double[] y_t, double[] z_t) {
        this.proyectil = proyectil;
        this.t = t;
        this.x_t = x_t;
        this.y_t = y_t;
        this.z_t = z_t;
    }

    public Calculo(Proyectil proyectil) {
        this.proyectil = proyectil;

        int n = IO.readInt("¿Cuantos puntos de tiempo desea calcular?");
        double dt = IO.readDouble("Ingrese la separación entre los puntos (s):");

        t = new double[n];
        x_t = new double[n];
        y_t = new double[n];
        z_t = new double[n];     

        for (int i = 0; i < n; i++) {
            t[i] = i * dt;
            x_t[i]= 0.0;
            y_t[i]= 0.0;
            z_t[i]= 0.0;

        }
    }

    public Proyectil getProyectil() {
        return proyectil;
    }

    public void setProyectil(Proyectil proyectil) {
        this.proyectil = proyectil;
    }

    public double[] getT() {
        return t;
    }

    public void setT(double[] t) {
        this.t = t;
    }

    public double[] getX_t() {
        return x_t;
    }

    public void setX_t(double[] x_t) {
        this.x_t = x_t;
    }

    public double[] getZ_t() {
        return z_t;
    }

    public void setZ_t(double[] z_t) {
        this.z_t = z_t;
    }

    
    
}
