package campingTrip;

public class Dinner extends Meal {
	
	/**
	 * Prepares dinner.
	 * pre: none
	 * post: Displays food and drink served for dinner that day.
	 */
	public void prepareDinner() {
		mealName = "dinner";
		if (mealDayNum == 1) {
			foodItems = "hamburger and fries";
			drink = "ginger ale";
		} else if (mealDayNum == 2) {
			foodItems = "pasta with sauce";
			drink = "club soda";
		} else {
			foodItems = "tacos";
			drink = "water";
		}
	}
}
