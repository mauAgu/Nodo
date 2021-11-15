/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.awt.Graphics;

/**
 *
 * @author mauag
 */
public class Circulo {
      private int x= 0, y= 0; 
    public static final int d= 60; 

    public Circulo(int x, int y ) {
    setX(x); 
    setY(y); 
    }
    
    public void pintar (Graphics g )
    {
    g.drawOval(getX(), getY(), d, d);
    }

 public int getX() 
{
return x; 
}
public void setX(int x)
{
this.x=x; 

}

public int getY()
{
    return y; 
}

public void setY(int y)
{
this.y  = y; 
}


}
