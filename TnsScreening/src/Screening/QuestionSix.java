//6)An apartment complex in Bengaluru provides a Community Report to each of the households at the end of each year. Write a program that accepts a score and displays a message based on the score using these details:
//
//Score	Message to be displayed
//0 - 3	When can we meet you to explain the roles and responsibilities of a resident?
//4 - 7	You have taken a step in the right direction!
//8 - 10	Thank you for going the extra mile! Would you be interested in training others?
//
//Use switch-case to write the sol 
package Screening;

import java.util.*;
public class QuestionSix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Score:");                              
		int a;
		a=sc.nextInt();
		switch(a){
			case (0):
			case (1): 
			case (2):
			case (3):
				System.out.println("When can we meet you to explain the roles and responsibilities of a resident?");
				break;
			case (4):
			case (5): 
			case (6):
			case (7):
				System.out.println("You have taken a step in the right direction!");
				break;
			case (8):
			case (9): 
			case (10):
				System.out.println("Thank you for going the extra mile! Would you be interested in training others");
				break;	
			}
	}
}

