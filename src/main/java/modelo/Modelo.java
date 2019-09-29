/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.DefaultListModel;


/**
 *Clase Modelo
 * @author julian esteban vallejo galindo
 */
public class Modelo {
    
    DefaultListModel modelo = new DefaultListModel();        
    private String palabra;

    /**
     * getter palabra 
     * @return palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * setter palabra
     * @param palabra 
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    /**
     * Metodo que añade la palabra al modelo
     * @return 
     */
    public DefaultListModel añadir(){
        modelo.addElement(this.getPalabra());
        return modelo;
    }    
}
