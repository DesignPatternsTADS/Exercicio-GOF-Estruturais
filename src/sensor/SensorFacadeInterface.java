/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

import java.util.List;

/**
 *
 * @author jcrbsa
 */
public interface SensorFacadeInterface {

    void verifyPresenceSensors(List<Sensor> sensors);

    void verifyPresenceSensor(Sensor sensors);

   // void verifyPresenceSensorSecurity(Sensor sensor);

    void coutTimesPresence(Sensor sensor);

    ///void coutTimesPresenceSecurity(Sensor sensor);

    void registerUserAcessSecuritySensor(Security security, String login, String password);
    void deleteUserAcessSecuritySensor(Security security, String login, String password);
    void getSensorCacheProxy(String id);
}
