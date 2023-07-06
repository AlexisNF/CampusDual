package org.campusdual.bootcamp.ingenieros.ejericicio13.clases.animales;

import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Mascota;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Medio;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Reino;
import org.campusdual.bootcamp.ingenieros.ejericicio13.clases.Tipo;

public class Gato extends Mascota {

    public Gato(Reino reino, Tipo tipo, String raza, Medio medio, String nombreMascota) {
        super(reino, tipo, raza, medio, nombreMascota);
    }

    @Override
    public void desplazarse() {
        System.out.println("se desplaza como flash!!");
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Hace miau .....uuu aaggh agghh aghhh ....paraparapan parapan we going down with the sickness");
    }
}
