
public class TextTax {

	public static void main(String[] args) {
		double grossIncome;
		String state;
		int dependents;
		
		grossIncome = 50000;
		state = "NJ";
		dependents = 2;
		
		Tax t = new Tax(grossIncome, state, dependents);
		double yourTax = t.calcTax();
		
		Tax t2 = new Tax(65000, "TX", 4);
		double hisTax = t2.calcTax();
		
		Tax.convertToEuroTax(yourTax);
		Tax.convertToEuroTax(hisTax);

	}

}
