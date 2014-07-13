
public class Tax {
	static int customerCounter;
	
	int dependents;
	double grossIncome;
	String state;
	
	Tax(double gi, String st, int depen) {
		dependents = depen;
		grossIncome = gi;
		state = st;
		customerCounter++;
		
		System.out.println("Preparing the tax for customer # " + customerCounter);
	}
	
	double calcTax() {
		return (grossIncome*0.33 - dependents*100);
	}
	
	static void convertToEuroTax(double tax){
		double euroTax = tax * 1.25;
		
		System.out.println("The tax in euros is " + euroTax);
	}
}
