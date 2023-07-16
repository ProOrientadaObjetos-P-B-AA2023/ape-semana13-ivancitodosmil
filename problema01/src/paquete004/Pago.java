package paquete004;

public abstract class Pago {
    
    public abstract double ObtenerPago();

    @Override
    public String toString() {
        return "Pago{El pago es: " +ObtenerPago()+ '}';
    }
}
