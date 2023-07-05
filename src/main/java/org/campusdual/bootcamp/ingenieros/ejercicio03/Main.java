package org.campusdual.bootcamp.ingenieros.ejercicio03;

import org.campusdual.bootcamp.ingenieros.utils.Input;

public class Main {
    public static void main(String[] args) {

        System.out.println("Este es el ejericicio 03");

        //3. Dado un numero entero, determinar todos los divisores de dicho número

        Integer x = Input.integer();
        for(int i=1; i<=x.intValue(); i++){
            if(x%i==0)
                System.out.println(i);
        }






    }
}