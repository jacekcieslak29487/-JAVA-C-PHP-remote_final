package rem_v01;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * @author Cieœlak Jacek 29487|
 * 			Karol Maciej 29687
 *
 */
public class Main {

	private JFrame frameMain;
	private JTextField textFieldPom1;
	private JTextField textFieldPom2;
	private JTextField textFieldPom3;
	private JTextField textFieldPom4;
	public String txt1="WY£¥CZONE", txt2="WY£¥CZONE", txt3="WY£¥CZONE", txt4="WY£¥CZONE";
	public String kontrolki;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frameMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMain = new JFrame();
		frameMain.setTitle("ZDALNE STEROWANIE O\u015AWIETLENIEM");
		frameMain.getContentPane().setBackground(Color.CYAN);
		frameMain.setBounds(100, 100, 798, 554);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(null);
		
		textFieldPom1 = new JTextField();
		textFieldPom1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textFieldPom1.setForeground(Color.WHITE);
		textFieldPom1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPom1.setText("WY£¥CZONE");
		textFieldPom1.setBackground(Color.DARK_GRAY);
		textFieldPom1.setBounds(41, 204, 150, 40);
		frameMain.getContentPane().add(textFieldPom1);
		textFieldPom1.setColumns(10);
		
		textFieldPom2 = new JTextField();
		textFieldPom2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textFieldPom2.setForeground(Color.WHITE);
		textFieldPom2.setText("WY£¥CZONE");
		textFieldPom2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPom2.setBackground(Color.DARK_GRAY);
		textFieldPom2.setBounds(228, 204, 150, 40);
		frameMain.getContentPane().add(textFieldPom2);
		textFieldPom2.setColumns(10);
		
		textFieldPom3 = new JTextField();
		textFieldPom3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textFieldPom3.setForeground(Color.WHITE);
		textFieldPom3.setText("WY£¥CZONE");
		textFieldPom3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPom3.setBackground(Color.DARK_GRAY);
		textFieldPom3.setBounds(409, 204, 150, 40);
		frameMain.getContentPane().add(textFieldPom3);
		textFieldPom3.setColumns(10);
		
		textFieldPom4 = new JTextField();
		textFieldPom4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textFieldPom4.setForeground(Color.WHITE);
		textFieldPom4.setText("WY£¥CZONE");
		textFieldPom4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPom4.setBackground(Color.DARK_GRAY);
		textFieldPom4.setBounds(581, 204, 150, 40);
		frameMain.getContentPane().add(textFieldPom4);
		textFieldPom4.setColumns(10);
		
		/*vv----- PRZYCISK OD POMIESZCZENIA nr1 -----vv*/
		
		JButton btnPom1 = new JButton("POMIESZCZENIE 1");
		btnPom1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPom1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				if ( txt1.equals("WY£¥CZONE")){
					textFieldPom1.setText("W£¥CZONE");
					textFieldPom1.setBackground(Color.orange);
					textFieldPom1.setForeground(Color.BLACK);						
				}
				
				if ( txt1.equals("W£¥CZONE")){
					textFieldPom1.setText("WY£¥CZONE");
					textFieldPom1.setBackground(Color.DARK_GRAY);
					textFieldPom1.setForeground(Color.WHITE);										
				}
				txt1 = textFieldPom1.getText();
				txt2 = textFieldPom2.getText();
				txt3 = textFieldPom3.getText();
				txt4 = textFieldPom4.getText();
				Requests.ustaw(txt1,txt2,txt3,txt4);
				
