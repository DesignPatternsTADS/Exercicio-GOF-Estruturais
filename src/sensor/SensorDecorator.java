/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

/**
 *
 * @author jcrbsa
 */
public abstract class SensorDecorator extends Sensor implements Security{
    private Security security;

    public SensorDecorator(Security security) {
       
        this.security = security;
    }
    public abstract void envia(String mensagem);
    public abstract boolean presence();

    public Security getSecurity() {
        return security;
    }
    
    
    
}
