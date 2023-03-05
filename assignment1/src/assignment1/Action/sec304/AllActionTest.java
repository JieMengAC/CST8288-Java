package assignment1.Action.sec304;

import java.util.Scanner;
/**

*/
/**
 * This is the code for part Part 3. 
   The reason for this class is to demonstrate the Action class and subclasses.
   An array of action objects (hint: check the sample output file provided for you) is declared to store
   different action activities. A user of this system could input a date of their choice and
   retrieve an output of all activities that would occur on that date.
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 *
 *
 */


public class AllActionTest
{
	/**
	 * main method to test all the actions
	 * @param args main method arguments
	 */
   public static void main(String[] args)
   {
	   Action[] actions = new Action[6];
	   actions[0] = new RegularAction("Wash your hands");
	   actions[1] = new OccasionalAction("Take a PCR test.");
	   actions[1].setDueDay(01);
	   
	   actions[2] = new OccasionalAction("Get a booster shot.");
	   actions[2].setDueDay(15);
	   
	   actions[3] = new OccasionalAction("Clean your room");
	   actions[3].setDueDay(19);
	   
	   actions[4] = new RegularAction("Ware a mask");
	   
	   actions[5] = new RareAction("change the filter of furnace");
	   actions[5].setDueDay(19);
	   actions[5].setDueMonth(11);
	   

	   
	   
	   String go = "yes";
	   while(go.equals("yes")){
			int year, month, day;
		    Scanner in =new Scanner(System.in);
		    System.out.print("Enter a date (like 2018 01 30): " );
		    year = in.nextInt();
		    month =in.nextInt();
		    day = in.nextInt();
		    in.nextLine();
		    System.out.printf("These are your actions on %02d/%02d/%d %n",day,month,year);
		  
		    for(int i = 0;i < actions.length; i++) {
		    	  
		    	  if(actions[i].occursOn(year, month, day)) {
		    		  System.out.println (actions[i].toString());
		    	  }
		    	  
		      }
		
		    System.out.print("Continue(yes/no)? " ); 
		    go = in.nextLine();
		   
	   }
	   

    }
}
