package horloge;


public final class CHoraire {
	
	private int iHORSecondes;
	private int iHORMinutes;
	private int iHORHeures;
	private static CHoraire HORInstance;
	
	private CHoraire() {
        
    }

    public static CHoraire getInstance() {
        if (HORInstance == null) {
        	HORInstance = new CHoraire();
        }
        return HORInstance;
    }
    
	public CHoraire HORAvoirInstance() {
    	return HORInstance;
    }
    
    
    public int HORLireSecondes() {
		return iHORSecondes;
	}

	public void HORDefinirSecondes(int iHORSecondes) {
		this.iHORSecondes = iHORSecondes;
	}

	public int HORLireMinutes() {
		return iHORMinutes;
	}

	public void HORDefinirMinutes(int iHORMinutes) {
		this.iHORMinutes = iHORMinutes;
	}

	public int HORLireHeures() {
		return iHORHeures;
	}

	public void HORDefinirHeures(int iHORHeures) {
		this.iHORHeures = iHORHeures;
	}


    
    
 }