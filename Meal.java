package campingTrip;

import java.lang.Math;

public abstract class Meal {
	static String mealName, foodItems, drink;
	int foodEnjoyLevel, drinkEnjoyLevel;
	static int mealDayNum;
	static int mealLeaderPts;
	boolean reallyEnjoyedFood;
	
	/**
	 * Constructor
	 * pre: none
	 * post: The Day Number is determined and the meal leader points are initialized to 0.
	 */
	public Meal() {
		mealDayNum = 1;
		mealLeaderPts = 0;
	}
	
	/**
	 * Picks up the food for your meal.
	 * pre: none
	 * post: Displays the meal name and the food + drink you'll be having for that mean.
	 */
	public void pickUpFood() {
		System.out.println("You pick up your " + mealName + ". You will be eating " + foodItems + " with " + drink + ".");
	}
	
	/**
	 * Player eats their food for their meal.
	 * pre: none
	 * post: @return reallyEnjoyedFood (Determines whether or not you really enjoyed your food. [1/3] chance.)
	 */
	public boolean eat() {
		System.out.println("You ate your " + mealName + ".");
		foodEnjoyLevel = taste();
		drinkEnjoyLevel = taste();
		
		if (foodEnjoyLevel == 3) {	
			System.out.println("You really enjoyed your " + foodItems + "! You compliment the kitchen staff for a job well done! ");
			reallyEnjoyedFood = true;
		} else if (foodEnjoyLevel == 2) {
			System.out.print("You didn't mind eating your " + foodItems + ". ");
			reallyEnjoyedFood = false;
		} else {
			System.out.print("You disliked your " + foodItems + ". ");
			reallyEnjoyedFood = false;
		}
		return reallyEnjoyedFood;
	}
		
	/**
	 * Player drinks their drink.
	 * pre: none
	 * post: A message is displayed indicating hoe much they enjoyed their strength.
	 */
	public void drink() {
		if (drinkEnjoyLevel == 3) {
			System.out.println("You really enjoyed your " + drink + "!");
		} else if (drinkEnjoyLevel == 2) {
			System.out.println("You didn't mind drinking your " + drink + ".");
		} else {
			System.out.println("You disliked your " + drink + ".");
		}
	}
	
	/**
	 * Player tastes their meal.
	 * pre: none
	 * post: @return randNum (1/3 chance of 
	 */
	public int taste() {
		int randNum = (int) (3 * Math.random() + 1);
		return randNum;
	}
	
	/**
	 * Player cleans up food.
	 * pre: none
	 * post: A message is displaying stating so.
	 */
	public void cleanUpFood() {
		System.out.println("You clean yourself up and prepare for your next activity.");
	}
}



