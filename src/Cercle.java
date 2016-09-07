import java.awt.Graphics;
import java.awt.Point;

//Souris
//19 juil. 2016
//charvoz
//

public class Cercle extends Figure2Points
{

	public Cercle(Point g)
	{
		super(g);
		
	}
	public void paint (Graphics g)
	{
		//méthode Cercle
		int r = (int) Math.sqrt (Math.pow(getAnchor().x - getCurrentPoint().x, 2) + Math.pow(getAnchor().y-getCurrentPoint().y, 2));
		super.paint(g);	
		g.fillOval(getAnchor().x, getCurrentPoint().y, 2*r, 2*r);
							  
		
	}
	


}
