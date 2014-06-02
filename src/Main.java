import sensor.local.LocalColorCamera;
import sensor.local.LocalTemperatureSensor;
import sensor.local.LocalThermalCamera;
import sensor.remoto.RemoteTemperatureSensor;
import sensor.remoto.RemoteThermalCamera;
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
