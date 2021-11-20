/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageG3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author jose_
 */
public class HorseList implements PositionIterator{ //it contains the list with the horses
    private  LinkedList<Horse> hList;
    

    public HorseList() {
        this.hList = new LinkedList<>();
        
        Horse h1=new Horse(1);
        Horse h2=new Horse(2);
        Horse h3=new Horse(3);
        Horse h4=new Horse(4);
        Horse h5=new Horse(5);
        this.hList.add(h1);
        this.hList.add(h2);
        this.hList.add(h3);
        this.hList.add(h4);
        this.hList.add(h5);
        Collections.shuffle(hList);
    }

    @Override
    public Iterator createIterator() {
        return this.hList.iterator();
    }

    public LinkedList<Horse> gethList() {
        return hList;
    }
    

    
    
}
