package org.campusdual.bootcamp.ingenieros.ejercicio4;

import org.campusdual.bootcamp.ingenieros.utils.Input;

public class Main {
    public static void main(String[] args) {

        //Calcular el factorial de un numero dado (No probar con número muy altos).

        System.out.println("Este es el ejericio 04 Ingrese un n{umero para saber su factorial");

        Integer x = Input.integer();
        int factorial = 1;
        while(x.intValue()>1){
            factorial*=x.intValue();
            x--;
        }
        System.out.println("Su factorial es "+factorial);
    }
}