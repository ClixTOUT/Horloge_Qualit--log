package horloge;
import java.time.LocalTime;

public class CSourceHoraireCPU extends CSourceHoraire {
public CSourceHoraireCPU() {
	
}
	@Override
	public void InitVariables() {
		iHeuresInitiales = LocalTime.now().getHour();
		iMinutesInitiales = LocalTime.now().getMinute();
		iSecondesInitiales = LocalTime.now().getSecond();
	}

}
