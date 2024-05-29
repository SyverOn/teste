package projetoBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela5 window = new tela5();
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
	public tela5() {
		initialize();
	
	}
	
	void hack() {
		tela5 window = new tela5();
		window.frame.setVisible(true);
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		banco_de_dados banc = new banco_de_dados();
		banc.conectar();
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVerLogin = new JButton("Ver Lista de Login");
		btnVerLogin.setFont(new Font("SansSerif", Font.BOLD, 18));
		btnVerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				banc.listarLogin();
			}
		});
		btnVerLogin.setBounds(46, 163, 207, 82);
		frame.getContentPane().add(btnVerLogin);
		
		JButton btnNewButton_1 = new JButton("Ver Lista de Cadastro");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				banc.listarCadastro();
			}
		});
		btnNewButton_1.setBounds(379, 163, 207, 82);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("OPÇÕES DE HACKER");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(171, 49, 299, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("OU");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1.setBounds(285, 179, 66, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ESCOLHA ENTRE...");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(226, 112, 181, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela1 tel = new tela1();
				tel.login();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton.setBounds(23, 328, 89, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
