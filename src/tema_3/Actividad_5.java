package tema_3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Actividad_5 implements ActionListener{

	private JFrame frame;
	private tF_frio_calor tF_frio_calor_;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad_5 window = new Actividad_5();
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
	public Actividad_5() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 81, 26);
		frame.getContentPane().add(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmReiniciarCtrl = new JMenuItem("Reiniciar");
		mntmReiniciarCtrl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		mntmReiniciarCtrl.setActionCommand("Reiniciar");
		mntmReiniciarCtrl.addActionListener(this);
		mnOpciones.add(mntmReiniciarCtrl);
		
		JLabel lblaciertaElNmero = new JLabel("\u00A1ACIERTA EL N\u00DAMERO ENTRE 0 Y 100 PARA GANAR!");
		lblaciertaElNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblaciertaElNmero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblaciertaElNmero.setBounds(12, 25, 408, 30);
		frame.getContentPane().add(lblaciertaElNmero);
		
		JLabel lblParaReiniciarEl = new JLabel("PARA REINICIAR EL JUEGO PULSAR \"CTRL + N\"");
		lblParaReiniciarEl.setForeground(Color.GRAY);
		lblParaReiniciarEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaReiniciarEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaReiniciarEl.setBounds(12, 55, 408, 30);
		frame.getContentPane().add(lblParaReiniciarEl);
		
		tF_frio_calor_ = new tF_frio_calor();
		tF_frio_calor_.setFont(new Font("Tahoma", Font.PLAIN, 53));
		tF_frio_calor_.setBounds(12, 118, 408, 122);
		frame.getContentPane().add(tF_frio_calor_);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tF_frio_calor_.restart();
		
		
	}
}
