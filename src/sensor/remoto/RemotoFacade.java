/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor.remoto;

/**
 *
 * @author jcrbsa
 */
public class RemotoFacade {
    
    private RemoteColorCamera remoteColorCamera;
    private RemoteTemperatureSensor remoteTemperatureSensor;
    private RemoteThermalCamera remoteThermalCamera;

    public RemotoFacade(RemoteColorCamera remoteColorCamera, RemoteTemperatureSensor remoteTemperatureSensor, RemoteThermalCamera remoteThermalCamera, String Id) {
     
        this.remoteColorCamera = remoteColorCamera;
        this.remoteTemperatureSensor = remoteTemperatureSensor;
        this.remoteThermalCamera = remoteThermalCamera;
    }

   

    public boolean presence() {
        return this.remoteColorCamera.presence() | this.remoteTemperatureSensor.presence() | this.remoteThermalCamera.presence() ? true : false;
    }
    
    
    
    
    
}
