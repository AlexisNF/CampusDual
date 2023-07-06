package org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Animales;

import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Mascota;
import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejercicio12.clases.Tipo;

public class Perro extends Mascota {
    public Perro(Reino reino, Tipo tipo, String raza, Medio medio, String nombreMascota) {
        super(reino, tipo, raza, medio, nombreMascota);
    }
}
