package horloge;

public abstract class CSourceHoraire {
	protected int iSecondesInitiales;
	protected int iMinutesInitiales;
	protected int iHeuresInitiales;

	public CSourceHoraire() {
		iSecondesInitiales = 0;
		iMinutesInitiales = 0;
		iHeuresInitiales = 0;
	}
	public abstract void InitVariables(int heure, int minute,int seconde);
	public void setiSecondesInitiales(int iSecondesInitiales) {
		this.iSecondesInitiales = iSecondesInitiales;
	}
	public void setiMinutesInitiales(int iMinutesInitiales) {
		this.iMinutesInitiales = iMinutesInitiales;
	}
	public void setiHeuresInitiales(int iHeuresInitiales) {
		this.iHeuresInitiales = iHeuresInitiales;
	}
	public int getiSecondesInitiales() {
		return iSecondesInitiales;
	}
	public int getiMinutesInitiales() {
		return iMinutesInitiales;
	}
	public int getiHeuresInitiales() {
		return iHeuresInitiales;
	}
}
