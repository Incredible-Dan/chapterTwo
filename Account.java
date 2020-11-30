	public class Account{

	private String name;
	private double balance;


	public void withdrawAmount(double newBalance){
	
		balance = balance - newBlance;

	
	}

	public void depositAmount(double newDeposit){

		balance = balance + newDeposit;
	}

	public String getName(){
	return name;
	}

	public void setName(String newName){
		name = newName;

	}
	
	public double getBalance(){
		return balance;
	}


	public Account(String name, double balance){
		this.name = name;
		this.balance = balance; 
	}
}
}