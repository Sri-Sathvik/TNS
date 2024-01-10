//2)Write a program in Java to count the total number of vowels and consonants in a String.
//The string can contain all the alphanumeric and other special characters as well.
//However, only the lowercase English alphabets are allowed in the String.
package Screening;

import java.util.*;
public class QuestionTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c;
		System.out.println("Enter the String:");
		c =sc.next();
		char temp;
		int count = 0;
		for(int i=0;i<c.length();i++) {
			temp=c.charAt(i);
			if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u') {
			count++;
			}
		}
		if(count>0) {
			System.out.println("Number of Vowels="+count);
		}
		else {
			System.out.println("There are no Vowels");
		}
	}
}
