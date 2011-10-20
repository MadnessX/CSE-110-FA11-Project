import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MarketplaceBackup {
	//initiliazing swing objects
	private JFrame f = new JFrame("Marketplace");
	private JPanel pnlLogin = new JPanel(); //login frame
	private JPanel pnlOptionList = new JPanel(); //option list frame
	private JPanel pnlResultWindow = new JPanel(); //window frame
	
	//making buttons to put in panels
	private JButton btnLogin = new JButton("Login"); //login button
	private JButton btnQuit = new JButton("Quit"); //quit button
	
	//menu
	private JMenuBar mb = new JMenuBar(); //menubar
	private JMenu mnuFile = new JMenu("File"); // File Entry on Menu bar
	private JMenuItem mnuItemQuit = new JMenuItem("Quit"); // Quit sub item
	private JMenu mnuHelp = new JMenu("Help"); // Help Menu entry
	private JMenuItem mnuItemAbout = new JMenuItem("About"); // About Entry
	private final JTextField textField = new JTextField();
	
	/* GUI constructor */
	public MarketplaceBackup(){
		//set menubar
		f.setJMenuBar(mb);
		
		//build menus
		mnuFile.add(mnuItemQuit); //quit line
		mnuHelp.add(mnuItemAbout); //about line
		mb.add(mnuFile); //add menu items
		mb.add(mnuHelp);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[]{116, 63, 55, 0};
		gbl_pnlLogin.rowHeights = new int[]{25, 0};
		gbl_pnlLogin.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLogin.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlLogin.setLayout(gbl_pnlLogin);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		pnlLogin.add(textField, gbc_textField);
		
		//build frame
		f.getContentPane().setLayout(new BorderLayout());
		f.getContentPane().add(pnlLogin, BorderLayout.CENTER);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.SOUTH;
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 0;
		pnlLogin.add(btnLogin, gbc_btnLogin);
		GridBagConstraints gbc_btnQuit = new GridBagConstraints();
		gbc_btnQuit.anchor = GridBagConstraints.SOUTH;
		gbc_btnQuit.gridx = 2;
		gbc_btnQuit.gridy = 0;
		pnlLogin.add(btnQuit, gbc_btnQuit);
		
		//allow swing app to close
		f.addWindowListener(new ListenCloseWdw());
		
		//menu listener
		mnuItemQuit.addActionListener(new ListenMenuQuit());
	}
	
	public class ListenMenuQuit implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	public class ListenCloseWdw extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	
	public void launchFrame(){
		textField.setColumns(10);
		//Display Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack(); //adjust panel to components for display
		f.setVisible(true);
	}
	
	public static void main(String[] args){
		MarketplaceBackup marketplace = new MarketplaceBackup();
		marketplace.launchFrame();
	}
}
