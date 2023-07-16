package paquete002;

public class Propiedad{
    public double costopropiedad;

    public Propiedad(double costopropiedad) {
        this.costopropiedad = costopropiedad;
    }

    public void setCostopropiedad(double costopropiedad) {
        this.costopropiedad = costopropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "costoPropiedad=" + costopropiedad + '}';
    }
    
}