package Modelo;

public class Boleto {

    //Atributos
    private int id;
    private int precio;
    private String nombrePelicula;
    private String asiento;
    private Espectador espectador;

    public Boleto(int id, String nombre, String x){
        this.id = id;
        this.precio = 10000;
        this.nombrePelicula = nombre;
        this.asiento = x;
    }

	public String getId() {
		return Integer.toString(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
    
    
}
