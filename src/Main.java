import org.generation.adoption.models.Cat;
import org.generation.adoption.models.Pet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * Clase abstracta que es y para que sirve
         * Como generar documentacion de java usando javadoc (css y html)
         * Interfaces que son y para que sirven (diferencia entre herencia e implementacion)
         * Como heredar
         * Sobrecarga de metodos
         * Override de metodos
         * Excepciones y como propagarlas
         * Polimorfismo y encapsulacion.
         */
        //creando un arraylist de tipo pet
        ArrayList<Pet> mascotas = new ArrayList<>();
        mascotas.add(new Cat("Nami", 1, "tricolor", 4, "carey"));
        mascotas.add(new Cat("Alora", 1, "tricolor", 4, "calico"));
        mascotas.add(new Cat("July", 5, "blanco con gris", 4, "americano de pelo corto"));
        for (Pet mascota : mascotas){
            mascota.makeSound();
            mascota.showDetails();
        }

    }
}
