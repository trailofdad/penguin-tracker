import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;


public class gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelSplash = new JPanel();
		frame.getContentPane().add(panelSplash, "name_638199312526200");
		panelSplash.setLayout(null);
		
		JLabel lblHeader = new JLabel("Penguin Tracker v0.01");
		lblHeader.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 30));
		lblHeader.setBounds(148, 91, 383, 87);
		panelSplash.add(lblHeader);
		
		JLabel lblPenguinImg = new JLabel("");
		lblPenguinImg.setBounds(284, 287, 46, 14);
		panelSplash.add(lblPenguinImg);
		
		JPanel panelHome = new JPanel();
		frame.getContentPane().add(panelHome, "name_643662697706850");
		
		JPanel panelTracks = new JPanel();
		frame.getContentPane().add(panelTracks, "name_643683576160058");
		
		JPanel panelAnimalSelect = new JPanel();
		frame.getContentPane().add(panelAnimalSelect, "name_643716753834128");
		
		JPanel panelAddProperties = new JPanel();
		frame.getContentPane().add(panelAddProperties, "name_643746603322670");
	}
}
