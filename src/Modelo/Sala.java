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
                    case 0 -> asientos.add(aux, (i + 1) + "D");
                    case 1 -> asientos.add(aux, (i + 1) + "C");
                    case 2 -> asientos.add(aux, (i + 1) + "B");
                    case 3 -> asientos.add(aux, (i + 1) + "A");
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

    String frase_2 = "pinche u";

    //sotzio

    //hola
    //Hola perro
    String frase = "Git jujuemadre";

    String frase_3 = "lolsito";
    
    String frase_d = "lolsito";
    String frase_a = "lolsito";
}