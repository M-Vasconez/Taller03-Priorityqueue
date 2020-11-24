/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller03.ed;

import java.util.PriorityQueue;

/**
 *
 * @author Jorge
 */
public class Pais {
    private int poblacion;
    private float area;
    private String idioma;
    private PriorityQueue<Ciudad> listaCiudades;

    public Pais(int poblacion, float area, String idioma) {
        this.poblacion = poblacion;
        this.area = area;
        this.idioma = idioma;
    }
    
    
}
