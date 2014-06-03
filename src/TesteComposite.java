
import sensor.Sensor;
import sensor.SensorComposite;

import sensor.local.LocalColorCamera;
import sensor.local.LocalTemperatureSensor;
import sensor.local.LocalThermalCamera;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcrbsa
 */
public class TesteComposite {
    public static void main(String[] args) {
        
        Sensor sensor1 = new LocalColorCamera("1");
        Sensor sensor2 = new LocalTemperatureSensor("2");
        Sensor sensor3 = new LocalThermalCamera("3");
        
        
        SensorComposite sensorComposite = new SensorComposite();
        
        sensorComposite.adiciona(sensor1);
        sensorComposite.adiciona(sensor2);
        
       sensorComposite.presence();
         
        
        sensorComposite.adiciona(sensor3);
        sensorComposite.presence();
        
        

           
        
        
        
    }
}
