	public class HeartRate{
	
	private String firstName;
	private String lastName;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	int maxHeartRate; 
	int Age;
	int currentYear;
	int targetHeartRate;
	
	public HeartRate(String firstName, String lastName, int dayOfBirth,int monthOfBirth, int yearOfBirth){
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.dayOfBirth = dayOfBirth;
	this.monthOfBirth = monthOfBirth;
	this.yearOfBirth = yearOfBirth;
	
	}
	
	public int getAge(int yearOfBirth) {
		currentYear = 2020;
		Age = currentYear - yearOfBirth;
		return Age;
	}
	
	public int getMaxHeartRate(){
	maxHeartRate = 220 - this.getAge(yearOfBirth);
	return maxHeartRate;
	
	}
	public void getTargetHeartRate(){
	int startRange;
	int endRange;
	startRange = (50*getMaxHeartRate())/100;
	endRange = (85*getMaxHeartRate())/100;
	
	System.out.printf("TargetHeartRange is between %d and %d%n", startRange,endRange);
	}

}