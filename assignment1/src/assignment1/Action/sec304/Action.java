package assignment1.Action.sec304;

/**
 * This is the Action Superclass class that provides a catalog of actions to be carried out 
 * in view of COVID-19 OPH protocols. 
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 */
public abstract class Action
{
	/**
	 * description of the action that should be done in a specific date
	 */
	private String description;
	
    /**
     * dueYear, dueMonth, dueDay are integer variables used to store the values of year, month and day.
     */
	private int dueYear;
	private int dueMonth;
	private int dueDay;



	/**
	 * no-argument constructor
	 * Constructs an action without a description.
	 */
	public Action()
	{
	   description = "";
	}
	

	/**
	 * one argument constructor
	 * Constructs an action with a description.
	 * @param desc the description
	 */
	public Action(String desc)
	{
	   description = desc;
	}
	
	
	/**
	 * constructor with three integer arguments
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public Action(int dueYear,int dueMonth,int dueDay) {
		this.dueYear = dueYear;
		this.dueMonth = dueMonth;
		this.dueDay = dueDay;
	}
	
	/**
	 * 
	 * Sets the description of this action.
	 * @param description the text description of the action
	*/
	public void setDescription(String description)
	{
	   this.description = description;
	}
	
	/**
	   Determines if this action occurs on the specified date.
	   @param year the year
	   @param month the month
	   @param day the day
	   @return true if the action activity occurs on the specified date.
	*/

	public abstract boolean occursOn(int year , int month,int day);
	
	/**
	 * get the value of dueYear
	 * @return year
	 */
	public int getDueYear() {
		return dueYear;
	}
	
	/**
	 * set the value of dueYear
	 * @param dueYear the value assigned to dueYear
	 */
	public void setDueYear(int dueYear) {
		this.dueYear = dueYear;
	}
	
	/**
	 * get the value of dueMonth
	 * @return month the value of dueMonth
	 */
	public int getDueMonth() {
		return dueMonth;
	}
	
	/**
	 * set the value of dueMonth
	 * @param dueMonth the value assigned to dueMonth
	 */
	public void setDueMonth(int dueMonth) {
		this.dueMonth = dueMonth;
	}
	

	/**
	 * Converts action activity to string description.
	 * @return the description of the action
	 */
	public String toString()
	{
	   return description;
	}
	
	/**
	 * get the value of dueDay
	 * @return dueDay the value of dueDay
	 */
	public int getDueDay() {
		return dueDay;
	}
	
	/**
	 * set the value of dueDay
	 * @param dueDay the value assigned to dueDay
	 */
	public void setDueDay(int dueDay) {
		this.dueDay = dueDay;
	}
}

