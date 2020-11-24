/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 *
 * @author User
 */
public class Archivo {
    
    public void leer(){
        LinkedList<Ciudad> ciudad = new LinkedList();
        //PriorityQueue<Ciudad> colaPrioridad = new PriorityQueue<>((Ciudad c1, Ciudad c2) -> c1.getPuntaje()-c2.getPuntaje());
        PriorityQueue<Ciudad> colaPrioridad = new PriorityQueue<>(new PorPuntaje());
        
        try{
            
            
            FileReader fr= new FileReader(new File("src\\Guayaquil2.txt"));
            BufferedReader br= new BufferedReader(fr);
            String linea;
            br.readLine();
            while((linea=br.readLine())!=null){
                 StringTokenizer word = new StringTokenizer(linea,",\n");
                        while(word.hasMoreTokens()){
                               Ciudad c = new Ciudad(word.nextToken(), Double.valueOf(word.nextToken()), Double.valueOf(word.nextToken()), Double.valueOf(word.nextToken()));
                               colaPrioridad.offer(c);
                               
                               
                    }
            }
            
            
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        //System.out.println(colaPrioridad.toString());
        while(!colaPrioridad.isEmpty()){
            System.out.println(colaPrioridad.poll());
        }
    }
    
    
    
    
    
    
    
}
