package sensor.local;

public class LocalThermalCamera extends LocalSensor {

    private int times = 0;
    
	public LocalThermalCamera(String Id) {
		super(Id);
	}

	@Override
	public boolean presence() {
		this.writeLocalCommand("GET_THERM_MOV");
		return  this.readLocalReply() > 40;
	}

    @Override
    public int countTimesPresence() {
        if(presence()){
            return times++;
        }else
           return times;
    }

}
