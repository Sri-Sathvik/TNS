//4)Write a program that accepts the number of units of water consumed by a household and calculates the total charge to be paid based on these details:
//
//Number of units	Rate per unit in Rs
//First 100 units	2.00
//Next 200 units	3.00
//Above 300 units	5.00 
//A surcharge of 2.5% is charged if the number of units consumed is above 300 units.                                   
package Screening;


import java.util.*;
public class QuestionFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		double Charges;
		float No_of_Units;
		
		System.out.print("Enter Number of Units Consumed:");
		No_of_Units=sc.nextInt();
		
		if(No_of_Units<=100) {
			Charges=No_of_Units*2.0;
		}
		else if(No_of_Units>100 && No_of_Units<=300) {
			float temp=No_of_Units-100;
			Charges=200+(temp*3.0);
		}
		else {
			float temp=No_of_Units-300;
			Charges=800+(temp*5);
			Charges=Charges+(Charges*2.5)/100;
		}
		System.out.print("Amount to be paid="+Charges);
	}
}
