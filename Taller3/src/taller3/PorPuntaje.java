/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;
import java.util.Comparator;
/**
 *
 * @author User
 */
public class PorPuntaje implements Comparator<Ciudad>{
    public int compare(Ciudad c1, Ciudad c2){
        if(c1.getPuntaje() > c2.getPuntaje()) return 0;
        if(c1.getPuntaje() == c2.getPuntaje()) return 1;
        return -1;
    }

    
}
