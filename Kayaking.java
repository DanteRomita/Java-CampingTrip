package campingTrip;

public class Kayaking extends CampActivity{
	
	/**
	 * The player decides to race fast on the kayak.
	 * pre: none
	 * post: Either the player falls of the kayak, or wins the race.
	 */
	public void raceFast() {
		randNum = (int) (10 * Math.random() + 1);
		
		System.out.println("You begin paddling as fast as you can around the lake. Your kayak begins to wobble and you lose some control.");
		if (randNum >= 5) {
			System.out.println("You fall off your kayak into the cold water! Rebecca notices you, dives is and dives in to rescue you immediately."
					+ "You both make it back to shore safely and you spend the rest of the morning drying up.");
		} else {
			winRace();
		}
		
	}
	
	/**
	 * The player decides to be strategic in their kayaking technique.
	 * pre: none
	 * post: Antonio's friend points increase along with athletic points.
	 */
	public void winRace() {
		System.out.println("You win the race! Antonio admires your talent and skill.\nYour friendship points with Antonio increase by 3 and your athletic "
				+ "points increase by 5!");
		antonioFriendPts += 3;
		athleticPts += 5;
	}
	
	/**
	 * The player decides to paddle freely across the lake.
	 * pre: none
	 * post: Increase in athletic points.
	 */
	public void paddleFreely() {
		System.out.println("You decide to paddle freely around the lake at a leisurley pace for the rest of the morning. You earned 2 athletic points!");
		athleticPts += 2;
	}
	
	/**
	 * The player asks for help with kayaking.
	 * pre: none
	 * post: Increase in athletic points.
	 */
	public void kayakingHelp() {
		System.out.println("You ask for help with kayaking. Sean, an expert in kayaking, is more than happy to help! He helps get you geared up, teaching you"
				+ "the proper rowing techniques.\nYou decide to take a slow approach for the rest of the morning to be extra safe. You earned 1 athletic point!");
		athleticPts += 1;
	}
}
