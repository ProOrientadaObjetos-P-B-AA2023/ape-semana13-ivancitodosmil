package paquete004;

public class PagoTelefonoConvencional extends Pago {
    public double tarifa;
    public double minutosConsumidos;
    public double costoMinuto;

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }
  
    public void calcularPago(){
         pago = tarifa + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" + "tarifa=" + tarifa + ", minutosConsumidos=" + minutosConsumidos + ", costoMinuto=" + costoMinuto + super.toString()+ '}';
    }
}
