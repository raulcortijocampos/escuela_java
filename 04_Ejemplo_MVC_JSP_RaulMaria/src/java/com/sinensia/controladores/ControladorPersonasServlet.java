
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
        if(metodo.equals("cambiar")){
            request.getSession().setAttribute("modificarPers", p);
            request.getRequestDispatcher("modificarPersona.jsp").forward(request, response);
        }else if(metodo.equals("buscar"))
            request.getSession().setAttribute("resultadoBusq", p);
            request.getRequestDispatcher("resultados_busqueda.jsp").forward(request, response);
    }

    
    
    
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String email = request.getParameter("email"); 
        String password = request.getParameter("password"); 
        String metodo = request.getParameter("queHacer");
        String viejoNombre = request.getParameter("viejoNombre");
        if(metodo.equals("add")){
            try{
                Persona p = ServicioPersona.getInstancia().addPersonas(nombre, edad,email,password);
                if ( p == null){
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }else{
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
        }else if(metodo.equals("cambiar")){
            try{
                ServicioPersona.getInstancia().modificarPersona(nombre,edad,email,password,viejoNombre);
            }catch(Exception w){}
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
