package org.campusdual.bootcamp.ingenieros.ejercicio06;

import org.campusdual.bootcamp.ingenieros.utils.Input;

public class Main {
    public static void main(String[] args) {

        //Ejericio 06 Imprimir por pantalla la serie de Fibonacci

        System.out.println("Este es el ejercicio 6");
        System.out.println("Indique la cantidad de números de la serie Fibonacci que desea ver");

        Integer cantElementos = Input.integer();

        double x = 0;
        double y = 1;

        double suma = 0;

        double numero = 1;
        do {
            suma = x + y;

            System.out.println("Número " + Math.round(numero) + ": " + Math.round(suma));

            x = y;
            y = suma;

            numero++;
            cantElementos--;
        }
        while (cantElementos > 0);

    }

}