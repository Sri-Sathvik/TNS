//1)Asif has gone for a walk in the park. He makes rounds in the park multiple times and during each round, he collects some leaf samples.
//When he collects at least 30 new samples, he completes the round and returns home.
//Write a java program for this scenario, accepting user input for the number of leaf samples collected during each round.
//The program should display the total samples collected and the number of rounds around the park  that he took in collecting these samples.
package Screening;

import java.util.*;
public class QuestionOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int NoOfSamples,NoOfRounds,FinalSampleCount=0;
		
		for(int i=1;;i++) {
			System.out.println("This is your Round "+i+" \nEnter the number of samples collected during this round :");
			NoOfSamples=sc.nextInt();
			NoOfRounds=i;
			FinalSampleCount+=NoOfSamples;
			if(FinalSampleCount>=30) {
				break;
			}		
		}
			System.out.println("Congratulation... You Have Collected "+ FinalSampleCount + " Samples Within "+NoOfRounds+" Rounds");

	}

}
