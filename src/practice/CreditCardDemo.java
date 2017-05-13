package practice;

public class CreditCardDemo {
	public static void main(String[] args) {
		
		CreditCard eCard = new CreditCard("Eddy Vittini","Chase Bank","4207 6701 9012 8678", 5000,4000);
		CreditCard sCard = new CreditCard("Shaitasia Holley","Chase Bank","4207 6721 9445 8688", 10000,400000);
	
		
		
		CreditCard.printSummary(sCard);
		
		
	}

}
