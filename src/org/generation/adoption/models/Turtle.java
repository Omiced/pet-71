package org.generation.adoption.models;

public class Turtle extends Pet{
    private Boolean isMarine;

    public Turtle(String name, Integer age, String color, Integer numPatas, Boolean isMarine) {
        super(name, age, color, numPatas);
        this.isMarine = isMarine;
    }

    public Boolean getMarine() {
        return isMarine;
    }

    public void setMarine(Boolean marine) {
        isMarine = marine;
    }


    @Override
    public void makeSound() {
        System.out.println("Sonidos de tortuga 🐢");
    }

    @Override
    public void showDetails() {
        System.out.println("La tortuga de nombre " + getName() + " tiene color " + getColor() + " tiene " + getAge() + " años y es " +
                (getMarine() ? " es marina" : " es terrestre"));
    }
}
