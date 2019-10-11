package Tema_2;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	private JFrame frame;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		MiBotonWifi mbtnwfOn = new MiBotonWifi();
		mbtnwfOn.setBounds(73, 113, 103, 59);
		frame.getContentPane().add(mbtnwfOn);
		
		MiBotonGuardar mbtngrdrGuardado = new MiBotonGuardar();
		mbtngrdrGuardado.setBounds(100, 28, 176, 49);
		frame.getContentPane().add(mbtngrdrGuardado);
	}
}
