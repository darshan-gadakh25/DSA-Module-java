import java.util.*;
import java.lang.*;

interface AccountOperations{
	void deposit(double amount);
	
	void withdraw(double amount);
}


abstract class Account{
	private int accountId;
	private String accountHolderName;
	private double balance;
	
	Account(int accountId, String accountHolderName, double balance){
		this.accountId=accountId;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}

	
	public int getAccountId(){
		return accountId;
	}
	
	public void setAccountId(int accountId){
		this.accountId=accountId;
	}
	
	public String getAccountName(){
		return accountHolderName;
	}
	public void setAccountName (String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	abstract void displayDetails();
}

class SavingsAccount extends Account{
	private double interestRate;
	
	SavingsAccount(int accountId, String accountHolderName, double balance, double interestRate){
		super(accountId, accountHolderName, balance);
		this.interestRate=interestRate;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public void setInterestRate(double interestRate){
		this.interestRate=interestRate;
	}
	
	void displayDetails(){
		System.out.println("Account Details: [ AccountId:"+getAccountId()+", Account Holder name: "+getAccountName()+", Account Balance: "+getBalance()+", Account interest Rate: "+this.interestRate+"% ]");
	}
}

class CurrentAccount extends Account implements AccountOperations{
	private double overDraftLimit;
	
	CurrentAccount(int accountId, String accountHolderName, double balance, double overDraftLimit){
		super(accountId, accountHolderName, balance);
		this.overDraftLimit=overDraftLimit;
	}
	
	public double getOverDraftLimit(){
		return overDraftLimit;
	}
	
	public void setOverDraftLimit(double overDraftLimit){
		this.overDraftLimit=overDraftLimit;
	}
	
	
	public void deposit(double deposit){
		if( deposit < 0){
			throw new IllegalArgumentException("Deposite amount should not less than 0.");
		}
		setBalance( getBalance() + deposit);
	}
	
	public void withdraw(double withdraw){
		
		if(withdraw > getBalance() + overDraftLimit){
			throw new RuntimeException("Withdram amount not less than account balance + overDraftLimit");
		}
		else {
			setBalance( getBalance ()  - withdraw); 
		}
	}
	
	void displayDetails(){
		System.out.println("Account Details: [ AccountId:"+getAccountId()+", Account Holder name: "+getAccountName()+", Account Balance: "+getBalance()+ "Overdraft: "+overDraftLimit+" ]");
	}

}

class Sortbybalabce implements Comparator<Account> {
	
	@Override
	public int compare(Account a1, Account a2){
		int namerepeated =a1.getAccountName().compareTo(a2.getAccountName());
		if( namerepeated == 0){
			return Double.compare(a1.getBalance(), a2.getBalance());
		}
		
		return namerepeated;
	}
}
public class BankManagement{

	public static void main(String [] args){
		TreeSet <Account>  accountset =new TreeSet<>(new Sortbybalabce());
		
		 accountset.add(new SavingsAccount(101, "Ramesh", 5000, 5));
        accountset.add(new CurrentAccount(102, "Anita", 2000, 1000));

        List<Account> accountList = new LinkedList<>(accountset);

        System.out.println("Before sorting: " );
		for(Account a: accountList){
			System.out.println("After sorting by balance: " + a.getAccountName() );
		}

        Collections.sort(accountList, new Sortbybalabce());

        System.out.println("After sorting by balance: "  );
		for(Account a: accountList){
			System.out.println("After sorting by balance: " + a.getAccountName() );
		}
	}
}