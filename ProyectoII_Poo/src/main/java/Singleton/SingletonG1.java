/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;
import packageG1.Game1;

/**
 *
 * @author jose_
 */
public final class SingletonG1 {
    
    public static Game1 value;

    public SingletonG1() {
        
    }
    
    public static synchronized Game1 getInstance(){
        if (value == null) {
            value = new Game1();
        }
    return value;
    }
}
