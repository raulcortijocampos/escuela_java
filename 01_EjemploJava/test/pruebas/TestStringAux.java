
package pruebas;

import clasesjava.StringAux;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestStringAux {
    
    public TestStringAux() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void probandoQuitarEspacios() {
       String texto3="       en    un       LUGAR    ";
       texto3=texto3.trim();
       String resultadoOk="en un LUGAR";
       StringAux texto3aux = new StringAux(texto3);
       String resultadoAux = texto3aux.quitarEspSobrantes();
       assertEquals(resultadoOk, resultadoAux);
    }
}
