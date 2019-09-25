
package pruebas;

import POO.Coche;
import POO.Moto;
import POO.TipoCarburante;
import POO.TipoColor;
import POO.Vehiculo;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAbstractInterfaces {
   
   @Test
   public void abstractos() {
       Vehiculo miVehiculo = new Vehiculo("fabrica guapa", "SIN MATRICULAR"){
           @Override
           public void abrirPuerta() {
               System.out.println("Abriendo puertas...");
           }

           @Override
           public void acelerar() {
               
               System.out.println("Acelerando");
           }

           @Override
           public void echarCarburante(double cantidad) {
               System.out.println("Echando carburante");
           }

           @Override
           public void vaciarDeposito() {
               System.out.println("Vaciando deposito");
           }
           
           @Override 
           public void hacerCaballito(){
            System.out.println("Haciendo caballito(solo motos)");
           }
           @Override 
           public void mostrar(){
            System.out.println("mostrando");
           }

           @Override
           public String toString() {
               return "";
           }
           
           
       };
       Vehiculo miMoto = new Moto("YAMAHA");
       Vehiculo miCoche = new Coche("mercedes");
       
       miVehiculo.abrirPuerta();
       miMoto.abrirPuerta();
       miCoche.acelerar();
       miCoche.echarCarburante(4.5);
       miMoto.echarCarburante(2.1);
       miMoto.vaciarDeposito();
       miCoche.vaciarDeposito();
       miMoto.hacerCaballito();
       miCoche.hacerCaballito();
       miMoto.mostrar();
       miCoche.mostrar();
       
   }
}
