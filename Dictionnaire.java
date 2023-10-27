/** Classe du lancement */

public class Dictionnaire
{
	public static void main(String args[])
	{
		KharbachaBW kbw = new KharbachaBW();
		
		if(null == kbw)
		{
			System.out.println("Impossible de charger le dictionnaire!");
		}else
		{
			(new MainFrame(kbw)).setVisible(true);
		}
	}
}