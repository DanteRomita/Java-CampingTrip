package campingTrip;

public class Breakfast extends Meal {
	
	/**
	 * Prepares breakfast.
	 * pre: none
	 * post: Displays food and drink served for breakfast that day.
	 */
	public void prepareBreakfast() {
		mealName = "breakfast";
		if (mealDayNum == 2) {
			foodItems = "eggs and bacon";
			drink = "orange juice";
		} else if (mealDayNum == 3) {
			foodItems = "pancakes and syrup";
			drink = "herbal tea";
		} else {
			foodItems = "french toast with hashbrowns";
			drink = "chocolate milk";
		}
	}
}
