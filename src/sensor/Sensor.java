package sensor;

import java.util.Calendar;

public abstract class Sensor implements SensorDecorator {

    protected String Id = null;
    protected static int id = 0;
    protected String type;
    protected boolean presence;

    public Sensor() {
    }

    public Sensor(String Id) {
        this.Id = Id;
        // this.Id = Integer.toString(id++);
    }

    public String report() {
        String str = "";
        str += "Sensor Id: " + this.Id + "\n";
        str += "Date: " + Calendar.getInstance().getTime() + "\n";
        str += "Presence: " + this.presence() + "\n";
        return str;
    }

    public abstract boolean presence();
}
