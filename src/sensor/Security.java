/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

/**
 *
 * @author jcrbsa
 */
public interface Security {
    
    void envia(String mensagem);
    int countTimesPresence();
    boolean presence();
    
    
}
