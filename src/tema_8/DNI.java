package tema_8;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class DNI  extends JTextField implements KeyListener{
    String dni;
    boolean check;
	
	public DNI() {
		check = false;
		this.setBackground(Color.WHITE);
		this.setText("");	
		addKeyListener(this);		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if(this.getText().length()==9) {				
			
			char dni_char=this.getText().charAt(8);
			if(dni_char==calculaLetra(Integer.parseInt(this.getText().substring(0,8)))) {
				check = true;
				this.setBackground(Color.GREEN);
			}
						
		}else if(this.getText()==""){
			check = false;
			this.setBackground(Color.WHITE);
			
		}else {
			check = false;
			this.setBackground(Color.RED);
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (this.getText().length()== 9)arg0.consume();		
	}
	public char calculaLetra(int dni)
    {
		//System.out.println("calcular letra"+dni);
	    String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
	    int modulo= dni % 23;
	    char letra = juegoCaracteres.charAt(modulo);
	    return letra; 
    } 
	
	public boolean getCheck() {
		return check;
	}
	
	public void SetFalse() {
		check = false;
		this.setBackground(Color.WHITE);
	}
	
	public void Check() {
		if(this.getText().length()==9) {				
			
			char dni_char=this.getText().charAt(8);
			if(dni_char==calculaLetra(Integer.parseInt(this.getText().substring(0,8)))) {
				check = true;
				this.setBackground(Color.GREEN);
			}
						
		}else if(this.getText()==""){
			check = false;
			this.setBackground(Color.WHITE);
			
		}else {
			check = false;
			this.setBackground(Color.RED);
		}
	}

}
