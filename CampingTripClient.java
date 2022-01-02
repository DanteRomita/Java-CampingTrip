/**
 * CampingTripClient.java
 * A Choose-Your-Own-Advanture program that takes the player on an overnight camping experience.
 * @author Dante Romita
 * ICS 4U1 - CPT
 */

package campingTrip;

import java.util.Scanner;
import java.lang.String;

public class CampingTripClient {
	
	//Object declarations
	static Scanner input = new Scanner(System.in);
	static String choice;	//The String data type will be used as the input method to prevent program breaking.
	
	static Breakfast breakfastEater = new Breakfast();
	static Lunch lunchEater = new Lunch();
	static Dinner dinnerEater = new Dinner();
	
	static IceBreakers newCamper = new IceBreakers();
	static Campfire camper = new Campfire();
	static Kayaking kayaker = new Kayaking();
	static RockClimbing rockClimber = new RockClimbing();
	static ObstacleCourse courseParticipant = new ObstacleCourse();
	static Archery archer = new Archery();
	static Hiking hiker = new Hiking();
	
	//Variable declarations
	static boolean madeAFriend;
	static final int minAthleticPts = 20, minLeaderPts = 20, minAntonioPts = 10, minMelissaPts = 10, minSarahPts = 10;
	static int totalLeaderPts;
	
