
package agenciaespacial;

public class NaveExploracion extends Nave implements Explorable{
    private TipoMision tipoMision;

    

    public NaveExploracion(String nombre, int tripulacion, int anioLanzamiento, TipoMision tipoMision) {
        super(nombre, tripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    //INTERFACE IMPLEMENTACION
    @Override
    public void Explorar() {
        System.out.println("iniciando exploracion de: "+ getNombre());
    }

    @Override
    public String toString() {
        return "NaveExploracion: " + super.toString() + ", tipoMision=" + tipoMision;
    }
    
    
}
