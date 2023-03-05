package assignment1.Action.sec304;


/**
 * This is the code solution for Part 2.
 * A subclass named OccasionalAction is created.
 * These are activities that occur on the same day of every month specified.
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 *
 */
public class OccasionalAction extends Action
{
	/**
	 * no-arg constructor
	 */
	public OccasionalAction() {
		
	}
	
	/**
	 * one-arg constructor chained to the one-arg superclass constructor in Action
	 * @param description the text description of the RegularAction
	 */
	public OccasionalAction(String description) {
		
		super(description);
	}
	
	/**
	 * constructor with three integer arguments
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public OccasionalAction(int dueYear,int dueMonth,int dueDay) {
		
		super( dueYear,dueMonth, dueDay);

	}

	@Override
	/**
	 * occuresOn() method is used to decide if it needs to do the action.
	 * @return true when the day matches
	 */
	public boolean occursOn(int year, int month, int day ) {
		if (day == getDueDay()) {
			return true;
			
		} 
		else {
			return false;
		}
		
	}
   















}
