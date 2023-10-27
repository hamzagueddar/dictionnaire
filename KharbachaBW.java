import java.util.*;
import java.io.*;

/** Classe pour charger le dictionnaire Atla: */

public class KharbachaBW
{
	/** Le dictionnaire: */
	ArrayList<ElementArab> Dict = null;
	
	/** Le chargement du dictionnaire: */
	public KharbachaBW()
	{
		String uneLigne = "";
		String a = "";
		String e = "";
		FileReader monFichier = null;
		BufferedReader tampon = null;
		Dict = new ArrayList();
		
		try{
			monFichier = new FileReader("Kharbacha.txt");
			tampon = new BufferedReader(monFichier);
			
			System.out.println("Debut chargement...");
			
			uneLigne = tampon.readLine();
			
			while(!(uneLigne == null))
			{
				a = uneLigne.substring(7,uneLigne.length() - 4);
				e = "";
				
				while(!uneLigne.endsWith("</ar>"))
				{
					uneLigne = tampon.readLine();
					e = e + uneLigne;
				}
				
				if(e.length() > 0)
				{
					e = e.substring(0, e.length() - 5);
					Dict.add(new ElementArab(a,e));
				}
				
				uneLigne = tampon.readLine();	
			}
			
			System.out.println("Chargement terminé");
		}catch(Exception except)
		{
			System.out.println("Une erreur s'est produite: " + except.toString());
		}finally
		{
			try{
				tampon.close();
				monFichier.close();
			}catch(Exception expcept2)
			{
				System.out.println("impossible de fermer le fichier!");
			}
		}				 			
	}
	
	
	public String getTraduction(String a)
	{
		String aRetourner = "";
		int i = 0;
		boolean trouve = false;
		
		while((i < Dict.size()) && !(trouve))
		{
			if(Dict.get(i).getArab().equals(a))
			{
				trouve = true;
				aRetourner = Dict.get(i).getAnglais();
			}else
			{
				++i;
			}
		}
		
		return aRetourner;
	}
	
	public String getArabicTraduction(String a)
	{
		String aRetourner = "";
		int i = 0;
		boolean trouve = false;
		
		while((i < Dict.size()) && !(trouve))
		{
			if(Dict.get(i).getAnglais().equalsIgnoreCase(a))
			{
				trouve = true;
				aRetourner = Dict.get(i).getArab();
			}else
			{
				++i;
			}
		}
		
		return aRetourner;
	
	}

}

class ElementArab
{
	String arab = null;
	String anglais = null;
	
	/** Constructeur d'un élément: */
	public ElementArab(String a, String e)
	{
		arab = a;
		anglais = e;
	}
	
	public String getArab()
	{
		return arab;
	}
	
	public String getAnglais()
	{
		return anglais;
	}
	
	public String toString()
	{
		return ("arab=" + arab +", anglais=" + anglais);
	}
}	
