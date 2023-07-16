package paquete004;

import java.util.ArrayList;

public class CalcularPagos {
    public ArrayList<Pago> pagos;

    public CalcularPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    public double CalcularPagosTotal(){
        double sumaPagos=0;
        for(Pago pago: pagos){
            sumaPagos=sumaPagos+pago.pago;
        }
        return sumaPagos;
    }

    @Override
    public String toString() {
        return "CalcularPagos{" + "pagos=" + pagos + '}';
    }
}
