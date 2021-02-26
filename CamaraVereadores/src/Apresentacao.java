import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

	private Camara camara = new Camara("Blumenau");
	private Partido pesquisado;

	/**
	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jtfNumPartido = new javax.swing.JTextField();
		jtfNomePartido = new javax.swing.JTextField();
		jbCadastrarPartido = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jtfNomeVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				pesquisado = camara.getPartido(Integer.parseInt(jtfNumPartidoVereador.getText()));
				String msg;
				boolean existe;
				if (pesquisado == null) {
					msg = "Número não encontrado";
					existe = false;
				} else {
					msg = pesquisado.getNome();
					existe = true;
				}
				jlNomePartido.setText(msg);
				jbCadastrarVereador.setEnabled(existe);
			}
		});

		jlNomePartido = new javax.swing.JLabel();
		jtfQtdProjApres = new javax.swing.JTextField();
		jtfQtdProjAprov = new javax.swing.JTextField();
		jbCadastrarVereador = new javax.swing.JButton();
		jbCadastrarVereador.setEnabled(false);
		jPanel3 = new javax.swing.JPanel();
		jbMenorDesempenho = new javax.swing.JButton();
		jbMenorDesempenho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador menor = camara.getVereadorMenorDesempenho();
				String msg;
				if (menor == null) {
					msg = "Não há vereadores cadastrados";
				} else {
					msg = "Menor desempenho: " + menor.getNome() + " do partido " + menor.getPartido().getNome()
							+ " está com desempenho " + menor.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jbMaisProjetos = new javax.swing.JButton();
		jbMaisProjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador mais = camara.getVereadorMaisProjAprov();
				String msg;
				if (mais == null) {
					msg = "Não há vereadores cadastrados";
				} else {
					msg = "Menor desempenho: " + mais.getNome() + " do partido " + mais.getPartido().getNome()
							+ " está com desempenho " + mais.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jbEstatisticas = new javax.swing.JButton();
		jbEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jbTotalProjetos = new javax.swing.JButton();
		jbVereadoresAcimaMedia = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jbCadastrarPartido.setText("Cadastrar");
		jbCadastrarPartido.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jbCadastrarPartido)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNomePartido, javax.swing.GroupLayout.PREFERRED_SIZE,
														177, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jtfNomePartido,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jbCadastrarPartido).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jLabel5.setText("Quantidade de projetos apresentados:");

		jLabel6.setText("aprovados:");

		jbCadastrarVereador.setText("Cadastrar");
		jbCadastrarVereador.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jtfNomeVereador, javax.swing.GroupLayout.PREFERRED_SIZE, 264,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jtfNumPartidoVereador, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(
												jlNomePartido, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel6).addComponent(jLabel5))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jtfQtdProjApres, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
														Short.MAX_VALUE)
												.addComponent(jtfQtdProjAprov)))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(132, 132, 132)
										.addComponent(jbCadastrarVereador)))
						.addContainerGap(63, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jtfNomeVereador,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(jtfNumPartidoVereador, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jlNomePartido, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jtfQtdProjApres,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jtfQtdProjAprov,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27).addComponent(jbCadastrarVereador).addGap(70, 70, 70)));

		jTabbedPane1.addTab("Vereador", jPanel2);

		jbMenorDesempenho.setText("Vereador menor desempenho");

		jbMaisProjetos.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jbEstatisticas.setText("Estatísticas do partido");

		jbTotalProjetos.setText("Total de projetos da Câmara");
		jbTotalProjetos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jbVereadoresAcimaMedia.setText("Vereadores acima da média");
		jbVereadoresAcimaMedia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator1)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jbEstatisticas)
										.addGap(0, 41, Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jbMenorDesempenho).addComponent(jbMaisProjetos)
								.addComponent(jbTotalProjetos).addComponent(jbVereadoresAcimaMedia))
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbEstatisticas)).addGap(13, 13, 13)
								.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jbMenorDesempenho).addGap(18, 18, 18).addComponent(jbMaisProjetos)
								.addGap(18, 18, 18).addComponent(jbTotalProjetos).addGap(18, 18, 18)
								.addComponent(jbVereadoresAcimaMedia).addContainerGap(45, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addGap(28, 28, 28)));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Partido partido = new Partido();
		partido.setNome(jtfNomePartido.getText());
		partido.setNumero(Integer.parseInt(jtfNumPartido.getText()));
		camara.addPartido(partido);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Vereador vereador = new Vereador(jtfNomeVereador.getText());
			vereador.setQtdProjApres(Integer.parseInt(jtfQtdProjApres.getText()));
			vereador.setQtdProjAprov(Integer.parseInt(jtfQtdProjAprov.getText()));
			pesquisado.addVereador(vereador);
			String msg = "Vereador " + vereador.getNome() + " do partido " + vereador.getPartido().getNome()
					+ " com desempenho " + vereador.getDesempenho();
			JOptionPane.showMessageDialog(this, msg);
		}
		catch(IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(this, iae.getMessage());
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "CÂMARA\n\nTotal de projetos apresentados: " + camara.getTotProjApres()
				+ "\nTotal de projetos aprovados:" + camara.getTotProjAprov();
		JOptionPane.showMessageDialog(this, msg);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "Vereadores acima da média:" + camara.getDesempenhoMedioCamara();
		ArrayList<Vereador> lista = camara.getVereadoresAcimaMediaDesempenho();
		for (Vereador v : lista) {
			msg += "\nVereador " + v.getNome() + " do partido " + v.getPartido().getNome() + " com desempenho "
					+ v.getDesempenho();
		}
		JOptionPane.showMessageDialog(this, msg);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jbCadastrarPartido;
	private javax.swing.JButton jbCadastrarVereador;
	private javax.swing.JButton jbMenorDesempenho;
	private javax.swing.JButton jbMaisProjetos;
	private javax.swing.JButton jbEstatisticas;
	private javax.swing.JButton jbTotalProjetos;
	private javax.swing.JButton jbVereadoresAcimaMedia;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jlNomePartido;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jtfNumPartido;
	private javax.swing.JTextField jtfNomePartido;
	private javax.swing.JTextField jtfNomeVereador;
	private javax.swing.JTextField jtfNumPartidoVereador;
	private javax.swing.JTextField jtfQtdProjApres;
	private javax.swing.JTextField jtfQtdProjAprov;
	private javax.swing.JTextField jTextField7;
}