public class Proyectil {

    private double masa;
    private double v0;
    private double phi;  // angulo Horizontal
    private double theta; // angulo vertical
    private double pos0_x;
    private double pos0_y;
    private double pos0_z;
    private double v0_x;
    private double v0_y;
    private double v0_z;

public Proyectil() {
    masa = IO.readDouble("Ingrese la masa del proyectil (kg):");
    v0   = IO.readDouble("Ingrese la velocidad inicial (m/s):");

    phi   = Math.toRadians(IO.readDouble("Ingrese el ángulo horizontal phi (grados):"));
    theta = Math.toRadians(IO.readDouble("Ingrese el ángulo vertical theta (grados):"));

    pos0_x = IO.readDouble("Ingrese la posición inicial X:");
    pos0_y = IO.readDouble("Ingrese la posición inicial Y:");
    pos0_z = IO.readDouble("Ingrese la posición inicial Z:");

    calcularYAsignarComponentes();
    }
private void calcularYAsignarComponentes() {
    v0_x = v0 * Math.cos(theta) * Math.cos(phi);
    v0_y = v0 * Math.cos(theta) * Math.sin(phi);
    v0_z = v0 * Math.sin(theta);  //Eje vertical
}
public double getMasa() {
    return masa;
}
public void setMasa(double masa) {
    this.masa = masa;
}
public double getV0() {
    return v0;
}
public void setV0(double v0) {
    this.v0 = v0;
}
public double getPhi() {
    return phi;
}
public void setPhi(double phi) {
    this.phi = phi;
}
public double getTheta() {
    return theta;
}
public void setTheta(double theta) {
    this.theta = theta;
}
public double getPos0_x() {
    return pos0_x;
}
public void setPos0_x(double pos0_x) {
    this.pos0_x = pos0_x;
}
public double getPos0_y() {
    return pos0_y;
}
public void setPos0_y(double pos0_y) {
    this.pos0_y = pos0_y;
}
public double getPos0_z() {
    return pos0_z;
}
public void setPos0_z(double pos0_z) {
    this.pos0_z = pos0_z;
}
public double getV0_x() {
    return v0_x;
}
public void setV0_x(double v0_x) {
    this.v0_x = v0_x;
}
public double getV0_y() {
    return v0_y;
}
public void setV0_y(double v0_y) {
    this.v0_y = v0_y;
}
public double getV0_z() {
    return v0_z;
}
public void setV0_z(double v0_z) {
    this.v0_z = v0_z;
}


}
