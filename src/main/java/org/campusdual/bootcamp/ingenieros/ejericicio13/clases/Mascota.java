package org.campusdual.bootcamp.ingenieros.ejericicio13.clases;

import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.principal.Animal;
import org.campusdual.bootcamp.ingenieros.ejericicio13.interfaces.IPropietario;

public class Mascota extends Animal implements IPropietario {

    String nombreMascota;

    public Mascota(Reino reino, Tipo tipo, String raza, Medio medio, String nombreMascota) {
        super(reino, tipo, raza, medio);
        this.nombreMascota=nombreMascota;
    }


    public String getNombre() {
        return nombreMascota;
    }

    public void setNombre(String nombre) {
        nombreMascota = nombre;
    }


    @Override
    public String getPropietario() {
        return null;
    }

    @Override
    public void setPropietario() {

    }

    @Override
    public void reproducirSonido() {
        System.out.println("Hace sonido de mascota");
    }

    @Override
    public void desplazarse() {
        System.out.println("Se desplaza como mascota");
    }
}
