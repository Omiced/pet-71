package org.generation.adoption.exceptions;

public class InvalidData extends Exception {
    /**
     * Metodo constructor para recibir el mensaje y fijarlo en el atributo de la super clase
     * Exception
     * @param message type String
     */
    public InvalidData(String message){
        super(message);
    }
}
