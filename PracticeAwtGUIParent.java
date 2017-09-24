

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class PracticeAwt extends JPanel {
	static private JFrame frame;
	static private JPanel panel;
	static private JLabel label;
	static private JScrollBar scrollbar;
	static private JButton button;
	static private JComponent jcomponent;
	
	public PracticeAwt() {
		// jcomponent.setHorizontalGroup(jcomponent.
			// createSequentialGroup()
				// .addComponent(label)
				// .addGroup(jcomponent.createParallelGroup(GroupLayout.Alignment.LEADING)
					// .addComponent(button))
		// );
		jcomponent = (GroupLayout) getLayout();
		GroupLayout gl = new GroupLayout(jcomponent);
		panel.setLayout(gl);
		jcomponent = GroupLayout.Constraints(true);
		
		button = new JButton("Add a button");
		button.setActionCommand("ADD");
		button.setActionListener(this);
		
		label = new JLabel("Cavity may be prevented if you start to smile to look at me.");
		label.setEditable(false);
		label.setVisible(true);
		
		scrollbar = new JScrollBar(1);
		scrollbar.setEnabled(true);
		// scrollbar.setOrientation(
		
		panel = new JPanel(gl);
		panel.add(label);
		panel.add(button);
		panel.setLayout(panel);
		panel.setPreferredSize(new Dimension(200, 85));
		panel.addContainerListerner(this);

		System.out.println("Debugging" );		
		
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
