import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		// Variable Declarations
		
		String userContinue;
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		
		do {
			
		System.out.print("Enter a word to be translated: ");
		
		Scanner scanner = new Scanner(System.in);
		String firstVowel = scanner.nextLine();
		char v = firstVowel.charAt(0);
		
		if (!"v".equals("a") && !"v".equals("e") && !"v".equals("i") 
				&& !"v".equals("o") && !"v".equals("a")) {
			
			String first = firstVowel.substring(0,1);
            String remainder = firstVowel.substring(1,firstVowel.length());
            System.out.println(remainder.toLowerCase() + first.toLowerCase() + "ay");		
		}
		else {
			String newWord = firstVowel + "ay";
            System.out.println(newWord);
		}
	
		System.out.println("Translate another line? (y/n)");
		userContinue = scanner.next();
		} while 
			(userContinue.equalsIgnoreCase("y")); 
	}
}


