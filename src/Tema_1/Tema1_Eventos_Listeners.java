package Tema_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.print.attribute.standard.JobName;
import javax.swing.*;

public class Tema1_Eventos_Listeners extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel,lblRes;
	private JSpinner num1,num2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema1_Eventos_Listeners frame = new Tema1_Eventos_Listeners();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tema1_Eventos_Listeners() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(67, 95, 442, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		num1 = new JSpinner();
		num1.setBounds(193, 278, 200, 22);
		contentPane.add(num1);
		
		num2 = new JSpinner();
		num2.setBounds(193, 313, 200, 22);
		contentPane.add(num2);
		
		
		
		
		//	Button
		JButton btnNewButton = new JButton("PÚLSAME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String labelCont = textField.getText();
				lblNewLabel.setText(labelCont.toLowerCase());
			}
		});
		
		lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(167, 255, 254, 22);
		contentPane.add(lblNewLabel);
		
		btnNewButton.setBounds(217, 153, 132, 48);
		contentPane.add(btnNewButton);
		
		JButton btnSumar = new JButton("SUMAR");
		btnSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSumar.setBounds(430, 296, 97, 25);
		contentPane.add(btnSumar);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(193, 368, 90, 16);
		contentPane.add(lblResultado);
		
		lblRes = new JLabel("");
		lblRes.setBounds(325, 368, 56, 16);
		contentPane.add(lblRes);
		
		
	}
}
