package monitor;

import java.util.ArrayList;
import java.util.List;
import sensor.AcessSecurity;

import sensor.Sensor;

public class Monitor {

	private List<Sensor> sensors = new ArrayList<Sensor>();
       
	public void addSensor(Sensor sensor) {
		this.sensors.add(sensor);		
	}

	public void run() {

		for (Sensor sensor : this.sensors) {
			System.out.print(sensor.report());
                }

	}
        
        public void registerUser(String user, String password){
          new AcessSecurity(user, password).registerUser();
            
        }
        
        void timeSensor(Sensor sensor){
            
        }

}
