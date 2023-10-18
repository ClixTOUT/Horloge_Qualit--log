package horloge;

import java.util.ArrayList;


public class CControleurHoraire implements Runnable{
	private CHoraire CHRHoraire;
	private ArrayList<CAffichageHoraire> IAFHCHRAffichage;
private TimeClockFrame TCF;
	
	public CControleurHoraire() {
		TCF = new TimeClockFrame();
		CHRHoraire = CHoraire.getInstance();
		IAFHCHRAffichage = new ArrayList<CAffichageHoraire>();
	}
	public CControleurHoraire(CSourceHoraire horaire) {
		this();
		CHRHoraire.HORDefinirSecondes(horaire.getiSecondesInitiales());
		CHRHoraire.HORDefinirMinutes(horaire.getiMinutesInitiales());
		CHRHoraire.HORDefinirHeures(horaire.getiHeuresInitiales());
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
	public void CHRAfficherAffichage() {
		int i=0;
		for(CAffichageHoraire index: IAFHCHRAffichage)
		{
			if(i==0) {
				TCF.Panel.setEnglishText(index.AFHAfficherTexte());
				i++;
			}else {
				TCF.Panel.setUnivText(index.AFHAfficherTexte());
			}
		}
	}
	
	@Override
	public void run() {
		  while (true) {
              try {
                  CHRActualiseHorloge();
                CHRActualiserAffichage();
                CHRAfficherAffichage();
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
		
	}
}