package sensor;

public class RemoteColorCamera extends RemoteSensor {

	public RemoteColorCamera(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.sendRemoteCommand("GET_MOV");
		return  this.getRemoteReply() > 40;
	}

}
