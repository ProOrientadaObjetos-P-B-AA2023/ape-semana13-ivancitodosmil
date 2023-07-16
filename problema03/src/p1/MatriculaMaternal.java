package p1;

public class MatriculaMaternal extends Matricula{
    private double costodesayunos;
    private double costoalmuerzo;
    private double costomedico;

    public MatriculaMaternal(double costodesayunos, double costoalmuerzo, double costomedico) {
        this.costodesayunos = costodesayunos;
        this.costoalmuerzo = costoalmuerzo;
        this.costomedico = costomedico;
    }

     public double ObtenerTarifa(){
        return (costodesayunos+costoalmuerzo+costomedico); 
    }

    @Override
    public String toString() {
        return "MatriculaMaternal{" + "costodesayunos=" + costodesayunos + ", costoalmuerzo=" + costoalmuerzo + ", costomedico=" + costomedico +super.toString()+'}';
    }
}