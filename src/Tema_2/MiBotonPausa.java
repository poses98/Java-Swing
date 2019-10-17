package Tema_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MiBotonPausa extends JButton implements ActionListener{
	public MiBotonPausa() {
		this.setText("PAUSE");
		this.setBackground(Color.GREEN);
		addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.getText().equals("PAUSE")) {
			this.setBackground(Color.RED);
			this.setText("CONTINUAR");
		}else if(this.getText().equals("CONTINUAR")){
			this.setBackground(Color.GREEN);
			this.setText("PAUSE");
		}
	}
}

