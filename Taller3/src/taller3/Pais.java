/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.ArrayList;


/**
 *
 * @author ronny
 */
public class Pais {

    private double poblacion;
    private double area;
    private String idiomaOficial;
    private ArrayList<Ciudad> ciudades;

    public Pais(double poblacion, double area, String idiomaOficial, ArrayList<Ciudad> ciudades) {
        this.poblacion = poblacion;
        this.area = area;
        this.idiomaOficial = idiomaOficial;
        this.ciudades = ciudades;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getIdiomaOficial() {
        return idiomaOficial;
    }

    public void setIdiomaOficial(String idiomaOficial) {
        this.idiomaOficial = idiomaOficial;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
    
}
