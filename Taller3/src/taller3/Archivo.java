/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author User
 */
public class Archivo {
    
    public void leer(){
        
        try{
            
            
            FileReader fr= new FileReader(new File("src\\Guayaquil.txt"));
            BufferedReader br= new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
            
            
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        
    }
    
    
    
    
    
    
    
}
