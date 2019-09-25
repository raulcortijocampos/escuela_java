package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestEjemploHijos {
    
    private class ProcesoA extends Thread{

        @Override
        public void run() {
            //super.run();
            mostrarLista();
        }
        
        public void mostrarLista(){
            for(int i=0; i<200; i++){
                System.out.println("Proceso A: " + i);
            }
        }
    }
    private class ProcesoB  extends Thread{
        @Override
        public void run() {
            //super.run();
            mostrarLista();
        }
        
        public void mostrarLista(){
            for(int i=0; i<200; i++){
                System.out.println("Proceso B: " + i);
            }
        }
    }
    
  @Test
    public void probandoClasesConNombre() {
        ProcesoA proA = new ProcesoA();
        ProcesoB proB = new ProcesoB();
//        
//        @Override
//        public void run() {
//        
//          for(int i=0; i<200; i++){
//                System.out.println("Proceso B: " + i);
//            }
//        }
        
        
        proA.start();
        proB.start();
        
        try {
            proA.join();
            proB.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestEjemploHijos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
