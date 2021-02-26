import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela {

	private JPanel panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private Enigma pl = new PredicateLogic();
	private JLabel enigmaStatus;
	


	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}
	
	public JPanel getJPanel() {
		return this.panel;
	}

	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(350, 250);
		
		JLabel lblNewLabel = new JLabel("Choose the equivalent answer:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 36, 338, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nem todo fumante \u00E9 b\u00EAbado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 288, 14);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("(\u2200x)(bebado(x)^fumante(x))");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 68, 237, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("(\u2203x)(fumante(x)^bebado(x))");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 108, 190, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u00AC(\u2203x)(fumante(x)^bebado(x))");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(10, 152, 209, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("(\u2200x)(bebado(x)^\u00ACfumante(x))");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(10, 194, 225, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				module.setEnigma(pl);
				module.incrementNumberExec();
				
				if (rdbtnNewRadioButton_1.isSelected()) {
					enigmaStatus.setText("DESARMADA");
					enigmaStatus.setForeground(Color.GREEN);
					module.incrementRightAnswers();
					module.setDefused(true);
					btnOK.setVisible(false);
				}
				else {
					module.incrementWrongsAnswers();
					if (module.getWrongAnswers() == 3) {
						btnOK.setVisible(false);
						JOptionPane.showMessageDialog(panel, "BOOM!!");
					}
					else {
						JOptionPane.showMessageDialog(panel, "Você errou");
					}
				}
			}
		});
		btnOK.setBounds(251, 216, 89, 23);
		panel.add(btnOK);
		
		enigmaStatus = new JLabel("ARMADA");
		enigmaStatus.setForeground(Color.RED);
		enigmaStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		enigmaStatus.setBounds(255, 11, 115, 14);
		panel.add(enigmaStatus);
	}

}
