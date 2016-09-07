import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

//Souris
//19 juil. 2016
//charvoz
//

public abstract class Figure
{
	private Color m_color;
	
	
	public Figure(Point g)
	{
		if ( g == null) g = new Point();
		setAnchor(g);
		setCurrentPoint(g);
		m_color = new Color((int)(Math.random()*0xFFFFFF));
	}
	
	
	
	protected abstract Point getAnchor();
	
	protected abstract void setAnchor(Point Anchor);
	
	protected abstract Point getCurrentPoint();
	
	public abstract void setCurrentPoint(Point CurrentPoint);
	
	public void paint(Graphics g)
	{
		g.setColor(m_color);
	}
}
