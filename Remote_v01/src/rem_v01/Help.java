package rem_v01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Help {

	public JFrame frameHelp;

	/**
	 * Launch the application.
	 */
	public void helpScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
					window.frameHelp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frameHelp = new JFrame();
		frameHelp.getContentPane().setBackground(Color.GRAY);
		frameHelp.getContentPane().setLayout(null);
		
		JLabel lblKlikajcNa = new JLabel("1) Klikaj\u0105c na poszczeg\u00F3lne pomieszczenia zapalasz lub gasisz \u015Bwiat\u0142o");
		lblKlikajcNa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKlikajcNa.setBounds(23, 25, 537, 30);
		frameHelp.getContentPane().add(lblKlikajcNa);
		frameHelp.setTitle("ZDALNE STEROWANIE O\u015AWIETLENIEM - POMOC");
		frameHelp.setBounds(100, 100, 600, 400);
	}
}
