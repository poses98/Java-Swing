package Tema_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Tema1_BorderLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema1_BorderLayout frame = new Tema1_BorderLayout();
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
	public Tema1_BorderLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		contentPane.add(comboBox, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		contentPane.add(chckbxNewCheckBox, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton_1);
	}

}
