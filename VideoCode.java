package assignmentCode;

public class VideoCode {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Week 3 Coding Assignment!");
		System.out.println("");
		
		/* 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93. */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 16};
		
		int x = ages[0];
		int y = ages[ages.length - 1];
		
		int sum = x - y;
		
		int ageAvg = 0;
		
		for (int i = 0; i < ages.length; i++) {
			ageAvg += ages[i];
		}
		
		int averageAge = ageAvg / ages.length;
		
		System.out.println("The value of the first array of ages[], " + x + ", subtracted from the last array, " + y + ", equals: " + sum + ".");
		
		System.out.println("The average age of the first array of ages[] is " + averageAge + ".");
		
		/* 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		int sumAvg = 0;
		
		for (int i = 0; i < names.length; i++) {
			sumAvg += names[i].length();
		}
		
		int average = sumAvg / names.length;
		
		String concantedNames = "";
		
		for (int i = 0; i < names.length; i++) {
			concantedNames += ( names[i] + " ");
		}
		
		System.out.println("The average number of letters per name in the array of names[] is " + average + ".");
		
		System.out.println(concantedNames);
		
		/* 3. How do you access the last element of any array? */
		
		System.out.println("To access the last element of any array, you would type: 'arrayName[arrayName.length - 1]'.");
		
		/* 4. How do you access the first array element of any array? */
		
		System.out.println("To access the first element of any array, you would type: 'arrayName[0]'.");
		
		
		/* 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and
		*  add the length of each name to the nameLengths array.
		*/
		
		int [] nameLengths = new int[names.length];
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}	
		
		/* 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		* Print the result to the console.
		*/
		
		int sumAddition = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			sumAddition += nameLengths[i];
		}
		
		System.out.println(sumAddition);
		
	}
		
		/* 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		*  (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		*/
		
	public static String concatWords(String word, int n) {

		String answer = "";
		for (int i = 0; i < n; i++) {
			answer = answer.concat(word);
		}
		
		return answer;
	}
		
		/* 8. Write a method that takes two Strings, firstName and lastName, and returns a full name
		*  (the full name should be the first and the last name as a String separated by a space).
		*/
		
	public static String nameCreation(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
		
		/* 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. */
		
	public static boolean validate(int array) {
		int[] numArray = new int[array];
		
		int sumArray = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			sumArray += numArray[i];
		}
		
		if (sumArray > 100) {
			return true;
		} else {
			return false;
		}
		
	}
		
		/* 10. Write a method that takes an array of double and returns the average of all the elements in the array. */
		
	public static double doubleAvg(int averageNumbers) {
		double[] avgNumber = new double[averageNumbers];
		
		double doubAvg = 0;
		
		for (int i = 0; i < avgNumber.length; i++) {
			doubAvg += avgNumber[i];
		}
		
		double averageNum = doubAvg / avgNumber.length;
		
		return averageNum;
	}
		
		/* 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array
		*  is greater than the average of the elements in the second array.
		*/
		
	public static boolean arrayTest(int one, int two) {
		
		double[] doubOne = new double[one];
		double[] doubTwo = new double[two];
		
		double doubAvgOne = 0;
		double doubAvgTwo = 0;
		
		for (int i = 0; i < doubOne.length; i++) {
			doubAvgOne += doubOne[i];
		}
		
		double avgNumOne = doubAvgOne / doubOne.length;
		
		for (int i = 0; i < doubTwo.length; i++) {
			doubAvgTwo += doubTwo[i];
		}
		
		double avgNumTwo = doubAvgTwo / doubTwo.length;
		
		if ( avgNumOne > avgNumTwo ) {
			return true;
		} else {
			return false;
		}
		
	}
		
		/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true
		*  if it is hot outside and if moneyInPocket is greater than 10.50.
		*/
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
		
		/* 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. */
	
	public static boolean groceryShopping(double bankAccount, boolean foodInFridge) {
		if (bankAccount >= 50.00 && foodInFridge == false) {
			return true;
		} else {
			return false;
		}
		
		// The above method will check if you should go grocery shopping. If you have at least $50 in your bank account, and your fridge does not have food in it, this program will return
		// a true value. Otherwise, you will receive a false value, either because you have food in your fridge, or you do not have the money to buy groceries.
		
	}
	
}