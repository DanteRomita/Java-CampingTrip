package campingTrip;

public class CampActivity {
	String activityName;
	String choice;
	static int athleticPts, leaderPts;
	static int antonioFriendPts, melissaFriendPts, sarahFriendPts;
	static boolean sameInterestAntonio, sameInterestMelissa, sameInterestSarah;
	static int dayNum;
	static int randNum;
	
	/**
	 * constructor
	 * pre: none
	 * post: All accumulators are initialized.
	 */
	public CampActivity() {
		athleticPts = 0;
		leaderPts = 0;
		antonioFriendPts = 0;
		melissaFriendPts = 0;
		sarahFriendPts = 0;
		
		dayNum = 1;
		
		sameInterestAntonio = false;
		sameInterestMelissa = false;
		sameInterestSarah = false;
	}
	
	/**
	 * The player heads to sleed and prepares for the next day.
	 * pre: @param mealLeaderPts
	 * post: Displays the player's current scores and increases the day by 1.
	 */
	public static void sleep(int mealLeaderPts) {
		System.out.println("Once it becomes late enough, you head to your cabin, wash up and head to sleep for the night.");
		System.out.println("\nDay " + dayNum + " completed! Here are your current results:");
		System.out.println("Athletic Points: " + athleticPts);
		System.out.println("Leadership Points: " + (leaderPts + mealLeaderPts));
		System.out.println("Friendship Points (Antonio, Melissa, Sarah respectively): " + antonioFriendPts + ", " + melissaFriendPts + ", " + sarahFriendPts);
		dayNum += 1;
	}
}

