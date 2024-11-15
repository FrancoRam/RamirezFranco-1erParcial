/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;


public class NaveDuplicadaException extends RuntimeException {
    // Constructor que recibe un mensaje
    public NaveDuplicadaException(String mensaje) {
        super(mensaje); // Pasa el mensaje al constructor de Exception
    }
}

