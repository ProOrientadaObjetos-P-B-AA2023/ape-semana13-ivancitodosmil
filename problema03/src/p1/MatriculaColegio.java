package p1;

public class MatriculaColegio extends Matricula{
    private double costodeportes;
    private double costofolletos;
    private double costouniformes;
    private double costolaboratorios;

    public MatriculaColegio(double costodeportes, double costofolletos, double costouniformes, double costolaboratorios) {
        this.costodeportes = costodeportes;
        this.costofolletos = costofolletos;
        this.costouniformes = costouniformes;
        this.costolaboratorios = costolaboratorios;
    }
  
    public double ObtenerTarifa(){
        return (costodeportes + costofolletos + costouniformes + costolaboratorios); 
    }

    @Override
    public String toString() {
        return "MatriculaColegio{" + "costodeportes=" + costodeportes + ", costofolletos=" + costofolletos + ", costouniformes=" + costouniformes + ", costolaboratorios=" + costolaboratorios + super.toString()+'}';
    }
}
