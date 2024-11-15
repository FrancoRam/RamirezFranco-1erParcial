
package agenciaespacial;

public class Carguero extends Nave implements Explorable{
    private static final double MAX_CARGA = 500;
    private static final double MIN_CARGA = 100;
    private double capacidadCarga;

    //CTOR
    public Carguero(double capacidadCarga, String nombre, int tripulacion, int anioLanzamiento) {
        super(nombre, tripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
        ValidarCarga();
        
    }
    
    
    //INTERFACE IMPLEMENTACION
    @Override
    public void Explorar() {
        System.out.println("iniciando exploracion de: "+ getNombre());
    }

    
    private boolean ValidarCarga()
    {
        if (capacidadCarga < MIN_CARGA || capacidadCarga > MAX_CARGA)
        {
            throw new IllegalArgumentException("La carga que indica es invalida");
        }
        return false;
        
    }
            
    
    @Override
    public String toString() {
        return "Carguero: " + super.toString() + ", capacidadCarga=" + capacidadCarga;
    }
    
}
