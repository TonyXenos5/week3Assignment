package assignmentCode;

import java.util.ArrayList;
import java.util.List;

public class ExampleCode {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();

		// Make sure to import Java code for List and ArrayList
		
		names.add("Terrence");
		names.add("Zylana");
		names.add("Seraphina");
		names.add("Zora");
		
		// listNama.add() will add each one individually
		
		String[] codeNames = {"Xenos", "Soluna", "Flaria", "Lumia"};
		
		for (int i = 0; i < codeNames.length; i++) {
			names.add(codeNames[i]);
		}
		
		/* You can also add to an ArrayList using an array of Strings if you use a loop
		 * to add the elements of the array into the List collection
		 */
		
		
		System.out.println(names);
	}

}
