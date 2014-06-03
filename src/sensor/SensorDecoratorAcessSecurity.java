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
public class SensorDecoratorAcessSecurity extends SensorDecorator {

    private Sensor sensor;
    private Security security;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String login="";
    private String password="";

    /*public SensorDecoratorAcessSecurity(Sensor sensor, String login, String password) {
     this.sensor = sensor;
     this.login = login;
     this.password = password;
     }

     public SensorDecoratorAcessSecurity(String login, String password) {
     this.login = login;
     this.password = password;
     }*/
    public SensorDecoratorAcessSecurity(Security security) {
        super(security);
       
    }
    private static Map<String, String> users = new HashMap<String, String>();

    static{
        users.put("ramide","designpatterns");
    }
    
    
    public void registerUser() {
        users.put(login, password);
        System.out.println("User registered!");
    }

    public void deleteUser() {
        users.remove(login);
        System.out.println("User deleted!");
    }

    public boolean authorizeAccess() {

        if (users.containsKey(login) && users.containsValue(password)) {
            System.out.println("User authorized!");
            return true;
        } else {
            System.out.println("User  not authorized!");
            return false;
        }
    }

    @Override
    public void envia(String mensagem) {
        System.out.println(" Enviando mensagem criptografada : ");
        this.getSecurity().envia(criptografa(mensagem));

    }

    private String criptografa(String mensagem) {
        String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
        return mensagemCriptografada;
    }

    @Override
    public int countTimesPresence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean presence() {

        if (authorizeAccess()) {
            return this.getSecurity().presence();
        } else {
            return false;
        }

    }
}
