package HeinigerLukas;
import robocode.*;




public class T8000_ extends JuniorRobot
{
	int north = 0;
	int west = 270;
	
	
	
	public void run() {
		
		setColors(black, white, red, yellow, black);	
		
		movement();
		
		while(true){
		
		turnGunLeft(360);	
		
		}
		
	}



		public void movement(){
		
		int heightdistanceToNorthWall;
		int widthdistanceToWestWall;
		heightdistanceToNorthWall = fieldHeight - robotY;
		widthdistanceToWestWall = fieldWidth - robotX;

		turnTo(north);
        ahead(heightdistanceToNorthWall);
        turnTo(west);
        ahead(widthdistanceToWestWall);

		}

		public void onScannedRobot() {
	    int myDistance = scannedDistance;
		out.println("My enemy: " + myDistance+ "," + scannedEnergy + "," + scannedAngle);
		turnGunTo(scannedAngle + scannedVelocity);
		
		fire(myDistance);
	
		
		
	}

	
	public void onHitByBullet() {
		
		turnAheadRight(200, 85);
	}
	
	
	public void onHitWall() {
	
	}	
	
	public void onHitByRobot(){
		
		turnTo(40);
		back(80);
		
	}

	public void fire(int distance){
		
		if (distance < 100)
		{ 
			fire(3);
		}
		if (distance < 200)
		{
			fire(1.5);
		}
		if (distance < 1500)
		{
			fire(1);
		}
	
	}
	

	
	
}