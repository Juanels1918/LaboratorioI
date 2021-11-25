package Modelo;

public class Pelicula {

    private String nombre;
    private String director;
    private int edadMin;
    private int duracion;
    private double precio;

    public Pelicula(String nombre, String director, int edadMin, int duracion, double precio) {
        this.nombre = nombre;
        this.director = director;
        this.edadMin = edadMin;
        this.duracion = duracion;
        this.precio = precio;
    }

    public String getNombre() { return nombre;    }
    public String getDirector() { return director;    }
    public int getEdadMin() { return edadMin;    }
    public int getDuracion() { return duracion;    }
    public double getPrecio() { return precio;    }

}
