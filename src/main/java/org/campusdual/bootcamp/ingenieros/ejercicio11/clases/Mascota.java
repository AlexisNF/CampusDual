package org.campusdual.bootcamp.ingenieros.ejercicio11.clases;

public class Mascota implements IPropietario{

    String Nombre;

    public Mascota(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public String getPropietario() {
        return null;
    }

    @Override
    public void setPropietario() {

    }
}
