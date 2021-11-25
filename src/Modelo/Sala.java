package Modelo;

import java.util.ArrayList;

public class Sala {

    //Atributos
    private ArrayList<String> asientos = new ArrayList<>();
    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private int hora = 11;
    private Boleto B;
    Pelicula P;
    private String peliculaActual;

    public Sala (){
        hora = 11;
        rellenarAsientos();
        agregarPelicula();
        mostrarAsientos();
        peliculaActual = peliculas.get(0).getNombre();
    }

    //Genera la cantidad de asientos
    public void rellenarAsientos () {

        int aux = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4; j++){
                switch (j) {
                    case 0 -> asientos.add(aux, (i + 1) + "D");
                    case 1 -> asientos.add(aux, (i + 1) + "C");
                    case 2 -> asientos.add(aux, (i + 1) + "B");
                    case 3 -> asientos.add(aux, (i + 1) + "A");
                }
                aux++;
            }
        }
    }

    //Muestra los asientos
    public void mostrarAsientos (){
        int aux = 15;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(asientos.get(aux) + " ");
                aux--;
            }
            System.out.println();
        }
    }

    //Genera las peliculas que se van a mostrar
    public void agregarPelicula (){
        peliculas.add(0, P = new Pelicula("Spider-Man 2", "Sam Raimi", 7, 127, 10000));
        peliculas.add(1, P = new Pelicula("Baby Driver", "Edgar Wright", 16, 115, 10000));
        peliculas.add(2, P = new Pelicula("Parasite", "Bong Joon-ho", 16, 132, 10000));
    }

    public String mostrarNombrePeli (int index){
        return peliculas.get(index).getNombre();
    }

    public String mostrarDirector (int index){
        return peliculas.get(index).getDirector();
    }

    public int mostrarEdadMin (int index){
        return peliculas.get(index).getEdadMin();
    }

    public int mostrarDuracion (int index){
        return peliculas.get(index).getDuracion();
    }

    public double mostrarPrecio (int index){
        return peliculas.get(index).getPrecio();
    }

    //Avanza la hora de la sala
    public void avanzarHora(){
        hora += 1;
    }

    private int idBoleta = 1;
    public void comprarBoleta (){
        int aux = (int) Math.floor(Math.random()*(16 - 1 + 1) + 1);
        B = new Boleto(idBoleta, peliculas.get(0).getNombre(), asientos.get(aux));
        idBoleta++;
        B.mostrar();
    }

    // --- -- -- -- Getters & Setters
    
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (this.hora<22) {
			this.hora += hora;
		}else {
			this.hora=11;
		}
		
	}

	public ArrayList<String> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<String> asientos) {
		this.asientos = asientos;
	}

	public Boleto getB() {
		return B;
	}

	public void setB(Boleto b) {
		B = b;
	}

	public String getPeliculaActual() {
		return peliculaActual;
	}

	public void setPeliculaActual(int num) {
		this.peliculaActual = peliculas.get(num).getNombre();
		System.out.println("" + this.peliculaActual);
	}
	
	
    
}