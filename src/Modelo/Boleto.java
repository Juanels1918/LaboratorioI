package Modelo;

public class Boleto {

    //Atributos
    private int id;
    private int precio;
    private String nombrePelicula;
    private String asiento;

    public Boleto(String nombre, String x){
        this.id = (int) Math.floor(Math.random()*(999 - 100 + 1) + 100);
        this.precio = 10000;
        this.nombrePelicula = nombre;
        this.asiento = x;
    }

}
