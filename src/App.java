import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		//Create a new Scanner object and prompt the user to input a number
		Scanner input = new Scanner(System.in);
		System.out.print("Choose a number to reverse: ");
		
		//Setup 2 instance variables. One will store the integer that the user inputs, and the other will store the reversed number.
		int number = input.nextInt();
		int reversedNum = 0;
		
		//Create a while loop so that as long as the number that the user inputs is not zero, will perform the actions inside of the curly brackets.
		while(number != 0) {
			
			reversedNum = reversedNum * 10;  
			/*The code above initially results in reversedNum being zero during the first full loop. However, once the user's chosen number 
			*gets moduled by 10 in the next line, it will store the remainder inside of the reversedNum variable. The remainder will always 
			*be the number listed in the ones place of the initial number*/
			
			reversedNum = reversedNum + number % 10; 
			/*Moduling by 10 means we divide the number by 10, then yield the remainder. Since dividing by 10 moves the decimal over to the 
			 * left one decimal place, the remainder will be the first number to the right of the decimal. */
			
			number = number / 10;
			/*Taking the user's input number, we divide that value by 10 in order to shift the decimal one place to the left. 
			 * Now, when the loop goes back around, this new number that is one digit shorter than the original number gets moduled
			 * in step 2 of the loop, and the remainder will again end up being the value that was initially in the ones place before 
			 * moduling the number.  This number will then get added onto the reversedNum sort of like a link being added to the end of a chain.
			 */
		}
		System.out.println();
		System.out.println("The reverse of your number is: " + reversedNum);
	}
}

