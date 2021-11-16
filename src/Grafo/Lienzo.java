/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javafx.scene.shape.Rectangle;
import javax.swing.JPanel;


/**
 *
 * @author mauag
 */
public class Lienzo extends  JPanel implements  MouseListener {

    private Vector <Nodo> vectorNodos; 
    
    private Vector<Enlace> vectorEnlace; 
    private  Point  p1, p2; 
    private Nodo nodoMover; 
    private int iNodo;
    
    public Lienzo() 
    {
    this.vectorNodos = new  Vector<>(); 
    this.vectorEnlace = new Vector<>(); 

    this.addMouseListener(this);
   
    }
    
    @Override
   public void paint(Graphics g)
   {
   for (Nodo nodos : vectorNodos){  // recorre los metodos y los va pintando    
     nodos.pintar(g);
   }
   for (Enlace enlace: vectorEnlace)
   {
   enlace.pintar(g);
   }
   
   
   }
    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getButton() == MouseEvent.BUTTON1) {   // IDENTIFICA LA ACCION PARA PINTAR 
   this.vectorNodos.add(new Nodo(e.getX(), e.getY())); 
    repaint(); 
    
    }
    if(e.getButton() == MouseEvent.BUTTON3){
    
        for (Nodo nodo : vectorNodos) {
    if(new java.awt.Rectangle(nodo.getX() - Nodo.d/2, nodo.getY() - Nodo.d/2,Nodo.d,Nodo.d).contains(e.getPoint())){
               
            
          if(p1==null)
              p1 = new Point(nodo.getX(), nodo .getY()); 
          else{
          p2 = new Point (nodo.getX(), nodo.getY()); 
          this.vectorEnlace.add(new Enlace(p1. x, p1. y, p2.x, p2.y)); 
          repaint();
          p1= null;
          p2=null; 
          
          }
          
       
   
    }
        }
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

