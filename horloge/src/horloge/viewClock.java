package horloge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;


public class viewClock{
	private JPanel panel = new JPanel();
	private JLabel Heure_Anglais = new JLabel();;
	private JLabel Heure_Univ = new JLabel();
	
	
	public viewClock(String anglais, String Univ) {
		
		panel.setLayout(new GridBagLayout());
		

		GridBagConstraints c = new GridBagConstraints();
		
		c.weightx=0.6;
		c.weighty=0.6;
		
		Heure_Anglais.setText(anglais);
		Heure_Anglais.setFont(new Font("Courier New", 1, 24));
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=2;
		c.gridheight=1;
		panel.add(Heure_Anglais,c);
		panel.setVisible(true);
		
		
		Heure_Univ.setText(Univ);
		Heure_Univ.setFont(new Font("Adobe Arial Bold", 1, 47));
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=2;
		c.gridheight=1;
		panel.add(Heure_Univ,c);
		UpdateTimeRunnable updateTimeRunnable = new UpdateTimeRunnable();
        Thread updateTimeThread = new Thread(updateTimeRunnable);
        updateTimeThread.start();
	}

	public JLabel getLabelAnglais() {
		return Heure_Anglais;
	}

	public void setLabelAnglais(JLabel label) {
		this.Heure_Anglais = label;
	}
	
	public JLabel getLabelUniv() {
		return Heure_Univ;
	}

	public void setLabelTime(JLabel labelTime) {
		this.Heure_Univ = labelTime;
	}
	
	private class UpdateTimeRunnable implements Runnable {
        public void run() {
            while (true) {
                try {
                    updateLocalTime();
                    updateRoundTime();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        //on recupere l'heure modifié à l'aide de ces deux méthodes
        private void updateLocalTime() {
            String currentTime = ActualTimeDisplay.getLocalTime();
            labelTime.setText(currentTime);
            
            String currentDate = getLocalDate(); // Ajout de la méthode pour récupérer la date actuelle
            labelDate.setText(currentDate);
        }

        private void updateRoundTime() {
            String roundTime = DisplayActualRoundTime.getRoundTime();
            labelRoundTime.setText(" Horaire retenu : "+roundTime);
        }
    }
}