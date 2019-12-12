package examen_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Emisora implements ActionListener{

	private JFrame frame;
	private JTextField usuario;
	private JTextField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private boolean logged = false;
	private Button conectar;
	private Label frecuencia;
	private TextArea registro;
	private JRadioButton fm;
	private JRadioButton am;
	private int volumen;
	private MiProgressBar progress;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emisora window = new Emisora();
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
	public Emisora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 263, 140);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label_1 = new Label("USUARIO");
		label_1.setBounds(10, 10, 60, 20);
		panel.add(label_1);
		
		Label label_2 = new Label("CONTRASE\u00D1A");
		label_2.setBounds(10, 48, 94, 22);
		panel.add(label_2);
		
		usuario = new JTextField();
		usuario.setText("IMF");
		usuario.setToolTipText("IMF");
		usuario.setBounds(111, 10, 131, 20);
		panel.add(usuario);
		usuario.setColumns(10);
		
		password = new JTextField();
		password.setText("12345");
		password.setToolTipText("12345");
		password.setColumns(10);
		password.setBounds(111, 48, 131, 20);
		panel.add(password);
		
		conectar = new Button("CONECTAR");
		conectar.setFont(new Font("Dialog", Font.PLAIN, 22));
		conectar.setActionCommand("conectar");
		conectar.addActionListener(this);
		conectar.setBounds(10, 86, 243, 44);
		panel.add(conectar);
		
		frecuencia = new Label("87.5");
		frecuencia.setBounds(10, 157, 248, 40);
		frame.getContentPane().add(frecuencia);
		frecuencia.setEnabled(false);
		frecuencia.setFont(new Font("Dialog", Font.PLAIN, 32));
		frecuencia.setAlignment(Label.CENTER);
		
		Button menosHz = new Button("<");
		menosHz.setBounds(10, 200, 113, 34);
		frame.getContentPane().add(menosHz);
		menosHz.setActionCommand("hz-");
		menosHz.addActionListener(this);
		menosHz.setEnabled(false);
		menosHz.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		Button masHz = new Button(">");
		masHz.setBounds(145, 200, 113, 34);
		frame.getContentPane().add(masHz);
		masHz.setActionCommand("hz+");
		masHz.addActionListener(this);
		masHz.setEnabled(false);
		masHz.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		Button registrarbtn = new Button("REGISTRAR");
		registrarbtn.setBounds(10, 236, 248, 37);
		registrarbtn.setActionCommand("registrar");
		registrarbtn.addActionListener(this);
		frame.getContentPane().add(registrarbtn);
		
		registrarbtn.setEnabled(false);
		registrarbtn.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		fm = new JRadioButton("FM");
		fm.setEnabled(false);
		fm.setSelected(true);
		buttonGroup.add(fm);
		fm.setBounds(264, 162, 46, 23);
		frame.getContentPane().add(fm);
		
		am = new JRadioButton("AM");
		am.setEnabled(false);
		buttonGroup.add(am);
		am.setBounds(264, 200, 46, 23);
		frame.getContentPane().add(am);
		
		Label labelVol = new Label("VOLUMEN");
		labelVol.setBounds(10, 279, 62, 22);
		frame.getContentPane().add(labelVol);
		
		registro = new TextArea();
		registro.setEditable(false);
		registro.setBounds(318, 36, 186, 265);
		frame.getContentPane().add(registro);
		
		Button borrarbtn = new Button("BORRAR");
		borrarbtn.setEnabled(false);
		borrarbtn.setActionCommand("borrar");
		borrarbtn.addActionListener(this);
		borrarbtn.setFont(new Font("Dialog", Font.PLAIN, 16));
		borrarbtn.setBounds(318, 307, 188, 27);
		frame.getContentPane().add(borrarbtn);
		
		Button menosVol = new Button("-");
		menosVol.setEnabled(false);
		menosVol.setActionCommand("vol-");
		menosVol.addActionListener(this);
		menosVol.setBounds(10, 307, 33, 22);
		frame.getContentPane().add(menosVol);
		
		Button masVol = new Button("+");
		masVol.setEnabled(false);
		masVol.setActionCommand("vol+");
		masVol.addActionListener(this);
		masVol.setBounds(254, 307, 33, 22);
		frame.getContentPane().add(masVol);
		
		Label label = new Label("REGISTRO");
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBounds(318, 8, 103, 22);
		frame.getContentPane().add(label);
		
		progress = new MiProgressBar();
		progress.setBounds(49, 301, 199, 33);
		frame.getContentPane().add(progress);
		
		volumen = 3;
		progress.setValue(volumen);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenuItem mntmRegistar = new JMenuItem("Registar");
		mntmRegistar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mntmRegistar.setActionCommand("registrar");
		mntmRegistar.addActionListener(this);
		mnRegistro.add(mntmRegistar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
		mntmBorrar.setActionCommand("borrar");
		mntmBorrar.addActionListener(this);
		mnRegistro.add(mntmBorrar);
		
		JMenu mnFrecuencia = new JMenu("Frecuencia");
		menuBar.add(mnFrecuencia);
		
		JMenuItem mntmIncrementar = new JMenuItem("Incrementar");
		mntmIncrementar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.SHIFT_MASK));
		mntmIncrementar.setActionCommand("hz+");
		mntmIncrementar.addActionListener(this);
		mnFrecuencia.add(mntmIncrementar);
		
		JMenuItem mntmDecrementar = new JMenuItem("Decrementar");
		mntmDecrementar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.SHIFT_MASK));
		mntmDecrementar.setActionCommand("hz-");
		mntmDecrementar.addActionListener(this);
		mnFrecuencia.add(mntmDecrementar);
		
		JMenu mnVolumen = new JMenu("Volumen");
		menuBar.add(mnVolumen);
		
		JMenuItem mntmAumentar = new JMenuItem("Aumentar");
		mntmAumentar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.ALT_MASK));
		mntmAumentar.setActionCommand("vol+");
		mntmAumentar.addActionListener(this);
		mnVolumen.add(mntmAumentar);
		
		JMenuItem mntmDisminuir = new JMenuItem("Disminuir");
		mntmDisminuir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.ALT_MASK));
		mntmDisminuir.setActionCommand("vol-");
		mntmDisminuir.addActionListener(this);
		mnVolumen.add(mntmDisminuir);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mntmHelp.setActionCommand("help");
		mntmHelp.addActionListener(this);
		mnHelp.add(mntmHelp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "conectar":
			Conectar();
			break;
		case "hz-":
			MofificarHz("-");
			break;
		case "hz+":
			MofificarHz("+");
			break;
		case "registrar":
			Registar();
			break;
		case "borrar":
			Borrar();
			break;
		case "vol+":
			ModificarVol("+");
			break;
		case "vol-":
			ModificarVol("-");
			break;
		case "help":
			Help();
			break;
		}
		
		
	}
	private void Help() {
		JOptionPane.showMessageDialog(null, "Rango de frecuencias válido:[87,5MHz - 108MHz]\nRango de niveles de volumen válido:[0-6]");		
	}

	private void ModificarVol(String string) {
		if(string.contentEquals("+")) {
			if(volumen<6) {
				volumen++;
				progress.setValue(volumen);
			}
		}
		if(string.contentEquals("-")) {
			if(volumen>0) {
				volumen--;
				progress.setValue(volumen);
			}
		}
	}

	private void Borrar() {
		this.registro.setText("");
	}

	private void Registar() {
		try {
			String registro = JOptionPane.showInputDialog("Nombre del registro:");
			String amfm;
			if(am.isSelected()) {
				amfm = "AM";
			}else {
				amfm = "FM";
			}
			try {
				if(!registro.isEmpty()) {
					this.registro.append(registro.toUpperCase() + ":" + frecuencia.getText() + "MHz -- " + amfm + "\n");
					JOptionPane.showMessageDialog(null, "Registro efectuado");
				}else {
					JOptionPane.showMessageDialog(new JFrame(), "Registro no efectuado", "Dialog",
					        JOptionPane.ERROR_MESSAGE);
				}
			}catch(NullPointerException e) {
				
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(new JFrame(), "Registro no efectuado", "Dialog",
			        JOptionPane.ERROR_MESSAGE);
		}
		
	}

	private void MofificarHz(String string) {
		double t_frec;
		if(string.contentEquals("+")) {
			t_frec = Double.parseDouble(frecuencia.getText());
			if(t_frec < 108) {
				t_frec += 0.1;
			}
			BigDecimal bd = new BigDecimal(t_frec);
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			frecuencia.setText(""+bd.doubleValue());
		}else {
			t_frec = Double.parseDouble(frecuencia.getText());
			if(t_frec > 87.5) {
				t_frec -= 0.1;
			}
			BigDecimal bd = new BigDecimal(t_frec);
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			frecuencia.setText(""+bd.doubleValue());		}
		
	}

	private void Conectar() {
		if((usuario.getText().contentEquals("IMF") && password.getText().contentEquals("12345")) && !logged) {
			JOptionPane.showMessageDialog(null, "Conectado usuario IMF");
			logged = true;
			conectar.setLabel("DESCONECTAR");
			HabilitarTodo();
		}else {
			JOptionPane.showMessageDialog(null, "Desconectado");
			logged = false;
			conectar.setLabel("CONECTAR");
			HabilitarTodo();
		}
		
	}
	
	private void HabilitarTodo() {
		for(Component comp : frame.getContentPane().getComponents()) {
			comp.setEnabled(logged);
		}
		usuario.setEnabled(!logged);
		password.setEnabled(!logged);
	}
}
