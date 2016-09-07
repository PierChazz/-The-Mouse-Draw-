import java.awt.Graphics;
import java.awt.Point;

//Souris
//19 juil. 2016
//charvoz
//

public class Ligne extends Figure2Points
{
	
	public Ligne(Point g)
	{
		super(g);
		
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);		
			//méthode Ligne
		g.drawLine(getAnchor().x, getAnchor().y, getCurrentPoint().x, getCurrentPoint().y);
	}

	
}
