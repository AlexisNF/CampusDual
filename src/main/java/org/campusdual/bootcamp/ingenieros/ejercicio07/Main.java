package org.campusdual.bootcamp.ingenieros.ejercicio07;

import org.campusdual.bootcamp.ingenieros.utils.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Este es el ejericio 7!");

        imprimirValor(Input.string());


        /*
        Crear el metodo imprimirValor que para cada tipo de datos imprime:
            a. “El {tipo de dato en castellano} es {valor} ”
            b. Por ejemplo:
            i. El entero es 5
            ii. El flotante es 2.7
         */
    }

    private static void imprimirValor(String valor){

        if(valor.matches("[0-9]+"))
            System.out.println("Es entero es "+valor);
        if(valor.matches("[^0-9][a-z]]") )  ////esta mal
            System.out.println("Es cadena de caracteres es "+valor);
        if(valor.matches("[0-9]+[.,]"))              ///////////////////////"esta mal"
            System.out.println("Es flotante es "+valor);
        if(valor.equalsIgnoreCase("true") || valor.equalsIgnoreCase("false"))
            System.out.println("Es boleano es "+valor);


        //matches();
        System.out.println("");
    }
}