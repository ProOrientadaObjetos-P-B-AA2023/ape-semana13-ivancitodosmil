package paquete004;

public class PagoTelefonoConvencional extends Pago {
    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }
  
    public double ObtenerPago(){
         return(tarifa + (minutosConsumidos * costoMinuto));
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" + "tarifa=" + tarifa + ", minutosConsumidos=" + minutosConsumidos + ", costoMinuto=" + costoMinuto + super.toString()+ '}';
    }
}
