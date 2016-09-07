import java.awt.Graphics;


/**
 * 16 juil. 2016
 * Souris
 * pier
 */

public class Groupe
{
	
	private final int MAX = 30; 						//nombre maximum de trait 
	private Figure[] m_indgroupe;
	private int nbTrait;
	
	public Groupe() 
		{
			m_indgroupe = new Figure [MAX];
		}
	
			
		/**
		 *fonction qui indique quand le nombre de traits max est atteint  
		 * @return un booléen
		 */
		public boolean isFull()
		{
			if (size()== MAX)
			{
				
				return true;
			}
			else 
			{
				return false;
			}
		}
		
		/**
		 * fonction qui retourne le nombre de trait dans la fenetre
		 * @return nbTrait le nombre de trait
		 */
		private int size()
		{
			return nbTrait;
		}
		public void add(Figure t)
		{
			if ( t != null)
			{
				m_indgroupe[nbTrait] = t;
				nbTrait++;
			}
		}
		public void paint (Graphics g)
		{
		   
		   
			//dessin des lignes validées
			for (int i = 0; i<nbTrait; i++)
			{
				
				m_indgroupe[i].paint(g);
			}
			
			
		}

		public void effaceTout()
		{
			 nbTrait = 0;
			
		}

		public void effaceDernier()
		{
			
			nbTrait --;
			
		}
	}
	/*
	
	import java.awt.Graphics;
import java.util.ArrayList;


public class Groupe
{
	private final int MAX=10;							//nbre max de traits
	private ArrayList<Trait>stock;						//stock les traits dans une liste
	
	public Groupe()
	{
		stock= new ArrayList<Trait>();
	}
	
	public int size()
	{
		return stock.size();
	}
	
	public boolean isFull()										//est ce que le tableau est plein
	{
		boolean statut;
		if(size()==MAX)
		{
			statut= true;
		}
		else
		{
		statut= false;
		}
		return statut;
	}
	
	
	
	public boolean ajouterLigne(Trait t)
	{
		if(!isFull()&& (t!=null))
		{
			stock.add(t);
			
			return true;
		}
		else
		{
			return false;
		}
	}
	public void eraseAll()
	{
		stock.clear();
	}
	public void eraseLast()
	{
		if ( size()>0)
			stock.remove(size()-1);
	}
	public void paint (Graphics g)
	{
		
		
		
		
		for (Trait t : stock)
		{	
			
			t.paint(g);
		}
		
		
	}

}

	
	 */
	 
