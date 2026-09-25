import org.generation.adoption.exceptions.InvalidData;
import org.generation.adoption.interfaces.Adoptable;
import org.generation.adoption.models.Cat;
import org.generation.adoption.models.Pet;
import org.generation.adoption.models.Turtle;

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
        try {
            mascotas.add(new Cat("Nami", 1, "tricolor", 4, "carey"));
            mascotas.add(new Cat("Alora", 1, "tricolor", 4, "calico"));
            mascotas.add(new Cat("", 5, "blanco con gris", 4, "americano de pelo corto"));
            mascotas.add(new Turtle("Tugo", 10, "Cafe", 4, false));
            mascotas.add(new Turtle("Kimbo", 15, "Verde", 4, true));
        }catch (InvalidData e){
            System.out.println("Problemas al crear la mascota " + e.getMessage());
        }
        for (Pet mascota : mascotas){
            mascota.makeSound();
            mascota.showDetails();
            if(mascota instanceof Adoptable){
                ((Adoptable) mascota).adopt();
            }
        }

    }
}
