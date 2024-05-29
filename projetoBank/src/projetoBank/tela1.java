package projetoBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class tela1 {

	private JFrame frmLOG;
	private JPasswordField SEN;
	private JTextField USU;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnCadastrar;
	private JLabel lblNewLabel_3;
	private JTextField Usuario;
	private JFrame frame;
	private JTextField txt;
	private JPasswordField Senha;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela1 window = new tela1();
					window.frmLOG.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela1() {
		initialize();
	}
	
	void login() {
		tela1 window = new tela1();
		window.frmLOG.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		banco_de_dados banc = new banco_de_dados();
		banc.conectar();
		frmLOG = new JFrame();
		frmLOG.setTitle("L O G I N");
		frmLOG.getContentPane().setBackground(new Color(255, 165, 0));
		frmLOG.getContentPane().setLayout(null);
		frmLOG.setResizable(false);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar senha");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 9));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					SEN.setEchoChar((char) 0);
					//SEN.setVisible(false);
					//textField.setVisible(true);
					
				}else {
					SEN.setEchoChar('\u2022');
					//SEN.setVisible(true);
					//textField.setVisible(false);
				}
			}
		});
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 265, 89, 23);
		frmLOG.getContentPane().add(btnNewButton_2);
		chckbxNewCheckBox.setBounds(288, 171, 97, 23);
		frmLOG.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("< TIO PATINHAS >");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
		lblNewLabel.setBounds(139, 25, 246, 49);
		frmLOG.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String usuário = USU.getText();
			String senha = SEN.getText();
			if (usuário.trim().equals("admin")&&senha.trim().equals("123")) {
				banc.inserirLogin(usuário, senha);
				tela3 tel = new tela3();
				tel.saque();
				frmLOG.dispose();
			}
			else if (usuário.trim().equals("hack")&&senha.trim().equals("000")) {
				
			}
			
			else {
				if (usuário.trim().equals("")&&senha.trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Por favor, forneça o usuário e senha.    ","ERROR",0);
				}
				
				
				
				else {
					JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos.","ERROR",0);
			}
			}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(216, 210, 97, 23);
		frmLOG.getContentPane().add(btnNewButton);
		
		USU = new JTextField();
		USU.setHorizontalAlignment(SwingConstants.CENTER);
		USU.setBounds(139, 93, 246, 25);
		frmLOG.getContentPane().add(USU);
		USU.setColumns(10);
		/*textField = new JTextField();
		textField.setBounds(127, 128, 187, 25);
		
		textField.setColumns(10);*/
		SEN = new JPasswordField();
		SEN.setHorizontalAlignment(SwingConstants.CENTER);
		SEN.setBounds(139, 150, 246, 25);
		frmLOG.getContentPane().add(SEN);
		//frmLOG.getContentPane().add(textField);
		
		
		
		
		
		lblNewLabel_1 = new JLabel("SENHA");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(168, 129, 187, 14);
		frmLOG.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("USUÁRIO");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(168, 71, 187, 25);
		frmLOG.getContentPane().add(lblNewLabel_2);
		
		btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				tela2 tel = new tela2();
				tel.cadastro();
				frmLOG.dispose();
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCadastrar.setBounds(204, 244, 120, 23);
		frmLOG.getContentPane().add(btnCadastrar);
		
		/*JCheckBox btnMostrasenha = new JCheckBox("Mostrar Senha");
		btnMostrasenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(btnMostrasenha.isSelected()) {
					txt.setVisible(true);
					Senha.setVisible(false);
				}else {
					txt.setVisible(false);
					Senha.setVisible(true);
				}
			}
		});
		btnMostrasenha.setBounds(285, 130, 97, 23);
		frame.getContentPane().add(btnMostrasenha);
		*/
		/*JCheckBox btnMostrasenha = new JCheckBox("New check box");
		btnMostrasenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (btnMostrasenha.isSelected()) {
				txt.setVisible(true);
				SEN.setVisible(false);
			}
			else {
				txt.setVisible(false);
				SEN.setVisible(true);
			}
			}
		});
		btnMostrasenha.setBounds(284, 176, 97, 23);
		frmLOG.getContentPane().add(btnMostrasenha);
		*/
		lblNewLabel_3 = new JLabel("Esqueceu a senha?");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(new Color(128, 128, 128));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_3.setBounds(139, 175, 120, 14);
		frmLOG.getContentPane().add(lblNewLabel_3);
		frmLOG.setBounds(100, 100, 545, 338);
		frmLOG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela4 tel = new tela4();
				tel.rec();
				frmLOG.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255,255, 150));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBounds(139, 175, 109, 14);
		frmLOG.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\tela1.jpeg"));
		lblNewLabel_5.setBounds(-180, 0, 981, 299);
		frmLOG.getContentPane().add(lblNewLabel_5);
		
		
		
		
		
		
		
	}
}