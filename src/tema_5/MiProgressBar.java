/**
 * Clase de progressbar personalizada
 * @author pablo
 */

package tema_5;

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
		   super(0,350);
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
		if(this.getValue() < 176) {
			this.setForeground(Color.RED);
		}
		if(this.getValue() >= 176) {
			this.setForeground(Color.GREEN);
		}
		
	}
	   
}
