package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    ArrayList<Televisor> televisores;
    
    public VentasTvs(ArrayList<Televisor> televisores) {
        this.televisores = televisores;
    }

    public String listaMarcasVendidas(){
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", s, televisores.get(i).obtenerMarca());
        }
        return s;
    }
    
    public double TelevisorMasCaro() {
    double s=0;
    for (int i = 0; i < televisores.size(); i++) {
        double precio = televisores.get(i).obtenerPrecio();
        if (precio > s) {
            s = precio;
        }
    }
    return s;
    }

     public double establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
        }
        return s;
    }
}

