package sensor;

public class LocalColorCamera extends LocalSensor {

	public LocalColorCamera(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.writeLocalCommand("GET_MOV");
		return  this.readLocalReply() > 50;
	}
}
