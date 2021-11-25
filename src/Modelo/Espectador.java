package Modelo;

import Modelo.Boleto;

public class Espectador {

    //atributos
    private String nombre;
    private String edad;
    private String dinero;
    
    public Espectador(String nombre, String edad, String dinero)
    {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.dinero = dinero;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDinero() {
		return dinero;
	}

	public void setDinero(String dinero) {
		this.dinero = dinero;
	}


}
