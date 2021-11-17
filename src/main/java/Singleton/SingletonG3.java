/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;
import packageG3.Game3;

/**
 *
 * @author jose_
 */
public final class SingletonG3 {
    
    public static Game3 value;

    public SingletonG3() {
        
    }
    
    public static synchronized Game3 getInstance(){
        if (value == null) {
            value = new Game3();
        }
    return value;
    }
}
