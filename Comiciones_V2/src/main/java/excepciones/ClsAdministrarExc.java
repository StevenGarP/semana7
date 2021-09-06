/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author HP
 */
public class ClsAdministrarExc extends Exception {
    String mensaje;
    
    public ClsAdministrarExc(String msg){
        this.mensaje = msg;
        
    }
    
}
