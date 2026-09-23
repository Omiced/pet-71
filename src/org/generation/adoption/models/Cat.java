package org.generation.adoption.models;

import org.generation.adoption.interfaces.Adoptable;

/**
 * La palabra reservada para heredar es Extends
 *
 */
public class Cat extends Pet implements Adoptable {
    private String breed;

    /**
     * Metodo constructor de una subclase
     * <p>
     *     En este metodo se reciben como parametros tambien los atributos heredados de la
     *     super clase, para luego ser asignados mediante el metodo super();
     * </p>
     * @param name Atributo heredado tipo String
     * @param age Atributo heredado tipo Integer
     * @param color Atributo heredado tipo String
     * @param numPatas Atributo heredado tipo Integer
     * @param breed Atributo propio tipo String
     */
    public Cat(String name, Integer age, String color, Integer numPatas, String breed){
        super(name, age, color, numPatas);
        this.breed = breed;
    }//constructor

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    /**
     * Override vs Overload
     * Override es cuando una subclase sobreescribe un metodo heredado usando exactamente
     * la misma firma.
     *
     * Overload es cuando tenemos un metodo con el mismo nombre varias veces, pero que recibe
     * diferente cantidad de parametros o en diferente orden.
     */


    @Override
    public void makeSound() {
        System.out.println("El gato 😺 " + this.getName() + " hace miau");
    }

    @Override
    public void showDetails() {
        System.out.println("El gato de nombre " + this.getName() + " tiene " + this.getAge() +
         " años es de color " + this.getColor() + " tiene " + this.getNumPatas() + " patas  y es de raza "
         + this.getBreed()
        );
    }

    @Override
    public void adopt() {
        System.out.println("Felicidades " + this.getName() + "  fue adoptad@ 🎉🍾");
    }
}//Cat
