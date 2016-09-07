import java.awt.Point;

//Souris
//19 juil. 2016
//charvoz
//

public abstract class Figure2Points extends Figure
{
	private Point m_anchor;						//point de départ de la ligne courante
	private Point m_currentPoint;				//point d'arrivée de la ligne courante
	
	public Figure2Points(Point g)
	{
		super(g);		
	}

	protected Point getAnchor()
	{
		return m_anchor;
	}

	protected void setAnchor(Point m_anchor)
	{
		this.m_anchor = m_anchor;
	}
	
	protected Point getCurrentPoint()
	{
		return m_currentPoint;
	}

	public void setCurrentPoint(Point g)
	{
		if ( g != null)
			m_currentPoint=g;			
		
	}

	
}
