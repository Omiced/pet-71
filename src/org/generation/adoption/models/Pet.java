package org.generation.adoption.models;

import org.generation.adoption.exceptions.InvalidData;

import java.util.Scanner;

/**
 * Una clase abstracta es una clase que sirve de molde para otras clases
 * Importante:
 * <ul>
 *     <li>No puede ser instanciada (no podemos crear objetos)</li>
 *     <li>Pueden tener metodos abstractos
 *          <p>
 *              Los metodos abstractos solo declaran la firma, y la clase que herede
 *              la clase abstracta se tiene que encargar de completarlos, es obligatorio para la subclase
 *              implementar estos metodos
 *              Indica que vamos a hacer pero no el como
 *          </p>
 *     </li>
 *     <li>Puede tener atributos/propiedades</li>
 *     <li>Puede tener metodos normales</li>
 *     <li>Puede tener constructor</li>
 * </ul>
 */
public abstract class Pet {
    /**
     * Propieades o atributos
     * Son caracteristicas del objeto
     * Nota:
     * Las clases no ocupan espacio en memoria
     * Cuando creamos el objeto, se reserva un espacio en memoria para llenar las caracteristicas
     */
    private String name;
    private Integer age;
    private String color;
    private Integer numPatas;


    /**
     * Metodo constructor
     * <p>Es un metodo especial que ayuda a definir el estado inicial del objeto</p>
     * Caracteristicas
     * <ul>
     *     <li>
     *         Tiene el mismo nombre que la clase, igualito en este caso Pet
     *     </li>
     *     <li>
     *         Se ejecuta cuando usamos la palabra reservada new
     *     </li>
     *     <li>
     *         No retorna nada y no es necesario ponerle void
     *     </li>
     * </ul>
     */
    public Pet(String name, Integer age, String color, Integer numPatas) throws InvalidData{
        setName(name);
        setAge(age);
        this.color = color;
        this.numPatas = numPatas;
    }

    /**
     * Getters y Setters
     * Son metodos que permiten obtener la informacion de un atributo
     * O fijar un valor a un atributo
     *
     * El getter retorna algo y no recibe parametros
     * El setter recibe parametros pero no retorna nada
     */

    /**
     * Retorna el valor del atributo name
     * @return tipo String name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Fija un nuevo valor al atributo name
     * @param newName tipo String
     */
    public void setName(String newName) throws InvalidData {
        if(newName == null || newName.trim().isEmpty()) throw  new InvalidData("El nombre no puede estar vacio o ser puros espacios");
        this.name = newName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws InvalidData {
        //aqui lanzar excepcion, verificar que la edad no este vacia y que sea mayor que 0
        if(age == null || age <= 0) throw new InvalidData("La edad no puede estar vacia, ser 0 o menor");
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(Integer numPatas) {
        this.numPatas = numPatas;
    }

    /**
     * Metodo abstracto
     *
     * Los metodos abstractos solo se pueden crear en clases abstractas o interfaces
     * <p>
     *      Son metodos que definen que se tiene que hacer, pero no como se hace
     *      Esto quiere decir que nos brindan la firma del metodo sin el body
     * </p>
     * <p>
     *     Las clases que hereden la clase abstracta se veran obligadas a
     *     implementar y completar el metodo abstracto
     * </p>
     */
    public abstract void makeSound();

    /**
     * Metodo abstracto
     *
     * Los metodos abstractos solo se pueden crear en clases abstractas o interfaces
     * <p>
     *      Son metodos que definen que se tiene que hacer, pero no como se hace
     *      Esto quiere decir que nos brindan la firma del metodo sin el body
     * </p>
     * <p>
     *     Las clases que hereden la clase abstracta se veran obligadas a
     *     implementar y completar el metodo abstracto
     * </p>
     */
    public abstract void showDetails();
}
