import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
Programme Ecouteur1.java
Date 12 juil. 2016
Auteur Pier C
*/
public abstract class Ecouteur1 implements WindowListener
{
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent evt){}
	public void windowClosed(WindowEvent evt){}
	public void windowDeactivated(WindowEvent evt){}
	public void windowDeiconified(WindowEvent evt){}
	public void windowIconified(WindowEvent evt){}
	public void windowOpened(WindowEvent evt){}
}

