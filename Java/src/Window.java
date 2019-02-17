import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
	JButton btnViewMatches;
	public Window() {
		setTitle("Pedigree compare");
		setSize(new Dimension(200, 200));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Compare c = new Compare();
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton btnViewMatches = new JButton("View Matches");	
		JButton btnCompare = new JButton("Compare");
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnViewMatches.setEnabled(true);
				c.readFiles();
				c.loop();
				c.write();
				
			}
		});
		
		JButton btnNewButton = new JButton("View tree A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openFile("a.txt");
			}
		});
		panel.add(btnNewButton);
		
		JButton btnViewTreeB = new JButton("View tree B");
		btnViewTreeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openFile("b.txt");
			}
		});
		panel.add(btnViewTreeB);
		panel.add(btnCompare);
		
	
		btnViewMatches.setEnabled(false);
		btnViewMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openFile("match.txt");
			}
		});
		panel.add(btnViewMatches);
		
	}

}
