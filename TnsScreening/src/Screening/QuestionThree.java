//3)Johanna, a 5-year-old girl, is learning the number names. She is having difficulty remembering all of the words. 
//To give her extra practice, her mother assigns a number and instructs her to write the number names separated by white space.
//Help her mum by writing a Java program that prints the number names of the numbers so Johanna may check the answers herself.
//Assume that she is learning from zero to nine.
//          
package Screening;

import java.util.*;
public class QuestionThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int Number;
		System.out.println("Hey!! Enter Your Number (0-9)");
		Number=sc.nextInt();
		
		if(Number==0) {
			System.out.println("Zero");
		}                    
		else if(Number==1) {
			System.out.println("One");
		}
		else if(Number==2) {
			System.out.println("Two");
		}
		else if(Number==3) {
			System.out.println("Three");
		}
		else if(Number==4) {
			System.out.println("Four");
		}
		else if(Number==5) {
			System.out.println("Five");
		}                    
		else if(Number==6) {
			System.out.println("Six");
		}
		else if(Number==7) {
			System.out.println("Seven");
		}
		else if(Number==8) {
			System.out.println("Eight");
		}
		else if(Number==9) {
			System.out.println("Nine");
		}
		

	}

}
