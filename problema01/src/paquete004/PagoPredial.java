package paquete004;

import paquete002.Propiedad;

public class PagoPredial extends Pago{
    private double porcentaje;
    private Propiedad propiedad;

    public PagoPredial(double porcentaje, Propiedad propiedad) {
        this.porcentaje = porcentaje;
        this.propiedad = propiedad;
    }

    public double ObtenerPago(){
        return( propiedad.costoPropiedad - ((propiedad.costoPropiedad*porcentaje)/100));
    }

    @Override
    public String toString() {
        return "PagoPredial{" + "porcentaje=" + porcentaje + ", propiedad=" + propiedad + super.toString()+'}';
    }
}
