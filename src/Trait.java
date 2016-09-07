import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


//Souris
//13 juil. 2016
//charvoz
//


public class Trait
{
	
	
	private Point m_anchor;						//point de départ de la ligne courante
	private Point m_currentPoint;				//point d'arrivée de la ligne courante
	private Color m_color;
	private ArrayList<Point> vecteur ;
	
	public Trait(Point g)
	{
		if ( g == null) g = new Point();
		//setAnchor(g);
		//setCurrentPoint(g);
		//vecteur = new ArrayList<Point>();
		//vecteur.add(g);
		m_color = new Color((int)(Math.random()*0xFFFFFF));
	}
		
	public  Point getAnchor()
	{
		return m_anchor;
	}
	public void setAnchor(Point g)
	{
		m_anchor=g;
	}
		
	public Point getCurrentPoint()
	{
		return m_currentPoint;
	}
		
	public void setCurrentPoint(Point g)
	{
		if ( g != null)
			m_currentPoint=g;
			vecteur.add(g);
	}
	
	public void paint (Graphics g)
	{
		//int r = (int) Math.sqrt (Math.pow(getAnchor().x - getCurrentPoint().x, 2) + Math.pow(getAnchor().y-getCurrentPoint().y, 2));
		//for (int i = 0; i < vecteur.size()-1 ; i ++)
		{
			//méthode MainLevée			
		//g.drawLine(vecteur.get(i).x,vecteur.get(i).y,vecteur.get(i+1).x, vecteur.get(i+1).y);
			//méthode Voile +
		//g.drawLine(vecteur.get(0).x,vecteur.get(0).y,vecteur.get(i+1).x, vecteur.get(i+1).y);
		}
			//méthode Cercle
		//g.fillOval(getAnchor().x, getCurrentpoint().y, 2*r, 2*r);
		
			//méthode Ligne
		//g.drawLine(getAnchor().x, getAnchor().y, getCurrentPoint().x, getCurrentPoint().y);
		  
		g.setColor(m_color);
	}

}
