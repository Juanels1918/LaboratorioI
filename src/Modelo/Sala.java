package Modelo;

import Modelo.Boleto;
import java.util.ArrayList;

public class Sala {

    //Atributos
    private ArrayList<String> asientos = new ArrayList<>();
    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private int hora = 11;

    Pelicula P;

    public Sala (){
        hora = 11;
        rellenarAsientos();
        agregarPelicula();
        mostrarAsientos();
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

    //Avanza la hora de la sala
    public void avanzarHora(){
        hora += 1;
    }

    private int idBoleta = 1;
    public void comprarBoleta (){
        int aux = (int) Math.floor(Math.random()*(16 - 1 + 1) + 1);
        Boleto B = new Boleto(idBoleta, peliculas.get(0).getNombre(), asientos.get(aux));
        idBoleta++;
        B.mostrar();
    }

    // --- -- -- -- Getters & Setters
    
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora += hora;
	}

	public ArrayList<String> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<String> asientos) {
		this.asientos = asientos;
	}
	
	
    
}