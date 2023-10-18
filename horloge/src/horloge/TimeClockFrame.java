package horloge;

import javax.swing.JFrame;

/**
 * Display the frame of the time clock
 */
public class TimeClockFrame extends JFrame{

	/**
	 * Constructor, display the frame
	 */
	public TimeClockFrame() {
		super();
		Afficher();
	}
	
	/**
	 * set the parameters for the frame
	 */
	private void Afficher() {
		setTitle("Horloge");
		setSize(700,325);
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On autorise le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
