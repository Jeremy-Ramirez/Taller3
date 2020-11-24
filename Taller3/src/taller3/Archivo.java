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
import java.util.StringTokenizer;

/**
 *
 * @author User
 */
public class Archivo {
    
    public void leer(){
        ArrayDeque a= new ArrayDeque();
        
        try{
            
            
            FileReader fr= new FileReader(new File("src\\Guayaquil.txt"));
            BufferedReader br= new BufferedReader(fr);
            String linea;
            br.readLine();
            while((linea=br.readLine())!=null){
                 StringTokenizer word = new StringTokenizer(linea,",\n");
                        while(word.hasMoreTokens()){
                               Ciudad c = new Ciudad(word.nextToken(), Double.valueOf(word.nextToken()), Double.valueOf(word.nextToken()), Double.valueOf(word.nextToken()));
                               a.add(c);
                               
                               System.out.println(c);
                               
                    }
            }
            
            
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        
    }
    
    
    
    
    
    
    
}
