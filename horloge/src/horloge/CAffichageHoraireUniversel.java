package horloge;

public class CAffichageHoraireUniversel extends CAffichageHoraire{
    public CAffichageHoraireUniversel() {
    }

    public String AFHAfficherTexte() {
        return (sAHRTexte.split(":")[0] + "h" + sAHRTexte.split(":")[1]);
    }

    @Override
    public void notify(String SParam) {
        // TODO Auto-generated method stub
        AFHModifierTexte(SParam);
    }
}