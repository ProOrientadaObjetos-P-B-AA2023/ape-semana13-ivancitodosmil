package paquete004;

public class PagoAguaPotable extends Pago {
    private String tipo;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }
     
    public double ObtenerPago(){
        if(tipo.equals("comercial")){
            return(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15);
        }else{
            return(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos));
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" + "tipo=" + tipo + ", tarifaFija=" + tarifaFija + ", metrosCubicosConsumo=" + metrosCubicosConsumo + ", costoConsumoCubicos=" + costoConsumoCubicos + super.toString()+'}';
    }
}
