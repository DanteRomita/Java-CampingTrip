package campingTrip;

import java.lang.String;

public class Campfire extends CampActivity {
	static boolean talkedToAntonio, talkedToMelissa, talkedToSarah;
	
	/**
	 * constructor
	 * pre: none
	 * post: Initializes all 'talkedTo' variables to false as you haven't talked to any campers yet.
	 */
	public Campfire() {
		talkedToAntonio = false;
		talkedToMelissa = false;
		talkedToSarah = false;
	}

	public void talkToAntonio_A(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) {	//Soccer is chosen
			System.out.println("Antonio has respect for watching soccer, but never really got into it all that much. He'd like to discuss it"
					+ "with you. You dive into a deep analysis of the sport for the rest of the night.");
			System.out.println("You friendship points with Antonio increased by 2!");
			antonioFriendPts += 2;
		} else if (this.choice.equals("2")) {	//Hockey is chosen
			System.out.println("This pleases Antonio immensely, as he explains how he is a hockey fanatic! You two go into deep analysis of the upcoming"
					+ " hockey season.\nThis takes up the rest of your discussion and you both throughly enjoy yourselves!");
			System.out.println("Your friendship points with Antonio increased by 5!");
			antonioFriendPts += 5;
		} else { //Basketball is chosen
			System.out.println("Antonio has a profound respect for basketball and has friends who are very invested into the sport. You have a productive discussion"
					+ " for the rest of the night.");
			System.out.println("Your friendship points with Antonio increased by 3!");
			antonioFriendPts += 3;
		}
		talkedToAntonio = true;
	}
	
	public void talkToAntonio_B(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) { 	//You're respectful of sports.
			System.out.println("You explain that you are respectful of sports, but that you were simply never invested in it.");
			System.out.println("Antonio respects your position and helps introduce the culture of sports to you. This conversation continues throughout the "
					+ "night.\nYou gain an insightful understanding of the sporting world.");
			System.out.println("Your friendship points with Antonio increase by 1!");
			antonioFriendPts += 1;
		} else {	//You dislike sports.
			System.out.println("You tell Antonio that you dislike sports. When questioned why, you explained how the whole sporting culture and were even "
					+ "disrespected in it at times.\nAntonio doesn't understand how that would be possible. This results in awkward tension between you to"
					+ "for the rest of the night.");
			System.out.println("Your friendship points with Antonio decreased by 1.");
			antonioFriendPts -= 1;
		}
		talkedToAntonio = true;
	}
	
	public void talkToMelissa_A(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) {	//Video Games is chosen
			System.out.println("You begin a discussion with Melissa about video games. She tells you she loves video games, as it's her favourite hobby."
					+ "\nYou both then discuss your favourite genres and find many commonalities!");
			System.out.println("You friendship points with Melissa increased by 3!");
			melissaFriendPts += 3;
		} else if (this.choice.equals("2")) {	//Programming is chosen
			System.out.println("You discuss programming with her. She beams! Melissa tells you that she has an expertise in programming and computer developement."
					+ "\nYou two go into an in-depth discussion about all of the aspects of projects you've done and take the time to appreciate how powerful and"
					+ "productive it truly is for society!");
			System.out.println("Your friendship points with Melissa increased by 5!");
			melissaFriendPts += 5;
		} else { //Robotics is chosen
			System.out.println("You discuss robotics with her. She explains how she's always been fascinated by robotics competitions.\nShe says she's unfortunate"
					+ " to have never been able to develop hands-on skills. She admires people who can combine theoretical skills with practical knowledge.");
			System.out.println("Your friendship points with Antonio increased by 4!");
			melissaFriendPts += 4;
		}
		talkedToMelissa = true;
	}
	
	public void talkToMelissa_B(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) {	//Difficulty making friends is chosen
			System.out.println("Melissa explains how much she loves to play video games in her spare time. You learn that she's an introvert, who finds her energy"
					+ " and her place of comfort when she is by herself.\nYou empathize with her and discuss this into the night.");
			System.out.println("Your friendship points with Melissa increased by 1!");
			melissaFriendPts += 1;
		} else if (this.choice.equals("2")) {	//Asking about her interests is chosen
			System.out.println("She is reluctant to share her interests at first, explaing that she's had difficulties doing so in the past. You reassure her, "
					+ "showing that you mean no harm.\nShe then agrees to tell you about her favourite games, game genres, as well as her interest in computers and robotics. "
					+ "You go into a productive discussion about the importance of technology.");
			System.out.println("Your friendship points with Melissa increased by 2!");
			melissaFriendPts += 2;
		} else {	//Asking about her social awkwardness is chosen
			System.out.println("You ask why she is socially awkward. This makes her extremely uncomfortable. She informs you that this is the type of language "
					+ "that contributes to the stigma of mental health.\nShe is clearly hurt by your choice of words."
					+ " This creates tension between you two for the rest of the night. ");
			System.out.println("Your friendship points with Melissa decreased by 3;.");
			melissaFriendPts -= 3;
			talkedToMelissa = true;
		}

	}
	
	public void talkToSarah(String choice) {
		this.choice = choice;
		
		if (this.choice.equals("1")) {	//Empathetic approach
			System.out.println("You decide to take an understanding, empathetic approach to her situation. She thanks you for this."
					+ "\nShe informs you that she's honestly trying to escape her limited social bubble. It hasn't been easy for her, as she's missed her family"
					+ " ,friends and community. She's explains that her phone allows her to keep connected with them.\nYou understand how difficult it can be "
					+ "being apart from the ones you love. You wish the best for her in the future. She thanked you tremendously.");
			System.out.println("Your friendships points with Sarah increased by 5!");
			sarahFriendPts += 5;
		} else {	//Direct, judgmental approach
			System.out.println("You ask her directly as to why she is so drawn to her phone. She looks at you with disgust. She shares her frustrations with the"
					+ " assumptions that she's 'always on her phone'.");
			System.out.println("Awkward tension ensues for the rest of the night. Your friendship points with Sarah decreased by 3.");
			sarahFriendPts -= 3;
		}
		talkedToSarah = true;
	}

}

