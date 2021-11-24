package Modelo;

import java.util.ArrayList;

public class Sala {

    ArrayList<String> asientos = new ArrayList<>();
    String pelicula;

    public void rellenarAsientos () {

        int aux = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4; j++){
                switch (j) {
                    case 0: asientos.add(aux, (i + 1) + "D"); break;
                    case 1: asientos.add(aux, (i + 1) + "C"); break;
                    case 2: asientos.add(aux, (i + 1) + "B"); break;
                    case 3: asientos.add(aux, (i + 1) + "A"); break;
                }
                aux++;
            }
        }
    }

    public void mostrar (){
        int aux = 15;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(asientos.get(aux) + " ");
                aux--;
            }
            System.out.println();
        }
    }
}