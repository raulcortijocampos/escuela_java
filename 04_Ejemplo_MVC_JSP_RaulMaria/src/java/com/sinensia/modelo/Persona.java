package com.sinensia.modelo;
/** Esta clase es un POJO( Plain Old Java Object)
 * Clases sin logica, sin herencia (o poco de...)
 * Suelen corresponder a una ENTIDAD
 * @author Raul 
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
