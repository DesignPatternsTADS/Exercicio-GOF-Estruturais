/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class SensorComposite extends Sensor {

    private List<Sensor> sensors;

    public SensorComposite() {

        super();
        System.out.println("Initializing SensorComposite");

        this.sensors = new ArrayList<Sensor>();
    }

    public void adiciona(Sensor sensor) {
        this.sensors.add(sensor);
        System.out.println("Sensor added success!");
    }

    public void remove(Sensor sensor) {
        this.sensors.remove(sensor);
        System.out.println("Sensor removed success!");


    }

    @Override
    public boolean presence() {
        boolean temp = false;
        for (Sensor sensor : this.sensors) {
            if (sensor.presence() == true) {
                sensor.presence  =true;
                
                System.out.println("Id Sensor: " + sensor.Id);
                System.out.println("Type Sensor: " + sensor.type);
                System.out.println("Presence Sensor: " + sensor.presence);

                temp = true;
            }
        }
        return temp;
    }

    @Override
    public int countTimesPresence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
