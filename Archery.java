package campingTrip;

public class Archery extends CampActivity{
	
	/**
	 * Occurs if you choose to draw maximum power to your bow.
	 * pre: none
	 * post: You lose leadership points, but gain sympathy from Antonio.
	 */
	public void maximumPower() {
		System.out.println("You draw your bow back at maximum power, and fire. It comes in close contact with Rebecca and breaks the target. She harshly "
				+ "lectures you about the importance of safety and only drawing back a reasonable amount as to not hurt any one."
				+ "\nYour leadership points decrease by 3, but Antonio admires your form. Your relationship points with Antonio increase by 1.");
		leaderPts -= 3;
		antonioFriendPts += 1;
		System.out.println("You shoot carefully from that point onwards, feeling guilty about what you've done for the rest of the afternoon");
	}
	
	/**
	 * Occurs if you choose to shoot strategically.
	 * pre: none
	 * post: Your friendship points with Melissa increase.
	 */
	public void strategicShot() {
		System.out.println("You take a strategic approach with each shot and land multiple bullseyes! Melissa admires your accruacy. She appreciates that you "
				+ "your calmness.\nTogether you make excellent shots one after another! Your friendship points with Melissa increase by 2!");
		melissaFriendPts += 2;
	}
	
	/**
	 * Occurs if you choose to help Sarah.
	 * pre: none
	 * post: Your leadership and friendship points with Sarah increase!
	 */
	public void helpSarah() {
		System.out.println("You approach Sarah, and explain to her the proper form and walk her through it slowly. She slowly gets the hang of it has you "
				+ "demonstrate.\nEventually, you both hit a bullseye! Sarah really appreciates your patience with her, and Rebecca takes note of your leadership!");
		System.out.println("Your friendship points with Sarah increase by 5 and your leadership points increase by 3!");
		sarahFriendPts += 5;
		leaderPts += 3;
	}
}
