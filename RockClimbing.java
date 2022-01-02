package campingTrip;

public class RockClimbing extends CampActivity{
	
	/**
	 * The player falls of the wall. Triggered by chance via other methods.
	 * pre: none
	 * post: Your rock-climbing session is over
	 */
	public void fallOffWall() {
		System.out.println("You end up falling off the wall when you're about halfway up, mildly injuring yourself. This forces you to rest "
				+ "for the remainder of the night.");
	}
	
	/**
	 * The player climbs the difficult wall.
	 * pre: none
	 * post: The player either falls of the wall or makes it to the top safely, increasing athletic points.
	 */
	public void climbHardWall() {
		randNum = (int) (10 * Math.random() + 1);
		
		System.out.println("You decide to take the difficult route. There is a decent chance that you may fall of the wall, but it's a risk you're willing to take.");
		
		if (randNum <= 5) { //50% chance of falling of wall.
			fallOffWall();
		} else {
			System.out.println("You use all of your might and strength to reach out to each rock and eventually reach the top of the difficult wall.");
			System.out.println("Your athletic points increased by 5!");
			athleticPts += 5;
		}
	}
	
	/**
	 * Player climbs the medium wall.
	 * pre: none.
	 * post: The player either falls of the wall or makes it to the top safely, increasing athletic points.
	 */
	public void climbMediumWall() {
		randNum = (int) (10 * Math.random() + 1);
		
		System.out.println("You decide to take the medium route. There's a slight chance of falling off the wall, but it's a risk you're willing to take");
		
		if (randNum <= 2) {	//20% chance of falling off the medium wall.
			fallOffWall();
		} else {
			System.out.println("You use all of your might and strenght to reach out to each rock and eventually reach the top of the difficult wall ");
			System.out.println("Your athletic points increased by 3!");
			athleticPts += 1;
		}
	}
	
	/**
	 * Player climbs the easy wall.
	 * pre: none.
	 * post: The player is guaranteed to make it to the top of the wall safely.
	 */
	public void climbEasyWall() {
		System.out.println("You decide to take the easy route and climb the wall with ease! Your athletic points increased by 1!");
		athleticPts += 1;
	}
	
	/**
	 * Player decides to help Melissa.
	 * pre: none
	 * post: Melissa friend points, leadership points and athletic points increase.
	 */
	public void helpMelissa() {
		System.out.println("You approach Melissa and ask about her concerns with climbing the rock wall. She tells you about her fear of heights."
				+ "\nYou decide to assist her in climbing, letting her go first and encouraging her every step of the way."
				+ "\nYou climb up with her and reassure that everything is alright every step of the way. She ends up slowly gaining confidence,"
				+ "\nAscends the rock wall and eventually makes it to the top! She really appreciates your patience with her and the counselors take notice"
				+ " as well!");
		System.out.println("Your friendship points with Melissa increase by 3, leadership points by 5 and athletic points by 1!");
		melissaFriendPts += 3;
		leaderPts += 5;
		athleticPts += 1;
	}
}
