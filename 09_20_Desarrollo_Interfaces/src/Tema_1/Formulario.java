package Tema_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Button;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Formulario extends JFrame implements ActionListener{


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private int it=0;
	private ArrayList<JTextComponent> texts;
	private ArrayList<JCheckBox> checks;
	private ArrayList<JRadioButton> radio;
	private ArrayList<Persona_form> personas;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JButton btnLimpiar;
	private ButtonGroup bgroup;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JLabel lblNuevaEntrada;
	private JLabel index_count;
	private String ruta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		String[] comunidades_esp = {"Andalucía", "Aragón", "Canarias", "Cantabria", "Castilla y León", "Castilla-La Mancha", "Cataluña", "Ceuta", "Comunidad Valenciana", "Comunidad de Madrid", "Extremadura", "Galicia", "Islas Baleares", "La Rioja", "Melilla", "Navarra", "País Vasco", "Principado de Asturias", "Región de Murcia"};
		String[] comunidades_por = {"Lisbon", "Porto", "Vila Nova de Gaia", "Braga", "Amadora", "Queluz", "Funchal", "Coimbra", "Setúbal", "Agualva-Cacém", "Almada", "Rio Tinto", "Aveiro", "Viseu", "Odivelas", "Leiria", "Guimarães", "Barreiro", "Évora", "Faro", "Portimão and Ponta Delgada"};
		
		ruta = "";
		texts = new ArrayList<JTextComponent>();
		checks = new ArrayList<JCheckBox>();
		radio = new ArrayList<JRadioButton>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(12, 35, 62, 14);
		contentPane.add(lblNewLabel);
		
		//	Nombre
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				textField.setText(textField.getText().toUpperCase()); 
}
		});
		textField.setToolTipText("");
		textField.setBounds(93, 32, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		texts.add(textField);
		
		JLabel label = new JLabel("Apellido:");
		label.setBounds(12, 66, 62, 14);
		contentPane.add(label);
		//	Apellido
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				textField_1.setText(textField_1.getText().toUpperCase()); 
}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(93, 63, 180, 20);
		contentPane.add(textField_1);
		texts.add(textField_1);

		

		textField_1.setText(textField_1.getText().toUpperCase());	
		
		
		JPanel genre_group = new JPanel();
		genre_group.setBounds(293, 31, 109, 54);
		contentPane.add(genre_group);
		genre_group.setLayout(null);
		
		//	Género
		rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBounds(0, 0, 109, 23);
		genre_group.add(rdbtnNewRadioButton);
		
		radioButton = new JRadioButton("Mujer");
		radioButton.setBounds(0, 31, 109, 23);
		genre_group.add(radioButton);
		
		radio.add(rdbtnNewRadioButton);
		radio.add(radioButton);
		
		bgroup = new ButtonGroup();
        bgroup.add(rdbtnNewRadioButton);
        bgroup.add(radioButton);
		
		JLabel lblNewLabel_1 = new JLabel("PA\u00CDS");
		lblNewLabel_1.setBounds(28, 115, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Portugal"}));
		comboBox.setBounds(93, 112, 86, 20);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(comunidades_esp));
		comboBox_1.setBounds(293, 112, 86, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblRegin = new JLabel("REGI\u00D3N");
		lblRegin.setBounds(228, 115, 46, 14);
		contentPane.add(lblRegin);
		
		JLabel lblNewLabel_2 = new JLabel("Elige el o los tipo/s de transporte que toma para ir a trabajar:");
		lblNewLabel_2.setBounds(12, 163, 340, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel transport = new JPanel();
		transport.setBounds(92, 190, 224, 44);
		contentPane.add(transport);
		transport.setLayout(new GridLayout(2, 3, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Moto");
		transport.add(chckbxNewCheckBox);
		checks.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Coche");
		transport.add(chckbxNewCheckBox_1);
		checks.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Metro");
		transport.add(chckbxNewCheckBox_4);
		checks.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bus");
		transport.add(chckbxNewCheckBox_3);
		checks.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("A pie");
		transport.add(chckbxNewCheckBox_2);
		checks.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Other");
		transport.add(chckbxNewCheckBox_5);
		checks.add(chckbxNewCheckBox_5);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(282, 247, 97, 25);
		btnLimpiar.setActionCommand(btnLimpiar.getName());
		btnLimpiar.addActionListener(this);
		contentPane.add(btnLimpiar);
		
		btnSiguiente = new JButton("\uD83E\uDC7A");
		btnSiguiente.setBounds(219, 247, 97, 25);
		btnSiguiente.setActionCommand("SIGUIENTE");
		btnSiguiente.addActionListener(this);
		
		contentPane.add(btnSiguiente);

		
		btnAnterior = new JButton("\uD83E\uDC78");
		btnAnterior.setBounds(93, 247, 97, 25);
		btnAnterior.setActionCommand("ANTERIOR");
		btnAnterior.addActionListener(this);
		contentPane.add(btnAnterior);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 74, 26);
		contentPane.add(menuBar);
		
		JMenu mnMen = new JMenu("Opciones");
		mnMen.setHorizontalAlignment(SwingConstants.CENTER);
		mnMen.setBackground(Color.GRAY);
		menuBar.add(mnMen);
		
		JMenuItem mntmInsertar = new JMenuItem("Nuevo registro");
		mntmInsertar.setActionCommand("Insertar");
		mntmInsertar.addActionListener(this);
		mnMen.add(mntmInsertar);

		
		JMenuItem mntmAbrir = new JMenuItem("Abrir archivo");
		mntmAbrir.setActionCommand("Abrir");
		mntmAbrir.addActionListener(this);
		mnMen.add(mntmAbrir);

		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setActionCommand("GUARDAR");
		mntmGuardar.addActionListener(this);
		mnMen.add(mntmGuardar);
		
		JMenuItem mntmCargar = new JMenuItem("Mostrar registros");
		mntmCargar.setActionCommand("CARGAR");
		mntmCargar.addActionListener(this);
		mnMen.add(mntmCargar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar archivo");
		mntmBorrar.setActionCommand("BORRAR");
		mntmBorrar.addActionListener(this);
		mnMen.add(mntmBorrar);
		
		lblNuevaEntrada = new JLabel("Nueva entrada");
		lblNuevaEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaEntrada.setBounds(93, 3, 180, 16);
		contentPane.add(lblNuevaEntrada);
		
		index_count = new JLabel("");
		index_count.setHorizontalAlignment(SwingConstants.CENTER);
		index_count.setBounds(164, 286, 86, 16);
		contentPane.add(index_count);
		
		btnAnterior.setVisible(false);
		btnSiguiente.setVisible(false);
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(comboBox.getSelectedItem().toString() == "España") {
		    		comboBox_1.setModel(new DefaultComboBoxModel(comunidades_esp));					
		    	}else {
		    		comboBox_1.setModel(new DefaultComboBoxModel(comunidades_por));
		    	}
		    }
		});
	}
	public void reset() {
		  // for all JTextFields and JTextAreas
		  for (JTextComponent textComponent: texts) {
		    textComponent.setText(""); 
		  }
		  for (JCheckBox checkBox: checks) {
			  checkBox.setSelected(false);
		  }
		  bgroup.clearSelection();
		  comboBox.setSelectedItem("España");
	}

	public void unlock(boolean locked) {
		  // for all JTextFields and JTextAreas
		  for (JTextComponent textComponent: texts) {
		    textComponent.setEditable(locked); 
		  }
		  for (JCheckBox checkBox: checks) {
			  checkBox.setEnabled(locked);
		  }
		  rdbtnNewRadioButton.setEnabled(locked);
		  radioButton.setEnabled(locked);
		  comboBox.setEnabled(locked);
		  comboBox_1.setEnabled(locked);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "LIMPIAR":
			reset();
			break;
		case "GUARDAR":
			guardarPersona();
			btnAnterior.setVisible(false);
			btnSiguiente.setVisible(false);
			index_count.setVisible(false);
			btnLimpiar.setVisible(true);
			reset();
			break;
		case "CARGAR":
			unlock(false);
			System.out.println("Cargar personas");
			lblNuevaEntrada.setText("Carga de personas");
			btnAnterior.setVisible(true);
			btnSiguiente.setVisible(true);
			btnLimpiar.setVisible(false);
			index_count.setVisible(true);
			personas = cargarPersonasDeArchivo();
			setIndexCount();
			personasDeLista();
			break;
		case "SIGUIENTE":
			it++;
			reset();
			setIndexCount();
			personasDeLista();
			break;
		case "ANTERIOR":
			it--;
			reset();
			personasDeLista();
			break;
		case "Insertar":
			insertar();
			break;
		case "BORRAR":
			borrarLista();
			break;
		case "Abrir":
			abrir();
			break;
		default:
			
			break;
		}
		
		
	}
	private void insertar() {
		reset();
		unlock(true);
		lblNuevaEntrada.setText("Nueva entrada");
		btnAnterior.setVisible(false);
		btnSiguiente.setVisible(false);
		index_count.setVisible(false);
		btnLimpiar.setVisible(true);
	}

	public void setIndexCount() {
		index_count.setText((it+1) + "/" + personas.size());
	}
	public void guardarPersona() {
		System.out.println("Guardando persona");
		String nombre = textField.getText();
		String apellido = textField_1.getText();
		String genero = setGenero();
		String pais = comboBox.getSelectedItem().toString();
		String region = comboBox_1.getSelectedItem().toString();
		ArrayList<String> transporte = new ArrayList<String>();
		for(JCheckBox checked : checks) {
			if(checked.isSelected()) {
				transporte.add(checked.getText());
			}
		}
		Persona_form persona = new Persona_form(nombre, apellido, genero, pais, region, transporte);
		agregarPersona(persona);
	}
	public String setGenero() {
		String genero = "";
		if(rdbtnNewRadioButton.isSelected()) {
			genero = "Hombre";
		}else if (radioButton.isSelected()){
			genero = "Mujer";
		}
		return genero;
		 
	}
	
	public void personasDeLista() {
		if(it >= personas.size()) {
			it = 0;
		}
		if(it < 0 ) {
			it = personas.size()-1;
		}
		setIndexCount();
		textField.setText(personas.get(it).getNombre());
		textField_1.setText(personas.get(it).getApellido());
		if(personas.get(it).getGenero().equalsIgnoreCase("Hombre")) {
			rdbtnNewRadioButton.setSelected(true);
		}else if(personas.get(it).getGenero().equalsIgnoreCase("Mujer")) {
			radioButton.setSelected(true);
		}
		comboBox.setSelectedItem(personas.get(it).getPais());
		comboBox_1.setSelectedItem(personas.get(it).getRegion());
		ArrayList<String> transporte = personas.get(it).getTransporte();
		for(int j=0;j < transporte.size();j++) {
			for (int i = 0; i < checks.size(); i++) {
				if(transporte.get(j).equalsIgnoreCase(checks.get(i).getText()) ) {
					checks.get(i).setSelected(true);
				}
			}
		}
	}
	
	public void agregarPersona(Object persona) {
		if(ruta == "") {
			abrir();
		}
		/**
		 * Escritura de objeto serializado
		 */
		ArrayList<Persona_form> personas = new ArrayList<Persona_form>();
		try {
		personas = cargarPersonasDeArchivo();
		}catch(Exception e) {
			System.out.println("Archivo vacío");
		}
		personas.add((Persona_form) persona);
		try {
			ObjectOutputStream obj = 
					new ObjectOutputStream(
							new FileOutputStream(ruta));
			
				obj.writeObject(personas);
			
			obj.close();
			System.out.println("Persona guardada con éxito.");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Persona_form> cargarPersonasDeArchivo() {
		if(ruta == "") {
			abrir();
		}
		
		/**
		 * Lectura de objeto serializado
		 */
		ArrayList<Persona_form> personas = new ArrayList<Persona_form>();
		/**
		 *  Vector de personas nuevas que se llenará desde
		 *  los datos del archivo serializado.
		 */
		try {
			/**
			 * Abro un ObjectInputStream para leer los datos
			 * del fichero serializado.
			 */
			// "src/personas.dat"
			ObjectInputStream ois = 
					new ObjectInputStream(
							new FileInputStream(ruta));
			/**
			 * Mientras la lectura sea true mete las personas en la lista.
			 */
			while(true){
				personas = (ArrayList<Persona_form>)ois.readObject();
				
			}
			/**
			 * Este catch de aquí es MUY IMPORTANTE ya que cuando intente 
			 * leer más y no pueda entonces saltará esta excepción. 
			 * Debemos controlarla para que no explote el programa.
			 */
		} catch (EOFException e) {
			System.out.println("Lectura de archivos terminada!");
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no encontrada");
		} catch (IOException e){
			System.out.println("Excepcion del sistema");
		}
		for(Persona_form per : personas) {
			System.out.println(per.toString());
		}
		return personas;
	}
	private void abrir() {
		JFileChooser j = new JFileChooser("C:\\Users\\PabloOsesAndia\\Desktop",FileSystemView.getFileSystemView()); 
		// Open the save dialog 
		if(j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			ruta = j.getSelectedFile().getAbsolutePath();

		}		
	}

	public void borrarLista() {
		if(ruta == "") {
			abrir();
		}
		try {
			ObjectOutputStream obj = 
					new ObjectOutputStream(
							new FileOutputStream(ruta));
			
				obj.writeObject(null);
			obj.close();
			System.out.println("Borrado con éxito.");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
		personas.clear();
		insertar();
	}
}
