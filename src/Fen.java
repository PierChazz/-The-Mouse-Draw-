import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;

//Souris
//12 juil. 2016
//charvoz
//

public class Fen extends JFrame 
{
 	private static final long serialVersionUID = -3332886434905609158L;
 	
 	private Groupe gr = new Groupe();
 	private Figure t;
 	private char choix;

	
 	 	
  public Fen() 
  {
	 
	 new Dessin(this);
	 new EcouteurClavier(this);
	 setBounds(400, 400, 800, 1000);
	 setVisible(true);
	 setDefaultCloseOperation (DISPOSE_ON_CLOSE);
	 setTitle("C'est le début !");
	 
	 JPanel pan = new JPanel();
	 pan.setBackground(Color.BLACK);
	 this.setContentPane(pan);
	 
  }

   public void message ()
   {
	   System.out.print("coucou");
   }
   
   public void paint (Graphics g)
	{
	   Image brouillon; 
	   Graphics2D tampon;
	   
	   Dimension d=this.getSize();
	   
	   brouillon = createImage(d.width,d.height);
	   tampon = (Graphics2D) brouillon.getGraphics();   			//ici pour faire tout le boulot d'affichage
	  
	   tampon.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   
	   
	   super.paint(tampon);
	   gr.paint(tampon);
				
		//dessin de la ligne courante
		
		if (t != null)
		{
			t.paint(tampon);
		}
		g.drawImage(brouillon, 0, 0, this); 						// affichage effectif
		titre();
	}

public void titre()
{
	String s;
	switch (Character.toLowerCase(choix))
	{
	case  'c' : s= "cercles";
	break;
	case 'v' :s = "voiles";
	break;
	case 'm' :s = "dessins à main levée";
	break;
	default  : s= "lignes";
	break;
	}
	if (!gr.isFull()) 
	{
		setTitle("Dessines moi des "+s+" !!!");
	}
	else
	{
		setTitle("Max traits atteints");

	}
}
   
   public void update(Graphics g)
   {
	   paint(g);
   }
   
	public void debutLigne(Point p)
	{
			
		if (!gr.isFull()) 
		{
			
			switch(choix)
			{
			case 'c' :  t = new Cercle(p); 
			break;
			case 'v' : t = new Voile(p);
			break;
			case 'm' : t = new MainLevee(p);
			break; 
			default : t = new Ligne(p);
			break;
			}
		}		
	}
	
	public void ajouterLigne(Point p)
	{
		if (!gr.isFull()) 
		{
			t.setCurrentPoint(p);
			gr.add(t);
			t = null;
			repaint();
		}
	}
	
	
	
	public void finLigne(Point p)
	{
		if (!gr.isFull()) 
		{
			t.setCurrentPoint(p);
			repaint();
		}
		
	}
		
	public void effacerTout()
	{
		gr.effaceTout();
		repaint();
	}
	
	public void effacerLigne()
	{
		gr.effaceDernier();
		System.out.println("efface ligne");
		repaint();
	}
		
	public void mouseEntered(MouseEvent e){}
		
	public void mouseExited(MouseEvent e){}
	
	public void mouseMoved(MouseEvent e){}
	
	void setChoix(char ke)
	{
		choix = ke;
		repaint();
	}

}
