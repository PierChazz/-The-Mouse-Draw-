import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.SwingUtilities;

//Souris
//13 juil. 2016
//charvoz
//

public class Dessin implements MouseListener, MouseMotionListener 
{
	private Fen m_fen ; 
	
	public Dessin(Fen f) 
	 {	
	    m_fen = f;	 
	    f.addMouseListener(this);
		f.addMouseMotionListener(this);
	 }
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		if( SwingUtilities.isLeftMouseButton(e))
		{
			m_fen.debutLigne(e.getPoint());
		}
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e)
	{
		if( SwingUtilities.isLeftMouseButton(e))
		{
			m_fen.ajouterLigne(e.getPoint());
		}
		
	}
	@Override
	public void mouseDragged(MouseEvent e)
	{
		if ( SwingUtilities.isLeftMouseButton(e)) 
		{
			m_fen.finLigne(e.getPoint());
		}
	}
		
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if (SwingUtilities.isLeftMouseButton(e) && (e.getClickCount() == 2))
		{
			m_fen.effacerTout();
		}
		else if (SwingUtilities.isRightMouseButton(e)&& (e.getClickCount() == 1))
		{
			m_fen.effacerLigne();
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e){}
		
	@Override
	public void mouseExited(MouseEvent e){}
	
	@Override
	public void mouseMoved(MouseEvent e){}

}
