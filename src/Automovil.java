
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Automovil extends Vehiculo implements Descontable {

    private int numeroA;
    private String tipo;

    public Automovil() {
    }

    public Automovil(String patente, String marca, String modelo, int anio, String color, int numeroA, String tipo) {
        super(patente, marca, modelo, anio, color);
        this.numeroA = numeroA;
        this.tipo = tipo;
    }

    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public String getTipo() {
        return tipo;
    }

    public Calendar fecha() {
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return null;
    }

    public void setTipo(String tipo) {
        if (this.tipo == "1") {
            this.tipo = "Sedan";
        } else if (this.tipo == "2") {
            this.tipo = "Hashback";
        } else if (this.tipo == "3") {
            this.tipo = "SUV";
        } else if (this.tipo == "4") {
            this.tipo = "Camioneta";
        }
    }

    public int minentr() {
        LocalDateTime locaDate = LocalDateTime.now();
        int minutes = locaDate.getMinute();
        return 0;
    }

    public int minsalid() {
        LocalDateTime locaDate = LocalDateTime.now();
        int minutes = locaDate.getMinute();
        return 0;
    }

    public int minutos() {
        return this.minentr() - this.minsalid();
    }

    @Override
    public void obtenerClasificacion() {
        System.out.println("----------------------------");
        System.out.println("         AUTOMOVIL");
        System.out.println("Patente: " + this.patente);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("----------------------------");
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
        int tipo2 = 0;
        if (this.tipo == "Sedan") {
            tipo2 = 1;
        } else if (this.tipo == "Hashback") {
            tipo2 = 2;
        } else if (this.tipo == "SUV") {
            tipo2 = 3;
        } else if (this.tipo == "Camioneta") {
            tipo2 = 4;
        }
        double descuento = 0;
        //if (this.fecha.getDay() == Calendar.SATURDAY || this.fecha.getDay() == Calendar.SUNDAY){
        //switch (tipo2){
        //case 1:
        //      descuento = DESCSEDHASH;
        //      break;
        //case 2:
        //      descuento = DESCSEDHASH;
        //      break;
        //case 3:
        //      descuento = DESCSUV;
        //case 4: 
        //      descuento = DESCAMION;
        //}
        //return this.obtenerPagarEstacionamiento()-(this.obtenerPagarEstacionamiento()*descontar);
        //}
        //else{
        //     return this.obtenerPagarEstacionamiento();
        //}

        return 0;

    }

    @Override
    public double obtenerTotalFinal() {
        return this.obtenerPagarEstacionamiento() - (this.obtenerPagarEstacionamiento() * this.descontar());
    }

    void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAuto() {
        return true;
    }

}
