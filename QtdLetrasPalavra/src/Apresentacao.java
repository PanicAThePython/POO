import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfFrase;
	private TextArea textArea;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite uma frase: ");
		lblNewLabel.setBounds(10, 11, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfFrase = new JTextField();
		tfFrase.setBounds(129, 8, 284, 20);
		frame.getContentPane().add(tfFrase);
		tfFrase.setColumns(10);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 75, 403, 160);
		frame.getContentPane().add(textArea);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frase umaFrase = new Frase(tfFrase.getText()+ " ");
				String[] palavra = umaFrase.dividirFrase();
				textArea.setText("A frase é "+tfFrase.getText()+"\n");
				for (int i = 0; i < palavra.length; i++) {
					if (palavra[i]==null) {
						break;
					}else {
						textArea.append("\n"+palavra[i]+"-"+palavra[i].length());
					}
				}
			}
		});
		btnOK.setBounds(10, 36, 89, 23);
		frame.getContentPane().add(btnOK);
	}
}
