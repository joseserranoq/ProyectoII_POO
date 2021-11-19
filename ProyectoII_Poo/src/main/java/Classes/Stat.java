/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

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
    
    public void writeArchive(){
        File f;
        FileWriter w;
        BufferedWriter br;
        PrintWriter wr;
        try{
            f=new File("src\\main\\java\\Classes\\texto.txt");
            w = new FileWriter(f,true);
            br= new BufferedWriter(w);
            wr = new PrintWriter(br);
            wr.write(this.key+" "+this.name+" "+this.value+"\n");
            wr.close();
            br.close();
           
        }catch(Exception e){
            System.out.println("Se ha presentado un error"+e);
        }
    }
    public void see() {
        File f = new File("src\\main\\java\\Classes\\texto.txt");
        String cadena;
        Scanner entrada = null;
        try{
            entrada = new Scanner(f);
            while(entrada.hasNext()){
                cadena = entrada.nextLine();
                System.out.println(cadena);
            }
            System.out.println("It has read all in the archive");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            entrada.close();
        }       
    }
}
