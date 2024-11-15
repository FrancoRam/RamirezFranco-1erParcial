/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;

import java.util.Objects;

public abstract class Nave {

    private String nombre;
    private int tripulacion;
    private int anioLanzamiento;

    
    public Nave(String nombre, int tripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.tripulacion = tripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioLanzamiento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof Nave nave)
        {
            return nombre.equals(nave.nombre) && anioLanzamiento == nave.anioLanzamiento;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", tripulacion=" + tripulacion + ", anioLanzamiento=" + anioLanzamiento;
    }
    
}
