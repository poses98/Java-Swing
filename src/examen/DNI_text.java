package examen;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class DNI_text extends JTextField implements KeyListener{
	
	public DNI_text() {
		super();
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(this.getText().length() < 9 || this.getText().length() > 9) {
			this.setBackground(Color.red);
		}else if(this.getText().length() == 9) {
			this.setBackground(Color.GREEN);
		}else if(this.getText().length() == 0) {
			this.setBackground(Color.white);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void Reiniciar() {
		this.setText("");
	}
}
