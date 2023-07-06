package org.campusdual.bootcamp.ingenieros.ejericicio13.clases;

import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.principal.Animal;
import org.campusdual.bootcamp.ingenieros.ejericicio13.interfaces.IPropietario;

public class AnimalGranja extends Animal implements IPropietario {


    @Override
    public void reproducirSonido() {

    }

    @Override
    public void desplazarse() {

    }

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