	public static void main(String[] args) {
		
		//GAME START
		System.out.println("Algonquin Camp by Dante Romita\n");
		
		do {	//Entire game takes place within this do-while loop.
			
			//Initializes all counters to 1 and accumulators to 0.
			CampActivity.athleticPts = 0;
			
			CampActivity.leaderPts = 0;
			Meal.mealLeaderPts = 0;
			totalLeaderPts = 0;
			
			CampActivity.antonioFriendPts = 0;
			CampActivity.melissaFriendPts = 0;
			CampActivity.sarahFriendPts = 0;
			
			CampActivity.sameInterestAntonio = false;
			CampActivity.sameInterestMelissa = false;
			CampActivity.sameInterestSarah = false;
			
			Campfire.talkedToAntonio = false;
			Campfire.talkedToMelissa = false;
			Campfire.talkedToSarah = false;
			
			madeAFriend = false;
			
			CampActivity.dayNum = 1;
			Meal.mealDayNum = 1;
			
			//---DAY 1---//
			
			System.out.println("DAY 1:\n");
			
			System.out.println("You read a sign that says 'Welcome to Algonquin Camp!' You've been excited, yet nervous about this camping experience for quite some time now.");
			System.out.println("You have never been camping before, but your parents have been encouraging you throughout the whole drive.");
			System.out.println("You are informed that this camping experience is tight-kint, with only 2 counselors and 3 other campers. ");
			System.out.println("You contemplate whether to focus on making friends, mastering all of the athletic activities, or take a leadership position.");
			System.out.println("The car pulls up to the camp enterace. You step out of the car and are then greeted by two counselors.");
			System.out.print("They tell you that their names are Rebecca and Sean. They are very happy to have you here.\nIn what manner will you respond? ");
			System.out.println("(1 = Reluctantly/Shyly, 2 = Respectfully, 3 = Confidently/Boastingly)");
			
			threeChoices();		//Occurs when there are three choices to choose from.
			newCamper.firstImpression(choice);		//Passes the choice to the corresponding method.
			
			System.out.println("\nSean directs you to follow him to the campsite, where you meet the other campers. You first notice that they all look "
					+ "to be around the age of 13, which is your age!");
			System.out.println("You first turn your attention to a boy with a muscular build. He looks like he's in shape.");
			System.out.println("You then look to see a quiet, shy girl who is reluctant to make direct eye contact with anyone.");
			System.out.println("You look to the right to see a third girl who doesn't take her eyes off her phone.");
			
			System.out.println("\nFIRST-DAY ACTIVITY: ICE BREAKERS\n");
			
			System.out.println("The camp counselors introduce themselves to all of the campers and announce that the first activity will be icebreakers."
					+ "\nThey encourage all of you to introduce one fact about yourselves along with what goal you have for your camping experience.");
			
			System.out.println("First, the athletic boy introduces himself first. His name is Antonio. He presents himself as the outdoorsy, athletic type. "
					+ "\nHis goal is to enjoy himself throughout the camp's activities and push his body further.");
			System.out.println("Next, the shy girl attempts to introduce herself. She's reluctant at first, and then speaks in a cautious voice. Her name is Melissa. "
					+ "\nShe explains that she likes to keep to herself and hopes that she can break out of her shell with a trusted group.");
			System.out.println("It's now the turn of the girl who's on her phone. She doesn't initially respond. It takes a second calling to get her attention."
					+ "\nShe apologizes and introduces herself. Her name is Sarah. She aspires to be a social media influencer and is extraverted. "
					+ "\nShe's trying to work on reaching out to others beyond her local friend group."); 
			
			System.out.println("\nNow, it's your turn. What would you like to say about yourself?");
			System.out.println("I love sports and outdoor activies. (1)");
			System.out.println("I love video games and technology. (2)");
			System.out.println("I enjoy school and learning. (3)");
			System.out.println("Nothing interesting, sticking to generic attributes. (4)");
			
			fourChoices();	//Occurs when there are four options to choose from.
			newCamper.introduceYourself(choice);
			
			System.out.println("\nRebecca thanks everyone for introducing themselves. She and Sean hope that everyone will have an amazing time at Algonquin camp.");
			System.out.println("Sean explains that there's a lot to look forward to. He says that if you take initiative to participate in activities, "
					+ "you can earn some special certificates!\nHe says you should aim for at least one of the following three goals:");
			System.out.println("\t1. Develop an amazing relaionship with a friend.");
			System.out.println("\t2. Win the most athletic award. (Gain Athletic Points)");
			System.out.println("\t3. Win the leadership award. (Gain Leadership Points)");
			
			System.out.print("\nRebecca then invites you to dinner at a log cabin. As you walk with the group, Rebecca explains how every meal will offer a"
					+ "new type of food and drink for you to enjoy.\nYou feel like you are going to love some foods and possibly dislike others. ");
			
			System.out.println("You prepare for dinner.");
			
			dinnerEater.prepareDinner();
			dinnerEater.pickUpFood();

			if (dinnerEater.eat()) {	//Returns a boolean value that determines whether or not you really liked a meal.
				increaseMealPts();		//Really liking a meal prompts the player to compliment the chefs, thus increasing leadership points.
			}
			dinnerEater.drink();
			dinnerEater.cleanUpFood();
			
			System.out.println("After dinner, Sean explains that after dinner, the group always assembles around a campfire for the rest of evening."
					+ "\nThis is considered downtime, a time where you can socialize with anyone and get to know them a whole lot more.");
			System.out.println("You figured that it would be best to decide in advance who you'd like to talk to each night.");
			
			campfireTalk();		//The Campfire activity occurs multiple times throughout the program, so it is called in a method.
			CampActivity.sleep(Meal.mealLeaderPts);	//Passes 'mealLeaderPts' to the sleep() method to help calculate the current Leader Point total.
			
			//---DAY 2---//
			Meal.mealDayNum = 2;
			System.out.println("\nDAY 2:\n");
			
			System.out.println("You wake up, ready to start another day! Once everyone wakes up, you then travel to breakfast together.");
			breakfastEater.prepareBreakfast();
			breakfastEater.pickUpFood();
			
			if (breakfastEater.eat()) {
				increaseMealPts();
			}
			breakfastEater.drink();
			breakfastEater.cleanUpFood();
			
			System.out.println("\nMORNING ACTIVITY: KAYAKING\n");
			
			System.out.println("Sean and Rebecca both guide you to a large, nearby lake. Sean explains how you have the freedom to choose what you would like"
					+ " to do, within reason.\nWhat will you decide? (1 = Race with Antonio, 2 = Free Paddle Across the Lake, 3 = Ask For Kayaking Assistance)");
			threeChoices();
			
			if (choice.equals("1")) {
				System.out.println("You decide to race against Antonio. You hop into a kayak and he explains the rules to you.You two will race around the river"
						+ " and the first one back to the dock wins.\nWhen he says 'GO' the race will begin. What approach will you take? "
						+ "(1 = Speedy, 2 = Strategically/Skillfully)");
				twoChoices();	//Choose between two choices to determine your speed during the race
				
				if (choice.equals("1")) {	//Race Antonio
					kayaker.raceFast();
				} else {
					System.out.println("You choose to race strategically and skillfully. Little did you know at the time, but this would guarantee your victory!" );
					kayaker.winRace();
				}
			} else if (choice.equals("2")) {	//Paddle Freely
				kayaker.paddleFreely();
			} else {					//Ask for help
				kayaker.kayakingHelp();	
			}
			
			System.out.println("You finish kayaking at noon and head to lunch with the group.\n");
			lunchEater.prepareLunch();
			lunchEater.pickUpFood();
			
			if (lunchEater.eat()) {
				increaseMealPts();
			}
			
			lunchEater.drink();
			lunchEater.cleanUpFood();
			
			System.out.println("\nAFTERNOON ACTIVITY: ROCK-CLIMBING WALL\n");
			
			System.out.println("Rebecca leads you and the group to a rock-climbing wall in the woods. Rebecca explains safety procedures and how to climb up "
					+ "the wall.\nThere are specific sections that are more difficult than others, and you can choose which one you’d like to partake in."
					+ "\nAntonio tries the hard route, Sarah tries the medium route. Melissa struggles with the easy route. Which route will you take?");
			System.out.println("(1 = Difficult Route, 2 = Medium Route, 3 = Easy Route, 4 = Help Melissa)");
			fourChoices();

			if (choice.equals("1")) {	//Climb the Difficult wall
				rockClimber.climbHardWall();
			} else if (choice.equals("2")) {		//Climb the Medium wall
				rockClimber.climbMediumWall();
			} else if (choice.equals("3")) {		//Climb the Easy wall
				rockClimber.climbEasyWall();
			} else {	//Help Melissa
				rockClimber.helpMelissa();
			}
			
			System.out.println("Afer your rock-climbing activity is complete, you and the group head over to dinner.\n");
			dinnerEater.prepareDinner();
			dinnerEater.pickUpFood();

			if (dinnerEater.eat()) {
				increaseMealPts();
			}
			dinnerEater.drink();
			dinnerEater.cleanUpFood();
			
			campfireTalk();	
			CampActivity.sleep(Meal.mealLeaderPts);
			
			//---DAY 3---//
			
			Meal.mealDayNum = 3;
			System.out.println("\nDAY 3:\n");
			
			System.out.println("You wake up, ready to start another day! Once everyone wakes up, you then travel to breakfast together.");
			breakfastEater.prepareBreakfast();
			breakfastEater.pickUpFood();
			
			if (breakfastEater.eat()) {
				increaseMealPts();
			}
			breakfastEater.drink();
			breakfastEater.cleanUpFood();
			
			System.out.println("\nMORNING ACTIVITY: OBSTACLE COURSE\n");
			
			System.out.println("You all head over to the camp's obstacle course. There, Sean explains that each participant will partake in the course one at "
					+ "a time.\nYou will encounter various obstacles such as platforming, climbing, tube-crawling, rope-ascending, pole-sliding, etc."
					+ "\nWill you volunteer to go first? (1 = Yes, 2 = No)");
			twoChoices();
			
			if (choice.equals("1")) {	//You volunteer to go first
				System.out.println("Sean admires your enthusiasm! He thanks you for volunteering! Your leadership points increased by 3!");
				CampActivity.leaderPts += 3;
			} else {
				System.out.println("Antonio decides to volunteer first, and the rest of the campers soon follow. You end up going last.");
			}
			
			System.out.println("What approach will you take when partaking in the obstacle course? (1 = Speedy, 2 = Strategic)");
			twoChoices();
			
			if (choice.equals("1")) {
				courseParticipant.speedThroughObstacles();
			} else {
				courseParticipant.strategicThroughObstacles();
			}
			
			System.out.println("After everyone completes the obstacle course, you all break for lunch.\n");
			
			System.out.println("Once everyone completes the obstacle course, head to lunch with the group.");
			lunchEater.prepareLunch();
			lunchEater.pickUpFood();
			
			if (lunchEater.eat()) {
				increaseMealPts();
			}
			
			lunchEater.drink();
			lunchEater.cleanUpFood();
			
			System.out.println("\nAFTERNOON ACTIVITY: ARCHERY\n");
			
			System.out.println("Rebecca leads you all to an open field complete with targets, bows and arrows. She teaches each of you how to peoperly shoot at"
					+ " one of the targets.\nYou each take a bow and begin practicing one at a time.\nAntonio and Melissa have no problems handling bow, but Sarah"
					+ " looks as though she's having difficulties.");
			System.out.println("What will you do? (1 = Align for Max Power, 2 = Take a strategic approach, 3 = Assist Sarah)");
			
			threeChoices();
			
			if (choice.equals("1")) {
				archer.maximumPower();
			} else if (choice.equals("2")) {
				archer.strategicShot();
			} else {
				archer.helpSarah();
			}
			
			System.out.println("Afer your archery activity is complete, you and the group head over to dinner.\n");
			dinnerEater.prepareDinner();
			dinnerEater.pickUpFood();

			if (dinnerEater.eat()) {
				increaseMealPts();
			}
			dinnerEater.drink();
			dinnerEater.cleanUpFood();
			
			campfireTalk();	
			CampActivity.sleep(Meal.mealLeaderPts);
			
			//---DAY 4---//
			
			Meal.mealDayNum = 4;
			System.out.println("\nDAY 4 - THE FINAL DAY:\n");
			
			System.out.println("You wake up, ready for your last day! Once everyone wakes up, you then travel to breakfast together.");
			breakfastEater.prepareBreakfast();
			breakfastEater.pickUpFood();
			
			if (breakfastEater.eat()) {
				increaseMealPts();
			}
			breakfastEater.drink();
			breakfastEater.cleanUpFood();
			
			System.out.println("\nMORNING ACTIVITY: HIKING\n");
			
			System.out.println("Both counselors lead you along a hiking trial and encourage you to enjoy nature and the secnery in the final few hours that "
					+ "you have together.\nRebecca advises that you all stick the the trail and all of you do so, until Antonio pulls you aside."
					+ "\nHe informs you that he found a big rock in a nearby river close to the short. He tries to persuade you in joining him. What will you do?");
			System.out.println("(1 = Join Him, 2 = Leave Him Be, 3 = Warn Him)");
			
			threeChoices();
			
			if (choice.equals("1")) {
				hiker.followAntonio();
			} else if (choice.equals("2")) {
				hiker.leaveAntonioBe();
			} else {
				hiker.warnAntonio();
			}
			
			System.out.println("After the hike, everyone returns back to camp. There, the awards ceremony commences.\n");
			
			//-Closing Ceremony-//
			
			System.out.println("Rebecca reminds you once again of the possible awards: Leadership, Athletics, Make a Friend.");
			
			System.out.println("She unveils the first award: Athletics. This award goes to...");
			
			totalLeaderPts = CampActivity.leaderPts + Meal.mealLeaderPts;
			
			if (CampActivity.athleticPts >= minAthleticPts) {
				System.out.println("YOU! You receive a standing ovation from the campers. You go up to accept your reward and "
						+ "are very thankful!");
			} else {
				System.out.println("Antonio! You all applaud for him and he thanks you all for the award!");
			}
			
			System.out.println("Up next is the Leadership award! This award goes to...");
			
			if (totalLeaderPts >= minLeaderPts) {
				System.out.println("YOU! You receive a standing ovation from the campers. You go up to accept your reward and "
						+ "are very thankful!");
			} else {
				System.out.println("Sarah! You all applaud for her and she thanks you all for the award!");
			}
			
			System.out.println("For the last award, Sean asks everyone if they feel they were able to make any friends throughout this trip. You listen "
					+ "respectfully until it's your turn.\nPertaining to you, you wait to hear if anybody had an enjoyable time with you!");
			
			madeAFriend = false;
			
			if (CampActivity.antonioFriendPts >= minAntonioPts) {
				System.out.println("Antonio had an enjoyable time with you! He thanks you for partaking in athletic activities with him & says you're"
						+ " a real blast to hang out with!");
				madeAFriend = true;
			}
			
			if (CampActivity.melissaFriendPts >= minMelissaPts) {
				System.out.println("Melissa had an enjoyable time with you! She thanks you for supporting her and helping her break out of her shell!");
				madeAFriend = true;
			}
			
			if (CampActivity.sarahFriendPts >= minSarahPts) {
				System.out.println("Sarah had an enjoyable time with you! She thanks your for being kind, empathetic and understanding throughout the whole trip!");
				madeAFriend = true;
			}
			
			if (madeAFriend = true) {
				System.out.println("You are very grateful and happy that you finished off your camping experiene with a new friend!");
			}
			
			System.out.println("This concludes the Algonquin Camp experience! Sean and Rebecca thank you all for being with them and wish you all the best in"
					+ " your future endeavours!\nYour parents arrive to pick you up, you all say your goodbyes, and you tell your parents about your experience.");
			
			displayResults();
			
			//---MENU PROMPT TO PLAY GAME AGAIN---//
			
			System.out.println("\nWould you like to play again? (1 = Yes, 2 = No)");
			twoChoices();
		} while (choice.equals("1"));
		
		System.out.println("\nThank you for playing!");
		
	}
	
