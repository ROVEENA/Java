import stanford.karel.SuperKarel;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Karel: 7. WindowCleaningKarel
 * 
 * Karel's day job is to clean windows of skyscrapers in Chicago. He is facing
 * east, standing in front of the first skyscraper.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Ralph P. Lano
 */
public class WindowCleaningKarel extends SuperKarel {

	/**
	 * Karel has to clean five skyscrapers, one at a time.
	 * 
	 * PreCondition: Karel is standing in front of the first skyscraper, facing
	 * east <br/>
	 * PostCondition: Karel is standing behind the last skyscraper, facing east
	 */
	public void run() {
		//Big problem to clean five scrapers
		cleanFiveskyscrapers();
		
	}
	public void cleanFiveskyscrapers(){
        //Small problem of cleaning one scraper
		for(int i=0; i<5; i++)
		{
			cleanOneskyscraper();
		}
	}
	public void cleanOneskyscraper(){
		moveUpandClean();
		moveOVer();
		moveDownAndClean();
	}
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void moveOVer(){
		turnRight();
		move();
		move();
	}
	public void moveUpandClean(){
		turnLeft();
		while(rightIsBlocked()){
			move();
		}
	}
	public void moveDownAndClean(){
		turnRight();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}
	
}