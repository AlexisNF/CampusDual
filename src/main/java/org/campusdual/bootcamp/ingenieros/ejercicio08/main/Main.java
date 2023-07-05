package org.campusdual.bootcamp.ingenieros.ejercicio08.main;

import org.campusdual.bootcamp.ingenieros.utils.Input;

import java.util.LinkedList;

public class Main {

    private static LinkedList<Integer> lista = new LinkedList<Integer>();

    public static void main(String[] args) {


        /*
        8. Crear un programa con un menú de línea de comandos.
a. Si se selección la opción “a”, se solicitará un numero para añadir a la lista.
b. Si se selección la opción “s”, se devolverá la suma de los elementos de la lista.
c. Si se selecciona la opción “d” se eliminará el último elemento de la lista.
         */

        System.out.println("Ejercicio 8");




        boolean exit = false;
        initializeList();

        while(!exit){

            mostrarComandos();

            char comando =Input.character();

            if(comando == 'a' || comando == 'A')
                solicitarNumeroAddLista();

            if(comando == 's' || comando == 'S')
                System.out.println("La suma total de todos los elementos de la lista es: "+sumaElementosLista());


            if(String.valueOf(comando).equalsIgnoreCase("d"))
                eliminarUltimoElemento();

            if(String.valueOf(comando).equalsIgnoreCase("m"))
               mostrarListadDetallada();

            if(comando == 'e' || comando == 'E')
                exit=true;

        };

    }

    private static void solicitarNumeroAddLista(){
        System.out.println("Inserte el número");
        Integer value = Input.integer();
        lista.add(value);

        System.out.println("indice del elemento "+(lista.size()-1)+" valor: "+lista.get(lista.size()-1));

    }

    private static int sumaElementosLista( ){

        int suma=0;

        for (Integer value: lista
             ) {
            suma+=value.intValue();
        }

        return suma;
    }

    private static void eliminarUltimoElemento(){
        lista.remove(lista.size()-1);
    }


    private static void initializeList(){

        for(int i=0; i<10;i++){
            lista.add(i);
        }

    }

    private static void  mostrarComandos(){
        System.out.println("");
        System.out.println("Seleccione un comando de la siguiente lista");
        System.out.println("Presione 'a' para añadir un # a la lista");
        System.out.println("Presione 's' para sumar todos los elementos de la lista");
        System.out.println("Presione 'd' para eleminar el último elemento de la lista");
        System.out.println("Presione 'm' para mostrar indice, valor y tamaño de la lista");
        System.out.println("Presione 'e' para salir del programa");
    }

    private static void mostrarListadDetallada(){

        System.out.println("El tamaño de la lista es "+lista.size());

        for (Integer v:lista
             ) {
            System.out.println("Posicion "+lista.indexOf(v)+" valor: "+v.intValue());
        }

    }
}