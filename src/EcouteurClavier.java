import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//Souris
//19 juil. 2016
//charvoz
//

public class EcouteurClavier implements KeyListener
{
	private Fen etre;
	
	

	
	public EcouteurClavier(Fen f)
	{
		etre = f;
		f.addKeyListener(this);
	}


	public void keyPressed(KeyEvent arg0)
	{
				
	}

	
	public void keyReleased(KeyEvent arg0)
	{
				
	}

	public void keyTyped(KeyEvent ke)
	{
		etre.setChoix(ke.getKeyChar());
	}


	


	


}