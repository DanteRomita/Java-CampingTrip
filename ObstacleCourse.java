package campingTrip;

public class ObstacleCourse extends CampActivity{
	boolean injured;
	
	/**
	 * constructor
	 * pre: none
	 * post: Initializes 'injured' to false since you are not injured before the activity.
	 */
	public ObstacleCourse() {
		injured = false;
	}
	
	/**
	 * The player decides to speed through each obstacle.
	 * pre: none
	 * post: Athletic points are gained throughout until a potential injury. If completed safely, you gain max athletic points.
	 */
	public void speedThroughObstacles() {
		injured = false;
		System.out.println("You decide to speed through each obstacle. You realize that there is a decent risk of injury as you encounter each obstacle, and that"
				+ "it's a risk you're willing to take.");
		
		System.out.println("You begin the course. Your first obstacle is crawling through a plastic tube.");
		randNum = (int) (10 * Math.random() + 1);
		
		if (randNum == 1) {	//10% chance of injury.
			System.out.println("You end up rubbing up against the plastic the wrong way & end up with a serious burn that prevents you from continuing.");
			injured = true;
		} else {
			System.out.println("You pass the plastic tube safely and move onto the next obstable. Your athletic points increased by 1!");
			athleticPts += 1;
		}
		
		if (injured == false ) {
		System.out.println("Your second obstacle is tire traversing, where you'll need to step in the centre of each tire.");
		randNum = (int) (10 * Math.random() + 1);
		}
		if (randNum <= 2 && injured == false) {	//20% chance of injury if you are not injured already.
			System.out.println("You end up tripping on a tire and land face-first. This injury prevents you from continuing.");
			injured = true;
		} else if (injured == false) {	//The player can only continue if they are not injured already.
			System.out.println("You step across each tire safely and move onto the next obstacle. Your athletic points increase by 2!");
			athleticPts += 2;
		}

		if (injured == false ) {
		System.out.println("Your third obstacle is crawling up a spiderweb made up of net.");
		randNum = (int) (10 * Math.random() + 1);
		}
		
		if (randNum <= 3 && injured == false) {	//30% chance of injury if you are not injured already.
			System.out.println("You end up getting rope burn. This injury prevents you from continuing.");
			injured = true;
		} else if (injured == false) {	//The player can only continue if they are not injured already.
			System.out.println("You manage to climb up to the top of the rope structure safely and reach a platform above. Your athletic points increase by 3!");
			athleticPts += 3;
		}
		
		if (injured == false ) {
		System.out.println("Your fourth obstacle is a rope swing platform. You are safely attatched to a harness but still jump on each of them at full speed!");
		randNum = (int) (10 * Math.random() + 1);
		}
		
		if (randNum <= 2 && injured == false) {	//20% chance of injury if you are not injured already.
			System.out.println("You end up slipping off the platform and scraping your legs. This injury prevents you from continuing.");
			injured = true;
		} else if (injured == false) {	//The player can only continue if they are not injured already.
			System.out.println("You swing across each platform safely and swiftly. Your athletic points increased by 2!");
			athleticPts += 2;
		}
		
		if (injured == false ) {
		System.out.println("Your fifth and final obstacle is a balance beam. This poses the highest risk to you, but you're dedicated to continue at full speed"
				+ " at this point.");
		randNum = (int) (10 * Math.random() + 1);
		}
		
		if (randNum <= 5 && injured == false) {	//50% chance of injury if you are not injured already.
			System.out.println("You end up falling off the balance beam and fall to the ground about 3ft below you, injuring your arm in an attempt to break your"
					+ " fall.");
			injured = true;
		} else if (injured == false) {	//The player can only continue if they are not injured already.
			System.out.println("You make it across the balance beam safely and complete the course successfully! Your athletic points increase by 2!");
			athleticPts += 2;
		}
		
		if (injured) {	//If the player got injured at any point.
			System.out.println("Rebecca rushes to your aid with a first aid kit and attends to your wounds. She wishes that you didn't rush through the course."
					+ "\nYou will be alright for the rest of the day, however.");
		} else {	//If the player did not get injured at any point.
			System.out.println("The camp counselors and your camp-mates stare at you in awe with your sheer speed and skill! Antonio, in particular, compliments"
					+ " you and earns a lot of respect from you. Your friendship points with Antonio increased by 5!");
			antonioFriendPts += 5;
		}
	}
	
	/**
	 * The player strategically traverses each obstacle
	 * pre: none
	 * post: Athletic points increase.
	 */
	public void strategicThroughObstacles() {
		System.out.println("Since you have decided to take a safe, strategic approach, you know there won't be any risk of injury.\n"
				+ "You pass safely through the plastic tube, traverse the tires, climb the spiderweb net, swing across the rope platform and walk across the "
				+ "balance beam. The entire group applauds you, and you do the same for them on their attempts to complete the course!");
		System.out.println("Your athletic points increased by 3!");
		athleticPts += 3;
	}
}
