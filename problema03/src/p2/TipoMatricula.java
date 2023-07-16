package p2;

import java.util.ArrayList;
import p1.Matricula;

public class TipoMatricula {
    ArrayList<Matricula> matriculas;

    public TipoMatricula(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public double ObtenerPromedioTarifas(){
        double promedioMatriculas=0;
        for (Matricula matricula:matriculas){
            promedioMatriculas=promedioMatriculas+matricula.ObtenerTarifa();
        }
        return promedioMatriculas/matriculas.size();
    }
}
