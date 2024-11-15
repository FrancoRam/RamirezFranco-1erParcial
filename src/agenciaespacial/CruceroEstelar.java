/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;

/**
 *
 * @author ThinkPad
 */
public class CruceroEstelar extends Nave{
    
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int tripulacion, int anioLanzamiento, int cantidadPasajeros) {
        super(nombre, tripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }
   
    
    @Override
    public String toString() {
        return "CruceroEstelar: " + super.toString() + ", cantidadPasajeros=" + cantidadPasajeros;
    }
}
