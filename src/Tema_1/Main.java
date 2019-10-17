package Tema_1;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("hola");
		Tema1_Absolutelayout frame = new Tema1_Absolutelayout();
		frame.setVisible(true);
		frame.setTitle("Mi primera interfaz");
		
		
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema1_Absolutelayout[] frame = new Tema1_Absolutelayout[10];
					for(int i=0;i < frame.length;i++) {
						frame[i] = new Tema1_Absolutelayout();
						frame[i].setVisible(true);
						
					}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

}
