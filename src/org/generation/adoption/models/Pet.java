package org.generation.adoption.models;

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
    public Pet(String name, Integer age, String color, Integer numPatas){
        this.name = name;
        this.age =  age;
        this.color = color;
        this.numPatas = numPatas;
    }



}
