package exception;

import java.util.Scanner;

public class Balance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw:");
		double amount=sc.nextDouble();
		SavingAccount s=new SavingAccount();
		double balance=s.getBalance();
		try { 
			if(amount>balance) {
				throw new InsufficientBalanceException();
				}else if(amount<0) {
					throw new IlllegalbankTransaction();
					
				}
			
		}
		catch(InsufficientBalanceException ex) {
			ex.printStackTrace();
		}
		catch(IlllegalbankTransaction el) {
			el.printStackTrace();;
		}
		
	}

}
