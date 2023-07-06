package org.campusdual.bootcamp.ingenieros.ejercicio11.clases;

public class AnimalGranja implements IPropietario{
    private int identificador;

    public AnimalGranja(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String getPropietario() {
        return "";
    }

    @Override
    public void setPropietario() {

    }
}
