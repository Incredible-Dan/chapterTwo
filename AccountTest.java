import java.util.Scanner;
	public class AccountTest{
		
		public static void main(String[] args){
			
			Account firstAccount = new Account("Peter", 0.00);
			Account secondAccount = new Account("George",100.00);
			System.out.printf("%s balance: $%.2f%n", firstAccount.getName(), firstAccount.getBalance());
			System.out.printf("%s balance: $%.2f%n", secondAccount.getName(), secondAccount.getBalance());
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter deposit amount for firstAccount:");
			double depositAmount =  input.nextDouble();
			Sytem.out.print("%n adding %.2f to firstAccount balance%n%n", depositAmount);
			
		}
		
	}