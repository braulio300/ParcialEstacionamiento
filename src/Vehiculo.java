
public abstract class Vehiculo implements Descontable {

    protected String patente;
    //se define metodo abstracto
    protected String marca;
    protected String modelo;
    protected int anio;
    protected String color;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, int anio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        int largo;
        largo = marca.length();
        if (largo == 6) {
            this.patente = patente;
        } else {
            System.out.println("Debe Ingresar Una patente de 6 caracteres");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        int largo;
        largo = marca.length();
        if (largo > 0) {
            this.marca = marca;
        } else {
            System.out.println("DEBE INGRESAR UNA MARCA");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        int larg;
        larg = modelo.length();
        if (larg > 0) {
            this.modelo = modelo;
        } else {
            System.out.println("DEBE INGRESAR UN MODELO");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < 2020 && anio > 1900) {
            this.anio = anio;
        } else {
            System.out.println("INGRESE UN AÑO VALIDO");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void verVehiculo(){
        System.out.println("--------------------");}
    public abstract void obtenerClasificacion();
    
    public abstract boolean isAuto();

       @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + '}';
    }

 
}
