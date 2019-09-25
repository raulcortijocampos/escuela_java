package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
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



    // @Test
    public void generacionFicheroAleatorio() {
        HiloFichero hf = new HiloFichStrAux1();
        hf.crearFicheroEjemp("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");

    }

    
    //MEDIANTE METODOS
//    public void lecturaFicheroAleatorio() {
//        HiloFichero hf1 = new HiloFichStrAux1();
//        HiloFichero hf2 = new HiloFichStrAux2();
//        HiloFichero hf3 = new HiloFichStrAux3();
//        hf1.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
//        hf2.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
//        hf3.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\PruebaHilosPractica\\ficheroALeer.txt");
//
//    }
    
    //@Test
    public void lecturaFicheroAleatorio() {
        HiloFichero hf1 = new HiloFichStrAux1();
        HiloFichero hf2 = new HiloFichStrAux2();
        HiloFichero hf3 = new HiloFichStrAux3();
        hf1.leerFicheroEjem("..\\PruebaHilosPractica\\ficheroALeer.txt");
        hf2.leerFicheroEjem("..\\PruebaHilosPractica\\ficheroALeer.txt");
        hf3.leerFicheroEjem("..\\PruebaHilosPractica\\ficheroALeer.txt");

    }
    public class Metodo1 extends Thread {

        @Override
        public void run() {
            //super.run();
            HiloFichStrAux1.leerFicheroEjem("..\\PruebaHilosPractica\\ficheroALeer.txt");

        }

    }
    public class Metodo2 extends Thread {

        @Override
        public void run() {
            //super.run();
            HiloFichStrAux2.leerFicheroEjem("..\\PruebaHilosPractica\\ficheroALeer.txt");

        }

    }
    public class Metodo3 extends Thread {

        @Override
        public void run() {
            //super.run();
            HiloFichStrAux3.leerFicheroEjem("..\\PruebaHilosPractica\\ficheroALeer.txt");

        }

    }

    @Test
    public void probando() {

        Metodo1 mt1 = new Metodo1();
        Metodo2 mt2 = new Metodo2(); 
        Metodo3 mt3 = new Metodo3();
        
        mt1.start();
        mt2.start();
        mt3.start();
        
        try {
            mt1.join();
            mt2.join();
            mt3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestEjemploHijos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
