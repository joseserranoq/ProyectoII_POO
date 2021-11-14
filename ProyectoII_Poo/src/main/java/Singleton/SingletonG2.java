/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;
import packageG2.Game2;

/**
 *
 * @author jose_
 */
public final class SingletonG2 {
    
    public static Game2 value;

    public SingletonG2() {
        
    }
    
    public static synchronized Game2 getInstance(){
        if (value == null) {
            value = new Game2();
        }
    return value;
    }
}
