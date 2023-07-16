package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    ArrayList<Televisor> televisiones;
    
    public VentasTvs(ArrayList<Televisor> televisiones) {
        this.televisiones = televisiones;
    }

    public String listaMarcasVendidas(){
        String s = "";
        for (int i = 0; i < televisiones.size(); i++) {
            s = String.format("%s%s\n", s, televisiones.get(i).obtenerMarca());
        }
        return s;
    }
    
    public double TelevisorMasCaro() {
    double s=0;
    for (int i = 0; i < televisiones.size(); i++) {
        double precio = televisiones.get(i).obtenerPrecio();
        if (precio > s) {
            s = precio;
        }
    }
    return s;
    }

     public double establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisiones.size(); i++) {
            s = s + televisiones.get(i).obtenerPrecio();
        }
        return s;
    }
}

