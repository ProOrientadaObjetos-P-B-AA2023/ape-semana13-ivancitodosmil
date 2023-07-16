package p1;

public class MatriculaJardin extends Matricula{
    private double costodesayunos;
    private double costolibros;
    private double costopaseos;

    public MatriculaJardin(double costodesayunos, double costolibros, double costopaseos) {
        this.costodesayunos = costodesayunos;
        this.costolibros = costolibros;
        this.costopaseos = costopaseos;
    }

    public double getTarifa(){
        return (costodesayunos+costolibros+costopaseos); 
    }

    @Override
    public String toString() {
        return "MatriculaJardin{" + "costodesayunos=" + costodesayunos + ", costolibros=" + costolibros + ", costopaseos=" + costopaseos +super.toString()+'}';
    }
}
