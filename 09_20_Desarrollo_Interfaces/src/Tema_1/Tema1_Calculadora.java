package Tema_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class Tema1_Calculadora extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema1_Calculadora frame = new Tema1_Calculadora();
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
	public Tema1_Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 187, 227, 241);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton button_7 = new JButton("7");
		button_7.setActionCommand(button_7.getText());
		button_7.addActionListener(this);
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setActionCommand(button_8.getText());
		button_8.addActionListener(this);
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setActionCommand(button_9.getText());
		button_9.addActionListener(this);
		panel.add(button_9);
		
		JButton button_4 = new JButton("4");
		button_4.setActionCommand(button_4.getText());
		button_4.addActionListener(this);
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setActionCommand(button_5.getText());
		button_5.addActionListener(this);
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setActionCommand(button_6.getText());
		button_6.addActionListener(this);
		panel.add(button_6);
		
		JButton button_1 = new JButton("1");
		button_1.setActionCommand(button_1.getText());
		button_1.addActionListener(this);
		panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setActionCommand(button_2.getText());
		button_2.addActionListener(this);
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setActionCommand(button_3.getText());
		button_3.addActionListener(this);
		panel.add(button_3);
		
		JButton button_10 = new JButton("");
		panel.add(button_10);
		
		JButton button = new JButton("0");
		button.setActionCommand(button.getText());
		button.addActionListener(this);
		panel.add(button);
		
		JButton button_11 = new JButton("");
		panel.add(button_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(278, 187, 142, 241);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(7, 0, 0, 0));
		
		JButton btnAc = new JButton("AC");
		btnAc.setActionCommand(btnAc.getText());
		btnAc.addActionListener(this);
		panel_1.add(btnAc);
		
		JButton btnDel = new JButton("DEL");
		btnDel.setActionCommand(btnDel.getText());
		btnDel.addActionListener(this);
		panel_1.add(btnDel);
		
		JButton button_15 = new JButton("/");
		button_15.setActionCommand(button_15.getText());
		button_15.addActionListener(this);
		panel_1.add(button_15);
		
		JButton button_14 = new JButton("*");
		button_14.setActionCommand(button_14.getText());
		button_14.addActionListener(this);
		panel_1.add(button_14);
		
		JButton button_13 = new JButton("-");

		button_13.setActionCommand(button_13.getText());
		button_13.addActionListener(this);
		panel_1.add(button_13);
		
		JButton button_12 = new JButton("+");
		button_12.setActionCommand(button_12.getText());
		button_12.addActionListener(this);
		panel_1.add(button_12);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.setActionCommand(btnNewButton.getText());
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setBounds(12, 152, 408, 22);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLog = new JLabel("Log");
		lblLog.setBounds(12, 13, 56, 16);
		contentPane.add(lblLog);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 29, 408, 110);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String num = "";
		switch (e.getActionCommand()) {
		case "AC":
			textField.setText("");
			textArea.setText("");
			break;
		case "DEL":
			String newValue = textField.getText().substring(0, textField.getText().length()-1);
			textField.setText(newValue);
			break;
		case "=":
			try {
				textArea.append(textField.getText()+ " = ");
				num = textField.getText();
				String reg = "\\s*[0-9]+";
				String[] operators = num.split(reg);
				reg = "\\s*[+-/\\*]+";
				String [] op = num.split(reg);
				MakeOp(operators,op);
			}catch (Exception e2) {
				System.out.println("ERROR");
			}
			textField.setText("");
			break;
		default:
			textField.setText(textField.getText() + e.getActionCommand());
			break;
		}
		
	}
	private void MakeOp(String[]op,String[]num) {
		int res = Integer.parseInt(num[0]);
		for (int i = 0; i < op.length; i++) {
			switch (op[i]) {
			case "+":
				res += Integer.parseInt(num[i]);
				break;
			case "-":
				res -= Integer.parseInt(num[i]);
				break;
			case "/":
				res /= Integer.parseInt(num[i]);
				break;
			case "*":
				res *= Integer.parseInt(num[i]);
				break;
			default:
				break;
			}
			System.out.println(res);
		}
		textArea.append(res +"\n");
	}
}
