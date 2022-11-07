package br.com.biometric.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.biometric.ctr.Indice;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPrincipal {

	private JFrame frame;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	private JTextField textFieldIMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPrincipal window = new FormPrincipal();
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
	public FormPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o seu peso:");
		lblNewLabel.setBounds(27, 67, 116, 32);
		panel.add(lblNewLabel);
		
		JLabel lblDigiteASua = new JLabel("Digite a sua altura:");
		lblDigiteASua.setBounds(27, 121, 116, 32);
		panel.add(lblDigiteASua);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(166, 71, 82, 25);
		panel.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setColumns(10);
		textFieldAltura.setBounds(166, 125, 82, 25);
		panel.add(textFieldAltura);
		
		JButton btnNewButton = new JButton("Calcular");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Indice imc = new Indice(Float.parseFloat(textFieldPeso.getText()),
						Float.parseFloat(textFieldAltura.getText()), 0);
				
				String resultado = Float.toString(imc.calculaIMC());
				textFieldIMC.setText(resultado);
			}
		});
		btnNewButton.setBounds(163, 169, 85, 21);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Seu IMC é:");
		lblNewLabel_1.setBounds(60, 226, 67, 25);
		panel.add(lblNewLabel_1);
		
		textFieldIMC = new JTextField();
		textFieldIMC.setBounds(163, 229, 74, 19);
		panel.add(textFieldIMC);
		textFieldIMC.setColumns(10);
	}
}
