package com.sinensia.modelo;
/** Esta clase es un POJO( Plain Old Java Object)
 * Clases sin logica, sin herencia (o poco de...)
 * Suelen corresponder a una ENTIDAD
 * @author Raul 
 */
public class Persona {

    private String nombre;
    private int edad;
    private String email; 
    private String password; 

    public Persona(String nombre, int edad,String email,String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.email=email; 
        this.password=password; 
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    

}
