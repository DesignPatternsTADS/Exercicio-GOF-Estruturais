package sensor;

public class RemoteTemperatureSensor extends RemoteSensor {

	public RemoteTemperatureSensor(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.sendRemoteCommand("GET_TEMP");
		return  this.getRemoteReply() > 37;
	}
}
