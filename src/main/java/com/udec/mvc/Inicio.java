/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *Clase Inicio
 * @author julian esteban vallejo galindo
 */
public class Inicio {
    
    /**
     * Inicia Programa
     * @param args 
     */
    public static void main(String[] args) {       
        
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(vista, modelo);
        controlador.iniciar();
    }
}
