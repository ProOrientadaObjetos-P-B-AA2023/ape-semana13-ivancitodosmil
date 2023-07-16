package p1;

public abstract class Matricula {
    
    public abstract double getTarifa();
        
    @Override
    public String toString() {
        return "Matricula{" + "tarifa=" + getTarifa() + '}';
    }
}
