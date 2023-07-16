package p1;

public class MatriculaEscuela extends Matricula{
    private double costolibros;
    private double costodeportes;
    private double costofolletos;
    private double costouniformes;

    public MatriculaEscuela(double costolibros, double costodeportes, double costofolletos, double costouniformes) {
        this.costolibros = costolibros;
        this.costodeportes = costodeportes;
        this.costofolletos = costofolletos;
        this.costouniformes = costouniformes;
    }

    public double ObtenerTarifa(){
        return (costolibros+costodeportes+costofolletos+costouniformes); 
    }

    @Override
    public String toString() {
        return "MatriculaEscuela{" + "costolibros=" + costolibros + ", costodeportes=" + costodeportes + ", costofolletos=" + costofolletos + ", costouniformes=" + costouniformes +super.toString()+'}';
    }
}