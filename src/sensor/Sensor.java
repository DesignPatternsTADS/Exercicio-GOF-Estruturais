package sensor;

import java.util.Calendar;

public abstract class Sensor implements Security {

    protected String Id = null;
    protected static int id = 0;
    protected String type;
    protected boolean presence;
    protected int valueReply;
    protected String command;

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
    @Override
    public abstract int countTimesPresence();

    @Override
    public void envia(String mensagem) {

        System.out.println("Realize Acess Security : ");
        System.out.println(mensagem);
    }
}
