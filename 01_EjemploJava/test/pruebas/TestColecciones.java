
package pruebas;

import POO.Coche;
import POO.CocheRally;
import POO.TipoCarburante;
import POO.TipoColor;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestColecciones {
    
     @Test
     public void arrays(){
         Coche coches[] = new Coche[3]; //Coche coches[];
         coches[0]=new Coche("Fiat",TipoCarburante.GASOLINA,TipoColor.AZUL);
         coches[1]=new Coche("Audi",TipoCarburante.ELECTRICO,TipoColor.NEGRO);
         coches[2]=new Coche("BMW",TipoCarburante.DIESEL,TipoColor.PLATEADO);
         
         Coche[] cocheBis = {
             coches[2],
             coches[1],
             new Coche("Fiat",TipoCarburante.GASOLINA,TipoColor.AZUL)}; 
         
         Coche elMio = new Coche("Audi",TipoCarburante.ELECTRICO,TipoColor.NEGRO);
         elMio  = coches[2];
         elMio.setArrancado(true);
         elMio.acelerar();
         ///////////////////
         coches[2].mostrar();
         ArrayList arrayListObj = new ArrayList(); //ArrayList NO generico
         arrayListObj.add(42);                     //Todos los elementos son objetos
         arrayListObj.add("aaaaaa");               //ES MEJOR NO USAR ESTE TIPO
         arrayListObj.add(elMio);
         
         for(Object obj : arrayListObj){
             System.out.println("Obj: " + obj);
         }
         
         ArrayList<Integer> ventasAnuales = new ArrayList<Integer>(); //ArrayList de Integer
         Integer objEntero = new Integer(200);
         objEntero.longValue();
         ventasAnuales.add(30000);
         
        ArrayList<Coche> cochesParaVender = new ArrayList<>();
        cochesParaVender.add(new Coche("Sinca",TipoCarburante.ELECTRICO,TipoColor.NEGRO)); //ArrayList de objeto Coche
        cochesParaVender.add(coches[0]);
        cochesParaVender.add(coches[1]);
        cochesParaVender.add(coches[2]);
        
        cochesParaVender.add(new CocheRally("ferrari"));
        
        if(cochesParaVender.contains(coches[0])){
            System.out.println("El coche existe");
        }
        
        //TestColecciones.mostrarCoche(elMio);
        //cochesParaVender.forEach( TestColecciones::mostrarCoche);
        
        //FUNCION LAMBDA
        cochesParaVender.forEach( (coche) -> {
            System.out.println(" -> " + coche.toString());
        });
     }
     
     public static void mostrarCoche(Coche coche){
         System.out.println(" -> " + coche.toString());
     }
     
}
