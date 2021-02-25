package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	public void run() {
		while (frontIsClear())	{
			move();
			checkMiddleBeeper();
			if (noBeepersPresent())	{
				removeExtraBeepers();
			}
			move();
		}		
	}
	private void checkMiddleBeeper() {
		if (beepersPresent()) {
			move();
			move();
		}
	}
	private void removeExtraBeepers() {
		turnRight();
		checkBeeper();
		checkBeeper();
		turnLeft();
	}
	private void checkBeeper()	{
			move();
			while (beepersPresent()) {
				pickBeeper();
			}
	turnAround();
	move();
	
	}}