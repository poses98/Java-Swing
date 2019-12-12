/**
 * Clase de progressbar personalizada
 * @author pablo
 */

package examen_final;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicProgressBarUI;

@SuppressWarnings("serial")
public class MiProgressBar extends JProgressBar implements ChangeListener{
	   public MiProgressBar() {
		   super(0,6);
		   this.setStringPainted(true);
		   this.addChangeListener(this);

	   }
	/**
	 * Detecta cambios en el progressbar y le cambia el color según el valor
	 * <ul>
	 * <li>hasta 176 no incluido se muestra en rojo</li>
	 * <li>desde 176 en adelante se muestra en verde (mayoría)</li>
	 * </ul>
	 * @param e - evento de cambio
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		if(this.getValue() == 1) {
			this.setForeground(Color.CYAN);
		}
		if(this.getValue() == 2) {
			this.setForeground(Color.BLUE);
		}
		if(this.getValue() == 3) {
			this.setForeground(Color.GREEN);
		}
		if(this.getValue() == 4) {
			this.setForeground(Color.YELLOW);
		}
		if(this.getValue() == 5) {
			this.setForeground(Color.ORANGE);
		}
		if(this.getValue() == 6) {
			this.setForeground(Color.RED);
		}
	}
	   
}
