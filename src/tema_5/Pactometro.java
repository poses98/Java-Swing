/**
 * @author Pablo Osés
 * @version 1.0
 * Clase JavaSwing que crea la ventana con los partidos y el JProgressBar
 */

package tema_5;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Pactometro implements ActionListener{

	private JFrame frame;
	private JTextField rpsoe;
	private JPanel panel;
	private JTextField rpp;
	private JTextField rvox;
	private JTextField rup;
	private JTextField rerc;
	private JTextField rcs;
	private JTextField rjunts;
	private JTextField rpnv;
	private JTextField rteruel;
	private JTextField rbildu;
	private JTextField rmaspais;
	private JTextField rcup;
	private JTextField rcc;
	private JTextField rnasuma;
	private JTextField rbng;
	private JTextField rprc;
	private MiProgressBar progress;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pactometro window = new Pactometro();
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
	public Pactometro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(6, 6, 372, 191);
		
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox psoe = new JCheckBox("PSOE");
		psoe.setBounds(0, 0, 79, 23);
		panel.add(psoe);
		
		JCheckBox pp = new JCheckBox("PP");
		pp.setBounds(0, 24, 79, 23);
		panel.add(pp);
		
		JCheckBox vox = new JCheckBox("VOX");
		vox.setBounds(0, 48, 79, 23);
		panel.add(vox);
		
		JCheckBox up = new JCheckBox("UP");
		up.setBounds(0, 72, 79, 23);
		panel.add(up);
		
		JCheckBox erc = new JCheckBox("ERC");
		erc.setBounds(0, 96, 79, 23);
		panel.add(erc);
		
		JCheckBox cs = new JCheckBox("CS");
		cs.setBounds(0, 117, 79, 23);
		panel.add(cs);
		
		JCheckBox junts = new JCheckBox("JUNTS");
		junts.setBounds(0, 139, 79, 23);
		panel.add(junts);
		
		JCheckBox pnv = new JCheckBox("PNV");
		pnv.setBounds(0, 161, 79, 23);
		panel.add(pnv);
		
		JCheckBox bildu = new JCheckBox("BILDU");
		bildu.setBounds(177, 24, 134, 23);
		panel.add(bildu);
		
		JCheckBox maspais = new JCheckBox("MASPAIS");
		maspais.setBounds(177, 48, 134, 23);
		panel.add(maspais);
		
		JCheckBox cup = new JCheckBox("CUP");
		cup.setBounds(177, 72, 134, 23);
		panel.add(cup);
		
		JCheckBox cc = new JCheckBox("CC");
		cc.setBounds(177, 96, 134, 23);
		panel.add(cc);
		
		JCheckBox nasuma = new JCheckBox("NASUMA");
		nasuma.setBounds(177, 117, 134, 23);
		panel.add(nasuma);
		
		JCheckBox bng = new JCheckBox("BNG");
		bng.setBounds(177, 139, 134, 23);
		panel.add(bng);
		
		JCheckBox prc = new JCheckBox("PRC");
		prc.setBounds(177, 161, 134, 23);
		panel.add(prc);
		
		JCheckBox teruel = new JCheckBox("TERUELEXISTE");
		teruel.setBounds(177, 0, 134, 23);
		panel.add(teruel);
		
		rpsoe = new JTextField();
		rpsoe.setName("rpsoe");
		rpsoe.setText("120");
		rpsoe.setEditable(false);
		rpsoe.setBounds(91, -1, 60, 26);
		panel.add(rpsoe);
		rpsoe.setColumns(10);
		
	
		
		rpp = new JTextField();
		rpp.setName("rpp");
		rpp.setText("89");
		rpp.setEditable(false);
		rpp.setColumns(10);
		rpp.setBounds(91, 23, 60, 26);
		panel.add(rpp);
		
		rvox = new JTextField();
		rvox.setName("rvox");
		rvox.setText("52");
		rvox.setEditable(false);
		rvox.setColumns(10);
		rvox.setBounds(91, 47, 60, 26);
		panel.add(rvox);
		
		rup = new JTextField();
		rup.setText("35");
		rup.setName("rup");
		rup.setEditable(false);
		rup.setColumns(10);
		rup.setBounds(91, 71, 60, 26);
		panel.add(rup);
		
		rerc = new JTextField();
		rerc.setName("rerc");
		rerc.setText("13");
		rerc.setEditable(false);
		rerc.setColumns(10);
		rerc.setBounds(91, 95, 60, 26);
		panel.add(rerc);
		
		rcs = new JTextField();
		rcs.setText("10");
		rcs.setName("rcs");
		rcs.setEditable(false);
		rcs.setColumns(10);
		rcs.setBounds(91, 116, 60, 26);
		panel.add(rcs);
		
		rjunts = new JTextField();
		rjunts.setText("8");
		rjunts.setName("rjunts");
rjunts.setEditable(false);
		rjunts.setColumns(10);
		rjunts.setBounds(91, 138, 60, 26);
		panel.add(rjunts);
		
		rpnv = new JTextField();
		rpnv.setText("6");
		rpnv.setName("rpnv");

		rpnv.setEditable(false);
		rpnv.setColumns(10);
		rpnv.setBounds(91, 160, 60, 26);
		panel.add(rpnv);
		
		rteruel = new JTextField();
		rteruel.setText("1");
		rteruel.setName("rteruelexiste");
		rteruel.setEditable(false);
		rteruel.setColumns(10);
		rteruel.setBounds(306, -1, 60, 26);
		panel.add(rteruel);
		
		rbildu = new JTextField();
		rbildu.setText("5");
		rbildu.setName("rbildu");
rbildu.setEditable(false);
		rbildu.setColumns(10);
		rbildu.setBounds(306, 23, 60, 26);
		panel.add(rbildu);
		
		rmaspais = new JTextField();
		rmaspais.setText("3");
		rmaspais.setName("rmaspais");
		rmaspais.setEditable(false);
		rmaspais.setColumns(10);
		rmaspais.setBounds(306, 47, 60, 26);
		panel.add(rmaspais);
		
		rcup = new JTextField();
		rcup.setText("2");
		rcup.setName("rcup");
		rcup.setEditable(false);
		rcup.setColumns(10);
		rcup.setBounds(306, 71, 60, 26);
		panel.add(rcup);
		
		rcc = new JTextField();
		rcc.setText("2");
		rcc.setName("rcc");
		rcc.setEditable(false);
		rcc.setColumns(10);
		rcc.setBounds(306, 95, 60, 26);
		panel.add(rcc);
		
		rnasuma = new JTextField();
		rnasuma.setText("2");
		rnasuma.setName("rnasuma");
		rnasuma.setEditable(false);
		rnasuma.setColumns(10);
		rnasuma.setBounds(306, 116, 60, 26);
		panel.add(rnasuma);
		
		rbng = new JTextField();
		rbng.setText("1");
		rbng.setName("rbng");
		rbng.setEditable(false);
		rbng.setColumns(10);
		rbng.setBounds(306, 138, 60, 26);
		panel.add(rbng);
		
		rprc = new JTextField();
		rprc.setText("1");
		rprc.setName("rprc");
		rprc.setEditable(false);
		rprc.setColumns(10);
		rprc.setBounds(306, 160, 60, 26);
		panel.add(rprc);
		
		JButton btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setBounds(123, 202, 117, 29);
		btnReiniciar.setActionCommand("reinicio");
		btnReiniciar.addActionListener(this);
		frame.getContentPane().add(btnReiniciar);
		

		
		progress = new MiProgressBar();
		progress.setBounds(10, 242, 345, 29);
		frame.getContentPane().add(progress);
		
		
		Setup();
		
	}
	

	/**
	 * Método que decide qué hacer con el evento efectuado en el frame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "reinicio":
			Reiniciar();
			break;
		default:
			for(Component comp : panel.getComponents()) {
				if(comp instanceof JCheckBox) {
					if(((JCheckBox) comp).getText().contentEquals(e.getActionCommand())) {						
						Descontar((JCheckBox)comp);
					}
				}
			}
		}	
	}
	/**
	 * Inicia el pactómetro colocando listeners y centrando el texto
	 */
	public void Setup() {
		for(Component comp : panel.getComponents()) {

			if(comp instanceof JCheckBox) {				
				((JCheckBox) comp).setSelected(true);
				((JCheckBox) comp).setActionCommand(((JCheckBox) comp).getText());
				((JCheckBox) comp).addActionListener(this);
			}
			if(comp instanceof JTextField) {
				((JTextField)comp).setHorizontalAlignment(SwingConstants.CENTER);
			}
			progress.setValue(getSuma());

		}
	}
	/**
	 * Reinicia el pactómetro
	 */
	public void Reiniciar() {
		System.out.println("Reiniciando el pactómetro");
		for(Component comp : panel.getComponents()) {
			if(comp instanceof JCheckBox) {
				((JCheckBox) comp).setSelected(true);
				
			}
		}
		progress.setValue(getSuma());

	}
	/**
	 * Descuenta el numero de escaños del JProgressBar del checkbox pasado como parámetro
	 * @param partido - CheckBox partido del que descontar escaños
	 */
	public void Descontar(JCheckBox partido) {
		for(Component comp : panel.getComponents()) {
			if(comp instanceof JTextField) {
				String name = ((JTextField) comp).getName();
				if(name.equalsIgnoreCase("r" + partido.getText())){
					if(!partido.isSelected()) {
						System.out.println("Se decuenta " + partido.getText() + " con " + ((JTextField) comp).getText() + " escaños");
						progress.setValue(getSuma());
					}else {
						progress.setValue(getSuma());
						System.out.println("Se suma " + partido.getText() + " con " + ((JTextField) comp).getText() + " escaños");
					}
				}
			}
		}
	}
	

	/**
	 * Obtiene la suma de todos los esca�os presentes en el frame
	 * @return suma - int - total de esca�os seleccionados
	 */
	public int getSuma() {
		int suma = 0;
		for(Component comp : panel.getComponents()) {
			if(comp instanceof JTextField) {
				for(Component check : panel.getComponents()) {
					if(check instanceof JCheckBox) {
						if(((JCheckBox) check).isSelected()) {
							String name = ((JTextField) comp).getName();
							if(name.equalsIgnoreCase("r" +((JCheckBox)check).getText())){
								suma += Integer.parseInt(((JTextField) comp).getText());
							}
						}
					}
				}
				
			}
		}		
		return suma;
	}
}
