package org.campusdual.bootcamp.ingenieros.ejericicio13.clases.principal;

import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Tipo;

public abstract class Animal {

    private Reino reino;
    private Tipo tipo;
    private String raza;
    private Medio medio;


    public abstract void reproducirSonido();
    public abstract void desplazarse();

    public Animal(Reino reino, Tipo tipo, String raza, Medio medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }

    public Reino getReino() {
        return reino;
    }

    public void setReino(Reino reino) {
        this.reino = reino;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino=" + reino +
                ", tipo=" + tipo +
                ", raza='" + raza + '\'' +
                ", medio=" + medio +
                '}';
    }


    //constructor copia
    public Animal (Animal a){
        this.reino = a.reino;
        this.tipo = a.tipo;
        this.raza = a.raza;
        this.medio = a.medio;
    }


}

