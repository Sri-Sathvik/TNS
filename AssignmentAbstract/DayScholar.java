package AssignmentAbstract;

public class DayScholar extends Student{
	private int busNumber;
	private float distance;
	
	
	//Constructors
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}
	//Getter and Setter
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	//OverRide Method Function
	@Override
	public double calculateTotalFee() {
		
		double Total=0;
		if(distance>30 && distance<=40) {
			Total=collegeFee+28000;
		}
		
		else if(distance>20 && distance<=30) {
			Total=collegeFee+20000;          
		}
		
		else if(distance>10 && distance<=20) {
			Total=collegeFee+12000;  
		}
		
		else if(distance<=10) {
			Total=collegeFee+6000;
		}
		
		return Total;     
		
		
	}       
	
	
}
