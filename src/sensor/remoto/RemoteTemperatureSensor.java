package sensor.remoto;

public class RemoteTemperatureSensor extends RemoteSensor {

	public RemoteTemperatureSensor(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.sendRemoteCommand("GET_TEMP");
		return  this.getRemoteReply() > 37;
	}
        
        
         private int times = 0;
         @Override
    public int countTimesPresence() {
        if(presence()){
            return times++;
        }else
           return times;
    }
}
