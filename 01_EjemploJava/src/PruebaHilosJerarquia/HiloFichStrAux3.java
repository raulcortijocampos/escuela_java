package PruebaHilosJerarquia;

import Threads.*;

/**
 * @author Raul 
 */
public class HiloFichStrAux3 extends HiloFichero {
    
@Override
    protected String quitarEspacios(String s) {
        return StringAuxHilos.quitarEspSobrantesV3(s);
    }
}
