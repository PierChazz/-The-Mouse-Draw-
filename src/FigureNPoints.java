import java.awt.Point;
import java.util.ArrayList;

//Souris
//19 juil. 2016
//charvoz
//

public abstract class FigureNPoints extends Figure
{
	protected ArrayList<Point> vecteur ;

	public FigureNPoints(Point g)
	{
		super(g);		
	}
	
	@Override
	protected void setAnchor(Point g)
	{
		if ( vecteur == null) vecteur = new ArrayList<Point>() ;
		setCurrentPoint(g);
		
	}

	@Override
	public void setCurrentPoint(Point g)
	{
		
		if (g!=null)
		{
			vecteur.add(g);
		}
	}

	@Override
	protected Point getAnchor()
	{
		
		return vecteur.get(0);
	}

	@Override
	protected Point getCurrentPoint()
	{
		
		return vecteur.get(vecteur.size()-1);
	}

	
}
