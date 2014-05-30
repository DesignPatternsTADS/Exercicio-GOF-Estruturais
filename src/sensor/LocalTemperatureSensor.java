package sensor;

public class LocalTemperatureSensor extends LocalSensor {

	public LocalTemperatureSensor(String Id) {
		super(Id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean presence() {
		this.writeLocalCommand("GET_TEMP");
		return  this.readLocalReply() > 37;
	}

}
