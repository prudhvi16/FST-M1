package Activities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		java.util.List<Integer> listNumbers = Arrays.asList(3, 9, 1, 5, 3, 9, 1, 3, 8, 6);
		System.out.println("List: " + listNumbers);
		

		
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		uniqueNumbers.add(12);
		if (uniqueNumbers.remove(12)) {
		    System.out.println("12 is removed");
		}
		System.out.println("Set: " + uniqueNumbers);
		System.out.println("The set has " + uniqueNumbers.size() + " elements");
		
		
	}

}
