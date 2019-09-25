
package pruebas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGenericos {
   
    @Test
    public void metodosGenericos() {
        
        ArrayList <Integer> listaInt = new ArrayList<>();
        intesrarDobleGenerico(listaInt,10);
        intesrarDobleGenerico(listaInt,15);
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList <String> listaStr = new ArrayList<>();
        intesrarDobleGenerico(listaStr,"texto 1");
        intesrarDobleGenerico(listaStr,"texto 2");
        System.out.println("Textos: " + listaStr.toString());
        
        String listaStri[] = new String[3];
        listaStri[0]="hola";
        listaStri[1]="que";
        listaStri[2]="tal";
        
        mostrarListaGenerico(listaStri);
       // mostrarListaGenerico(listaStr.toArray());
        
        Integer listaEnt[] = new Integer[3];
        listaEnt[0]=10;
        listaEnt[1]=20;
        listaEnt[2]=30;
        
        mostrarListaGenerico(listaEnt);
        mostrarListaGenerico(listaInt.toArray());
        
        convertirArray(listaEnt);
        
        Float[] arrF ={1.1f, 2.2f, 3.3f};
        ArrayList<Float> arrayFloat = convertirArray(arrF);
        mostrarListaGenerico(arrayFloat.toArray());
        
    }
    public static <Tipo> void intesrarDobleGenerico(ArrayList<Tipo> lista, Tipo valor){
            lista.add(valor);
            lista.add(valor);
    }
    
    public static <Tipo> void mostrarListaGenerico( Tipo[] lista){
            for(Object v : lista){
                System.out.println(v);
            }
    }
    
    public static <Tipo> ArrayList <Tipo> convertirArray(Tipo[] lista){
        ArrayList <Tipo> nuevoArray = new ArrayList<Tipo>();
            for(Tipo v : lista){
                nuevoArray.add(v);
            }
            return nuevoArray;
    }
}