				try {
					Requests.sendRequest();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPom1.setBounds(41, 43, 150, 150);
		frameMain.getContentPane().add(btnPom1);
		/*^^^^^--------------------------------^^^^^*/
		
		/*vv----- PRZYCISK OD POMIESZCZENIA nr2 -----vv*/
		JButton btnPom2 = new JButton("POMIESZCZENIE 2");
		btnPom2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPom2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
								
				if ( txt2.equals("WY£¥CZONE")){
					textFieldPom2.setText("W£¥CZONE");
					textFieldPom2.setBackground(Color.orange);
					textFieldPom2.setForeground(Color.BLACK);					
				}
				
				if ( txt2.equals("W£¥CZONE")){
					textFieldPom2.setText("WY£¥CZONE");
					textFieldPom2.setBackground(Color.DARK_GRAY);
					textFieldPom2.setForeground(Color.WHITE);					
				}
				txt1 = textFieldPom1.getText();
				txt2 = textFieldPom2.getText();
				txt3 = textFieldPom3.getText();
				txt4 = textFieldPom4.getText();
				Requests.ustaw(txt1,txt2,txt3,txt4);
				
				try {
					Requests.sendRequest();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPom2.setBounds(228, 43, 150, 150);
		frameMain.getContentPane().add(btnPom2);
		/*^^^^^--------------------------------^^^^^*/
		
		/*<--- PRZYCISK OD POMIESZCZENIA nr3  -->*/		
		JButton btnPom3 = new JButton("POMIESZCZENIE 3");
		btnPom3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPom3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
								
				if ( txt3.equals("WY£¥CZONE")){
					textFieldPom3.setText("W£¥CZONE");
					textFieldPom3.setBackground(Color.orange);
					textFieldPom3.setForeground(Color.BLACK);					
				}
				
				if ( txt3.equals("W£¥CZONE")){
					textFieldPom3.setText("WY£¥CZONE");
					textFieldPom3.setBackground(Color.DARK_GRAY);
					textFieldPom3.setForeground(Color.WHITE);					
				}
				txt1 = textFieldPom1.getText();
				txt2 = textFieldPom2.getText();
				txt3 = textFieldPom3.getText();
				txt4 = textFieldPom4.getText();
				Requests.ustaw(txt1,txt2,txt3,txt4);
				
				try {
					Requests.sendRequest();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});		
		btnPom3.setBounds(409, 43, 150, 150);
		frameMain.getContentPane().add(btnPom3);
		/*^^^^^--------------------------------^^^^^*/
		
		/*vv----- PRZYCISK OD POMIESZCZENIA nr4 -----vv*/
		JButton btnPom4 = new JButton("POMIESZCZENIE 4");
		btnPom4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPom4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				if ( txt4.equals("WY£¥CZONE")){
					textFieldPom4.setText("W£¥CZONE");
					textFieldPom4.setBackground(Color.orange);
					textFieldPom4.setForeground(Color.BLACK);					
				}				
				if ( txt4.equals("W£¥CZONE")){
					textFieldPom4.setText("WY£¥CZONE");
					textFieldPom4.setBackground(Color.DARK_GRAY);
					textFieldPom4.setForeground(Color.WHITE);					
				}
				
				txt1 = textFieldPom1.getText();
				txt2 = textFieldPom2.getText();
				txt3 = textFieldPom3.getText();
				txt4 = textFieldPom4.getText();
				Requests.ustaw(txt1,txt2,txt3,txt4);
				
				try {
					Requests.sendRequest();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPom4.setBounds(581, 43, 150, 150);
		frameMain.getContentPane().add(btnPom4);
		/*^^^^^--------------------------------^^^^^*/
		
		/*vv----- PRZYCISK ZAPALAJ¥CY WSZYSTKIE -----vv*/
		JButton btnZapalWszystkie = new JButton("ZAPAL WSZYSTKIE");
		btnZapalWszystkie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldPom1.setText("W£¥CZONE");
				textFieldPom1.setBackground(Color.orange);
				textFieldPom1.setForeground(Color.BLACK);
				
				textFieldPom2.setText("W£¥CZONE");
				textFieldPom2.setBackground(Color.orange);
				textFieldPom2.setForeground(Color.BLACK);
				
				textFieldPom3.setText("W£¥CZONE");
				textFieldPom3.setBackground(Color.orange);
				textFieldPom3.setForeground(Color.BLACK);
				
				textFieldPom4.setText("W£¥CZONE");
				textFieldPom4.setBackground(Color.orange);
				textFieldPom4.setForeground(Color.BLACK);
				
				txt1 = textFieldPom1.getText();
				txt2 = textFieldPom2.getText();
				txt3 = textFieldPom3.getText();
				txt4 = textFieldPom4.getText();
				Requests.ustaw(txt1,txt2,txt3,txt4);
				
				try {
					Requests.sendRequest();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnZapalWszystkie.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnZapalWszystkie.setBounds(41, 284, 150, 40);
		frameMain.getContentPane().add(btnZapalWszystkie);
		/*^^^^^--------------------------------^^^^^*/
		
		/*vv----- PRZYCISK GASZ¥CY WSZYSTKIE -----vv*/
		JButton btnZgaWszystkie = new JButton("ZGAŒ WSZYSTKIE");
		btnZgaWszystkie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldPom1.setText("WY£¥CZONE");
				textFieldPom1.setBackground(Color.DARK_GRAY);
				textFieldPom1.setForeground(Color.WHITE);
				
				textFieldPom2.setText("WY£¥CZONE");
				textFieldPom2.setBackground(Color.DARK_GRAY);
				textFieldPom2.setForeground(Color.WHITE);
				
				textFieldPom3.setText("WY£¥CZONE");
				textFieldPom3.setBackground(Color.DARK_GRAY);
				textFieldPom3.setForeground(Color.WHITE);
				
				textFieldPom4.setText("WY£¥CZONE");
				textFieldPom4.setBackground(Color.DARK_GRAY);
				textFieldPom4.setForeground(Color.WHITE);
				
				txt1 = textFieldPom1.getText();
				txt2 = textFieldPom2.getText();
				txt3 = textFieldPom3.getText();
				txt4 = textFieldPom4.getText();
				Requests.ustaw(txt1,txt2,txt3,txt4);
				
				try {
					Requests.sendRequest();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnZgaWszystkie.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnZgaWszystkie.setBounds(228, 284, 150, 40);
		frameMain.getContentPane().add(btnZgaWszystkie);
		/*^^^^^--------------------------------^^^^^*/
		
		JButton btnPomoc = new JButton("POMOC");
		btnPomoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Help help = new Help();
				help.helpScreen();				
			}
		});
		btnPomoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPomoc.setBounds(609, 400, 130, 23);
		frameMain.getContentPane().add(btnPomoc);
		
		JButton btnOProgramie = new JButton("O PROGRAMIE");
		btnOProgramie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				About about = new About();
				about.aboutScreen();
			}
		});
		btnOProgramie.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOProgramie.setBounds(609, 434, 130, 23);
		frameMain.getContentPane().add(btnOProgramie);
		
		
		JLabel lblNewLabel = new JLabel("Jacek Cie\u015Blak | 29487");
		lblNewLabel.setBounds(581, 468, 150, 14);
		frameMain.getContentPane().add(lblNewLabel);
		
		JLabel lblMaciejKarol = new JLabel("Maciej Karol | 29687");
		lblMaciejKarol.setBounds(581, 485, 150, 14);
		frameMain.getContentPane().add(lblMaciejKarol);
		
		JLabel lblZdalneSterowanieOwietleniem = new JLabel("ZDALNE STEROWANIE O\u015AWIETLENIEM");
		lblZdalneSterowanieOwietleniem.setBounds(43, 468, 305, 14);
		frameMain.getContentPane().add(lblZdalneSterowanieOwietleniem);
		
		JLabel lblNewLabel_1 = new JLabel("copywright by");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(470, 476, 100, 14);
		frameMain.getContentPane().add(lblNewLabel_1);
		
		JLabel lblWyszaSzkoaInformatyki = new JLabel("Wy\u017Csza Szko\u0142a Informatyki i Umiej\u0119tno\u015Bci w \u0141odzi");
		lblWyszaSzkoaInformatyki.setBounds(43, 485, 335, 14);
		frameMain.getContentPane().add(lblWyszaSzkoaInformatyki);		
	}
}



