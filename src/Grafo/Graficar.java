/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import javax.swing.JFrame;

/**
 *
 * @author mauag
 */
public class Graficar {
    
    public static void main(String [] args)
    {
        
        
    JFrame ventana = new JFrame();
    Lienzo objLienzo = new Lienzo(); 
   ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  ventana.setSize(600, 600);
   ventana.add(objLienzo);
    ventana.setVisible(true);
     
}
    
}