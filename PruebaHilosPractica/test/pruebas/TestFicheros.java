
package pruebas;

import pruebahilospractica.HiloFichStrAux1;
import pruebahilospractica.HiloFichero;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author student
 */
public class TestFicheros {
    
    public TestFicheros() {
    }
    // @Test
     public void generacionFicheroAleatorio(){
         HiloFichero hf = new HiloFichStrAux1();
         hf.crearFicheroEjemp("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");

     }
    @Test
    public void lecturaFicheroAleatorio(){
         HiloFichero.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");

    }
}
