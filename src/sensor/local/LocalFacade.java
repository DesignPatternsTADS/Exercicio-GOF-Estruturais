/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor.local;

import sensor.local.LocalColorCamera;
import sensor.local.LocalTemperatureSensor;
import sensor.local.LocalThermalCamera;

/**
 *
 * @author jcrbsa
 */
public class LocalFacade {
    
    
private LocalColorCamera localColorCamera;
    private LocalTemperatureSensor localTemperatureSensor;
    private LocalThermalCamera localThermalCamera;

    public LocalFacade(LocalColorCamera localColorCamera, LocalTemperatureSensor localTemperatureSensor, LocalThermalCamera localThermalCamera, String Id) {
     
        this.localColorCamera = localColorCamera;
        this.localTemperatureSensor = localTemperatureSensor;
        this.localThermalCamera = localThermalCamera;
    }

        
        
        

    public boolean visualizePresence() {
        
                return this.localColorCamera.presence() | this.localTemperatureSensor.presence() | this.localThermalCamera.presence() ? true : false;
    }
    
    


}
