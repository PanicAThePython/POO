import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario {

	private JFrame frame;
	private JTextField tfSolt;
	private JTextField tfSobrenome;
	private JTextField tfNome;
	private JTextField tfCidade;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
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
		
		JLabel lblNewLabel = new JLabel("Seu Primeiro Nome");
		lblNewLabel.setBounds(10, 11, 132, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seu Sobrenome");
		lblNewLabel_1.setBounds(10, 36, 90, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("O Sobrenome de Solteira da sua M\u00E3e");
		lblNewLabel_2.setBounds(10, 61, 191, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("A Cidade Onde Nasceste");
		lblNewLabel_3.setBounds(10, 86, 156, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfSolt = new JTextField();
		tfSolt.setBounds(211, 58, 86, 20);
		frame.getContentPane().add(tfSolt);
		tfSolt.setColumns(10);
		
		tfSobrenome = new JTextField();
		tfSobrenome.setBounds(211, 33, 86, 20);
		frame.getContentPane().add(tfSobrenome);
		tfSobrenome.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setBounds(211, 8, 86, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(211, 83, 86, 20);
		frame.getContentPane().add(tfCidade);
		tfCidade.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] respostas = new String[3];
				respostas[0] = tfNome.getText() + " " + tfSobrenome.getText();
				respostas[1] = tfSolt.getText(); 
				respostas[2] = tfCidade.getText();
				
				String nomeJedi = NameGenerator.generateStarWarsName(respostas);
				
				JOptionPane.showMessageDialog(null, nomeJedi);
			}
		});
		btnEnviar.setBounds(335, 82, 89, 23);
		frame.getContentPane().add(btnEnviar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(52, 166, 328, 14);
		frame.getContentPane().add(lblResposta);
	}

}
