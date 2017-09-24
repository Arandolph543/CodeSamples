import java.awt.Dimension;
import java.swing.JFrame;
import java.swing.SwingUtilities;

public class JFrameSizeIndividualThread {

	static void displayJFrame() {
		JFrame openedJFrame = new JFrame("JFrame Size Example");
		openedJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		openedJFrame.setPreferredSize(new Dimension(400, 300));
		openedJFrame.pack();
		openedJFrame.setLocationRelativeTo(null);
		openedJFrame.setVisible(true);		
	}
	
	static boolean checkSocket(int portNumber) {
		
		
		
	}	
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				displayJFrame(); 
			}
		});
	}

}
