package sensor.remoto;

public class RemoteColorCamera extends RemoteSensor {

	public RemoteColorCamera(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.sendRemoteCommand("GET_MOV");
		return  this.getRemoteReply() > 40;
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
