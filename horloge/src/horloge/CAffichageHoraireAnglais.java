package horloge;

public class CAffichageHoraireAnglais extends CAffichageHoraire{
    public CAffichageHoraireAnglais() {

    }

    public String AFHAfficherTexte() {
        int Heures = Integer.valueOf(sAHRTexte.split(":")[0]);
        int Minutes = Integer.valueOf(sAHRTexte.split(":")[1]);
        int Secondes = Integer.valueOf(sAHRTexte.split(":")[2]);


        if (Heures <=12) {
            return(Integer.toString(Heures) + "am:" + Integer.toString(Minutes) + " " + Integer.toString(Secondes)+"s");
        }
        else {
            return(Integer.toString(Heures-12) + "pm:" + Integer.toString(Minutes) + " " + Integer.toString(Secondes)+"s");
        }
    }

    @Override
    public void notify(String SParam) {
        // TODO Auto-generated method stub
        AFHModifierTexte(SParam);
    }

}