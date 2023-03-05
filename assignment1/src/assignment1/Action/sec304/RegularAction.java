package assignment1.Action.sec304;

/**
   
   YOUR TASK is to 
*/
/**
 * This is code for Part 1.
 * create a subclass named RegularAction. This is a subclass of the Action Superclass.
 * Action has a description (for example,"Wash your hands") and occurss on one or more dates.
 * A regular action activity occurs every day.
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 *
 *
 */

//YOUR CODE STARTS HERE!!!!

public class RegularAction extends Action
{
	/**
	 * no-arg constructor
	 */
	public RegularAction() {
		
	}
	/**
	 * one-arg constructor chained to the one-arg superclass constructor in Action
	 * @param description the text description of the RegularAction
	 */
	
	public RegularAction(String description) {
		super(description);
	}
	
	/**
	 * constructor with three integer arguments
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public RegularAction(int dueYear,int dueMonth,int dueDay) {
		
		super( dueYear,dueMonth, dueDay);

	}
	
	
	@Override	
	/**
	 * occuresOn() method is used to decide if it needs to do the action.
	 * @return true everyday
	 */
	public boolean occursOn(int day, int month, int year) {
		
		return true;
	}

}