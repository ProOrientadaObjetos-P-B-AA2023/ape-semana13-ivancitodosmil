package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.CalcularPagos;
import paquete004.Pago;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;
import paquete006.DatosAgua;
import paquete006.DatosLuz;
import paquete006.DatosPropiedades;
import paquete006.DatosTelefono;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pago> pagos= new ArrayList<>();
      
        // Pago de Agua
        double[][] AguaCasas= new DatosAgua().datosCasas();
        for (int i = 0; i < AguaCasas.length; i++) {
            pagos.add(new PagoAguaPotable("Casa: ",AguaCasas[i][0],AguaCasas[i][1],AguaCasas[i][2]));
        }
        double[][] AguaComerciales= new DatosAgua().datosComerciales();
        for (int i = 0; i < AguaComerciales.length; i++) {
            pagos.add(new PagoAguaPotable("Comercial: ",AguaComerciales[i][0],AguaComerciales[i][1],AguaComerciales[i][2]));
        }
        
        // Pago Electricidad
        double[][] LuzLoja= new DatosLuz().datosLoja();
        Ciudad ciudad1= new Ciudad("Loja");
        for (int i = 0; i < LuzLoja.length; i++) {
            pagos.add(new PagoLuzElectrica(LuzLoja[i][0],LuzLoja[i][1],LuzLoja[i][2],ciudad1));
        } 
        double[][] LuzOtraCiudad= new DatosLuz().datosGeneral();
        Ciudad ciudad= new Ciudad("Otra Ciudad");
        for (int i = 0; i < LuzOtraCiudad.length; i++) {
            pagos.add(new PagoLuzElectrica(LuzOtraCiudad[i][0],LuzOtraCiudad[i][1],LuzOtraCiudad[i][2],ciudad));
        }
        
        // Pago Predial
        double[][] datospropiedad= new DatosPropiedades().datos();
        ArrayList<Propiedad> props= new ArrayList<>();
        for (int i = 0; i < datospropiedad.length; i++) {
            props.add(new Propiedad(datospropiedad[i][0]));
            pagos.add(new PagoPredial(datospropiedad[i][1],props.get(i)));
        }
        
        // Pago Teléfono
        double[][] datostelefono= new DatosTelefono().datos();
        for (int i = 0; i < datostelefono.length; i++) {
            pagos.add(new PagoTelefonoConvencional(datostelefono[i][0],datostelefono[i][1],datostelefono[i][2]));
        }
        
        for(Pago calcularpago: pagos)
            calcularpago.calcularPago();

        CalcularPagos totalpagos= new CalcularPagos(pagos);
        Persona persona= new Persona("Iván", "González", 20,"1105658502",ciudad1);
        BilleteraPagos billeterapagos= new BilleteraPagos(persona,"Julio",totalpagos.CalcularPagosTotal(),pagos);
        System.out.println(billeterapagos);
    }
}
