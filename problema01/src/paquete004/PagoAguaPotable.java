package paquete004;

public class PagoAguaPotable extends Pago {
    public String tipo;
    public double tarifaFija;
    public double metrosCubicosConsumo;
     public double costoConsumoCubicos;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }
     
    public void calcularPago(){
        if(tipo.equals("comercial")){
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" + "tipo=" + tipo + ", tarifaFija=" + tarifaFija + ", metrosCubicosConsumo=" + metrosCubicosConsumo + ", costoConsumoCubicos=" + costoConsumoCubicos + super.toString()+'}';
    }
}
