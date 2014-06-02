/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jcrbsa
 */
public class AcessSecurity {
    
    private Sensor sensor;
    private String login;
    private String password;

    public AcessSecurity(Sensor sensor, String login, String password) {
        this.sensor = sensor;
        this.login = login;
        this.password = password;
    }

    public AcessSecurity(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    
    
    private static Map<String, String> users = new HashMap<String,String>();
    
            
    public void registerUser(){
        users.put(login, login);
        System.out.println("User registered!");
    }
    
    public void deleteUser(){
        users.remove(login);
        System.out.println("User deleted!");
    }
    
    
   public void authorizeAccess(){
            
       if(users.containsKey( login) && users.containsValue(password)){
           System.out.println("User ahthorized!");
       }else{
       System.out.println("User  not ahthorized!");
       }
   }
       
}
