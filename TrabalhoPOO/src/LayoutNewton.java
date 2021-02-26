import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LayoutNewton {

	private JPanel panel;
	private JTextField tf252;
	private JTextField tf84;
	private JTextField tf84_2;
	private JTextField tf45;
	private JTextField tf56;
	private JTextField tf15;
	private JTextField tf15_2;
	private JTextField tf20;
	
	private boolean isArmed = true;


	private Enigma lr = new LogicalReasoning();
	private JLabel lblWarning;
	private ModuloM03 module;


	/**
	 * Create the application.
	 */
	public LayoutNewton() {
		initialize();
	}

	/**
	 * Initialize the contents of the panel.
	 */
	private void initialize() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(350, 250);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel.setBounds(87, 85, 15, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("6");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(112, 86, 15, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("15");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(137, 86, 23, 20);
		lblNewLabel_2.setVisible(false);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("20");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(170, 86, 29, 20);
		lblNewLabel_3.setVisible(false);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("15");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(209, 86, 29, 20);
		lblNewLabel_4.setVisible(false);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(248, 86, 15, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(268, 86, 15, 20);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(72, 109, 15, 23);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("7");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(97, 110, 29, 21);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("21");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(122, 111, 29, 21);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("35");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(154, 112, 29, 21);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("35");
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(189, 112, 23, 21);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("21");
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_5_1.setBounds(229, 111, 23, 21);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("7");
		lblNewLabel_6_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1.setBounds(258, 112, 15, 21);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("1");
		lblNewLabel_6_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1.setBounds(278, 112, 29, 21);
		panel.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("1");
		lblNewLabel_7_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_7_1.setBounds(53, 134, 11, 23);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("8");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(84, 135, 11, 21);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("28");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(107, 135, 21, 21);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("56");
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(137, 135, 29, 21);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("70");
		lblNewLabel_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(172, 135, 23, 21);
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("56");
		lblNewLabel_5_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_5_1_1.setBounds(209, 135, 29, 21);
		lblNewLabel_5_1_1.setVisible(false);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("28");
		lblNewLabel_6_1_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_2.setBounds(240, 135, 29, 21);
		panel.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("8");
		lblNewLabel_6_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1.setBounds(269, 135, 15, 21);
		panel.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("1");
		lblNewLabel_6_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_1.setBounds(289, 135, 15, 21);
		panel.add(lblNewLabel_6_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("1");
		lblNewLabel_7_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_7_1_1.setBounds(34, 157, 15, 23);
		panel.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("9");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(67, 158, 15, 21);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("36");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(91, 158, 29, 21);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lbl84 = new JLabel("84");
		lbl84.setFont(new Font("Dialog", Font.PLAIN, 16));
		lbl84.setBounds(123, 158, 23, 21);
		lbl84.setVisible(false);
		panel.add(lbl84);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("126");
		lblNewLabel_4_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1.setBounds(149, 158, 29, 21);
		panel.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("126");
		lblNewLabel_5_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_5_1_1_1.setBounds(182, 158, 41, 21);
		panel.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("84");
		lblNewLabel_6_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_2_1.setBounds(218, 158, 29, 21);
		lblNewLabel_6_1_2_1.setVisible(false);
		panel.add(lblNewLabel_6_1_2_1);
		
		JLabel lblNewLabel_6_1_1_1_2 = new JLabel("36");
		lblNewLabel_6_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_2.setBounds(255, 158, 29, 21);
		panel.add(lblNewLabel_6_1_1_1_2);
		
		JLabel lblNewLabel_6_1_1_1_1_1 = new JLabel("9");
		lblNewLabel_6_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_1_1.setBounds(283, 158, 20, 21);
		panel.add(lblNewLabel_6_1_1_1_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1_2 = new JLabel("1");
		lblNewLabel_6_1_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_1_2.setBounds(302, 158, 29, 21);
		panel.add(lblNewLabel_6_1_1_1_1_2);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("1");
		lblNewLabel_7_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_7_1_1_1.setBounds(16, 182, 15, 23);
		panel.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("10");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(44, 182, 30, 21);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("45");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_1.setBounds(73, 183, 25, 21);
		lblNewLabel_2_1_1_1_1.setVisible(false);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("120");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_3_1_1_1_1.setBounds(101, 183, 29, 21);
		panel.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("210");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_1.setBounds(139, 183, 27, 21);
		panel.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("252");
		lblNewLabel_5_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_5_1_1_1_1.setBounds(171, 183, 41, 21);
		lblNewLabel_5_1_1_1_1.setVisible(false);
		panel.add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_6_1_2_1_1 = new JLabel("210");
		lblNewLabel_6_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_2_1_1.setBounds(209, 183, 34, 21);
		panel.add(lblNewLabel_6_1_2_1_1);
		
		JLabel lblNewLabel_6_1_1_1_2_1 = new JLabel("120");
		lblNewLabel_6_1_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_2_1.setBounds(240, 183, 41, 21);
		panel.add(lblNewLabel_6_1_1_1_2_1);
		
		JLabel lblNewLabel_6_1_1_1_1_1_1 = new JLabel("45");
		lblNewLabel_6_1_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_1_1_1.setBounds(270, 183, 29, 21);
		panel.add(lblNewLabel_6_1_1_1_1_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1_2_1 = new JLabel("1");
		lblNewLabel_6_1_1_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_1_2_1.setBounds(312, 183, 29, 21);
		panel.add(lblNewLabel_6_1_1_1_1_2_1);
		
		JLabel lblNewLabel_6_1_1_1_1_2_1_1 = new JLabel("10");
		lblNewLabel_6_1_1_1_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1_1_1_1_2_1_1.setBounds(291, 183, 29, 21);
		panel.add(lblNewLabel_6_1_1_1_1_2_1_1);
		
		final BlinkLabel lblArmed = new BlinkLabel("ARMED");
		lblArmed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblArmed.setForeground(Color.RED);
		lblArmed.setBounds(216, 1, 133, 14);
		panel.add(lblArmed);
		
		tf252 = new JTextField();
		tf252.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf252.setBounds(167, 183, 39, 20);
		panel.add(tf252);
		tf252.setColumns(10);
		
		tf84 = new JTextField();
		tf84.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf84.setBounds(119, 158, 27, 20);
		panel.add(tf84);
		tf84.setColumns(10);
		
		tf84_2 = new JTextField();
		tf84_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf84_2.setColumns(10);
		tf84_2.setBounds(217, 158, 34, 20);
		panel.add(tf84_2);
		
		tf45 = new JTextField();
		tf45.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf45.setColumns(10);
		tf45.setBounds(72, 183, 28, 20);
		panel.add(tf45);
		
		tf56 = new JTextField();
		tf56.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf56.setColumns(10);
		tf56.setBounds(164, 137, 34, 20);
		panel.add(tf56);
		
		tf15 = new JTextField();
		tf15.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf15.setColumns(10);
		tf15.setBounds(100, 88, 29, 20);
		panel.add(tf15);
		
		tf15_2 = new JTextField();
		tf15_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf15_2.setColumns(10);
		tf15_2.setBounds(167, 88, 34, 20);
		panel.add(tf15_2);
		
		tf20 = new JTextField();
		tf20.setFont(new Font("Dialog", Font.PLAIN, 16));
		tf20.setColumns(10);
		tf20.setBounds(133, 88, 29, 20);
		panel.add(tf20);
		
		JLabel lblNewLabel_8 = new JLabel("Newton's Binomial Theorem");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_8.setBounds(23, 19, 307, 32);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Fill in the blanks with the correct numbers");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8_1.setBounds(21, 55, 305, 32);
		panel.add(lblNewLabel_8_1);
		
		JTextField[] tfArr = {tf15, tf15_2, tf20, tf252, tf45, tf56, tf84, tf84_2};
		int[] tfAnswers = {15, 15, 20, 252, 45, 56, 84, 84};
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				module.setEnigma(lr);
				module.incrementNumberExec();
				
				boolean emptyTfExists = false;
				
				for (JTextField tf : tfArr) {
					if (tf.getText().isEmpty()) {
						emptyTfExists = true;
					}
				}
				
				if (!emptyTfExists) {
					boolean textsAreNumbers = true;
					boolean answersAreRight = true;
					
					for (int i = 0; i < tfArr.length; i++) {
						try {
							if (Integer.parseInt(tfArr[i].getText()) != tfAnswers[i]) {
								answersAreRight = false;
								
							}
						}
						catch (Exception ex) {
							textsAreNumbers = false;
						}
					}
					
					if (answersAreRight && textsAreNumbers) {
						module.incrementRightAnswers();
						module.setDefused(true);
						isArmed = false;
						lblArmed.setText("UNARMED");
						lblArmed.setBlinking(false);
						lblArmed.setForeground(Color.GREEN);
						lblArmed.setArmed(isArmed);
						btnConfirm.setVisible(false);

					}
					
					else if (!textsAreNumbers) {
						lblWarning.setText("Invalid numbers");
						lblWarning.setVisible(true);
					}
					
					else {
						module.incrementWrongAnswers();
					}
				
				}
				else {
					lblWarning.setText("Incomplete fields");
					lblWarning.setVisible(true);
				}
				
			}
		});
		btnConfirm.setBounds(142, 207, 89, 23);
		panel.add(btnConfirm);
		
		lblWarning = new JLabel("Warnings");
		lblWarning.setForeground(Color.RED);
		lblWarning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWarning.setBounds(20, 229, 234, 19);
		lblWarning.setVisible(false);
		panel.add(lblWarning);
		}
	
	public JPanel getJPanel() {
		return this.panel;
	}
	}

