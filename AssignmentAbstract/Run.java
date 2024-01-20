package AssignmentAbstract;
import java.util.*;
public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String category="";
		
		System.out.println("Enter Student id");       
		int studentId=sc.nextInt();
			
		System.out.println("Enter Student Name");
		String studentName=sc.next();
			
		System.out.println("Enter Department Name");       
		String department=sc.next();
			
		System.out.println("Enter Gender");
		String gender=sc.next();
		
		System.out.println("Enter Category");       
		category=sc.next();
		
		
		if(category.equals("Hosteller")) {
			
			System.out.println("Enter College Fee");
			double collegeFee=sc.nextDouble();   
			
			System.out.println("Enter Room Number");       
			int roomNumber=sc.nextInt(); 
			
			System.out.println("Enter Block Name");       
			char blockName=sc.next().charAt(0);
			
			System.out.println("Enter Room Type");       
			String roomType=sc.next();           
			Hosteller H1=new Hosteller(studentId,studentName,department,gender,category,collegeFee,roomNumber,blockName,roomType);
			
			System.out.println("Total College Fee is "+H1.calculateTotalFee());
		
		}
		else if(category.equals("DayScholar")) {
			
			System.out.println("Enter College Fee");
			double collegeFee=sc.nextDouble();   
			
			System.out.println("Enter Bus Number");       
			int busNumber=sc.nextInt(); 
			
			System.out.println("Enter Distance");       
			float distance=sc.nextInt();
			         
			DayScholar D1=new DayScholar(studentId,studentName,department,gender,category,collegeFee,busNumber,distance);
			
			System.out.println("Total College Fee is "+D1.calculateTotalFee());
		
		}
		
		else {
			System.out.println("Invalid Input");
		}
		}                       

	}


