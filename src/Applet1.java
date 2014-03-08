import java.applet.Applet;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
public class Applet1 extends Applet implements KeyListener{

  String text = "I'm a simple applet";

  public void init() {
        text = "I'm a simple applet";
        setBackground(Color.cyan);
  }
  public void start() {
        System.out.println("starting...");
  }
  public void stop() {
        System.out.println("stopping...");
  }
  public void destroy() {
        System.out.println("preparing to unload...");
  }
  public void paint(Graphics g){
        System.out.println("Paint");
        Color c = new Color(0, 0, 0);
        Color v = new Color (50, 0, 0);
        g.setColor(c);
        //g.fillOval(60, 60, 50, 50);
        //g.fillOval(150, 60, 50, 50);
        //for (int x=0; x < 5; x++)
        {
        	g.fillOval(22, 22, 50, 50);
        	g.fillOval(74, 22, 50, 50);
        	//g.fillRect(22, 74, 104, 20);
        	g.setColor(v);
        	g.fillOval(34, 34, 30, 30);
        	
        	
        }
        
        
        
        /* for (int x=2; x < 30; x++)
       {
    	   g.setColor(Color.cyan);
    	   g.fillOval(x-1, 60, 50, 50);
    	   try {
        	   Thread.sleep(100);
        	   } catch (InterruptedException oe) {
        		   System.out.println(oe);
        	   }
    	   g.setColor(c);
    	   g.fillOval(x, 60, 50, 50);*/
    	   
       }
        //g.drawLine(10, 10, 50, 10);
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e);
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
        
        /*
        for (int white = 0; white < 254; white++)
        {
        	c = new Color(0+white, 0, 0+white);
        	g.setColor(c);
        	g.drawLine(10, 11+white, 50, 11+white);
        }
        g.setColor(Color.red);
       */
        
        
}
