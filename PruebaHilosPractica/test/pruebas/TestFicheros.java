
package pruebas;

import pruebahilospractica.HiloFichStrAux1;
import pruebahilospractica.HiloFichStrAux2;
import pruebahilospractica.HiloFichStrAux3;
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
    //MEDIANTE METODOS
    public void lecturaFicheroAleatorio(){
        HiloFichero hf1 = new HiloFichStrAux1();
        HiloFichero hf2 = new HiloFichStrAux2();
        HiloFichero hf3 = new HiloFichStrAux3();
        hf1.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
        hf2.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
        hf3.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
        
        Date
    }
}
