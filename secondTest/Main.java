/* Testing Java features */

import cosas.Persona;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList();

        lista.add(new Persona("Gaston", 21));
        lista.add(new Persona("Beto", 19));
        lista.add(new Persona("Pepe", 22));

        for (Persona alguien : lista){
            alguien.bailar();
        }
   
    }

}
