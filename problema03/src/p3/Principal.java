package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> matriculas= new ArrayList<>();
        matriculas.add(new MatriculaCampamento(100.2,30.2,90.2));
        matriculas.add(new MatriculaColegio(150.2,140.2,240.2,300.4));
        matriculas.add( new MatriculaEscuela(50.2,40.2,140.2,200.4));
        matriculas.add (new MatriculaJardin(50.2,140.2,40));
        matriculas.add(new MatriculaMaternal(50.2,40.2,80.2));
        matriculas.add(new MatriculaMaternal(50.2,40.2,80.2));
     
        System.out.println("-----------------------------------");
        for (Matricula tipomatricula: matriculas){
             System.out.println(tipomatricula);
        }
        TipoMatricula tiposmatricula= new TipoMatricula(matriculas);
        System.out.printf("El promedio de Tarifas es: %.2f\n", tiposmatricula.ObtenerPromedioTarifas());
    }
}