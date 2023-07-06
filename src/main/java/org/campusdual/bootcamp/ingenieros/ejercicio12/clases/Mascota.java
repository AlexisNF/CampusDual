package org.campusdual.bootcamp.ingenieros.ejercicio12.clases;

import org.campusdual.bootcamp.ingenieros.ejercicio12.Interfaces.IPropietario;

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
}
