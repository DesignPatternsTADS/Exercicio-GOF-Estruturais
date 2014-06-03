
import sensor.Sensor;
import sensor.SensorProxy;
import sensor.local.LocalColorCamera;
import sensor.remoto.RemoteColorCamera;
import sensor.remoto.RemoteThermalCamera;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jcrbsa
 */
public class TesteProxy {

    public static void main(String[] args) {
        Sensor s;
        SensorProxy sp;
        s = new RemoteColorCamera("1");
        sp = new SensorProxy(s);


        //System.out.println("Presence : " + sp.presence());
        sp.presence();

        s = new RemoteThermalCamera("2");
                sp = new SensorProxy(s);
        System.out.println("Presence : " + sp.presence());

        sp.cachePresence("1");
        



    }
}
