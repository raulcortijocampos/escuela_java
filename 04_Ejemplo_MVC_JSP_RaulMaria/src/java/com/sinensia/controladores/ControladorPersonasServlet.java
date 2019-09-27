
package com.sinensia.controladores;

import com.sinensia.modelo.Persona;
import com.sinensia.modelo.logica.ServicioPersona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
public class ControladorPersonasServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String viejoNombre;
        //String edad = request.getParameter("edad");
        
        Persona p = ServicioPersona.getInstancia().getPersona(nombre);
        
        String metodo = request.getParameter("queHacer");
        if(metodo.equals("irAModificar")){
            request.getSession().setAttribute("modificarPers", p);
            request.getRequestDispatcher("modificarPersona.jsp").forward(request, response);
        }else if(metodo.equals("irABuscar"))
            request.getSession().setAttribute("resultadoBusq", p);
            request.getRequestDispatcher("resultados_busqueda.jsp").forward(request, response);
    }

    
    
    
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String nombreABorrar = request.getParameter("nombreABorrar");
        String edad = request.getParameter("edad");
        String email = request.getParameter("email"); 
        String password = request.getParameter("password"); 
        String metodo = request.getParameter("queHacer");
        String nuevoNombre = request.getParameter("nuevoNombre");
        String nuevoEdad = request.getParameter("nuevoEdad");
        String nuevoEmail = request.getParameter("nuevoEmail"); 
        String nuevoPassword = request.getParameter("nuevoPassword"); 
        
        if(metodo.equals("add")){
            try{
                Persona p = ServicioPersona.getInstancia().addPersonas(nombre, edad,email,password);
                if ( p == null){
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }else{
                    request.setAttribute("vieneDe", "add");
                    request.getRequestDispatcher("exito.jsp").forward(request, response);
                }
            }catch(NumberFormatException ex){
                request.getSession().setAttribute("mensajeError","Error numerico: "+ ex.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }catch(IllegalArgumentException ex){
                request.getSession().setAttribute("mensajeError","Error en campos: "+ ex.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }catch(Exception ex){
                request.getSession().setAttribute("mensajeError","Error generico: "+ ex.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            ;
        }else if(metodo.equals("cambiar")){
            try{
               
               ServicioPersona.getInstancia().modificarPersona(nuevoNombre,nuevoEdad,nuevoEmail,nuevoPassword,nombre);
            }catch(Exception w){}
        }else if(metodo.equals("borrar")){
            try{
               
               ServicioPersona.getInstancia().borrarPersona(nombreABorrar);
               request.setAttribute("vieneDe", "borrar");
               request.getRequestDispatcher("exito.jsp").forward(request, response);
            }catch(Exception w){
                // TODO: Terminar con rquest.setAtt...()
                request.getSession().setAttribute("mensajeError","Error generico: "+ w.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
