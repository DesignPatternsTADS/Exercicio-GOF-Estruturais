package sensor;

import java.util.Calendar;

public abstract class Sensor {
	
	protected String Id = null;
	
	public Sensor(String Id) {
		this.Id = Id;
	}
	
	public String report() {
		String str = "";
		str += "Sensor Id: " + this.Id + "\n";
		str += "Date: " + Calendar.getInstance().getTime() + "\n";
		str += "Presence: " + this.presence() + "\n";		
		return str;
	}
	
	public abstract boolean presence();

}
