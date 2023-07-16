package p1;

public abstract class Matricula {
    
    public abstract double ObtenerTarifa();

    @Override
    public String toString() {
        return "Matricula{ La Tarifa es: " +ObtenerTarifa()+ '}';
    }
}
