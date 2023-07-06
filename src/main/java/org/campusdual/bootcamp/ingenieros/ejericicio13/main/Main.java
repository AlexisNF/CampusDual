package org.campusdual.bootcamp.ingenieros.ejericicio13.main;


import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Tipo;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.animales.Gato;

public class Main {
    public static void main(String[] args) {

        System.out.println("Este es el ejercicio 13");
        /*
         13. En un nuevo paquete. Convertir la clase Animal, en abstracta.
         Esta clase tiene los métodos abstractos reproducir sonido,
         y desplazarse que imprimirá por consola el sonido
          y el método de desplazamiento de cada animal.
         */

        Gato cat = new Gato(Reino.mamífero,new Tipo("gatito"),"Leon", Medio.terrestre,"Simba");
        cat.desplazarse();//como redefino este metodo en la clase de gato y no en su calse padre mascota??
        cat.reproducirSonido();
    }
}