	/**
	 * This is evening activity that occurs each night.
	 * pre: none
	 * post: Completes the campfire activity
	 */
	public static void campfireTalk() {
		boolean talkedToSomeone = false;
		System.out.println("\nEVENING ACTIVITY: CAMPFIRE\n");
		do {
			System.out.println("Who will you talk to? (1 = Antonio, 2 = Melissa, 3 = Sarah)");
			threeChoices();
			
		if (choice.equals("1") && Campfire.talkedToAntonio == false) {	//Speak to Antonio only if you didn't speak to her on a previous night.
			System.out.print("You have chosen to speak with Antonio. ");
			Campfire.talkedToAntonio = true;
			if (CampActivity.sameInterestAntonio) {		//Occurs if you mentioned your interest in athletic activities during icebreakers
				System.out.println("As you approach him, he remembers that you mentioned your love of sports in icebreakers."
						+ "\nHe asks you what your favourite sport is. What sport will you choose?");
				System.out.println("(1 = Soccer, 2 = Hockey, 3 = Basketball)");
				
				threeChoices();
				camper.talkToAntonio_A(choice);
				talkedToSomeone = true;
			} else {
				System.out.print("When you sit down with Antonio, he tries to spark up conversation with you. He asks if you're interested in sports.\nIf so,"
						+ " to what degree? ");
				System.out.println("What will you respond with? (1 = Respectful, 2 = Dislike)");
				twoChoices();
				camper.talkToAntonio_B(choice);
				talkedToSomeone = true;
			}
				
		} else if (choice.equals("2") && Campfire.talkedToMelissa == false) {		//Speak to Melissa only if you didn't speak to her on a previous night.
			System.out.print("You have chosen to speak with Melissa. She is reluctant to engage with you at first, so you decide to start the conversation. ");
			Campfire.talkedToMelissa = true;
			if (CampActivity.sameInterestMelissa) {		//Occurs if you mentioned your interest in video games and technology
				System.out.println("You remember that she perked up when you shared your interest in video games and technology, so you decide to start with that.");
				System.out.println("What are you interested in the most regarding this topic? (1 = Video Games, 2 = Programming, 3 = Robotics)");
				
				threeChoices();
				camper.talkToMelissa_A(choice);
				talkedToSomeone = true;
			} else {
				System.out.println("You try to encourage her to speak up. What will you say to try to spark up conversation?");
				System.out.println("(1 = Difficulty making friends, 2 = Ask about her interests, 3 = Why is she socially awkward?)");
				
				threeChoices();
				camper.talkToMelissa_B(choice);
				talkedToSomeone = true;
			}
				
		} else if (choice.equals("3") && Campfire.talkedToSarah == false) {		//Speak to Sarah only if you didn't speak to her on a previous night.
			Campfire.talkedToSarah = true;
			System.out.println("You have chosen to speak with Sarah. You notice that she is looks discracted and distraught, likely because she didn't have access"
					+ " to her phone.\nYou approach her, but she seems agitated. What will you do? (1 = Put her at ease, 2 = Ask why she is drawn to her phone)");
			twoChoices();
			camper.talkToSarah(choice);
			talkedToSomeone = true;
		} else {	//Occurs if you selected to speak with the same person for more than one evening. You must speak to each character once.
			System.out.println("You have already spoken to this person. Your counselors encourage you to speak to a new camper each night.");
		}
		
		} while (((choice.equals("1") && Campfire.talkedToAntonio) | (choice.equals("2") && Campfire.talkedToMelissa) | 
				(choice.equals("3") && Campfire.talkedToSarah)) && talkedToSomeone == false);		//Loop continues until you talk to a new person.
	}
	
