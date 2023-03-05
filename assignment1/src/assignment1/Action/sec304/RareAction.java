package assignment1.Action.sec304;

/**
   In this file you will provide the code solution for Part 2. 
   You are required to create a subclass named RareAction.
   Activities for RareAction occurs on a particular date of the year
*/

// YOUR CODE STARTS HERE!!!
public class RareAction extends Action
{
	
	/**
	 * no-arg constructor
	 */
	public RareAction() {
		
	}
	
	/**
	 * one-arg constructor chained to the one-arg superclass constructor in Action
	 * @param description the text description of the RegularAction
	 */
	public RareAction(String description) {
		
		super(description);
	}
	
	/**
	 * constructor with three integer arguments
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public RareAction(int dueYear,int dueMonth,int dueDay) {
		
		super( dueYear,dueMonth, dueDay);

	}
	
	
	/**
	 * occuresOn() method is used to decide if it needs to do the action.
	 * @return true when the day and month both match.
	 */
	@Override	
	public boolean occursOn(int year, int month, int day) {
		if(day == this.getDueDay() && month == this.getDueMonth()) {
			return true;
		}
		else {
			return false;
		}
		
	}

















}
