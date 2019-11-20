
import java.io.Console;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Estacionamiento {

    private ArrayList<Vehiculo> vehiculos;

    public Estacionamiento() {
        vehiculos = new ArrayList<>();
    }

    public void agregar(Vehiculo vehiculo) {
        fecha();
        horaentrada();
        Scanner teclado = new Scanner(System.in);
        Automovil automovil = new Automovil();
        System.out.println("Ingrese patente");
        String patente = teclado.next();
        automovil.add();
    }

    public void listar(String tipo) {
        for (Vehiculo v : vehiculos) {
            if (tipo == "A" && v.isAuto()) {
                v.obtenerClasificacion();
            } else if (tipo == "M" && !v.isAuto()) {
                v.obtenerClasificacion();
            }
        }
    }

    public void borrar() {
        horasalida();
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        {
            { //Declaración y creación del ArrayList de enteros.
                a.add(4);
                a.add(4);
                a.add(12);
                a.add(3);
                a.add(41);
                a.add(39);
                a.add(21);
                a.add(4);
            }
        }
        System.out.println("Introduzca patente a sacar: ");
        int patente = teclado.nextInt();
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i).equals(patente)) { //Se eliminan el número/s igual al que se ha introducido por teclado.
                a.remove(i);
            }
        }
        for (int i = a.size() - 1; i >= 0; i--) { //Se muestra.
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    private void fecha() {
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println("Fecha        : " + dia + "/" + (mes) + "/" + año);
    }

    private void horaentrada() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora Entrada : " + hours + ":" + minutes + ":" + seconds);
    }

    private void horasalida() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora Salida : " + hours + ":" + minutes + ":" + seconds);
    }

}
