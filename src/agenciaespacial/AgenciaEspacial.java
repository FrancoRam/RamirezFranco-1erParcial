
package agenciaespacial;

import java.util.ArrayList;


public class AgenciaEspacial {

    private ArrayList<Nave> naves;
    public AgenciaEspacial() {
        this.naves = new ArrayList<>();
    }
    
    public void MostrarNaves()
    {
        for (Nave nave : naves) 
        {
            System.out.println(nave);
        }
    }
    
    public void AgregarNave(Nave nave)
    {
        if(this.naves.contains(nave))
        {
            throw new NaveDuplicadaException("La nave está duplicada");
        }
        naves.add(nave);
        System.out.println("se agregó una nave a la lista (naves)..");
    }
    
    public void IniciarExploracion()
    {
        for (Nave nave : naves)
        {
            if (nave instanceof Explorable explorador)
            {
                explorador.Explorar();
            }
            else
            {
                System.out.println(nave.getNombre() +" no puede explorar");
            }
        }
    }
    
}
