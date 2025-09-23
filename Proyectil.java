public class Proyectil{
  protected double masa;
  protected double v0;
  protected double phi;  // angulo Horizontal
  protected double tetha; // angulo vertical
  protected double pos0_x;
  protected double pos0_y;
  protected double pos0_z;
  protected double v0_x;
  protected double v0_y;
  protected double v0_z;


  protected double calcularV0EjeX{
     return v0 * Math.cos(theta) * Math.cos(phi);
  }

  protected double calularVOEjeY{
    return v0 * Math.cos(theta)* Marh.sin(phi);
  }
  
  protected double calularVOEjeZ{
    return v0 * Marh.sin(phi);
  }
  
}
