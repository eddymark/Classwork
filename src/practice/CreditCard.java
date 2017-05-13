package practice;

public class CreditCard {
	
	private String customer,bank,account; //get the name of the customer bank and the account number as a string 
	private int limit; //this sets the limit of the credit card
	protected double balance; //this will tell you the balance 
	
	
	//create a constructor of credit card 
	
	public CreditCard(String cus, String bank, String acc, int lim, double initBal){
		
		setCustomer(cus);
		this.setBank(bank);
		setAccount(acc);
		limit = lim;
		balance = initBal;
	}
	public CreditCard( String cus,String bank,String acc, int lim){
		this(cus,bank,acc,lim,0.0); //starts the balance at zero
	}
	
	//the getter and setters for an account 
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	//how to charge a card 
	
	public boolean charge(double price){
		
		if(price + balance> limit){ //if your price and credit balance is more then the limit you decline
			System.out.println("Sorry your card has been declined");
			return false;
		}else {
			balance+=price; //this updates the balance
			System.out.println("you have "+balance+" remaing on your balance");
			return true; //charges the card 
		}

	}
	public void makePayment(double ammount){
		balance-=ammount;//
		
	}
	public static void printSummary(CreditCard card){
		System.out.println("customer = "+card.customer);
		System.out.println("Bank = "+card.bank);
		System.out.println("Account = "+card.account);
		System.out.println("Balance = "+card.balance);
		System.out.println("Limit = "+card.limit);
		
	}
	
	

}
