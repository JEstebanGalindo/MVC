/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *Clase Controlador
 * @author julian esteban vallejo galindo
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;

    /**
     * Controlador de la clase Controlador recibe vista y modelo
     * @param view vista
     * @param model modelo
     */
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.B_Guardar.addActionListener(this);
    }
    
    /**
     * Metodo que centra la vista
     */
    public void iniciar(){    
        view.setLocationRelativeTo(null);            
        view.setVisible(true);
    }

    /**
     * Metodo que captura la accion del boton
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setPalabra(view.TB_Palabras.getText());
        if(model.getPalabra().isEmpty()){
            model.setPalabra("vacio");
            view.JL_Mostrar.setModel(model.añadir());
            view.TB_Palabras.setText("");            
        }else{
            view.JL_Mostrar.setModel(model.añadir());
            view.TB_Palabras.setText("");
        }
    }    
}
