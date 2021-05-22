import java.util.Comparator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		// Create and initialize a LinkedList
		LinkedList<String> groceryList = new LinkedList<>();

		// Adding new elements
		groceryList.add("cheese");
		groceryList.add("Milk");
		groceryList.add("Bread");
		groceryList.add("Coke");
		groceryList.add("Sugar");

		groceryList.add("eggs");
		groceryList.add("bacon");
		groceryList.add("spring onion");
		groceryList.add("coffee");

		System.out.println("groceryList : " + groceryList);

		boolean name = groceryList.add("tea");// adding an element
		System.out.println("Removed from groceryList : " + name + " | New groceryList : " + groceryList);


		System.out.println("groceryList : " + groceryList);

	

		// Removing an element , if empty it return null

		name = groceryList.poll() != null;


		System.out.println("Removed from groceryList : " + name + " | New groceryList : " + groceyList);

		System.out.println("The size of the list is" + " " + groceyList.size());// size of the list


		groceryList.sort(new MyComparator());// sorting the list
		System.out.println("After sorting: " + groceryList);
	}
}

class MyComparator implements Comparator<String> {//comparing method
	public int compare(String string1, String string2) {
		return string1.compareTo(string2);
	}
}
