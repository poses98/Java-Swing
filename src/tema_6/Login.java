package tema_6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.Button;
import java.awt.Label;
import java.awt.SystemColor;

public class Login implements ActionListener{

	private JFrame frame;
	private JTextField nick;
	private JTextField client_ip;
	private JTextField puerto;
	private JTextField server_ip;
	private TextField escribirMensaje;
	private TextArea conectados;
	private TextArea mensajes; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 555, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(6, 6, 270, 168);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblClientnick = new JLabel("Client_nick");
		lblClientnick.setBounds(6, 19, 92, 16);
		panel.add(lblClientnick);
		
		JLabel lblClientip = new JLabel("Client_ip");
		lblClientip.setBounds(6, 47, 92, 16);
		panel.add(lblClientip);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(85, 81, 92, 26);
		btnLogin.setActionCommand("login");
		btnLogin.addActionListener(this);
		panel.add(btnLogin);
		
		nick = new JTextField();
		nick.setBounds(85, 14, 130, 26);
		panel.add(nick);
		nick.setColumns(10);
		
		client_ip = new JTextField();
		client_ip.setEditable(false);
		client_ip.setColumns(10);
		client_ip.setBounds(85, 42, 130, 26);
		panel.add(client_ip);
		
		JLabel lblPuerto = new JLabel("Puerto");
		lblPuerto.setBounds(6, 119, 61, 16);
		panel.add(lblPuerto);
		
		JLabel lblIp = new JLabel("IP");
		lblIp.setBounds(134, 119, 61, 16);
		panel.add(lblIp);
		
		puerto = new JTextField();
		puerto.setEditable(false);
		puerto.setHorizontalAlignment(SwingConstants.CENTER);
		puerto.setText("5555");
		puerto.setBounds(6, 136, 92, 26);
		panel.add(puerto);
		puerto.setColumns(10);
		
		server_ip = new JTextField();
		server_ip.setHorizontalAlignment(SwingConstants.CENTER);
		server_ip.setEditable(false);
		server_ip.setText("10.1.98.12");
		server_ip.setColumns(10);
		server_ip.setBounds(134, 136, 130, 26);
		panel.add(server_ip);
		
		mensajes = new TextArea();
		mensajes.setEditable(false);
		mensajes.setBackground(Color.LIGHT_GRAY);
		mensajes.setBounds(6, 178, 270, 222);
		frame.getContentPane().add(mensajes);
		
		escribirMensaje = new TextField();
		escribirMensaje.setBounds(6, 414, 270, 41);
		frame.getContentPane().add(escribirMensaje);
		
		Button limpiar = new Button("LIMPIAR");
		limpiar.setBounds(6, 459, 117, 29);
		limpiar.setActionCommand("limpiar");
		limpiar.addActionListener(this);
		frame.getContentPane().add(limpiar);
		
		Button enviar = new Button("ENVIAR");
		enviar.setBounds(159, 461, 117, 29);
		enviar.setActionCommand("enviar");
		enviar.addActionListener(this);
		frame.getContentPane().add(enviar);
		
		Label label = new Label("CONECTADOS");
		label.setBounds(297, 6, 117, 16);
		frame.getContentPane().add(label);
		
		conectados = new TextArea();
		conectados.setBounds(290, 28, 255, 460);
		frame.getContentPane().add(conectados);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "login":
			showPasswordDialog();
			break;
		case "enviar":
			enviar();
			break;
		case "limpiar":
			limpiar();
			break;
		}
	}

	private void limpiar() {
		mensajes.setText("");
		
	}

	private void enviar() {
		if(!escribirMensaje.getText().contentEquals("")) {
			mensajes.append("[" + nick.getText() + "] : " + escribirMensaje.getText() + "\n");
			escribirMensaje.setText("");
		}
	}

	private void showPasswordDialog() {
		String pass = JOptionPane.showInputDialog("Type in your password: (1234)");
        
		if(pass.contentEquals("1234")) {
			getIPAddress();
		}else {
			JOptionPane.showMessageDialog(null,
				    "CONTRASEÑA INCORRECTA",
				    "Warning",
				    JOptionPane.WARNING_MESSAGE);
		}
		
	}

	private void getIPAddress() {
		try {
			client_ip.setText(InetAddress.getLocalHost().getHostAddress());
			conectados.append("[" + nick.getText() + "] : "  + client_ip.getText() + "\n");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
