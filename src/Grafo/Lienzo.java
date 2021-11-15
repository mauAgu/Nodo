/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JPanel;


/**
 *
 * @author mauag
 */
public class Lienzo extends  JPanel implements  MouseListener {

    private Vector<Nodo> vectorNodos; 
    
    public Lienzo() 
    {
        this.vectorNodos = new  Vector<>(); 
    this.addMouseListener(this);
    }
   
    @Override
   public void paint(Graphics g)
   {
   for (Nodo nodos : vectorNodos){
    // recorre los metodos y los va pintando    
     nodos.pintar(g);
   }
   } 

    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getButton() == MouseEvent.BUTTON1) {
    // IDENTIFICA LA ACCION PARA PINTAR 
   this.vectorNodos.add(new Nodo(e.getX(), e.getY())); 
    repaint();  
       
    
    }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
    
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
        
        
    }
    
}
