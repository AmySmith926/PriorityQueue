import java.util.Comparator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		// Create and initialize a LinkedList
		LinkedList<String> shoppingList = new LinkedList<>();

		// Adding new elements
		shoppingList.add("cheese");
		shoppingList.add("Milk");
		shoppingList.add("Bread");
		shoppingList.add("Coke");
		shoppingList.add("Sugar");

		System.out.println("shoppingList : " + shoppingList);

		boolean name = shoppingList.add("Coffee");// adding an element
		System.out.println("Removed from ShoppingList : " + name + " | New ShoppingList : " + shoppingList);

		// Removing an element , if empty it return null

		name = shoppingList.poll() != null;

		System.out.println("Removed from ShoppingList : " + name + " | New ShoppingList : " + shoppingList);

		System.out.println("The size of the list is" + " " + shoppingList.size());// size of the list

		shoppingList.sort(new MyComparator());// sorting the list
		System.out.println("After sorting: " + shoppingList);
	}
}

class MyComparator implements Comparator<String> {//comparing method
	public int compare(String string1, String string2) {
		return string1.compareTo(string2);
	}
}
