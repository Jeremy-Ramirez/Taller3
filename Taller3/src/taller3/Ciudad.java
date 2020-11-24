/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author User
 */
public class Ciudad {
    
    private String lugar;
    private double Longitud;
    private double Latitud;
    private double puntaje;

    public Ciudad(String lugar, double Longitud, double Latitud, double puntaje) {
        this.lugar = lugar;
        this.Longitud = Longitud;
        this.Latitud = Latitud;
        this.puntaje = puntaje;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
    
    
    
}
