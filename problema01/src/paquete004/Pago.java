package paquete004;

public abstract class Pago {
    public double pago;
   
    public abstract void calcularPago();

    @Override
    public String toString() {
        return "Pago{" + "pago=" + pago + '}';
    }
}
