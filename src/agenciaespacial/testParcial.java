
package agenciaespacial;

public class testParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgenciaEspacial agenciaDeNaves = new AgenciaEspacial();
        
        NaveExploracion naveDeExploracion = new NaveExploracion("Nave Agile - explorer", 24, 2025, TipoMision.INVESTIGACION);
        Carguero naveCarguero = new Carguero(100.0, "Carguero F100", 20, 2012);
        CruceroEstelar naveCruceroEstelar = new CruceroEstelar("Crucero - Raptor1", 2000, 2011, 5000);
        
        agenciaDeNaves.AgregarNave(naveDeExploracion);
        agenciaDeNaves.AgregarNave(naveCarguero);
        agenciaDeNaves.AgregarNave(naveCruceroEstelar);
        //agenciaDeNaves.AgregarNave(naveCruceroEstelar);
        
        agenciaDeNaves.IniciarExploracion();
        System.out.println("___________________");
        System.out.println("-------------------");
        agenciaDeNaves.MostrarNaves();
        
        
    }
    
}
