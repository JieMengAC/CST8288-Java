package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

//22W Assignment 3 Solution: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document. Hints have been provided on your tasks.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are code inbetween the print statements (see assignment information).

//TO DO: YOUR TASK 1: Add the necessary import statements here.

/**
 * assignment3. practice of collections
 * 
 * @author jie Meng
 * @version 1.0
 * @since 11.0.14.1
 * 
 */
public class CarBrandsList {
/**
 *main method for practicing collections and some of the methods
 * @param args parameter
 */
	public static void main(String[] args) {
		// add rides to list1
		String[] rides = { "cardillac", "toyota", "suzuki", "chevrolet", "hyundai", "mercedies", "keke" };
		//LinkedList<String> list = (LinkedList<String>) Arrays.asList(rides);
		LinkedList<String> list1 = new LinkedList<>(Arrays.asList(rides));
		//List<String> list = new LinkedList<>(Arrays.asList(rides));
		// TO DO: YOUR TASK 2

		// add rides2 to list2
		String[] rides2 = { "volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda" };

		LinkedList<String> list2 = new LinkedList<>(Arrays.asList(rides2));
		
		
		// TO DO: YOUR TASK 3
		list1.addAll(list2);
		printList(list1);
		
	

		System.out.printf("%nDisplaying names of car brands in uppercase letters...");

		toUppercase(list1);
		printList(list1);
		
		

		System.out.printf("%nDeleting car brands 5 to 7...");
		
		sublist(list1,5,8);
		printList(list1);
		

		System.out.printf("%nHere is the current list of car brands...");

		// TO DO: YOUR TASK 9
		printList(list1);
		
		System.out.printf("%nReversed List:%n");

		// TO DO: YOUR TASK 10
		printReversedList(list1);

		System.out.printf("%nSorted car brands in alphabetical order...");

		// TO DO: YOUR TASK 11
		sort(list1);
		printList(list1);

		System.out.printf("%nRemoving duplicate car brands...");
		list1 = removeDuplicate(list1);
		printList(list1);

	}

	// HINT: MORE TO DO: Insert all your methods in this section which includes:

	// output List contents
	/**
	 * print the elements of a list
	 * @param list a list object
	 */
	public static void printList(List<String> list) {
		
		System.out.printf("%nList is:%n");
		for(String value : list) {
			System.out.print(value +"  ");
		}
		System.out.printf("%n");
	}
	/**
	 * convert each element in a list to uppercase
	 * @param list a list object
	 * @return a list 
	 */
	public static List<String> toUppercase(List<String> list) {
		
		ListIterator<String> ite = list.listIterator();
		//LinkedList<String> upperlist = new LinkedList<>();
		String element;
		while(ite.hasNext()){
			 
			 element = ite.next();
			 ite.set(element.toUpperCase());
			 
		}
		
		return list;
	}
	
	/**
	 * remove a sublist from a list
	 * @param superlist sublist
	 * @param x start point
	 * @param y end point
	 */
	public static void sublist(LinkedList<String> superlist,int x, int y) {
		
		
		 superlist.subList(x, y).clear();
		
		
	}
	
	/**
	 * Print a reversed list
	 * @param superlist a list object
	 */
	public static void printReversedList(LinkedList<String> superlist) {
		
//		for(int i = superlist.size()-1; i >= 0; i--){
//			
//			System.out.print(superlist.get(i).toUpperCase() +"  ");
//			
//		}
		
		ListIterator<String> ite = superlist.listIterator(superlist.size());
		while(ite.hasPrevious()) {
			
			System.out.print(ite.previous().toUpperCase() +"  ");
		}
		
		System.out.println();
		
	}
	
	/**
	 * 
	 * @param superlist a list object
	 * @return a sorted list
	 */
	public static List<String> sort(LinkedList<String> superlist) {
		
		Collections.sort(superlist);
		
		return superlist;
	}

	/**
	 * 
	 * @param superlist a list object
	 * @return a list with no duplicates
	 */
	public static LinkedList<String> removeDuplicate(LinkedList<String> superlist) {
		
		Set<String> set = new HashSet<>(superlist);
		
		 superlist = new LinkedList<>(set);
		
		
		return  superlist;
	}

}
