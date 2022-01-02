package campingTrip;

public class Hiking extends CampActivity{

	boolean personInjured;
	
	/**
	 * constructor
	 * pre: none
	 * post: Initializes 'personInjured' to false since no one is injured initially.
	 */
	public Hiking() {
		personInjured = false;
	}
	
	/**
	 * You follow Antonio.
	 * pre: none
	 * post: You either both make it back to the group safely, or get caught and lose leadership points.
	 */
	public void followAntonio() {
		System.out.println("You decide to join Antonio, towards the rock. There is a decent chance that either of you could face an minor injury."
				+ "Antonio climbs the rock first.");
		
		randNum = (int) (10 * Math.random() + 1);
		
		if (randNum <= 5) {		//50% chance of Antonio becoming injured.
			System.out.print("Antonio injures himself and screams. ");
			personInjured = true;
		} else {
			System.out.print("Antonio makes it up and down from the rock safely. ");
			randNum = (int) (10 * Math.random() + 1);
			if (randNum <= 5 ) {	//50% chance of you becoming injured.
				System.out.print("You injure himself and scream. ");
				personInjured = true;
			} else {
				System.out.print("You make it up and down from the rock safely. ");
			}
		}
		
		if (personInjured) {	//Occurs if either of you were injured
			System.out.print("The group hears this scream and races towards you two. \nThey first ensure that both of you are alright and you are then "
					+ "lectured not to ever leave the trail again. You feel ashamed for what you've one and worry about it for the rest of the hike.");
			System.out.println("You lose 5 leadership points.");
			leaderPts -= 5;
		} else {	//Occurs if neither of you were injured
			System.out.println("You tell Antonio that you two should catch up with the others and he agrees since. You catch up with the group without them ever"
					+ " knowing that you were gone.");
			System.out.println("Your friendship points with Antonio increased by 3!");
			antonioFriendPts += 3;
		}
	}
	
	/**
	 * You leave Antonio be in this scinareo. He goes to the rock while you stay.
	 * pre: none
	 * post: Antonio either becomes injured and you report his injury, or he doesn't get injured and no one notices.
	 */
	public void leaveAntonioBe() {
		System.out.println("You tell Antonio that you're not going with him. Antonio responds with 'Your loss!' and goes to climb the rock.");
		randNum = (int) (10 * Math.random() + 1);
		
		if (randNum <= 5) {	 //50% chance of Antonio becoming injured.
			System.out.print("Antonio injures himself and screams. ");
			personInjured = true;
		} else {
			System.out.print("Antonio makes it up and down from the rock safely. You both travel back to the group without them noticing, and continue on the hike.");
		}
		
		if (personInjured) {
			System.out.println("You call out to the counselors. They race back to where you are and attend to Antonio's wounds. While Sean lectures Antonion, "
					+ "\nRebecca thanks you for reaching out, as she never would have known otherwise and worries about what could have happened.");
			System.out.println("Your leadership points increase by 3!");
			leaderPts += 3;
		}
	}
	
	/**
	 * You warn Antonio not to climb the rock in this scinareo.
	 * pre: none
	 * post: You report Antonio for his actions before any harm can be done.
	 */
	public void warnAntonio() {
		System.out.println("You warn Antonio not to leave the group, but he defies you, saying that you are no fun. This prompts you to report to the counselors"
				+ " immediately.\nSean lectures Antonio about the importance of not leaving the trail while Rebecca thanks you for doing the right thing.");
		System.out.println("Antonio is not pleased with you, however. Your friendship points with him decrease by 3 but your leadership points increase by 5!");
		antonioFriendPts -= 3;
		leaderPts += 5;
	}
}
