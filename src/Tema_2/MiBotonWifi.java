package Tema_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MiBotonWifi extends JButton implements ActionListener{
	public MiBotonWifi() {
		this.setText("ON");
		this.setForeground(Color.GREEN);
		this.setIcon(new ImageIcon(MiBotonWifi.class.getResource("/imagenes/wifiON.png")));
		addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.getText().equals("OFF")) {
			this.setForeground(Color.GREEN);
			this.setText("ON");
			this.setIcon(new ImageIcon(MiBotonWifi.class.getResource("/imagenes/wifiON.png")));
		}else if(this.getText().equals("ON")){
			this.setForeground(Color.RED);
			this.setText("OFF");
			this.setIcon(new ImageIcon(MiBotonWifi.class.getResource("/imagenes/wifiOFF.png")));
		}
	}
}
