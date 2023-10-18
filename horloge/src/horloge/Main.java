package horloge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CControleurHoraire H = new CControleurHoraire(new CSourceHoraireCPU());
		H.CHRAjouterAffichage(new CAffichageHoraireAnglais());
		H.CHRAjouterAffichage(new CAffichageHoraireUniversel());
		new Thread(H).start();
	}

}
