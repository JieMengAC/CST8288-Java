package assignment1.Action.sec304;
import java.lang.reflect.*;
/**
 * class ActionDriver is used to test that the class RegularAction is a subclass of Action, and has no extra fields. 
 * Then toString() method and occursOn() method are called to output the description and expected results.
 * 
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 * 
 */

public class ActionDriver {
	
	/**
	 * main method is created to test the new subclass RegularAction inherited from class Action
	 * @param args args main method arguments
	 * @throws ClassNotFoundException throws exceptions
	 */

	public static void main(String[] args) throws ClassNotFoundException  {
		
		
	RegularAction ra = new RegularAction("Wash your hands");
	/*
	 * get the class of RegularAction's superclass.
	 */
	Class raSuperclass = ra.getClass().getSuperclass();
	
	Class actionClass = Action.class;
	
	//Class actionClass =Class.forName("assignment1.Action.sec304.Action");
	if(raSuperclass == actionClass) {
		System.out.println("RegularAction is just a subclass of Action: ture" );
	}
	System.out.println("Expected: true");
	
	/*
	 * get all the fields declared in RegularAction 
	 */
	Class raClass = ra.getClass();	
	Field[] raFields = raClass.getDeclaredFields();	
	if (raFields.length == 0) {
		System.out.println("RegularAction activities have no extra fields:true" );
	}
	System.out.println("Expected: true");
	
	System.out.println("Looking at regular actions: " + ra.toString() );
	System.out.println("Expected: Wash your hands");
	
	System.out.println(ra.occursOn(0, 0, 0) );
	System.out.println("Expected: true");
	
	
	

	

	
	
	
	
	
  
	

	

	}

}
