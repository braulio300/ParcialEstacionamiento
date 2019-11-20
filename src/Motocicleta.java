
import java.util.Date;

public class Motocicleta extends Vehiculo implements Descontable {

    private int cilindrada;
    private boolean custodia;
    private String categoria;

    public Motocicleta() {
    }

    public Motocicleta(String patente, String marca, int anio, String modelo, String color, int cilindrada, boolean custodia, String categoria) {
        super(patente, marca, modelo, anio, color);
        this.cilindrada = cilindrada;
        this.categoria = categoria;
        this.custodia = custodia;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isCustodia() {
        return custodia;
    }

    public void setCustodia(boolean custodia) {
        this.custodia = custodia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int minutos() {
        return 0;
    }

    @Override
    public void obtenerClasificacion() {
        System.out.println("MOTOCICLETA");
        System.out.println("Patente:" + this.patente);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cilindrada:" + this.cilindrada);
    }

    @Override
    public double obtenerPagarEstacionamiento() {
        double total = 20 * this.minutos();
        if (total <= 10000) {
            return total;
        } else {
            return 10000;
        }
    }

    @Override
    public double descontar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerTotalFinal() {
        return this.obtenerPagarEstacionamiento() - (this.obtenerPagarEstacionamiento() * this.descontar());
    }

    @Override
    public boolean isAuto() {
        return false;
    }

}
