package org.campusdual.bootcamp.ingenieros.ejercicio5;

import org.campusdual.bootcamp.ingenieros.utils.Input;

public class MyInput extends Input{


    public static String string(String message) {
        if (message != null) {
            System.out.print(message+"my metodo");
        }
        String value = Input.init();
        return value;
    }
}
