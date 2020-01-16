package tema_8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

public class Registro_actividades implements ActionListener{

	private JFrame frame;
	private JTextField txtregistro;
	private JTextField textNombre;
	private JTextField txtApellido;
	private DNI dni;
	private JTextField txtCP;
	private JTextField txtDir;
	private JTextField txtArticulo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ArrayList<Registro> registros = new ArrayList<Registro>();
	private JPanel panel;
	private JRadioButton rdEnviado;
	private JRadioButton rdPendiente;
	private JComboBox continente;
	private JComboBox pais;
	private JComboBox ciudad;
	private JComboBox listar;
	private List list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro_actividades window = new Registro_actividades();
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
	public Registro_actividades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 553, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 275, 439);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setBounds(10, 11, 95, 26);
		panel.add(lblRegistro);
		
		txtregistro = new JTextField();
		txtregistro.setEditable(false);
		txtregistro.setBounds(115, 14, 150, 20);
		panel.add(txtregistro);
		txtregistro.setColumns(10);
	
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(115, 48, 150, 20);
		panel.add(textNombre);
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 Character c = e.getKeyChar();
	                if(Character.isLetter(c)) {
	                    e.setKeyChar(Character.toUpperCase(c));
	                }if (Character.isDigit(c)) {
	                	e.consume();
	                }
			}
		});
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 45, 95, 26);
		panel.add(lblNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(115, 82, 150, 20);
		panel.add(txtApellido);
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 Character c = e.getKeyChar();
	                if(Character.isLetter(c)) {
	                    e.setKeyChar(Character.toUpperCase(c));
	                }if (Character.isDigit(c)) {
	                	e.consume();
	                }
			}
		});
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 79, 95, 26);
		panel.add(lblApellido);
		
		dni = new DNI();
		dni.setColumns(10);
		
		dni.setBounds(115, 116, 150, 20);
		panel.add(dni);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 113, 95, 26);
		panel.add(lblDni);
		
		txtCP = new JTextField();
		txtCP.setColumns(10);
		txtCP.setBounds(115, 150, 150, 20);
		panel.add(txtCP);
		txtCP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Character c = e.getKeyChar();
				if(txtCP.getText().length() < 5) {
	                if (!Character.isDigit(c)) {
	                	e.consume();
	                }
				}else {
					e.consume();
				}
			}
		});
		
		JLabel lblCp = new JLabel("CP");
		lblCp.setBounds(10, 147, 95, 26);
		panel.add(lblCp);
		
		JLabel lblContinente = new JLabel("Continente");
		lblContinente.setBounds(10, 181, 95, 26);
		panel.add(lblContinente);
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setBounds(10, 215, 95, 26);
		panel.add(lblPas);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(10, 249, 95, 26);
		panel.add(lblCiudad);
		
		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(115, 286, 150, 20);
		panel.add(txtDir);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(10, 283, 95, 26);
		panel.add(lblDireccin);
		
		txtArticulo = new JTextField();
		txtArticulo.setColumns(10);
		txtArticulo.setBounds(115, 320, 150, 20);
		panel.add(txtArticulo);
		
		JLabel lblArtculo = new JLabel("Art\u00EDculo");
		lblArtculo.setBounds(10, 317, 95, 26);
		panel.add(lblArtculo);
		
		JLabel label_9 = new JLabel("Registro");
		label_9.setBounds(10, 365, 95, 26);
		panel.add(label_9);
		
		rdEnviado = new JRadioButton("Enviado");
		rdEnviado.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdEnviado);
		rdEnviado.setBounds(115, 348, 109, 23);
		panel.add(rdEnviado);
		
		rdPendiente = new JRadioButton("Pendiente");
		rdPendiente.setSelected(true);
		rdPendiente.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdPendiente);
		rdPendiente.setBounds(115, 381, 109, 23);
		panel.add(rdPendiente);
		
		continente = new JComboBox();
		continente.setBounds(115, 184, 150, 20);
		panel.add(continente);
		
		pais = new JComboBox();
		pais.setBounds(115, 218, 150, 20);
		panel.add(pais);
		
		ciudad = new JComboBox();
		ciudad.setBounds(115, 252, 150, 20);
		panel.add(ciudad);
		
		continente.setModel(new DefaultComboBoxModel(new PaisesGestor().getContinentes()));
		
		continente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pais.setModel(new DefaultComboBoxModel(new PaisesGestor().getPaises(continente.getSelectedIndex())));
				pais.setSelectedIndex(0);
			}
		});
		
		pais.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ciudad.setModel(new DefaultComboBoxModel<String>(new PaisesGestor().getCiudades(continente.getSelectedIndex(), pais.getSelectedIndex())));
				ciudad.setSelectedIndex(0);
			}
			
		});
		continente.setSelectedIndex(0);
		pais.setSelectedIndex(0);

		
		JButton btnNew = new JButton("Nuevo Registro");
		btnNew.setBounds(10, 465, 275, 30);
		btnNew.setActionCommand("New");
		btnNew.addActionListener(this);
		frame.getContentPane().add(btnNew);
		
		JButton btnUpdate = new JButton("Actualizar Resgistros");
		btnUpdate.setBounds(10, 502, 275, 30);
		btnUpdate.setActionCommand("Update");
		btnUpdate.addActionListener(this);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnRemove = new JButton("Eliminar Registro");
		btnRemove.setBounds(10, 542, 275, 30);
		btnRemove.setActionCommand("Remove");
		btnRemove.addActionListener(this);
		frame.getContentPane().add(btnRemove);
		
		list = new List();
		list.setBounds(291, 11, 236, 538);
		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SetSelectedItem();
			}
		});
		
		frame.getContentPane().add(list);
		
		JLabel lblListar = new JLabel("Listar:");
		lblListar.setBounds(301, 558, 46, 14);
		frame.getContentPane().add(lblListar);
		
		listar = new JComboBox();
		listar.setModel(new DefaultComboBoxModel(new String[] {"TODOS", "ENVIADOS", "PENDIENTES"}));
		listar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UpdateList();
			}

			
			
		});
		listar.setBounds(357, 555, 170, 20);
		frame.getContentPane().add(listar);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNuevo.setActionCommand("New");
		mntmNuevo.addActionListener(this);
		mnRegistro.add(mntmNuevo);
		
		JMenuItem mntmActualizar = new JMenuItem("Actualizar");
		mntmActualizar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mntmActualizar.setActionCommand("Update");
		mntmActualizar.addActionListener(this);
		mnRegistro.add(mntmActualizar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mntmEliminar.setActionCommand("Remove");
		mntmEliminar.addActionListener(this);
		mnRegistro.add(mntmEliminar);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mntmHelp.setActionCommand("Help");
		mntmHelp.addActionListener(this);
		mnHelp.add(mntmHelp);
		
		NuevoRegistro();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "New":
			NuevoRegistro();
			break;
		case "Update":
			try {
				GuardarRegistro();
			} catch (Exception e1) {
				GuardarRegistro();
			}
			break;
		case "Remove":
			try {
			RemoveItem();
			}catch(Exception c) {
				RemoveItem();
			}
			NuevoRegistro();
			break;
		case "Help":
			ShowHelp();
			break;
		default:
			break;
		}
		
	}
	private void ShowHelp() {
		JOptionPane.showMessageDialog(panel, "Rellena todos los campos antes de darle a actualizar o el registro"
				+ " no se efectuará.\nDebes completar el campo DNI con información real.", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
		
	}

	private void NuevoRegistro() {
		int val = (int) Math.floor(Math.random()*1000000000);
		
		for(Component com : panel.getComponents()) {
			if(com instanceof JTextField) {
				((JTextField) com).setText("");
			}
		}
		dni.SetFalse();
		txtregistro.setText("REG-".concat(String.valueOf(val)));
		
	}

	

	private void GuardarRegistro() {
		boolean check = true;
		for(Component com : panel.getComponents()) {
			if(com instanceof JTextField) {
				if(com.equals("")) {
					check = false;
				}
			}
		}
		if(!dni.getCheck()) {
			check = false;
		}
		for(Component com : panel.getComponents()) {
			if(com instanceof JComboBox) {
				if(((JComboBox) com).getSelectedIndex() == -1) {
					check = false;
				}
			}
		}
		if(check) {
			System.out.println("Llenando registros...");
			
			boolean enviado = true;
			if(rdPendiente.isSelected()) {
				enviado = false;
			}
			int cont = 0;
			int bueno;
			for(Registro reg : registros) {
				cont++;
				if(txtregistro.getText().equals(reg.getRegistro())) {
					registros.remove(reg);
				}
			}
			registros.add(new Registro(txtregistro.getText(), textNombre.getText(), txtApellido.getText(), dni.getText()
					, txtCP.getText(),continente.getSelectedItem().toString(), pais.getSelectedItem().toString(), ciudad.getSelectedItem().toString()
					, txtDir.getText(),txtArticulo.getText(),enviado));
			NuevoRegistro();
			UpdateList();
		}else {
			JOptionPane.showMessageDialog(panel, "Revisa los campos.", "Error al insertar", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void UpdateList() {
		list.removeAll();
		if(listar.getSelectedItem().toString().equals("TODOS")) {
			for(Registro reg :  registros) {
				list.add(reg.getRegistro());
			}
		}
		if(listar.getSelectedItem().toString().equals("ENVIADOS")) {
			for(Registro reg :  registros) {
				if(reg.isEnviado())
					list.add(reg.getRegistro());
			}
		}
		if(listar.getSelectedItem().toString().equals("PENDIENTES")) {
			for(Registro reg :  registros) {
				if(!reg.isEnviado())
					list.add(reg.getRegistro());
			}
		}
	}
	private void SetSelectedItem() {
		for(Registro reg :  registros) {
			if(reg.getRegistro().equals(list.getSelectedItem())) {
				txtregistro.setText(reg.getRegistro()); 
				textNombre.setText(reg.getNombre()); 
				txtApellido.setText(reg.getApellidos()); 
				dni.setText(reg.getDni());
				dni.Check();
				txtCP.setText(reg.getCp());
				continente.setSelectedItem(reg.getContinente());
				txtDir.setText(reg.getDireccion());
				txtArticulo.setText(reg.getArticulo());
				if(reg.isEnviado()) {
					rdEnviado.setSelected(true);
				}else {
					rdPendiente.setSelected(true);
				}
			}
		}
	}
	private void RemoveItem() {
		for(Registro reg :  registros) {
			if(reg.getRegistro().equals(list.getSelectedItem())) {
				registros.remove(reg);
			}
		}
		UpdateList();
	}
}
