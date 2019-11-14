package tema_4;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;

public class AbrirCHM extends JFrame implements ActionListener{

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbrirCHM frame = new AbrirCHM();
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
	public AbrirCHM(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpmaker = new JMenuItem("HelpMaker");
		mntmHelpmaker.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0));
		mntmHelpmaker.setActionCommand("Open");
		mntmHelpmaker.addActionListener(this);
		mnHelp.add(mntmHelpmaker);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		OpenCHM.open("tema_4/InstalacionEclipse.chm");
	}

}
