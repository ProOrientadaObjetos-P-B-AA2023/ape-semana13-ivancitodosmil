package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Televisor> teles = new ArrayList<>();
        teles.add(new Televisor("LG-14 pulgadas",300.2));
        teles.add(new Televisor("SAMSUMG-21 pulgadas",1300.2));
        teles.add(new Televisor("RIVIERA-29 pulgadas",2300.5));
        System.out.println("-----------------");
        
        System.out.printf("Las Marcas Vendidas fueron:\n  %s\n", new VentasTvs(teles).listaMarcasVendidas());
        System.out.printf("El Precio Total de los Televisores es: %.2f\n", new VentasTvs(teles).establecerPrecioTotal());
        System.out.printf("El Televisor más caro es: %.2f\n", new VentasTvs(teles).TelevisorMasCaro());
        System.out.println("-----------------");
    }
}

