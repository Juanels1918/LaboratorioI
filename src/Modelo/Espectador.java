package Modelo;

import Modelo.Boleto;

public class Espectador {

    //atributos
    private String nombre;
    private int edad;
    private int dinero;
    Boleto b; 
    
    public Espectador(String nombre, int edad, int dinero, Boleto b)
    {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.dinero = dinero;
    	this.b = b;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public Boleto getB() {
		return b;
	}

	public void setB(Boleto b) {
		this.b = b;
	}

}
