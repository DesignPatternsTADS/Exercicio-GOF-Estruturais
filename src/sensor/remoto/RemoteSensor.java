package sensor.remoto;

import sensor.Sensor;

public abstract class RemoteSensor extends Sensor {
	
	public RemoteSensor(String Id) {
		super(Id);
		// TODO Auto-generated constructor stub
	}

	protected void initializeRemoteSensor() {
		// open connection;
		System.out.println("Remote Sensor " + this.Id + ": open connection." );
	}
	
	protected void sendRemoteCommand(String command) {
		// send command to remote device via network
		System.out.println("Remote Sensor " + this.Id + ": sending command " + command);
	}
	
	protected int getRemoteReply() {
		// get response from device
		int reply = Double.valueOf(Math.random() * 100).intValue(); 
		System.out.println("Remote Sensor " + this.Id + ": getting reply: " + reply);
		return reply;
	}
}
