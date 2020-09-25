import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JTextField tfTitle;
	private JTextField tfAuthor;
	private JTextField tfParecerista;
	private JTextField tfDate;
	private JTextField tfContent;
	private JTextField tfConsult;
	private HashMap <String, Obra> obras = new HashMap<>();
	private Obra obraAtual;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
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
		
		JLabel lblNewLabel = new JLabel("Titulo da Obra:");
		lblNewLabel.setBounds(10, 31, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfTitle = new JTextField();
		tfTitle.setBounds(113, 28, 138, 20);
		frame.getContentPane().add(tfTitle);
		tfTitle.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Autor:");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfAuthor = new JTextField();
		tfAuthor.setBounds(113, 59, 138, 20);
		frame.getContentPane().add(tfAuthor);
		tfAuthor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Parecerista:");
		lblNewLabel_2.setBounds(10, 109, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfParecerista = new JTextField();
		tfParecerista.setBounds(113, 106, 138, 20);
		frame.getContentPane().add(tfParecerista);
		tfParecerista.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data:");
		lblNewLabel_3.setBounds(10, 139, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfDate = new JTextField();
		tfDate.setBounds(113, 137, 138, 20);
		frame.getContentPane().add(tfDate);
		tfDate.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Conteudo:");
		lblNewLabel_4.setBounds(10, 175, 79, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfContent = new JTextField();
		tfContent.setBounds(113, 172, 138, 20);
		frame.getContentPane().add(tfContent);
		tfContent.setColumns(10);
		
		JButton btnCad = new JButton("Cadastrar Obra");
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obraAtual = new Obra(tfTitle.getText(), tfAuthor.getText());
				if(obras.containsKey(obraAtual.getTitulo())) {
					JOptionPane.showMessageDialog(null, "A obra já foi cadastrada anteriormente");
				}else {
					obras.put(obraAtual.getTitulo(), obraAtual);
					JOptionPane.showMessageDialog(null, "A obra foi cadastrada");
				}
			}
		});
		btnCad.setBounds(286, 58, 138, 23);
		frame.getContentPane().add(btnCad);
		
		JButton btnAdd = new JButton("Adicionar Parecer");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parecer p = new Parecer(tfParecerista.getText(), LocalDate.parse(tfDate.getText(), formatter), tfContent.getText());
				if(obraAtual.setParecer(p)) {
					obraAtual.setParecer(p);
					JOptionPane.showMessageDialog(null, "Parecer adicionado");
				}else {
					JOptionPane.showMessageDialog(null, "Atingiu o limite de pareceres!");
				}
			}
		});
		btnAdd.setBounds(286, 171, 138, 23);
		frame.getContentPane().add(btnAdd);
		
		tfConsult = new JTextField();
		tfConsult.setBounds(113, 230, 138, 20);
		frame.getContentPane().add(tfConsult);
		tfConsult.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Titulo:");
		lblNewLabel_5.setBounds(10, 233, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnConsult = new JButton("Consultar");
		btnConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (obras.containsKey(tfConsult.getText())) {
					JOptionPane.showMessageDialog(null, obras.get(tfConsult.getText()));
				}else {
					JOptionPane.showMessageDialog(null, "Obra não cadastrada");
				}
			}
		});
		btnConsult.setBounds(286, 229, 138, 23);
		frame.getContentPane().add(btnConsult);
	}
}
