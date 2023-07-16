package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;

public class BilleteraPagos {
    private Persona persona;
    private String mes;
    private double gastoPagos;
    private ArrayList<Pago> pagos;

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
