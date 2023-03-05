package assignment1.Action.sec304;

import java.lang.reflect.*;
/**
 * class ActionDriver2 has a main method which is used to test that the class OccasionalAction and RareAction are subclasses of Action, and These 
 * two subclasses have no extra fields. 
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 * 
 */

public class ActionDrive2 {
	/**
	 * method main() is created to test class OccasionalAction and RareAction are subclasses of Action, and These 
	 * two subclasses have no extra fields. 
	 * @param args main method arguments
	 */

	public static void main(String[] args) {
		OccasionalAction oaAction = new OccasionalAction();
		RareAction raAction = new RareAction();
		Class oaName = oaAction.getClass().getSuperclass();
		Class raName = raAction.getClass().getSuperclass();
		Class acName = Action.class;
				//Class.forName("assignment1.Action.sec304.Action");
		if (oaName == acName) {
			System.out.println("OccasionalAction is just a subclass of Action: ture" );
		}
		System.out.println("Expected: true");
		
		if (raName == acName) {
			System.out.println("RareAction is just a subclass of Action: ture" );
		}
		System.out.println("Expected: true");
		
		Field[] oaFields = oaAction.getClass().getDeclaredFields();
		Field[] raFields = raAction.getClass().getDeclaredFields();
		
		if (oaFields.length == 0) {
			System.out.println("OccasionalAction have no extra fields:true" );
		}
		System.out.println("Expected: true");
		
		if (raFields.length == 0) {
			System.out.println("RareAction have no extra fields:true" );
		}
		System.out.println("Expected: true");


	}

}
