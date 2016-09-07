import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Souris
//13 juil. 2016
//charvoz
//

public class NewFen extends JFrame
{
	/**
	 * 
	 */
	/*private static final long serialVersionUID = -8213989289919232134L;
	
		private final int MAX = 10; 						//nombre maximum de trait 
	 	private Point starts[] = new Point[MAX];			//points de départ
	 	private Point ends[] = new Point[MAX];				//point d'arrivée
	 	private Point anchor;								//point de départ de ligne courante
	 	private Point currentPoint; 						//point d'arrivée de ligne courante
	 	private int currline = 0; 							//nombre de ligne tracées
	 	
	  public NewFen() 
	  {
		 
		/* //EcouteurSouris ec = new EcouteurSouris(this);
		 Dessin d = new Dessin(this);
		 addMouseListener(d);
		 addMouseMotionListener(d);
		 
		 setBounds(200, 200, 400, 500);
		 setVisible(true);
		 setDefaultCloseOperation (DISPOSE_ON_CLOSE);
		 setTitle("Essai");
		 JPanel pan = new JPanel();
		 pan.setBackground(Color.GREEN);
		 this.setContentPane(pan);
		 
	  }

	   public void message ()
	   {
		   System.out.print("coucou");
	   }
	   
	  
	   public void paint (Graphics g)
		{
			super.paint(g);	
			//dessin des lignes validées
			for (int i = 0; i<currline; i++)
			{
				g.drawLine(starts[i].x, starts[i].y, ends[i].x, ends[i].y);
			}
			//dessin de la ligne courante
			g.setColor(Color.RED);
			if (currentPoint != null)
			{
				g.drawLine(anchor.x, anchor.y, currentPoint.x, currentPoint.y);
			}
		}

		public void debutTrait(MouseEvent e)
		{
			if (currline < MAX) 
			{
				anchor = e.getPoint();	
				repaint();
			}
			
		}
		
		private void nbTraitsMaxAtteints()
		{
			setTitle("Max traits atteints");
		}
		
		public void tracer(MouseEvent e)
		{
			if (currline < MAX)
			{
				ends[currline] = e.getPoint();
				starts[currline] = anchor;
				currline++;
				currentPoint = null;
				anchor = null;
				repaint();
			}
		}
		
		public void finTrait(MouseEvent e)
		{
			if (currline<MAX)
			{
				currentPoint =e.getPoint();
				repaint();
			}
			else 
			{
				nbTraitsMaxAtteints();
			}
		}
		public void effacerTout(MouseEvent e)
		{
			System.out.println("efface tout");
			currline = 0;	
			setTitle("");
			repaint();
		}
		
		public void effacerLigne(MouseEvent e)
		{
			System.out.println("efface ligne");
			currline--;
			repaint();
			
		}
			
		public void mouseEntered(MouseEvent e){}
			
		public void mouseExited(MouseEvent e){}
		
		public void mouseMoved(MouseEvent e){}

		


	}*/

}
