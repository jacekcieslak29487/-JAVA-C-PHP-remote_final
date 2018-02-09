package rem_v01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class About {

	private JFrame frmZdalneSterowanieOwietleniem;

	/**
	 * Launch the application.
	 */
	public void aboutScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.frmZdalneSterowanieOwietleniem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZdalneSterowanieOwietleniem = new JFrame();
		frmZdalneSterowanieOwietleniem.getContentPane().setBackground(Color.GRAY);
		frmZdalneSterowanieOwietleniem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROGRAM NAPISANY NA POTRZEBY PRZEDMIOTU");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(42, 26, 511, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblNewLabel);
		
		JLabel lblprojektZespoowy = new JLabel("\"PROJEKT ZESPO\u0141OWY\"");
		lblprojektZespoowy.setHorizontalAlignment(SwingConstants.CENTER);
		lblprojektZespoowy.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblprojektZespoowy.setBounds(42, 57, 511, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblprojektZespoowy);
		
		JLabel lblWyszaSzkoaInformatyki = new JLabel("Wy\u017Csza Szko\u0142a Informatyki i Umiej\u0119tno\u015Bci w \u0141odzi");
		lblWyszaSzkoaInformatyki.setHorizontalAlignment(SwingConstants.CENTER);
		lblWyszaSzkoaInformatyki.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWyszaSzkoaInformatyki.setBounds(23, 137, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblWyszaSzkoaInformatyki);
		
		JLabel lblWydziaInformatykiI = new JLabel("Wydzia\u0142 Informatyki i Zarz\u0105dzania");
		lblWydziaInformatykiI.setHorizontalAlignment(SwingConstants.CENTER);
		lblWydziaInformatykiI.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWydziaInformatykiI.setBounds(23, 160, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblWydziaInformatykiI);
		
		JLabel lblWyszaSzkoaInformatyki_1 = new JLabel("kierunek: Informatyka");
		lblWyszaSzkoaInformatyki_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWyszaSzkoaInformatyki_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWyszaSzkoaInformatyki_1.setBounds(33, 179, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblWyszaSzkoaInformatyki_1);
		
		JLabel lblProjektWykonali = new JLabel("PROJEKT WYKONALI");
		lblProjektWykonali.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjektWykonali.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblProjektWykonali.setBounds(218, 221, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblProjektWykonali);
		
		JLabel lblJacekCielakNr = new JLabel("JACEK CIE\u015ALAK nr indeksu 29487");
		lblJacekCielakNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblJacekCielakNr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblJacekCielakNr.setBounds(218, 249, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblJacekCielakNr);
		
		JLabel lblMaciejKarolNr = new JLabel("MACIEJ KAROL nr indeksu 29687");
		lblMaciejKarolNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaciejKarolNr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMaciejKarolNr.setBounds(218, 273, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblMaciejKarolNr);
		
		JLabel lblProwadzcyDrKrzysztof = new JLabel("prowadz\u0105cy: dr Krzysztof Rychlicki - Kicior");
		lblProwadzcyDrKrzysztof.setHorizontalAlignment(SwingConstants.CENTER);
		lblProwadzcyDrKrzysztof.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblProwadzcyDrKrzysztof.setBounds(128, 84, 335, 31);
		frmZdalneSterowanieOwietleniem.getContentPane().add(lblProwadzcyDrKrzysztof);
		frmZdalneSterowanieOwietleniem.setTitle("ZDALNE STEROWANIE O\u015AWIETLENIEM - O PROGRAMIE");
		frmZdalneSterowanieOwietleniem.setBounds(100, 100, 600, 400);
	}

}
