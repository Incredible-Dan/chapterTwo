public class Summation{

	int a = 5;
	int b = 2;
	String name = "Joshua";
	
	
	public static void main(String[] args) {
	Summation obj = new Summation();
	obj.sumWelcome();
	obj.sum(5, 2);
	
	}
	
	
	
	
	public void sum(int a, int b) {
		int sumAction = a + b;
		System.out.println(sumAction);
	}
	
	
	public void sumWelcome() {
		System.out.println("Welcome" + " " + name);
	}
	
}