package org.campusdual.bootcamp.ingenieros.ejercicio01;

import org.campusdual.bootcamp.ingenieros.utils.Input;


public class Main {


    public static void main(String[] args) {

        //Pedir un numero entero al usuario, imprimir si el número es par o impar.
        System.out.println("Este es el ejercicio 01! Inserte un #");
        try {

            //Main.funcionNumberPar();
            Main.funcionNumberPar();


        } catch (NumberFormatException e) {
            System.out.println("Introduzca un número entero");
        } finally {
            System.out.println("fin de ejercicio 01");
        }

    }

    private static void funcionNumberPar() {
        //////////////////Ejercicio 01/////////////////////////
        Integer number = Input.integer();
        if (number % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("el número es impar");
        }
        //////////////////////////////////////////////////////

    }

}