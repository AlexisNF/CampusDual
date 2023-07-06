package org.campusdual.bootcamp.ingenieros.ejercicio10.main;


import org.campusdual.bootcamp.ingenieros.ejercicio10.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio10.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejercicio10.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejercicio10.clases.Tipo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Este es el ejercicio 10");
        /*
       Implementar en la clase animal un constructor de copia
       y el método clone.
         */
        try {
            Animal base = new Animal(Reino.mamífero, new Tipo("Perro"), "labrador", Medio.terrestre);
            System.out.println(base);

            Animal otroAnimal = new Animal(base.getReino(), base.getTipo(), base.getRaza(), base.getMedio());
            System.out.println(otroAnimal);
            System.out.println(base.equals(otroAnimal));

            Animal aCopy = new Animal(base);
            System.out.println(aCopy);
            System.out.println(base.equals(aCopy));

            Animal clone = (Animal) aCopy.clone();
            System.out.println(clone);
            System.out.println(base.equals(clone));
            System.out.println(clone.equals(aCopy));

        } catch (Exception e) {

        }
    }
}