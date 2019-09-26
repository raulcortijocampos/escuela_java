package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.util.ArrayList;

/** Singleton porque solo queremos un servicio por aplicacion/servidor
 * 
 * @author Raul 
 */
public class ServicioPersona {

    //Codigo Singleton
    private static ServicioPersona instancia;
    private ServicioPersona() {
        personas=new ArrayList<>();
    }
    public static ServicioPersona getInstancia(){
        if(instancia == null){
            instancia = new ServicioPersona();
        }
        return instancia;
    }
    
    private ArrayList<Persona> personas;
    
    public void addPersonas(String nombre, String edad){
//        try {
            int intEdad = Integer.parseInt(edad);
            if (intEdad > 12 && !nombre.equals("")) {
                Persona p = new Persona(nombre, intEdad);
                personas.add(p);
            }
//        } catch (NumberFormatException numberFormatException) {
//        }
    }
    public Persona getPersona(String nombre){
        for(Persona p : personas){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        return null;
    }
}
