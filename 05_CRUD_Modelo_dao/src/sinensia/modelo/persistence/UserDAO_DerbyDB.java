package sinensia.modelo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sinensia.modelo.User;

/**
 * @author Raul 
 */
public class UserDAO_DerbyDB implements IUserDao{
    private static final String CONEX_DB ="jdbc:derby://localhost:1527/db_users";
    private static final String USER_DB ="root";
    private static final String PSSWD_DB ="1234";
    
    public UserDAO_DerbyDB(){
        //Cargamos el driver de Derby DB. Esta basado en JDBC
        //Una implementacion de ORCB para Java
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(UserDAO_DerbyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public User create(User user) throws SQLException{
        Connection con = null;
        con = DriverManager.getConnection(CONEX_DB,USER_DB, PSSWD_DB);
           /*
           String sqlQuery = "INSERT INTO users (email, password, name, age) VALUES ("
                   + "'" + user.getEmail()
                   + "','" + user.getPassword()
                   + "','" + user.getName()
                   + "'," + user.getAge() +")";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sqlQuery);
           */
           
           //Los ? son los parametros de la sentencia SQL, que vamos a especificar posteriormente
           String sqlQuery = "INSERT INTO users (email, password, name, age) VALUES (?,?,?,?)";
           PreparedStatement prepStm = con.prepareCall(sqlQuery);
           prepStm.setString(1,user.getEmail());
           prepStm.setString(2,user.getPassword());
           prepStm.setString(3,user.getName());
           prepStm.setInt(4,user.getAge());
           
           prepStm.executeUpdate();
           
           con.close();
        return user;
        
    }

    @Override
    public List<User> getAll() throws SQLException{
        try (Connection con = DriverManager.getConnection(CONEX_DB, USER_DB, PSSWD_DB)){
        
        ArrayList<User> userList = new ArrayList<>();
        String sqlQuery = "SELECT id, email, password, name, age FROM users";
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sqlQuery);
        
        while(res.next()){
            int id = res.getInt("id");
            String email = res.getString("email");
            String password = res.getString("password");
            String name = res.getString("name");
            int age = res.getInt("age");
            User newUser = new User(email, password, name, age);
            newUser.setId(id);
            userList.add(newUser);
        }
        return userList;
        
        }

    }

    @Override
    public boolean remove(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(User user) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
