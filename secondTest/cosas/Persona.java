/* Clase persona */

package cosas;

import java.util.*;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void bailar(){
        System.out.println("Soy " + nombre + " y estoy bailando!");
    }

}
