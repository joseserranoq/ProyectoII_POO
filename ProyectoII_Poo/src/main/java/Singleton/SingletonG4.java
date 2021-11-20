/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;
import packageG4.Game4;
/**
 *
 * @author jose_
 */
public final class SingletonG4 {    //it makes an unique instance for game4
    
    public static Game4 value;

    public SingletonG4() {
        
    }
    
    public static synchronized Game4 getInstance(){
        if (value == null) {
            value = new Game4();
        }
    return value;
    }
}
