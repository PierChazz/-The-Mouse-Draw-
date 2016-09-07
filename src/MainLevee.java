import java.awt.Graphics;
import java.awt.Point;

//Souris
//19 juil. 2016
//charvoz
//

public class MainLevee extends FigureNPoints
{

	public MainLevee(Point g)
	{
		super(g);
		
	}
	public void paint (Graphics g)
	{
		super.paint(g);
		for (int i = 0; i < vecteur.size()-1 ; i ++)
		{
			//méthode MainLevée			
		g.drawLine(vecteur.get(i).x,vecteur.get(i).y,vecteur.get(i+1).x, vecteur.get(i+1).y);
		}
	 
		
	}


}
