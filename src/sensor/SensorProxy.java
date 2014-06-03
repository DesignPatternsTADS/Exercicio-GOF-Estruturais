/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sensor.Sensor;
import sensor.remoto.RemoteSensor;

/**
 *
 * @author jcrbsa
 */
public class SensorProxy extends Sensor {

    private Sensor sensor;
    private static Map<String, Sensor> listSensors = new HashMap<String, Sensor>();

    public SensorProxy(Sensor sensor) {
        super(sensor.Id);
        this.sensor = sensor;

    }

    @Override
    public boolean presence() {
        System.out.println("Sensor Remote Proxy Presence:");
        this.presence = this.sensor.presence();

        listSensors.put(this.Id, this.sensor);
        return this.presence;

    }

    public void cachePresence(String id) {
        System.out.println("Obtain Sensor Remote Proxy Cache Presence:");
        
        Sensor s = listSensors.get(id);
        
        System.out.println("Remote Sensor " + s.Id + ": sending command " + s.command);
        System.out.println("Remote Sensor " + s.Id + ": getting reply: " + s.valueReply);
        
        

    }

    /* @Override
     public int countTimesPresence() {
     System.out.println("Sensor Remote Proxy Times Presence:");
     return this.sensor.countTimesPresence();
     }*/
    @Override
    public int countTimesPresence() {

        return this.sensor.countTimesPresence();
    }
}
