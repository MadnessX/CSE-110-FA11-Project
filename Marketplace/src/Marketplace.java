import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Marketplace {
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
	
	/* GUI constructor */
	public Marketplace(){
		//set menubar
		f.setJMenuBar(mb);
		
		//build menus
		mnuFile.add(mnuItemQuit); //quit line
		mnuHelp.add(mnuItemAbout); //about line
		mb.add(mnuFile); //add menu items
		mb.add(mnuHelp);
		
		//add butons
		pnlLogin.add(btnLogin);
		pnlLogin.add(btnQuit);
		
		//build frame
		f.getContentPane().setLayout(new BorderLayout());
		f.getContentPane().add(pnlLogin, BorderLayout.CENTER);
		
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
		//Display Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack(); //adjust panel to components for display
		f.setVisible(true);
	}
	
	public static void main(String[] args){
		Marketplace marketplace = new Marketplace();
		marketplace.launchFrame();
	}
}
