package tema_3;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class tF_frio_calor extends JTextField implements KeyListener{
	int obj_value;
	
	public tF_frio_calor() {
		super();
		this.setHorizontalAlignment(CENTER);
		this.restart();
		addKeyListener(this);
	}

	public void restart() {
		Random random = new Random();
		obj_value = random.nextInt(101);
		this.setText("");
		this.setEnabled(true);

		System.out.println(obj_value);
		this.setBackground(Color.white);
	}

	public boolean checkNum() {
		int num;
		boolean check = false;
		try {
			num = Integer.parseInt(this.getText());
			if(num <= 100 && num >= 0) {
				check = true;
			}else {
				this.setText("");
			}
		}catch(Exception e) {
			check = false;
			this.setText("");
		}
		return check;
	}
	
	public void changeColor(Color c) {
		this.setBackground(c);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(checkNum()) {
			if(difference() >= 25) {
				changeColor(Color.GRAY);
				this.setForeground(Color.black);
			}else if(difference() >= 20) {
				changeColor(Color.CYAN);
				this.setForeground(Color.black);
			}else if(difference() >= 15) {
				changeColor(Color.BLUE);
				this.setForeground(Color.white);
			}else if(difference() >= 10) {
				changeColor(Color.YELLOW);
				this.setForeground(Color.black);
			}else if(difference() >= 5) {
				changeColor(Color.ORANGE);
				this.setForeground(Color.black);
			}else if(difference() < 5) {
				changeColor(Color.RED);
				this.setForeground(Color.white);
			}
			if(difference() == 0) {
				changeColor(Color.GREEN);
				this.setForeground(Color.BLACK);
				JOptionPane.showMessageDialog(null, "¡HAS ACERTADO!");		
				
				this.setEnabled(false);
			}
		}
		
	}

	private int difference() {
		int num = Integer.parseInt(this.getText());
		return Math.abs(num - obj_value);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
