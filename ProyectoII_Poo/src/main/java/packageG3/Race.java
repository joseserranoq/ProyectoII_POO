/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageG3;

import java.util.Iterator;


/**
 *
 * @author jose_
 */
public class Race {
    PositionIterator iter;

    public Race(PositionIterator iter) {
        this.iter = iter;
    }
    public void beginRace(){  //it define the position of the horses 
        Iterator itr = iter.createIterator();
        int count = 1;
        while(itr.hasNext()){
            Horse h = (Horse)itr.next();
            //System.out.println(h.getNumH());
            switch (count){
            
                case 1: Game3.horse1.setText(String.valueOf(h.getNumH()));
                    
                case 2: Game3.horse2.setText(String.valueOf(h.getNumH()));
                
                case 3: Game3.horse3.setText(String.valueOf(h.getNumH()));
                
                case 4: Game3.horse4.setText(String.valueOf(h.getNumH()));
                
                case 5: Game3.horse5.setText(String.valueOf(h.getNumH()));
            }
            count +=1;
        }
    }
}
