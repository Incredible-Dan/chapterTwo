import java.util.Scanner;
	public class StudentsgradeWithactualGrade{
		
	//int StudentsgradeWithactualGrade = grade;
	
		public static void main(String[] args){
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter Your Grade :");
			double grade = obj.nextDouble();
			
			
			if(grade > 100){
				System.out.println("You are not in this Grade Range");
			}
			else{
						
				if(grade >=90 && grade < 101){
					System.out.println("Excellent you made GRADE : 'A'");
					//System.out.println("Distinction");
					}
				else{
					if (grade >=65 && grade < 90){
						System.out.println("Well done!, you made GRADE : 'B'");
						System.out.println("Congratulations");
					
					}else{
						if (grade >=60 && grade < 65){
						System.out.println("Well done! you made an : 'C'");
						System.out.println("Congrates.");
						}
					
						
					else{
					  if (grade >=50 && grade < 60){
						System.out.println("Well done! you made a : 'D'");
						System.out.println("You can do better");
					
					}	
						
					else{
						if (grade < 50){
						System.out.println("Opps!, You Fialed the Course, you made an : 'F'");
						System.out.println("You will repeat the Course.");
					
					} 
					
					
			}
			
		}
	}
				}
			}
			
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			
				
				
				
	}}