package sensor;

public class RemoteThermalCamera extends RemoteSensor {

	public RemoteThermalCamera(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.sendRemoteCommand("GET_THERM_MOV");
		return  this.getRemoteReply() > 40;
	}
}
