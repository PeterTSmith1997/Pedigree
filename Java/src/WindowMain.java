import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class WindowMain extends JFrame{
	private final JButton btnCompareFiles = new JButton("Compare files");
	ArrayList<String> matchesD = new ArrayList<String>();
	private JTextPane Matchs = new JTextPane();
	private Compare worker = new Compare();
	public WindowMain() {
		setSize(new Dimension(490, 355));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblWelcone = new JLabel("Welcone");
		lblWelcone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWelcone.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblWelcone);
		
		JLabel lblPossableMatchs = new JLabel("Possable matchs");
		lblPossableMatchs.setHorizontalAlignment(SwingConstants.CENTER);
		lblPossableMatchs.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblPossableMatchs);
		lblPossableMatchs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel buttons = new JPanel();
		getContentPane().add(buttons, BorderLayout.EAST);
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		btnCompareFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				worker.readFiles();
				worker.loop();
				worker.write();
			}
		});
		
		buttons.add(btnCompareFiles);
		
		JPanel Matchesp = new JPanel();
		getContentPane().add(Matchesp, BorderLayout.CENTER);
		Matchesp.setLayout(new BorderLayout(0, 0));
		
		JTextArea Matches = new JTextArea();
		Matchesp.add(Matches, BorderLayout.CENTER);
		
		Matchs.setPreferredSize(new Dimension(250, 250));
		Matchs.setEditable(false);
		
	}

}
