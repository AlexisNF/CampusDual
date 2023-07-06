package org.campusdual.bootcamp.ingenieros.ejercicio12.clases;

import org.campusdual.bootcamp.ingenieros.ejercicio12.Interfaces.IPropietario;

public class AnimalGranja extends Animal implements IPropietario {


    public AnimalGranja(Reino reino, Tipo tipo, String raza, Medio medio) {
        super(reino, tipo, raza, medio);
    }


    @Override
    public String getPropietario() {
        return null;
    }

    @Override
    public void setPropietario() {

    }
}
