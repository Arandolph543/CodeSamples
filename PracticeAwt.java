

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
// import javax.swing.JTextArea;

import javax.swing.GroupLayout;

import java.io.*;
import java.io.Serializable;

import java.util.*;

import java.lang.*;

public class PracticeAwt extends JComponent implements ActionListener {
	static private JFrame frame;
	static private JPanel panel;
	static private JLabel label;
	static private JLabel listenerLabel;
	static private JScrollBar scrollbar;
	static private JButton button;
	
	public PracticeAwt() {
		GroupLayout layout = (GroupLayout) getLayout();
		super.setLayout(layout);
		System.out.println(this.toString());
		button = new JButton("Add a button");
		button.setActionCommand("ADD");
		button.addActionListener(this);
		
		label = new JLabel("Cavity may be prevented if you start to smile to look at me.");
		label.setSize(new Dimension(4,1));
		label.setVisible(true);
		//Label to tell what event movement is happening to the ScrollBar
		listenerLabel = new JLabel("");
		listenerLabel.setSize(new Dimension(2,1));
		listenerLabel.setVisible(true);
		
		// jcomponent.getHorizontalGroup(jcomponent.
			// createSequentialGroup()
				// .addComponent(label)
				// .addGroup(jcomponent.createParallelGroup(GroupLayout.Alignment.LEADING)
					// .addComponent(button))
		// );
		
		scrollbar = new JScrollBar(1);
		scrollbar.addComponentListener(new ComponentListener() {
			public void componentHidden(ComponentEvent ce) {
				//
			}
			public void componentShown(ComponentEvent ce) {
				//
			}
			public void componentResized(ComponentEvent ce) {
				//
			}
			public void componentMoved(ComponentEvent ce) {
				listenerLabel.setText(ce.toString());
			}
		});
		panel = new JPanel(layout);
		panel.add(label);
		panel.add(button);
		panel.setPreferredSize(new Dimension(200, 85));
		panel.addContainerListener(this);

		System.out.println("Debugging" );		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Event Performed is " + e.toString());
		frame.setVisible(false);
		frame.addContainerListerner(new WindowAdapter() {
			public void closeWindow(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	static public void createGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		frame = new JFrame("Placement to Create Informative Elements");
		frame.setSize(400,400);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent newPane = new PracticeAwt();
		frame.setContentPane(newPane);
		frame.pack();
		frame.setVisible(true);
	}
			
	//Element to create the ActionListener that it will be attached to	
	public static void main(String[] args) {
		PracticeAwt pa = new PracticeAwt();
		pa.createGUI();
	}	
	
}