	/**
	 * A method that determines the value of 'choice' when there are three options to choose from.
	 * pre: none
	 * post: 'choice' is either "1", or "2", otherwise the input validation loop continues until one of these values is true.
	 */
	public static void twoChoices() {
		do {
			System.out.print("Enter your selection here: ");
			choice = input.next();
			choice = choice.trim();
			if (!(choice.equals("1")) && !(choice.equals("2"))) {
				System.out.print("Invalid input. Please try again. ");
			}
		} while (!(choice.equals("1")) && !(choice.equals("2")));
	}
	
	/**
	 * A method that determines the value of 'choice' when there are three options to choose from.
	 * pre: none
	 * post: 'choice' is either "1", "2", or "3", otherwise the input validation loop continues until one of these values is true.
	 */
	public static void threeChoices() {
		do {
			System.out.print("Enter your selection here: ");
			choice = input.next();
			choice = choice.trim();
			if (!(choice.equals("1")) && !(choice.equals("2")) && !(choice.equals("3"))) {
				System.out.print("Invalid input. Please try again. ");
			}
		} while (!(choice.equals("1")) && !(choice.equals("2")) && !(choice.equals("3")));
	}
	
	/**
	 * A method that determines the value of 'choice' when there are three options to choose from.
	 * pre: none
	 * post: 'choice' is either "1", "2", "3" or "4", otherwise the input validation loop continues until one of these values is true.
	 */
	public static void fourChoices() {
		do {
			System.out.print("Enter your selection here: ");
			choice = input.next();
			choice = choice.trim();
			if (!(choice.equals("1")) && !(choice.equals("2")) && !(choice.equals("3")) && !(choice.equals("4"))) {
				System.out.print("Invalid input. Please try again. ");
			}
		} while (!(choice.equals("1")) && !(choice.equals("2")) && !(choice.equals("3")) && !(choice.equals("4")));
	}
	
