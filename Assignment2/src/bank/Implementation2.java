package bank;

public class Implementation2 {
public static void main(String[] args) {
	CurrentAccount c= new CurrentAccount();
	int bal=c.balance(1000);
	c.setBalance(bal);
	System.out.println("Current acct balance:"+c.getBalance());
	
	SavingAccount s=new SavingAccount();
	int balS=s.balance(2000);
	s.setBalance(balS);
	System.out.println("Saving acct balance:"+s.getBalance());
	
	Bank b=new Bank();
	int totalBalance=c.getBalance()+s.getBalance();
	b.setBalance(totalBalance);
	System.out.println("Bank balance:"+b.getBalance());
	
}
}
