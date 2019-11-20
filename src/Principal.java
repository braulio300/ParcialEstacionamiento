
import java.time.LocalDateTime;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estacionamiento est = new Estacionamiento();

        String marca, modelo, color, patente = null;

        int anio, opcion, numeroA, cilindrada;
        Date ingreso, salida;
        boolean salir = false;
        while (!salir) {
            System.out.println("---------------------------");
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Sacar vehiculo");
            System.out.println("3. Lista de vehiculos");
            System.out.println("4. Salir");
            System.out.println("---------------------------");
            try {
                System.out.println("Elija una opción");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1: {
                        System.out.println("Ingrese tipo {M} OR [A] ");
                        String tipo = teclado.next();
                        if (tipo == "M") {
                            Motocicleta motocicleta = new Motocicleta();
                            // rellenar datos
                            est.agregar(motocicleta);
                            System.out.println("Ingrese patente");
                            patente = teclado.next();
                            motocicleta.setPatente(patente);
                            
                        } else if (tipo == "a") {
                            Automovil auto = new Automovil();
                            // rellenar datos
                            System.out.println("Ingrese patente");
                            est.agregar(auto);
                        } else {
                            System.out.println("Ingrese un tipo valido");
                        }
                        {

                            break;
                        }
                    }
                    case 2: {

                        est.borrar();
                        break;
                    }
                    case 3: {
                        System.out.println("Ingrese tipo: ");
                        String tipo = teclado.next();
                        est.listar(tipo);
                        break;
                    }
                    case 4: {

                        salir = true;
                        break;
                    }
                    default:
                        System.out.println("Debe ingresar un número válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese opción válida");
                teclado.next();
            }
        }
    }
}
