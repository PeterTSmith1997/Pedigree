import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class Window extends JFrame {
	JButton btnViewMatches;
	private JTextField txtV;
	private String verison = "0.0.1";
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
				c.doComp();
				c.write();
				
			}
		});
		
		JButton btnNewButton = new JButton("view "+c.getFa().substring(0, c.getFa().length()-4));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					c.openFile(c.getFa());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "An errcor happened -- Window 41", "error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(btnNewButton);
	
		JButton btnViewTreeB = new JButton("view "+c.getFb().substring(0, c.getFb().length()-4));
		btnViewTreeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					c.openFile(c.getFb());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "An errcor happened -- Window 54", "error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(btnViewTreeB);
		panel.add(btnCompare);
		
	
		btnViewMatches.setEnabled(false);
		btnViewMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					c.openFile(Compare.getMacthf());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "An errcor happened -- Window 66", "error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(btnViewMatches);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		txtV = new JTextField();
		txtV.setHorizontalAlignment(SwingConstants.TRAILING);
		txtV.setText("Verison " + verison);
		panel_2.add(txtV, BorderLayout.EAST);
		txtV.setColumns(10);
		
	}

}
