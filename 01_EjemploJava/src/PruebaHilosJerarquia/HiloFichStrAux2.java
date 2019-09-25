package PruebaHilosJerarquia;

import Threads.*;

/**
 * @author Raul 
 */
public class HiloFichStrAux2 extends HiloFichero {
@Override
    protected String quitarEspacios(String s) {
        return StringAuxHilos.quitarEspSobrantesV2(s);
    }
}
