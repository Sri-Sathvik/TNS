//5)Write a program to calculate the sum of this series up to term p, where p is input by the user.
//2.5, 4.5, 6.5 . . . . .p
//
//In case the entered p is invalid (cannot be smaller than 2.5), the program should display an appropriate message.     
package Screening;

import java.util.*;
public class QuestionFive {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float p,Value=0;
		double i=2.5;
		System.out.println("Enter any Number greater than 2.5");
		p=sc.nextFloat();
		
		if(p<2.5) {
			System.out.println("cannot be smaller than 2.5");
		}
		else {
			while(i<=p) {
				Value+=i;
				i+=2;
			}
			System.out.println(Value);
		}
	}

}
