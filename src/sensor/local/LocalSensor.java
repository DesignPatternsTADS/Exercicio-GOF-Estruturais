package sensor.local;

import sensor.Sensor;


public abstract class LocalSensor extends Sensor  {
	
	public LocalSensor(String Id) {
		super(Id);
	}

	protected void writeLocalCommand(String command) {
		// send command to remote device via network
		System.out.println("Local Sensor " + this.Id + ": writing command " + command);
	}
	
	protected int readLocalReply() {
		// get response from device
		int reply = Double.valueOf(Math.random() * 100).intValue(); 
		System.out.println("Local Sensor " + this.Id + ": getting reply: " + reply);
		return reply;
	}	
        
        
        
     
        
}
