package sensor.local;

public class LocalColorCamera extends LocalSensor {

	public LocalColorCamera(String Id) {
		super(Id);
	}
	
	@Override
	public boolean presence() {
		this.writeLocalCommand("GET_MOV");
		return  this.readLocalReply() > 50;
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
