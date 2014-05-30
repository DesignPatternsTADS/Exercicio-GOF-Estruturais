import sensor.LocalColorCamera;
import sensor.LocalTemperatureSensor;
import sensor.LocalThermalCamera;
import sensor.RemoteTemperatureSensor;
import sensor.RemoteThermalCamera;
import monitor.Monitor;


public class Main {

	public static void main(String[] args) {

		Monitor monitor = new Monitor();
		
		monitor.addSensor(new LocalTemperatureSensor("LocalTemp1"));
		monitor.addSensor(new RemoteThermalCamera("RemThermCam1"));
		monitor.addSensor(new LocalThermalCamera("LocalThermCam1"));
		monitor.addSensor(new RemoteTemperatureSensor("RemTemp1"));
		monitor.addSensor(new LocalColorCamera("LocalColCam1"));
		
		monitor.run();
		
	}

}
