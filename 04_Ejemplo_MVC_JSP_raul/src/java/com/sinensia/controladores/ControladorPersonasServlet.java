
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
        //String edad = request.getParameter("edad");
        
        Persona p = ServicioPersona.getInstancia().getPersona(nombre);
        request.getSession().setAttribute("resultadoBusq", p);
        request.getRequestDispatcher("resultados_busqueda.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        try{
            Persona p = ServicioPersona.getInstancia().addPersonas(nombre, edad);
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
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
