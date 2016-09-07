
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.SwingUtilities;


//Souris
//12 juil. 2016
//charvoz
//

public class EcouteurSouris implements MouseListener, MouseMotionListener 
{
	//private static final long serialVersionUID = -3436912177287339462L;
	private Fen m_fen ; 
	
	/*public EcouteurSouris(Fen f) 
	 {	
	    m_fen = f;	 
		setTitle(essai Souris)
	}
	*/
	

	@Override
	public void mouseClicked(MouseEvent e)
	{
		if ( SwingUtilities.isLeftMouseButton(e)) 
		{
		 System.out.println("Click gauche en "+ e.getX()+" "+e.getY());
		}
		if ( SwingUtilities.isMiddleMouseButton(e)) 
		{
			System.out.println("Click milieu en " +e.getX()+" "+e.getY());
		}
		if ( SwingUtilities.isRightMouseButton(e)) 
		{
			System.out.println("Click droit en "+ e.getX()+" "+e.getY());
		}
		
		//m_fen.message();
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("Souris entrée dans la zone");
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
		System.out.println("Souris sortie de la zone");
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		if ( SwingUtilities.isLeftMouseButton(e)) 
		{
		 System.out.println("Bouton gauche pressé en "+ e.getX()+" "+e.getY());
		}
		if ( SwingUtilities.isMiddleMouseButton(e)) 
		{
			System.out.println("Bouton milieu pressé en " +e.getX()+" "+e.getY());
		}
		if ( SwingUtilities.isRightMouseButton(e)) 
		{
			System.out.println("Bouton droit pressé en "+ e.getX()+" "+e.getY());
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		
		System.out.println("Souris relachée");
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		
		System.out.println("Je click et bouge en même temps !");
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		                                                                       
		System.out.println("Souris bougée");
	}
	
}
