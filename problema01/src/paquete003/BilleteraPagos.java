package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;

public class BilleteraPagos {
    public Persona persona;
    public String mes;
    public double gastoPagos;
    public ArrayList<Pago> pagos;

    public BilleteraPagos(Persona persona, String mes, double gastoPagos, ArrayList<Pago> pagos) {
        this.persona = persona;
        this.mes = mes;
        this.gastoPagos = gastoPagos;
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        return "BilleteraPagos{" + "persona=" + persona + ", mes=" + mes + ", gastoPagos=" + gastoPagos + ", pagos=" + pagos + '}';
    }
}
