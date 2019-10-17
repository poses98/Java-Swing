package Tema_2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class TicTacToe implements ActionListener{

	private JFrame frame;
	private MatTicTacToe tablero;
	private int turno;
	private JButton[][] tableroBotones;
	private int winner;
	private boolean pause;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tablero = new MatTicTacToe();
		turno = 0;
		
		tableroBotones = new JButton[3][3];
		
		winner = 0;
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 431, 334);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton boton_1 = new JButton("");
		boton_1.setActionCommand("0,0");
		boton_1.addActionListener(this);
		panel.add(boton_1);
		
		JButton boton_2 = new JButton("");
		boton_2.setActionCommand("0,1");
		boton_2.addActionListener(this);
		panel.add(boton_2);
		
		JButton boton_3 = new JButton("");
		boton_3.setActionCommand("0,2");
		boton_3.addActionListener(this);
		panel.add(boton_3);
		
		JButton boton_4 = new JButton("");
		boton_4.setActionCommand("1,0");
		boton_4.addActionListener(this);
		panel.add(boton_4);
		
		JButton boton_5 = new JButton("");
		boton_5.setActionCommand("1,1");
		boton_5.addActionListener(this);
		panel.add(boton_5);
		
		JButton boton_6 = new JButton("");
		boton_6.setActionCommand("1,2");
		boton_6.addActionListener(this);
		panel.add(boton_6);
		
		JButton boton_7 = new JButton("");
		boton_7.setActionCommand("2,0");
		boton_7.addActionListener(this);
		panel.add(boton_7);
		
		JButton boton_8 = new JButton("");
		boton_8.setActionCommand("2,1");
		boton_8.addActionListener(this);
		panel.add(boton_8);
		
		JButton boton_9 = new JButton("");
		boton_9.setActionCommand("2,2");
		boton_9.addActionListener(this);
		panel.add(boton_9);
		
		tableroBotones[0][0] = boton_1;
		tableroBotones[0][1] = boton_2;
		tableroBotones[0][2] = boton_3;
		
		tableroBotones[1][0] = boton_4;
		tableroBotones[1][1] = boton_5;
		tableroBotones[1][2] = boton_6;
		
		tableroBotones[2][0] = boton_7;
		tableroBotones[2][1] = boton_8;
		tableroBotones[2][2] = boton_9;
		
		JButton btnJuegoNuevo = new JButton("NUEVA PARTIDA");
		btnJuegoNuevo.setActionCommand("Reset");
		btnJuegoNuevo.addActionListener(this);
		btnJuegoNuevo.setBounds(12, 359, 197, 48);
		frame.getContentPane().add(btnJuegoNuevo);
		
		MiBotonPausa mbtnpsPause = new MiBotonPausa();
		mbtnpsPause.setBounds(207, 359, 212, 48);
		mbtnpsPause.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					pause = !pause;
			}
		});
		frame.getContentPane().add(mbtnpsPause);
		pause = false;
		pintarTablero();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!pause) {
			
			switch(e.getActionCommand()) {
				case "0,0":
					juego(0,0);
					break;
				case "0,1":
					juego(0,1);
					break;
				case "0,2":
					juego(0,2);
					break;
				case "1,0":
					juego(1,0);
					break;
				case "1,1":
					juego(1,1);
					break;
				case "1,2":
					juego(1,2);
					break;
				case "2,0":
					juego(2,0);
					break;
				case "2,1":
					juego(2,1);
					break;
				case "2,2":
					juego(2,2);
					break;
				case "Reset":
					reset();
					break;
			//	Fin del switch
			}
		}
		pintarTablero();
		if(checkWin()) {
			ganador();
		}
	}
	private void reset() {
		tablero.clear();
		turno = 0;
		pintarTablero();
	}
	
	
	private void juego(int x,int y) {
		int jugador;
		if(turno % 2 == 0) {
			jugador = 1;
		}else {
			jugador = 2;
		}
		if(!tablero.setPos(x, y, jugador)) {
			posicionOcupada();
		}else {
			turno++;
		}
	}
	
	private void posicionOcupada() {
		JOptionPane.showMessageDialog(frame, "¡Posición ocupada!");		
	}
	
	private void ganador() {
		JOptionPane.showMessageDialog(frame, "¡Gana el jugador "+ winner +"!");	
		reset();
	}
	
	private void pintarTablero() {
		Integer[][] tablero = new Integer[3][3];
		tablero = this.tablero.getMatriz();
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if(tablero[i][j] == 1) {
					tableroBotones[i][j].setBackground(Color.RED);
				}else if(tablero[i][j] == 2) {
					tableroBotones[i][j].setBackground(Color.BLUE);
				}else {
					tableroBotones[i][j].setBackground(Color.WHITE);
				}
			}
		}
	}
	
	private boolean checkWin() {
		Integer[][] tablero = new Integer[3][3];
		tablero = this.tablero.getMatriz();
		boolean win = false;
		//	Horizontales y verticales
		for (int i = 0; i < tablero.length; i++) {
			if((tablero[i][0] == tablero[i][1]) && (tablero[i][0] == tablero[i][2]) && tablero[i][0] !=0) {
				win = true;
				winner = tablero[i][0];
			}
			if((tablero[0][i] == tablero[1][i]) && (tablero[0][i] == tablero[2][i]) && tablero[0][i] !=0) {
				win = true;
				winner = tablero[0][i];
			}
		}
		//	Diagonales
		if((tablero[0][0] == tablero[1][1]) && (tablero[0][0] == tablero[2][2]) && tablero[0][0] !=0) {
			win = true;
			winner = tablero[0][0];
		}
		if((tablero[0][2] == tablero[1][1]) && (tablero[0][2] == tablero[2][0]) && tablero[0][2] !=0) {
			win = true;
			winner = tablero[0][2];
		}
		return win;
	}
}
