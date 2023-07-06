package org.campusdual.bootcamp.ingenieros.ejericicio13.clases.animales;

import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.AnimalGranja;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Tipo;

public class Vaca extends AnimalGranja {
    public Vaca(Reino reino, Tipo tipo, String raza, Medio medio) {
        super(reino, tipo, raza, medio);
    }
}
