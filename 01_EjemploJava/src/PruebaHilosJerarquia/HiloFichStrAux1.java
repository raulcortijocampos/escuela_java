package PruebaHilosJerarquia;

import Threads.*;

/**
 * @author Raul 
 */
public class HiloFichStrAux1 extends HiloFichero {
    
    
    @Override
    protected String quitarEspacios(String s) {
        return StringAuxHilos.quitarEspSobrantesV1(s);
    }
   

}
