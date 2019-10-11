package Tema_2;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MiBotonGuardar extends JButton implements ActionListener{
	public MiBotonGuardar() {
		this.setText("GUARDADO");
		this.setForeground(Color.GREEN);
		this.setIcon(new ImageIcon(MiBotonGuardar.class.getResource("/imagenes/save.png")));
		addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.getText().equals("GUARDADO")) {
			this.setForeground(Color.RED);
			this.setText("NO GUARDADO");
		}else if(this.getText().equals("NO GUARDADO")){
			this.setForeground(Color.GREEN);
			this.setText("GUARDADO");
		}
	}
}
