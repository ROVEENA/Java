import stanford.karel.Karel;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Karel: 3. FillRowKarel
 * 
 * Karel wants to fill a row with beepers.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class FillRowKarel extends Karel {

	public void run() {
		fillBeeper();
		turnLeft();
		fillBeeper();
		turnLeft();
		fillBeeper();
		turnLeft();
		fillBeeper();
		turnLeft();
		fillmiddlerow();
		
	}
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	public void fillBeeper(){
		while(frontIsClear()){
			putBeeper();
			move();	
		}
	}
	
	public void fillmiddlerow(){
		turnLeft();
		move();
		turnRight();
		for(int i=0;i<3;i++)
		{
			move();
			putBeeper();
		}
		move();
	}
}
