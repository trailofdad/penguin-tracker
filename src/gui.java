import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;


public class gui {
	
	private int count = 0;
	
	private Penguin trackPenguin = new Penguin();
	private Sealion trackSealion = new Sealion();
	private Walrus trackWalrus = new Walrus();

	private ImageIcon penguin = new ImageIcon("src/penguin.png");
	private JFrame frame;
	private JTextField txtfSex;
	private JTextField txtfWeight;
	private JTextField txtfOption;
	private JTextField txtfLat0;
	private JTextField txtfLong0;
	private JTextField txtfLat1;
	private JTextField txtfLong1;
	private JTextField txtfLat2;
	private JTextField txtfLong2;
	private JPanel panelSplash = new JPanel();
	private JLabel lblHeader = new JLabel("Penguin Tracker v0.1");
	private JLabel lblPenguinImg = new JLabel((Icon) null);
	private JButton btnStartTracking = new JButton("Start Tracking");
	private JPanel panelHome = new JPanel();
	private JButton btnNewTrack = new JButton("New Track");
	private JButton btnLoadTrack = new JButton("Load Track");
	private JPanel panelTracks = new JPanel();
	private JLabel lblChoose = new JLabel("Select a Track:");
	private JTextArea txtaProperties = new JTextArea();
	private JLabel lblProperties = new JLabel("Properties:");
	private JSeparator separator_1 = new JSeparator();
	private JButton btnBack = new JButton("Back");
	private JPanel panelAnimalSelect = new JPanel();
	private JLabel lblSelectAnimalType = new JLabel("Select animal type:");
	private JComboBox cbxAnimalType = new JComboBox();
	private JButton btnCreateTrack = new JButton("Create Track");
	private JPanel panelAddProperties = new JPanel();
	private JLabel lblSex = new JLabel("Sex (male/female):");
	private JLabel lblWeight = new JLabel("Weight (lbs):");
	private JLabel lblOption = new JLabel("Blood Pressure:");
	private JSeparator separator = new JSeparator();
	private JLabel lblLat = new JLabel("Lat:");
	private JLabel lblLong = new JLabel("Long:");
	private JLabel lblEnterSets = new JLabel("Enter 3 sets of coordinates (for testing only):");
	private JButton btnSaveTrack = new JButton("Save Track");
	private JComboBox<String> cbxSelectTrack = new JComboBox();

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
		
		
		frame.getContentPane().add(panelSplash, "name_693423574120474");
		panelSplash.setLayout(null);
		
		
		lblHeader.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 30));
		lblHeader.setBounds(152, 11, 383, 87);
		panelSplash.add(lblHeader);
		
		
		lblPenguinImg.setBounds(198, 87, 301, 350);
		panelSplash.add(lblPenguinImg);
		lblPenguinImg.setIcon(penguin);
		btnStartTracking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelSplash.setVisible(false);
				panelTracks.setVisible(false);
				panelAnimalSelect.setVisible(false);
				panelAddProperties.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		
		
		btnStartTracking.setFont(new Font("Source Sans Pro", Font.PLAIN, 18));
		btnStartTracking.setBounds(260, 469, 174, 41);
		panelSplash.add(btnStartTracking);
		
		
		frame.getContentPane().add(panelHome, "name_693423580355738");
		panelHome.setLayout(null);
		btnNewTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSplash.setVisible(false);
				panelTracks.setVisible(false);
				panelAnimalSelect.setVisible(true);
				panelAddProperties.setVisible(false);
				panelHome.setVisible(false);
			}
		});
		
		
		btnNewTrack.setFont(new Font("Myriad Pro", Font.PLAIN, 65));
		btnNewTrack.setBounds(160, 93, 370, 134);
		panelHome.add(btnNewTrack);
		btnLoadTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSplash.setVisible(false);
				panelTracks.setVisible(true);
				panelAnimalSelect.setVisible(false);
				panelAddProperties.setVisible(false);
				panelHome.setVisible(false);
			}
		});
		
		
		btnLoadTrack.setFont(new Font("Myriad Pro", Font.PLAIN, 65));
		btnLoadTrack.setBounds(160, 295, 370, 134);
		panelHome.add(btnLoadTrack);
		
		
		frame.getContentPane().add(panelTracks, "name_693423586300018");
		panelTracks.setLayout(null);
		
		
		lblChoose.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblChoose.setBounds(70, 26, 138, 35);
		panelTracks.add(lblChoose);
		txtaProperties.setWrapStyleWord(true);
		txtaProperties.setLineWrap(true);
		
		
		txtaProperties.setBounds(262, 283, 302, 168);
		panelTracks.add(txtaProperties);
		
		
		lblProperties.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblProperties.setBounds(70, 277, 138, 35);
		panelTracks.add(lblProperties);
		
		
		separator_1.setBounds(70, 243, 522, 2);
		panelTracks.add(separator_1);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSplash.setVisible(false);
				panelTracks.setVisible(false);
				panelAnimalSelect.setVisible(false);
				panelAddProperties.setVisible(false);
				panelHome.setVisible(true);
			}
		});
		
		
		btnBack.setFont(new Font("Source Sans Pro", Font.PLAIN, 18));
		btnBack.setBounds(253, 478, 174, 41);
		panelTracks.add(btnBack);
		cbxSelectTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 readFile();				
				
			}
		});
		
		
		cbxSelectTrack.setBounds(262, 27, 302, 35);
		panelTracks.add(cbxSelectTrack);
		
		
		frame.getContentPane().add(panelAnimalSelect, "name_693423592387237");
		panelAnimalSelect.setLayout(null);
		
		
		lblSelectAnimalType.setFont(new Font("Source Sans Pro", Font.PLAIN, 32));
		lblSelectAnimalType.setBounds(200, 108, 271, 73);
		panelAnimalSelect.add(lblSelectAnimalType);
		
		
		cbxAnimalType.setModel(new DefaultComboBoxModel(new String[] {"Penguin", "Sea Lion", "Walrus"}));
		cbxAnimalType.setFont(new Font("Source Sans Pro", Font.PLAIN, 26));
		cbxAnimalType.setBounds(200, 216, 265, 50);
		panelAnimalSelect.add(cbxAnimalType);
		btnCreateTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSplash.setVisible(false);
				panelTracks.setVisible(false);
				panelAnimalSelect.setVisible(false);
				panelAddProperties.setVisible(true);
				panelHome.setVisible(false);
				
				clearForm();
				
				setOption();
				
				
			}
		});
		
		
		btnCreateTrack.setFont(new Font("Source Sans Pro", Font.PLAIN, 18));
		btnCreateTrack.setBounds(244, 339, 174, 41);
		panelAnimalSelect.add(btnCreateTrack);
		
		
		frame.getContentPane().add(panelAddProperties, "name_693423598469351");
		panelAddProperties.setLayout(null);		
		
		lblSex.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblSex.setBounds(42, 42, 239, 32);
		panelAddProperties.add(lblSex);		
		
		lblWeight.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblWeight.setBounds(42, 97, 239, 26);
		panelAddProperties.add(lblWeight);		
		
		lblOption.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblOption.setBounds(42, 152, 224, 26);
		panelAddProperties.add(lblOption);
		
		txtfSex = new JTextField();
		txtfSex.setBounds(291, 43, 195, 32);
		panelAddProperties.add(txtfSex);
		txtfSex.setColumns(10);
		
		txtfWeight = new JTextField();
		txtfWeight.setColumns(10);
		txtfWeight.setBounds(291, 91, 195, 32);
		panelAddProperties.add(txtfWeight);
		
		txtfOption = new JTextField();
		txtfOption.setColumns(10);
		txtfOption.setBounds(291, 146, 195, 32);
		panelAddProperties.add(txtfOption);		
		
		separator.setBounds(42, 210, 593, 2);
		panelAddProperties.add(separator);
		
		txtfLat0 = new JTextField();
		txtfLat0.setBounds(113, 308, 179, 32);
		panelAddProperties.add(txtfLat0);
		txtfLat0.setColumns(10);
		
		txtfLong0 = new JTextField();
		txtfLong0.setColumns(10);
		txtfLong0.setBounds(371, 308, 179, 32);
		panelAddProperties.add(txtfLong0);
		
		txtfLat1 = new JTextField();
		txtfLat1.setColumns(10);
		txtfLat1.setBounds(113, 362, 179, 32);
		panelAddProperties.add(txtfLat1);
		
		txtfLong1 = new JTextField();
		txtfLong1.setColumns(10);
		txtfLong1.setBounds(371, 362, 179, 32);
		panelAddProperties.add(txtfLong1);
		
		txtfLat2 = new JTextField();
		txtfLat2.setColumns(10);
		txtfLat2.setBounds(113, 425, 179, 32);
		panelAddProperties.add(txtfLat2);
		
		txtfLong2 = new JTextField();
		txtfLong2.setColumns(10);      
		txtfLong2.setBounds(371, 425, 179, 32);
		panelAddProperties.add(txtfLong2);		
		
		lblLat.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblLat.setBounds(113, 279, 71, 26);
		panelAddProperties.add(lblLat);		
		
		lblLong.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblLong.setBounds(371, 279, 71, 26);
		panelAddProperties.add(lblLong);
		
		
		lblEnterSets.setFont(new Font("Source Sans Pro", Font.PLAIN, 20));
		lblEnterSets.setBounds(144, 236, 387, 32);
		panelAddProperties.add(lblEnterSets);
		btnSaveTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setProperties();			
				
				
				panelSplash.setVisible(false);
				panelTracks.setVisible(false);
				panelAnimalSelect.setVisible(false);
				panelAddProperties.setVisible(false);
				panelHome.setVisible(true);
				
				
				
			}
		});
		
		
		btnSaveTrack.setFont(new Font("Source Sans Pro", Font.PLAIN, 18));
		btnSaveTrack.setBounds(249, 489, 174, 41);
		panelAddProperties.add(btnSaveTrack);
	}
	
	
	public void saveFile(String species, String sex, String weight, String option, String[] lat, String[] lon){
		
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("tracks/Track"+String.valueOf(count)+".txt"), "utf-8"));
		    writer.write("Species: "+species);
		    ((BufferedWriter) writer).newLine();
		    writer.write("Sex: "+sex);
		    ((BufferedWriter) writer).newLine();
		    writer.write("Weight: "+weight);
		    ((BufferedWriter) writer).newLine();
		    writer.write("Option: "+option);
		    ((BufferedWriter) writer).newLine();
		    writer.write("coordinates: "+lat[0]+", "+lon[0]+" / "+lat[1]+", "+lon[1]+" / "+lat[2]+", "+lon[2]);
		    JOptionPane.showMessageDialog(null, "Track " +String.valueOf(count) +" Has Been Saved. Write this track number down.");
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
		
		
		cbxSelectTrack.addItem("Track"+String.valueOf(count)+".txt");
		
		
		count++;
		
	}
	
	public void clearForm(){
		txtfSex.setText("");
		txtfWeight.setText("");
		txtfOption.setText("");
		txtfLat1.setText("");
		txtfLat2.setText("");
		txtfLat0.setText("");
		txtfLong0.setText("");
		txtfLong1.setText("");
		txtfLong2.setText("");
	}
	
	public void setOption(){
		String animal = cbxAnimalType.getSelectedItem().toString();
		
		if(animal == "Penguin"){
			
			lblOption.setText("Blood Pressure(##.#):");
		}
		else if(animal == "Sea Lion"){
			
			lblOption.setText("# of Spots (Integer):");
		}
		else if(animal == "Walrus"){
			
			lblOption.setText("Dental Health (good/avg/poor):");
		}
	}
	
	
	//READ FILE METHOD
	//reads the file and sets the text to a variables, which gets set to text area "Properties"
	public void readFile(){
		 try(BufferedReader br = new BufferedReader(new FileReader("tracks/"+(String) cbxSelectTrack.getSelectedItem()))) {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append(System.lineSeparator());
		            line = br.readLine();
		        }
		        String everything = sb.toString();
		        txtaProperties.setText(everything);
		    
		  } 
		  
		  catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//SET PROPERTIES METHOD
	//set the properties input based on animal selection
	public void setProperties() {
		String animal = cbxAnimalType.getSelectedItem().toString();
		String sex = txtfSex.getText();
		String weight = txtfWeight.getText();
		
		// Validation goes here for forms
		if(validateString(sex) == true && isDouble(weight)) {
			
		
		
		String[] lat = {txtfLat0.getText(), txtfLat1.getText(), txtfLat2.getText()};
		String[] lon = {txtfLong0.getText(), txtfLong1.getText(), txtfLong2.getText()};
		
		if(animal == "Penguin"){
			trackPenguin.setSex(sex);
			trackPenguin.setWeight(Double.parseDouble(weight));
			trackPenguin.setBloodPressure(Double.parseDouble(txtfOption.getText()));
			trackPenguin.animalTracker.setLatitude(lat);
			trackPenguin.animalTracker.setLongitude(lon);
			saveFile(animal, sex, String.valueOf(weight), txtfOption.getText(), lat, lon);
		}
		else if(animal == "Sea Lion"){
			trackSealion.setSex(sex);
			trackSealion.setWeight(Double.parseDouble(weight));
			trackSealion.setNumSpots(Integer.parseInt(txtfOption.getText()));
			trackSealion.animalTracker.setLatitude(lat);
			trackSealion.animalTracker.setLongitude(lon);
			saveFile(animal, sex, String.valueOf(weight), txtfOption.getText(), lat, lon);
			
		}
		else if(animal == "Walrus"){
			trackWalrus.setSex(sex);
			trackWalrus.setWeight(Double.parseDouble(weight));
			trackWalrus.setDentalHealth(txtfOption.getText());
			trackWalrus.animalTracker.setLatitude(lat);
			trackWalrus.animalTracker.setLongitude(lon);
			saveFile(animal, sex, weight, txtfOption.getText(), lat, lon);
			
		}
		}
		else {
			JOptionPane.showMessageDialog(null, "validation issue!");
		}
	}
	
	private boolean isDouble(String weight) {
		 try {
		        Double.parseDouble(weight);
		        return true;
		    } catch (NumberFormatException e) {
		    	JOptionPane.showMessageDialog(null, "Double not double!");
		    	return false;
		    }
		
	}

	public boolean validateString(String input) {
		
		String regex = "[a-zA-Z0-9]\\w*";

		if (input.matches(regex)) {
		    return true;
		}
		
		JOptionPane.showMessageDialog(null, "String not valid!");
		return false;
		
	}
	
	public boolean validateCoord(String input) {
		
		String regex = "[a-zA-Z0-9]\\w*";

		if (input.matches(regex)) {
		    return true;
		}
		
		JOptionPane.showMessageDialog(null, "String not valid!");
		return false;
		
	}

}
