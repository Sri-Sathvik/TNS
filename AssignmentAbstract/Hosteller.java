package AssignmentAbstract;

public class Hosteller extends Student{
	
	

	private int roomNumber;
	private char blockName;
	private String roomType;
	
	//Constructor
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int roomNumber,char blockName,String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber=roomNumber;
		this.blockName=blockName;
		this.roomType=roomType;
		
	}
	//Getter and Setters
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
	//OverRide Method(Function)
	@Override
	public double calculateTotalFee() {
		double Total=0;
		if(blockName=='A') {
			if(roomType.equals("Non-Ac")) {
				Total=collegeFee+60000;
			}
			else if(roomType.equals("AC")) {
				Total=collegeFee+60000+8000;
			}
		}
		else if(blockName=='B') {
			if(roomType.equals("Non-Ac")) {
				Total=collegeFee+50000;
			}
			else if(roomType.equals("AC")) {
				Total=collegeFee+50000+5000;
			}                
		}
		else if(blockName=='C') {
			if(roomType.equals("Non-Ac")) {
				Total=collegeFee+40000;
			}
			else if(roomType.equals("AC")) {
				Total=collegeFee+40000+2500;
			}   
		}
		return Total;
	}
}

