package Modelo;

public class Boleto {

    //Atributos
    private int id;
    private int precio;
    private String nombrePelicula;
    private String asiento;

    public Boleto(int id, String nombre, String x){
        this.id = id;
        this.precio = 10000;
        this.nombrePelicula = nombre;
        this.asiento = x;
    }

    public void mostrar (){
        System.out.println(this.id + " " + this.precio + " " + this.nombrePelicula + " " + this.asiento);
    }

}
