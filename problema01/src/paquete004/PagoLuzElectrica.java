package paquete004;

import paquete002.Ciudad;

public class PagoLuzElectrica extends Pago {

public double tarifaBase;
public double kilovatiosConsumidos;
public double costoKilovatio;
public Ciudad ciudad;

    public PagoLuzElectrica(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, Ciudad ciudad) {
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
    }

    public void calcularPago() {
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" + "tarifaBase=" + tarifaBase + ", kilovatiosConsumidos=" + kilovatiosConsumidos + ", costoKilovatio=" + costoKilovatio + ", ciudad=" + ciudad +super.toString()+ '}';
    }
}
