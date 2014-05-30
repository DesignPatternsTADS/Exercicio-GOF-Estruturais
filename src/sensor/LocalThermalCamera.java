package sensor;

public class LocalThermalCamera extends LocalSensor {

	public LocalThermalCamera(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.writeLocalCommand("GET_THERM_MOV");
		return  this.readLocalReply() > 40;
	}

}
