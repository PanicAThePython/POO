import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfUF;
	private JTextField tfRenda;
	private JLabel lblResposta;
	private Contribuinte[] vetor = new Contribuinte[100];
	private ArrayList <Contribuinte> lista = new ArrayList<>();
	private int index = 0;
	private JTextField tfConsulta;
	private JTextField tfCPFConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
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
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 13, 55, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCPF.setBounds(10, 38, 46, 14);
		frame.getContentPane().add(lblCPF);
		
		JLabel lblUF = new JLabel("UF");
		lblUF.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUF.setBounds(10, 63, 46, 14);
		frame.getContentPane().add(lblUF);
		
		JLabel lblRenda = new JLabel("Renda Anual");
		lblRenda.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRenda.setBounds(10, 88, 102, 14);
		frame.getContentPane().add(lblRenda);
		
		tfNome = new JTextField();
		tfNome.setBounds(103, 11, 86, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(103, 38, 86, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		tfUF = new JTextField();
		tfUF.setBounds(103, 63, 86, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		tfRenda = new JTextField();
		tfRenda.setBounds(103, 86, 86, 20);
		frame.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte c = new Contribuinte();
				c.setNome(tfNome.getText());
				c.setCpf(tfCPF.getText());
				c.setUf(tfUF.getText());
				c.setRendaAnual(Double.parseDouble(tfRenda.getText()));
				lista.add(c);
				//vetor[index] = c;
				//index++;
				lblResposta.setText("O valor do imposto de "+ c.getNome()+" é "+ c.calcularImposto());
			}
		});
		btnOK.setBounds(232, 85, 89, 23);
		frame.getContentPane().add(btnOK);
		
		lblResposta = new JLabel("");
		lblResposta.setBounds(10, 131, 396, 14);
		frame.getContentPane().add(lblResposta);
		
		JLabel lblNewLabel = new JLabel("Valor a Consultar (R$)");
		lblNewLabel.setBounds(10, 196, 126, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfConsulta = new JTextField();
		tfConsulta.setBounds(142, 193, 86, 20);
		frame.getContentPane().add(tfConsulta);
		tfConsulta.setColumns(10);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double valor = Double.parseDouble(tfConsulta.getText());
				String msg = "Os contribuintes que pagam mais de "+ valor+" são: \n";
				for (int i = 0; i < lista.size(); i++) {
					double imposto = lista.get(i).calcularImposto();
					if (imposto > valor) {
						msg+=lista.get(i).getNome() + " , CPF "+ lista.get(i).getCpf() +" , paga R$"+ imposto+"\n";
					}
				}
				
				//mostrar janela com a mensagem --> ver em aula gravada como fazer
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnConsulta.setBounds(232, 192, 89, 23);
		frame.getContentPane().add(btnConsulta);
		
		JButton btnVerifUF = new JButton("Verificar Estados");
		btnVerifUF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double somaSC = 0, somaPR = 0, somaRS = 0;
				int qtdSC = 0, qtdPR = 0, qtdRS = 0;
				for(int i = 0; i < lista.size(); i++) {
					if (lista.get(i).getUf() == "SC") {
						somaSC+= lista.get(i).calcularImposto();
						qtdSC++;
					}
					else if (lista.get(i).getUf() == "PR") {
						somaPR+= lista.get(i).calcularImposto();
						qtdPR++;
					}
					else if (lista.get(i).getUf() == "RS") {
						somaRS+= lista.get(i).calcularImposto();
						qtdRS++;
					}
				}
				double resultSC = (somaSC/qtdSC);
				double resultRS = (somaRS/qtdRS);
				double resultPR = (somaPR/qtdPR);
				
				String msg = "Porcentagem de SC:"+resultSC+"\n" + "Porcentagem de PR:"
				+ resultPR +"\n"+ "POrcentagem de RS:"+ resultRS;
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnVerifUF.setBounds(10, 162, 138, 23);
		frame.getContentPane().add(btnVerifUF);
		
		JLabel lblNewLabel_1 = new JLabel("CPF a Consultar");
		lblNewLabel_1.setBounds(10, 221, 102, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCPFConsulta = new JTextField();
		tfCPFConsulta.setBounds(142, 218, 86, 20);
		frame.getContentPane().add(tfCPFConsulta);
		tfCPFConsulta.setColumns(10);
		
		JButton btnConsCPF = new JButton("Verificar");
		btnConsCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean var = false;
				for (int i = 0; i < lista.size(); i++) {
					if (tfCPFConsulta.getText().contentEquals(lista.get(i).getCpf())) {
						var = true;
						JOptionPane.showMessageDialog(null, lista.get(i).toString());
						break;
					}
				}
				if (!var) {
					JOptionPane.showMessageDialog(null, "CPF não encontrado!");
				}
			}
		});
		btnConsCPF.setBounds(232, 217, 89, 23);
		frame.getContentPane().add(btnConsCPF);
	}
}
