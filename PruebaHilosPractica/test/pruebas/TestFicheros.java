package pruebas;

import java.util.Date;
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
    double TInicioT, TFinT, tiempoT;

    //@Test
    public void lecturaFicheroAleatorio() {

        double TInicio2 = new Date().getTime();
        HiloFichero hf1 = new HiloFichStrAux1();
        HiloFichero hf2 = new HiloFichStrAux2();
        HiloFichero hf3 = new HiloFichStrAux3();
        //for(int i =0; i<900;i++){for(int j=0;j<20;j++){System.out.println(j);}}
        hf1.leerFicheroEjem("..\\01_EjemploJava\\texto_esp.txt");
        hf2.leerFicheroEjem("..\\01_EjemploJava\\texto_esp.txt");
        hf3.leerFicheroEjem("..\\01_EjemploJava\\texto_esp.txt");
        double TFin2 = new Date().getTime();
        double tiempo2 = TFin2 - TInicio2;
        System.out.println("Tiempo de ejecución en milisegundos del proceso: " + tiempo2);

    }

    public class Metodo1 extends Thread {

        @Override
        public void run() {
            long TInicio1, TFin1, tiempo1;
            TInicio1 = System.currentTimeMillis();
            HiloFichStrAux1.leerFicheroEjem("..\\01_EjemploJava\\texto_esp.txt");
            TFin1 = System.currentTimeMillis();
            tiempo1 = TFin1 - TInicio1;
            System.out.println("Tiempo de ejecución en milisegundos del hilo 1: " + tiempo1);
        }

    }

    public class Metodo2 extends Thread {

        @Override
        public void run() {
            //super.run();
            long TInicio2, TFin2, tiempo2;
            TInicio2 = System.currentTimeMillis();
            //super.run(); //To change body of generated methods, choose Tools | Templates.
            HiloFichStrAux2.leerFicheroEjem("..\\01_EjemploJava\\texto_esp.txt");
            TFin2 = System.currentTimeMillis();
            tiempo2 = TFin2 - TInicio2;
            System.out.println("Tiempo de ejecución en milisegundos del hilo 2: " + tiempo2);
        }

    }

    public class Metodo3 extends Thread {
        @Override
        public void run() {
            long TInicio3, TFin3, tiempo3;
            TInicio3 = System.currentTimeMillis();
            //  super.run(); //To change body of generated methods, choose Tools | Templates.
            HiloFichStrAux3.leerFicheroEjem("..\\01_EjemploJava\\texto_esp.txt");
            TFin3 = System.currentTimeMillis();
            tiempo3 = TFin3 - TInicio3;
            System.out.println("Tiempo de ejecución en milisegundos del hilo 3: " + tiempo3);

        }
    }

    @Test
    public void probando() {
        TInicioT = System.currentTimeMillis();

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
        TFinT = System.currentTimeMillis();
        tiempoT = TFinT - TInicioT;
        System.out.println("Tiempo de ejecución total de los hilos: " + tiempoT);
    }
}
