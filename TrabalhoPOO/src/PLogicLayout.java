import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PLogicLayout {

	private ModuloM03 module;
	private JPanel panel;
	private JTextField answer;
	private JLabel armed;


	private Enigma prol = new PropositionalLogic();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLogicLayout window = new PLogicLayout();
					window.panel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PLogicLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		panel = new JPanel();
		panel.setSize(350, 250);
		panel.setLayout(null);;
		
		JLabel lblNewLabel = new JLabel("Read the sentence below and write the right answer ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(21, 24, 376, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lucas joga basquete se e somente se Arthur joga v\u00F4lei.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setBounds(20, 50, 519, 14);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(13, 44, 314, 1);
		panel.add(separator);
		
		Button confBtt = new Button("Confirm");
		confBtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				module.setEnigma(prol);
				module.incrementNumberExec();
				
				if(answer.getText().equals("Arthur joga volei") || answer.getText().equals("arthur joga volei")
					|| answer.getText().equals("Arthur joga vôlei") || answer.getText().equals("arthur joga vôlei")) {
					
					confBtt.setEnabled(false);
					armed.setForeground(Color.GREEN);
					module.incrementRightAnswers();
					module.setDefused(true);
					armed.setText("Desarmado");
				}
				else {
					module.incrementWrongsAnswers();
					if (module.getWrongAnswers() == 3) {
						confBtt.setVisible(false);
					}
				}
			}
			
		});
		confBtt.setBounds(133, 221, 70, 22);
		panel.add(confBtt);
		
		JLabel ansD = new JLabel("d) Lucas n\u00E3o joga basquete.");
		ansD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ansD.setBounds(22, 149, 196, 14);
		panel.add(ansD);
		
		JLabel ansA = new JLabel("a) Arthur n\u00E3o joga v\u00F4lei.");
		ansA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ansA.setBounds(22, 91, 152, 14);
		panel.add(ansA);
		
		JLabel ansE = new JLabel("e) Arthur joga v\u00F4lei.");
		ansE.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ansE.setBounds(22, 168, 134, 14);
		panel.add(ansE);
		
		JLabel ansB = new JLabel("b) Se Lucas joga basquete, ent\u00E3o Arthur n\u00E3o joga v\u00F4lei.");
		ansB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ansB.setBounds(22, 110, 334, 14);
		panel.add(ansB);
		
		JLabel ansC = new JLabel("c) Lucas n\u00E3o joga basquete e Arthur joga v\u00F4lei.");
		ansC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ansC.setBounds(22, 129, 268, 14);
		panel.add(ansC);
		
		answer = new JTextField();
		answer.setBounds(18, 195, 308, 20);
		panel.add(answer);
		answer.setColumns(10);
		
		armed = new JLabel("Armado");
		armed.setForeground(Color.RED);
		armed.setFont(new Font("Tahoma", Font.BOLD, 11));
		armed.setBounds(285, 6, 77, 14);
		panel.add(armed);
		
		JLabel lblNewLabel_2 = new JLabel(" Ora, Lucas joga basquete ou Arthur joga v\u00F4lei.\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(20, 66, 263, 14);
		panel.add(lblNewLabel_2);
		
		
	}
	public JPanel getJPanel() {
		return this.panel;
	}
}