package org.campusdual.bootcamp.ingenieros.ejercicio5;

import org.campusdual.bootcamp.ingenieros.utils.Input;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {


        // Dado un numero decimal, devolver por separado la parte entera y la parte decimal.

        System.out.println("Ejercicio 5 ingrese un número decimal");
        String numeroDecimal = Input.string();

        if(numeroDecimal.contains(",")){
            String [] cadenas = numeroDecimal.split(",");
            System.out.println( "parte entera "+cadenas[0]);
            System.out.println( "parte decimal"+cadenas[1]);
        }
        if(numeroDecimal.contains(".")){
            String [] cadenas = numeroDecimal.split("\\.");
            System.out.println( "parte entera "+cadenas[0]);
            System.out.println( "parte decimal"+cadenas[1]);
        }else {
            System.out.println(numeroDecimal);
        }
    }

    private String devolverParteEnteraYDecimal(){
     return "";
    }
}