package horloge;

public abstract class CAffichageHoraire implements Observer{
	private String sAHRTexte;
	public CAffichageHoraire() {
		
	}	
	public void AFHModifierTexte(String sParam) {
		sAHRTexte = sParam;
	}
	abstract String AFHAfficherTexte();
}
	
