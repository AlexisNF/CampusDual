package org.campusdual.bootcamp.ingenieros.ejericicio13.clases.animales;

import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Mascota;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Tipo;

public class Perro extends Mascota {
    public Perro(Reino reino, Tipo tipo, String raza, Medio medio, String nombreMascota) {
        super(reino, tipo, raza, medio, nombreMascota);
    }
}
