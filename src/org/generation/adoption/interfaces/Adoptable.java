package org.generation.adoption.interfaces;

public interface Adoptable {
    /**
     * Interfaz
     * Es un contrato que la clase que lo implementa debe seguir
     * Podemos implementar mas de una interface por clase
     *
     * Declaran por defecto metodos abstractos
     * la clase que implemente la interfaz se vera obligada a crear y completar los
     * metodos definidos en la interfaz
     *
     * Diferencias con una clase abstracta
     * 1. No tiene atributos
     * 2. No tiene un metodo constructor
     * 3. No puede tener metodos normales
     */

    void adopt();
}
