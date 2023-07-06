package org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Animales;

import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.AnimalGranja;
import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Tipo;

public class Vaca extends AnimalGranja {
    public Vaca(Reino reino, Tipo tipo, String raza, Medio medio) {
        super(reino, tipo, raza, medio);
    }
}
