package campingTrip;

import java.lang.String;

public class IceBreakers extends CampActivity {
	
	/**
	 * Player's first choice upon meeting the two counselors.
	 * pre: @param choice ("1, "2, or "3")
	 * post: Your respond in one of three ways, potentially increasing leader points.
	 */
	public void firstImpression(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) {
			System.out.println("You hesitate to respond at first, then reluctantly say 'Hi.'Both counselors give you an empathetic look, "
					+ "\nassuring you that you are in a safe, inclusive environment.");
		} else if (this.choice.equals("2")) {
			System.out.println("You respond in a respectful manner regarding what you're looking forward to during this camping experience."
					+ "\nBoth counseollors admire your respect. They tell you that you have the potential to set a wonderful example for the other campers!");
			System.out.println("Your leadership points increased by 2!");
			leaderPts += 2;
		} else {
			System.out.println("You respond in a confident, even slightly arrogant manner.Both counselors look at you strangely for a moment."
					+ "\nRebecca hesitantlythanks you for sharing, but Sean looks eager to move on. "
					+ "You realize that you should be more careful with what you say in the future.");
		}
	}
	
	/**
	 * The player introduces themselves to the campers.
	 * pre: @param choice ("1", "2", "3" or "4")
	 * post: Friendship points can increase with various campers, and can unlocks one of three special options that allow you to become really great friends with
	 * 		 a camper.
	 */
	public void introduceYourself(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) {
			System.out.println("You say that you love sports, especially the joy of the game. Going out and meeting new people is what you live for. "
					+ "\nYou are now trying to meet people of other interest and think differently outside the sporting world.");
			System.out.println("This results in Antonio receiving a positive first impression to you. (+3 Antonio Friendship Points)");
			antonioFriendPts += 3;
			sameInterestAntonio = true;
		} else if (this.choice.equals("2")) {
			System.out.println("You talk about your love of video games and technology. It's allowed you maintain a few really amazing friends for years.");
			System.out.println("This results in Melissa receiving a positive first impression to you. (+3 Melissa Friendship Points)");
			melissaFriendPts += 3;
			sameInterestMelissa = true;
		} else if (this.choice.equals("3")) {
			System.out.println("You say you enjoy school a lot. You have an aptitude for learning and try your absolute best in everything you do.");
			System.out.println("This pleases the instructors a lot. (+3 Leadership Points)");
			sameInterestSarah = true;
		} else {
			System.out.println("You discuss nothing interesting about yourself. You say only your name and a generic fact like your favourite food or colour.");
			System.out.println("Everyone stares blankly at you except for Antonio, who appreciates your sense of humour. (+1 Antonio Friendship Points)");
			antonioFriendPts += 1;
		}
	}
}
