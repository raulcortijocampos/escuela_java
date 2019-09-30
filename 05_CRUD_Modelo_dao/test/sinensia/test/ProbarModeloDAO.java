/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.test;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sinensia.model.logic.UserService;
import sinensia.modelo.User;
import sinensia.modelo.persistence.IUserDao;
import sinensia.modelo.persistence.UserDAO_DerbyDB;

/**
 *
 * @author student
 */
public class ProbarModeloDAO {
    UserService userSrv;
    
    public ProbarModeloDAO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        IUserDao daoUsers = new UserDAO_DerbyDB();
        userSrv = new UserService(daoUsers);
    }
    
    @After
    public void tearDown() {
        
    }
    @Test
    public void createAndListUsersFail(){
        List<User> allUsers;
        try {
            allUsers = userSrv.getAll();
            int totalUsersBefore = allUsers.size();
        
        User u1 = userSrv.create(null, null, null, 0);
        User u2 = userSrv.create("", "p1234" , "h j", 20);
        User u3 = userSrv.create("er@dd", null,  "h j", 20);
        User u4 = userSrv.create("er@dd", "p1234", "", 20);
        User u5 = userSrv.create("er@dd", "p1234" , "h j", 0);
        
        assertNull(u1);
        assertNull(u2);
        assertNull(u3);
        assertNull(u4);
        assertNull(u5);
        
        allUsers = userSrv.getAll();
        assertEquals(totalUsersBefore, allUsers.size());
        } catch (SQLException ex) {
            Logger.getLogger(ProbarModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
            fail("Error en SQL: " + ex.getMessage());
        }
     }
    
    @Test
    public void createAndListUsersOk(){
        
       List<User> allUsers;
        try {
            allUsers = userSrv.getAll();
            int totalUsersBefore = allUsers.size();
            
            User u1 = userSrv.create("aaa@mail.com", "a1234", "aaa", 20);
            User u2 = userSrv.create("bbb@mail.com", "b1234", "bbb", 30);
            User u3 = userSrv.create("ccc@mail.com", "c1234", "ccc", 40);
            User u4 = userSrv.create("ddd@mail.com", "d1234", "d dd", 50);
            
            
            assertNotNull(u1);
            assertEquals("bbb", u2.getName());
            assertTrue("ccc@mail.com".equals(u3.getEmail()));
            assertFalse(u4.getAge() != 50);

            //Repetido que debe fallar
            User u5 = userSrv.create("ddd@mail.com", "d1234", "d dd", 50);
            assertNull(u5);
            
            allUsers = userSrv.getAll();
            assertEquals(totalUsersBefore + 4, allUsers.size());
        } catch (SQLException ex) {
            Logger.getLogger(ProbarModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
            fail("Error en SQL: " + ex.getMessage());
        }
        
        
     }
}
