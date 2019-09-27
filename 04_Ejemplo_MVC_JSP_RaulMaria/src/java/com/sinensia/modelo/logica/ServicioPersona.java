package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
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
    
    public Persona addPersonas(String nombre, String edad, String email, String password)
            throws NumberFormatException, IOException, IllegalArgumentException{
            
            if(nombre.equals("")){
                throw new IllegalArgumentException("El nombre esta vacio");
            }else if(password.equals("")){   
                throw new IllegalArgumentException("El password esta vacio");
            }else if(email.equals("")){   
                throw new IllegalArgumentException("El email esta vacio");
            }else if(!email.contains("@") ||!email.contains(".")){   
                throw new IllegalArgumentException("Dirección email no válida");
            }else if(nombre.length() < 2){
                throw new IllegalArgumentException("El nombre es demasiado corto");
            }else if(edad.equals("")){
                throw new NumberFormatException("La edad esta vacia");
            }else{
                int intEdad = Integer.parseInt(edad);
                if (intEdad <= 12) {
                    throw new IllegalArgumentException("La edad debe ser mayor que 12");
                }else{
                    Persona p = new Persona(nombre, intEdad, email, password);
                    personas.add(p);
                    return p;
                }
            }
          }
    public Persona modificarPersona(String nuevoNombre,String nuevaEdad,String nuevoEmail,String nuevoPassword, String viejoNombre){
        Persona p = getPersona(viejoNombre);
        if(!nuevoNombre.equals(viejoNombre)){
           // p.setNombre(nuevoNombre);
            Persona p2 = personas.get(personas.indexOf(p));
                    p2.setNombre(nuevoNombre);
        }else if(p.getEdad() != Integer.parseInt(nuevaEdad)){
            //p.setEdad(Integer.parseInt(nuevaEdad));
            personas.get(personas.indexOf(p)).setEdad(Integer.parseInt(nuevaEdad));
        }else if(!p.getEmail().equals(nuevoEmail) ){
            //p.setEmail(nuevoEmail);
            personas.get(personas.indexOf(p)).setEmail(nuevoEmail);
        }else if(!p.getPassword().equals(nuevoPassword)){
            p.setPassword(nuevoPassword);
            personas.get(personas.indexOf(p)).setNombre(nuevoPassword);
        }
        return p;
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