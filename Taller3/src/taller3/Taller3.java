/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        Archivo a= new Archivo();
        int n;
        int c;
        PriorityQueue<Ciudad> cola;
        //Scanner scanner = new Scanner(System.in);
        
           File dir = new File("src");
           String[] ficheros = dir.list();
           int n2=1;
           if (ficheros == null)
            System.out.println("No hay ficheros en el directorio especificado");
            else { 
               Arrays.sort(ficheros);
                    
                for (int x=0;x<ficheros.length;x++){
                    if(ficheros[x].endsWith("txt")){
                    System.out.println(n2+" "+ficheros[x].subSequence(0, ficheros[x].length()-4));
                    n2++;
                    }
                }
                System.out.println((0)+" Salir");
                    
                    
                    }
        
 
        while (!salir) {
            
            
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion Guayaquil. Escribe el numero de lugares que deseas ver");
                        n=sn.nextInt();
                        
                        cola = a.leer(1);
                        for(int i=0; i<n;i++){
                            System.out.println(cola.poll());
                        }
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion Quito. Escribe el numero de lugares que deseas ver");
                        n=sn.nextInt();
                        
                        cola = a.leer(2);
                        for(int i=0; i<n;i++){
                            System.out.println(cola.poll());
                        }
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
      
}}
        
        
    
    

