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

    ArrayList <Circulo>     listaCirculos = null; 
  
    public Lienzo() 
    {
        setListaCirculos(new ArrayList<>());
        addMouseListener(this);
    
    }
    
    @Override
   public void paint(Graphics g)
   {
   super.paint(g);
   for(Circulo objCirculo : getListaCirculos()) {
   
   objCirculo.pintar(g);
   }
   
   
   
   
   
} 

    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getButton() == 1) {
    
        getListaCirculos().add(new Circulo(e.getX() - 30, e.getY() - 30));
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

    public ArrayList<Circulo> getListaCirculos() {
        return listaCirculos;
    }

    public void setListaCirculos(ArrayList<Circulo> listaCirculos) {
        this.listaCirculos = listaCirculos;
    }
    
}

