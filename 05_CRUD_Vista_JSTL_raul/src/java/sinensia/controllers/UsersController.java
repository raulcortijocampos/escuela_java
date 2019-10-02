package sinensia.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sinensia.model.logic.UserService;
import sinensia.modelo.User;
import sinensia.modelo.persistence.IUserDAO;
import sinensia.modelo.persistence.UserDAO_DerbyDB;

/**
 * @author Raul 
 */

@WebServlet(asyncSupported = true, urlPatterns = "/users.do")
public class UsersController extends HttpServlet{
    
    UserService userSrv;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        IUserDAO usersDAO = new UserDAO_DerbyDB();
        this.userSrv = new UserService(usersDAO);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try {
            String id= req.getParameter("id");
            String email= req.getParameter("email");
            String password= req.getParameter("password");
            String name= req.getParameter("name");
            String age= req.getParameter("age");

            String method = req.getParameter("method");
            switch(method){
                case "Delete":
                    userSrv.remove(Integer.parseInt(id));
                break;
                default:
                    userSrv.create(email, password, name, age);
                break;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            List<User> listUsers = userSrv.getAll();
            req.setAttribute("userList", listUsers);
            req.getRequestDispatcher("listUsers.jsp").forward(req, resp);
        }catch(Exception e){
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    

}
