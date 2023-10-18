package horloge;

import java.util.ArrayList;


public class CControleurHoraire {
	private CSourceHoraire CHRChemin;
	private CHoraire CHRHoraire;
	private ArrayList<CAffichageHoraire> IAFHCHRAffichage;
	
	
	public CControleurHoraire() {
		CHRHoraire = CHoraire.getInstance();
	}
	
	public void CHRActualiseHorloge() {
		CHRHoraire.HORupSecondes();
	}
	
	public void CHRActualiserAffichage() {
		String currentTime = CHRHoraire.HORLireHeures()+":"+CHRHoraire.HORLireMinutes()+":"+CHRHoraire.HORLireSecondes();
		for(CAffichageHoraire index: IAFHCHRAffichage)
		{
			
			index.notify(currentTime);
		}
	}
	
	public void CHRAjouterAffichage(CAffichageHoraire AFHParam) {
		IAFHCHRAffichage.add(AFHParam);
	}
	
	public void CHRSupprimerAffichage(int iParam) {
		IAFHCHRAffichage.remove(iParam);
	}
	
	public void CHRNotifierAffichage() {
		
	}
}