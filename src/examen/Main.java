package examen;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

public class Main implements ActionListener{

	private JFrame frame;
	private JTextField nombreText;
	private JTextField apellidosText;
	private DNI_text DNIText;
	private JTextField cuantiaText;
	private JTextField nomRec;
	private JTextField apellidosRec;
	private JTextArea log;
	private ArrayList<JTextComponent> texts;
	private String divisa;
	private ButtonGroup bgroup;
	private JRadioButton rdEfectivo;
	private JRadioButton rdbtnTarjeta;
	private JRadioButton rdbtnPaypal;
	private DNI_text dni_rec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		texts = new ArrayList<JTextComponent>();
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(37, 40, 298, 289);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//	EMISOR
		JLabel lblEmisor = new JLabel("Emisor");
		lblEmisor.setBounds(0, 13, 298, 28);
		lblEmisor.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblEmisor);
		
		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(10, 44, 93, 16);
		panel.add(nombre);
		
		
		nombreText = new JTextField();
		nombreText.setBounds(98, 41, 188, 22);
		nombreText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				nombreText.setText(nombreText.getText().toUpperCase()); 
				

			}
		});
		panel.add(nombreText);
		nombreText.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 73, 78, 16);
		panel.add(lblApellidos);
		
		apellidosText = new JTextField();
		apellidosText.setColumns(10);
		apellidosText.setBounds(98, 73, 188, 22);
		apellidosText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				apellidosText.setText(apellidosText.getText().toUpperCase()); 
			}	
		});
		panel.add(apellidosText);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 105, 78, 16);
		panel.add(lblDni);
		
		DNIText = new DNI_text();
		DNIText.setColumns(10);
		DNIText.setBounds(98, 102, 188, 22);
		panel.add(DNIText);
		
		
		//	METODO DE PAGO
		JLabel lblMtodo = new JLabel("M\u00E9todo");
		lblMtodo.setBounds(12, 167, 78, 16);
		panel.add(lblMtodo);
		
		rdEfectivo = new JRadioButton("Efectivo");
		rdEfectivo.setBounds(100, 133, 127, 25);
		panel.add(rdEfectivo);
		
		rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setBounds(100, 163, 127, 25);
		panel.add(rdbtnTarjeta);
		
		rdbtnPaypal = new JRadioButton("Paypal");
		rdbtnPaypal.setBounds(100, 193, 127, 25);
		panel.add(rdbtnPaypal);
		
		bgroup = new ButtonGroup();
		bgroup.add(rdbtnPaypal);
		bgroup.add(rdbtnTarjeta);
		bgroup.add(rdEfectivo);
		
		//	CUANTÍA
		JLabel lblCuanta = new JLabel("Cuant\u00EDa");
		lblCuanta.setBounds(10, 230, 78, 16);
		panel.add(lblCuanta);
		
		cuantiaText = new JTextField();
		cuantiaText.setBounds(98, 227, 188, 22);
		panel.add(cuantiaText);
		cuantiaText.setColumns(10);
		
		JLabel lblDivisa = new JLabel("Divisa");
		lblDivisa.setBounds(10, 259, 78, 16);
		panel.add(lblDivisa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dolar estadounidense", "Euro", "Yen japones", "Libra esterlina"}));
		comboBox.setBounds(98, 256, 188, 22);
		panel.add(comboBox);
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	divisa = comboBox.getSelectedItem().toString();
		    }
		});
		divisa = "Dolar estadounidense";
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(372, 40, 298, 160);
		frame.getContentPane().add(panel_1);
		
		//	RECEPTOR
		JLabel lblReceptor = new JLabel("Receptor");
		lblReceptor.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceptor.setBounds(0, 13, 298, 28);
		panel_1.add(lblReceptor);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(10, 54, 93, 16);
		panel_1.add(label_1);
		
		nomRec = new JTextField();
		nomRec.setColumns(10);
		nomRec.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				nomRec.setText(nomRec.getText().toUpperCase()); 
			}	
		});
		nomRec.setBounds(98, 51, 188, 22);
		panel_1.add(nomRec);
		
		JLabel label_2 = new JLabel("Apellidos");
		label_2.setBounds(10, 83, 78, 16);
		panel_1.add(label_2);
		
		apellidosRec = new JTextField();
		apellidosRec.setColumns(10);
		apellidosRec.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				apellidosRec.setText(apellidosRec.getText().toUpperCase()); 
			}	
		});
		apellidosRec.setBounds(98, 83, 188, 22);
		panel_1.add(apellidosRec);
		
		JLabel label_3 = new JLabel("DNI");
		label_3.setBounds(12, 119, 78, 16);
		panel_1.add(label_3);
		
		JButton btnEfectuar = new JButton("EFECTUAR");
		btnEfectuar.setBounds(408, 242, 124, 41);
		btnEfectuar.setActionCommand("Efectuar");
		btnEfectuar.addActionListener(this);
		frame.getContentPane().add(btnEfectuar);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(533, 242, 124, 41);

		btnReset.setActionCommand("Reset");
		btnReset.addActionListener(this);
		frame.getContentPane().add(btnReset);
		
		log = new JTextArea();
		log.setEditable(false);
		log.setBounds(12, 336, 658, 153);
		frame.getContentPane().add(log);
		
		JLabel lblOperacionesEnEuros = new JLabel("Operaciones en Euros");
		lblOperacionesEnEuros.setBounds(529, 315, 141, 16);
		frame.getContentPane().add(lblOperacionesEnEuros);
		
		JButton btnBorrarLog = new JButton("BORRAR");
		btnBorrarLog.setBounds(516, 494, 141, 33);
		btnBorrarLog.setActionCommand("Borrar");
		btnBorrarLog.addActionListener(this);
		frame.getContentPane().add(btnBorrarLog);
		
		dni_rec = new DNI_text();
		dni_rec.setBounds(98, 118, 188, 22);
		panel_1.add(dni_rec);
		
		texts.add(nombreText);
		texts.add(apellidosText);
		texts.add(DNIText);
		texts.add(cuantiaText);
		
		texts.add(nomRec);
		texts.add(apellidosRec);
		texts.add(dni_rec);

		
	
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnTransferencia = new JMenu("Transferencia");
		menuBar.add(mnTransferencia);
		
		JMenuItem mntmEfectuar = new JMenuItem("Efectuar");
		mntmEfectuar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mntmEfectuar.setActionCommand("Efectuar");
		mntmEfectuar.addActionListener(this);
		mnTransferencia.add(mntmEfectuar);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mntmReset.setActionCommand("Reset");
		mntmReset.addActionListener(this);
		mnTransferencia.add(mntmReset);
		
		JMenu menu = new JMenu("Transferencia");
		menuBar.add(menu);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
		mntmBorrar.setActionCommand("Borrar");
		mntmBorrar.addActionListener(this);
		menu.add(mntmBorrar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyuda = new JMenuItem("Conversion de divisas");
		mntmAyuda.setActionCommand("Help");
		mntmAyuda.addActionListener(this);

		mnAyuda.add(mntmAyuda);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			switch(e.getActionCommand()) {
			case "Efectuar":
				sendData();
				break;
			case "Reset":
				resetForm();
	
				break;
			case "Borrar":
				resetLog();
				break;	
			case "Help":
				JOptionPane.showMessageDialog(frame,
					    "TABLA DE DIVISAS:\nDólar estadounidense 0,9\r\n" + 
					    "Euro 1\r\n" + 
					    "Yen japonés 0,0083\r\n" + 
					    "Libra esterlina 1,16");
				break;
			}
			
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(frame,
				    "No se ha podido realizar la transferencia",
				    "Error en transferencia",
				    JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	private void sendData() {
		System.out.println("Gathering data...");
		try {
			String e_nom = texts.remove(0).getText();
			String e_ap = texts.remove(0).getText();
			String e_dni = texts.remove(0).getText();
			double e_cuantia = Integer.parseInt(texts.remove(0).getText());
			switch (divisa) {
			case "Dolar estadounidense":
				e_cuantia *= 0.9;
				break;
			case "Yen japones":
				e_cuantia *= 0.00839;
				break;
			case "Libra esterlina":
				e_cuantia *= 1.16;
				break;
			}
			String metodo = "";
			if(rdbtnPaypal.isSelected()) {
				metodo = "PayPal";
			}else if(rdEfectivo.isSelected()) {
				metodo= "Efectivo";
			}else if(rdbtnTarjeta.isSelected()) {
				metodo = "Tarjeta";
			}
			String r_nom = 	texts.remove(0).getText();
			String r_ap = 	texts.remove(0).getText();
			String r_dni = 	texts.remove(0).getText();
			e_cuantia = Math.round(e_cuantia);
			String data = e_nom + " " + e_ap + " & DNI " + e_dni + ">>" + r_nom + " " + r_ap + " &DNI " + r_dni + " >> " + e_cuantia + "EUROS" + ">> " + metodo;
			log.append(data +"\n");
			JOptionPane.showMessageDialog(frame,
				    "Transferencia efectuada.");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(frame,
				    "Falta algun campo por rellenar!",
				    "Error en transferencia",
				    JOptionPane.ERROR_MESSAGE);
		}
		resetForm();
		
	}

	private void resetLog() {
		System.out.println("reseting log...");
		log.setText("");
	}

	public void resetForm() {
		
		
		System.out.println("reseting form...");
		for(JTextComponent text:texts) {
			text.setText("");
		}
		texts.clear();
		texts.add(nombreText);
		texts.add(apellidosText);
		texts.add(DNIText);
		texts.add(cuantiaText);
		
		texts.add(nomRec);
		texts.add(apellidosRec);
		texts.add(dni_rec);
	}
}
