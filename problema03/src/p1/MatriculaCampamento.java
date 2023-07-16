package p1;

public class MatriculaCampamento extends Matricula{
    private double costotransporte;
    private double costocomida;
    private double costoinstructores;

    public MatriculaCampamento(double costotransporte, double costocomida, double costoinstructores) {
        this.costotransporte = costotransporte;
        this.costocomida = costocomida;
        this.costoinstructores = costoinstructores;
    }

    public double ObtenerTarifa(){
        return (costotransporte + costocomida + costoinstructores); 
    }
 
    @Override
    public String toString() {
        return "MatriculaCampamento{" + "costotransporte=" + costotransporte + ", costocomida=" + costocomida + ", costoinstructores=" + costoinstructores + super.toString()+'}';
    }
}

