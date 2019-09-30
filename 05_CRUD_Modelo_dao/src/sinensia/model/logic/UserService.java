package sinensia.model.logic;

import java.sql.SQLException;
import java.util.List;
import sinensia.modelo.User;
import sinensia.modelo.persistence.IUserDao;
import sinensia.modelo.persistence.UserDAO_DerbyDB;

/**
 * @author Raul 
 */
public class UserService {
    
    IUserDao daoUsers;
    
    public UserService(IUserDao daoUsers){
        this.daoUsers = daoUsers;
    }
    
    public User create(String email, String password, String name, int age) throws SQLException{
        User u = null;
        if(email != null && password != null && name != null){
            if (email.length() > 3
                    && !password.equals("") 
                    && !name.equals("")  
                    && age > 0){

               u = new User(email,  password, name, age);
               u = daoUsers.create(u);
            }
        }
        return u;
    }
    
    public List<User> getAll() throws SQLException{
        return daoUsers.getAll();
    }
}

