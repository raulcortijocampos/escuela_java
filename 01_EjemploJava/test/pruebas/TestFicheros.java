
package pruebas;

import Threads.HiloFichStrAux1;
import Threads.HiloFichStrAux2;
import Threads.HiloFichStrAux3;
import Threads.HiloFichero;
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
        HiloFichero hf1 = new HiloFichStrAux1();
        //HiloFichero hf2 = new HiloFichStrAux2();
      //  HiloFichero hf3 = new HiloFichStrAux3();
        hf1.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
      //  hf2.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
      //  hf3.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");

    }
}
