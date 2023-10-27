import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** Interface graphique por le dictionnaire */

public class MainFrame extends JFrame
{
	JLabel lblAnglais;
	JLabel lblArab;
	JLabel lblBW;
	
	JTextField txtAnglais;
	JTextField txtArab;
	JTextField txtBW;
	
	Container panel;
	
	JButton chercher;
	JButton quitter_b;
	
	JMenuBar menu;
	JMenu fichier;
	JMenuItem quitter_m;
	JMenu aide;
	JMenuItem apropos;
	
	KharbachaBW kbw;
	
	public MainFrame(KharbachaBW kbw_)
	{
		super("Dictionnaire Kharbacha");
		
		InitialisationGraphique();
		
		kbw = kbw_;
		
	}
	
	public void InitialisationGraphique()
	{
		lblAnglais = new JLabel("le mot anglais:");
		lblArab = new JLabel("le mot en arab:");
		lblBW = new JLabel("le mot en buck walter:");
		
		txtAnglais = new JTextField();
		txtArab = new JTextField();
		txtBW = new JTextField();
		
		chercher = new JButton("Chercher");
		quitter_b = new JButton("Quitter");
		
		menu = new JMenuBar();
		
		fichier = new JMenu("Fichier");
		quitter_m = new JMenuItem("Quitter");
		
		aide = new JMenu("Aide");
		apropos = new JMenuItem("A propos");
		
		setSize(300,150);
		
		panel = getContentPane();
		
		setJMenuBar(menu);
		
		menu.add(fichier);
		menu.add(aide);
		
		fichier.add(quitter_m);
		
		aide.add(apropos);
		
		panel.setLayout(new GridLayout(4,2));
		
		panel.add(lblAnglais);
		panel.add(txtAnglais);
		panel.add(lblArab);
		panel.add(txtArab);
		panel.add(lblBW);
		panel.add(txtBW);
		
		panel.add(chercher);
		panel.add(quitter_b);
		
		chercher.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				lancerRecherche();
			}
		});
		
		quitter_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				quitter();
			}
		});

		quitter_m.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				quitter();
			}
		});

		apropos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				aPropos();
			}
		});

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void lancerRecherche()
	{
		String aChercher = txtAnglais.getText().trim();
		String resultat;
		
		resultat = kbw.getArabicTraduction(aChercher);
		if(resultat.equals(""))
		{
			System.out.println("Mot introuvable!");
		}else
		{
			BuckwalterToArabic bta = new BuckwalterToArabic();
			txtArab.setText(bta.transliterate(resultat));
			txtBW.setText(resultat);
		}
	}
	
	public void quitter()
	{
		dispose();
	}
	
	public void aPropos()
	{
		JOptionPane.showMessageDialog(this, "Dictionnaire Bilingue Anglais -> Arab\nTarek Boutefara\nTarekProg(http://www.geocities.com/tarekprog)\ne-mail:tarekprog@yahoo.fr\nUtilisation libre.", "A props", JOptionPane.INFORMATION_MESSAGE);
	}	
}
		 