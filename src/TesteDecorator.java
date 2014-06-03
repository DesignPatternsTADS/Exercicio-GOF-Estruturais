
import sensor.Security;
import sensor.Sensor;
import sensor.SensorDecoratorAcessSecurity;
import sensor.local.LocalColorCamera;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcrbsa
 */
public class TesteDecorator {
    
    public static void main(String[] args) {
         String mensagem = "test" ;
        
           Security sensorCript;
      Sensor  s= new LocalColorCamera("1");
      
      //Security test = (Security)s;
     sensorCript = new SensorDecoratorAcessSecurity( s );
       sensorCript.presence();
       
        s = new LocalColorCamera("2");
        SensorDecoratorAcessSecurity sdas1 = new SensorDecoratorAcessSecurity( s );
        sdas1.setLogin("richardosn");
        sdas1.setPassword("ifpe");
        sensorCript = sdas1;
        sensorCript.presence();
        
        s = new LocalColorCamera("3");
         SensorDecoratorAcessSecurity sdas2= new SensorDecoratorAcessSecurity( s );
        sdas2.setLogin("ramide");
        sdas2.setPassword("designpatterns");
        sensorCript = sdas2;
        sensorCript.presence();

    }
    
}
