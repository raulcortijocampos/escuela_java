package PruebaHilosJerarquia;

import Threads.*;
import clasesjava.StringAux;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Raul 
 */
public abstract class HiloFichero {
    
    //static HiloFichStrAux1 str1;
    
    public void crearFicheroEjemp(String rutaFich)/* throws IOException*/{
        String[] palabras = new String['Z' - 'A' + 1];
        Random r = new Random(new Date().getTime());
                
        for(char c='A';c < 'Z' + 1; c++){
            int repe = 2 + Math.abs(r.nextInt() % 8); //Numero entre 2 y 9
            palabras[c - 'A'] = "";
            for (int i = 0; i < repe; i++){
                palabras[c - 'A'] += "" + c;
            }
        }
        System.out.println(">" + Arrays.toString(palabras));
        
        ///////Crear fichero
        FileWriter fich = null;
        try{
            fich = new FileWriter(rutaFich, false);
            for (int i = 0; i < 200000; i++){
                if(r.nextInt(2) == 0) //numero entre 0 y 2
                    fich.write(palabras[r.nextInt(palabras.length)]);
                
                if(r.nextInt(2) == 0)
                    for(int j=0; j< 10; j++)
                        fich.write(" ");
                
                if(r.nextInt(12) == 0)
                        fich.write("\n\r");
            }
            
        }catch(IOException e){
            System.out.println("Error en escritura: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Otro error " + e.getMessage());
        }finally{
            try {
                if(fich != null)
                    fich.close();
            } catch (IOException ex) {
                Logger.getLogger(HiloFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    protected abstract String quitarEspacios(String s);         
            
    public void leerFicheroEjem(String rutaFich){
        File fich = new File(rutaFich);
        Scanner escaner = null;
        try{
            escaner = new Scanner(fich);
            while(escaner.hasNextLine()){
                String linea = escaner.nextLine();
                //System.out.println(linea);
                
                //HiloFichStrAux2 strAux = new HiloFichStrAux2();
                System.out.println(quitarEspacios(linea));
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }finally{
            try {
                if(escaner != null){
                    escaner.close();
                }
            }catch (Exception ex) {
                Logger.getLogger(HiloFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
