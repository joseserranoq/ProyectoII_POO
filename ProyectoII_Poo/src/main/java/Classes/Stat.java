/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author jose_
 */
public class Stat {
    private String key;
    private String name;
    private int value;

    public Stat(String clave, String nombre, int valor) {
        this.key = clave;   //the type of points that will show
        this.name = nombre; //name of the game
        this.value = valor; //value is the points obtained
    }

    public String getClave() {
        return key;
    }

    public void setClave(String clave) {
        this.key = clave;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public int getValor() {
        return value;
    }

    public void setValor(int valor) {
        this.value = valor;
    }
    
    public void writeInArchive(String gameName,String type,int points){
        File archive;
        try{
            archive = new File("src\\main\\java\\Classes");
            if (archive.createNewFile())
                System.out.println("The archive has been created");
        }catch(IOException e){
            System.err.println("The archive has not been created "+e);
        }
    }
    
}
