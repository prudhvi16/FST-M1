package Activities;

import java.util.ArrayList;
import java.util.LinkedList;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
        // Add values to the list
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        
        // Loop through ArrayList
        list.forEach( 
            // lambda expression 
            (names)->System.out.println(names)
        );
	}

}
