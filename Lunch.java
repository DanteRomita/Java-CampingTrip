package campingTrip;

public class Lunch extends Meal {
	
	/**
	 * Prepares dinner.
	 * pre: none
	 * post: Displays food and drink served for dinner that day.
	 */
	public void prepareLunch() {
		mealName = "lunch";
		if (mealDayNum == 2) {
			foodItems = "sandwich";
			drink = "apple juice";
		} else if (mealDayNum == 3) {
			foodItems = "soup and crackers";
			drink = "water";
		} else {
			foodItems = "salad";
			drink = "club soda";
		}
	}
}
