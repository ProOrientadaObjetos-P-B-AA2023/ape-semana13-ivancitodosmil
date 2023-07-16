package paquete002;

public class Propiedad{
    public double costoPropiedad;

    public Propiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public void setCostoPropiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "costoPropiedad=" + costoPropiedad + '}';
    }
    
}