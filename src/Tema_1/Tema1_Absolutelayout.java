package Tema_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class Tema1_Absolutelayout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Tema1_Absolutelayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(28, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(93, 32, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Apellido:");
		label.setBounds(28, 66, 46, 14);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 63, 180, 20);
		contentPane.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(293, 31, 109, 54);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBounds(0, 0, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("Mujer");
		radioButton.setBounds(0, 31, 109, 23);
		panel_1.add(radioButton);
		
		ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnNewRadioButton);
        bgroup.add(radioButton);
		
		JLabel lblNewLabel_1 = new JLabel("PA\u00CDS");
		lblNewLabel_1.setBounds(28, 115, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ESPA\u00D1A", "PORTUGAL"}));
		comboBox.setBounds(93, 112, 86, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MADRID", "NAVARRA"}));
		comboBox_1.setBounds(293, 112, 86, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblRegin = new JLabel("REGI\u00D3N");
		lblRegin.setBounds(228, 115, 46, 14);
		contentPane.add(lblRegin);
		
		JLabel lblNewLabel_2 = new JLabel("Elige el o los tipo/s de transporte que toma para ir a trabajar:");
		lblNewLabel_2.setBounds(39, 163, 340, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 198, 224, 44);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 3, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Moto");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Coche");
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Metro");
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bus");
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("A pie");
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Other");
		panel.add(chckbxNewCheckBox_5);
	}
}