	/**
	 * Increases leadership points stored the meal class.
	 * pre: none
	 * post: Increases leadership points by 2.
	 */
	public static void increaseMealPts() {
		System.out.println("The counselors take notice of your compliment and appreciation for the camp staff. (+2 Leadership Points)");
		Meal.mealLeaderPts += 2;
	}
	
	/**
	 * Displays the your adventure's results
	 * pre: none
	 * post: Determines whether or not you won the game, with information on which ending(s) you were able to obtain.
	 */
	public static void displayResults() {
		
		System.out.println("\nRESULTS:\n");
		
		System.out.print("Winning Ending #1 - Athletic Award. Your score: " + CampActivity.athleticPts + "/" + minAthleticPts + ".");
		if (CampActivity.athleticPts >= minAthleticPts) {
			System.out.println(" Success!");
		} else {
			System.out.println(" Unsuccessful.");
		}
		
		System.out.print("Winning Ending #2 - Leadership award. Your score: " + totalLeaderPts + "/" + minLeaderPts + ".");
		if (totalLeaderPts >= minLeaderPts) {
			System.out.println(" Success!");
		} else {
			System.out.println(" Unsuccessful.");
		}
		
		System.out.println("Winning Ending #3 - Make a new Friend. Antonio: " + CampActivity.antonioFriendPts + "/" + minAntonioPts + ", " + "Melissa: " + 
		CampActivity.melissaFriendPts + "/" + minMelissaPts + ", Sarah: " + CampActivity.sarahFriendPts + "/" + minSarahPts + ".");
		System.out.print("You were able to make friends with the following people:");
		
		if (CampActivity.antonioFriendPts >= minAntonioPts) {
			System.out.print(" Antonio ");
		}
		
		if (CampActivity.melissaFriendPts >= minMelissaPts) {
			System.out.print(" Melissa ");
		}
		
		if (CampActivity.sarahFriendPts >= minSarahPts) {
			System.out.print(" Sarah ");
		}
		
		if (!(CampActivity.antonioFriendPts >= minAntonioPts | CampActivity.melissaFriendPts >= minMelissaPts | CampActivity.sarahFriendPts >= minSarahPts)) {
			madeAFriend = false;
		}
		
		if (CampActivity.athleticPts >= minAthleticPts | totalLeaderPts >= minLeaderPts | madeAFriend) {
			System.out.println("\nYou win! Try for an different ending!");
		} else {
			System.out.println("\nYou lose. Try for a better ending.");
		}
	}
}
