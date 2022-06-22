package exception;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException() {
		super("You dont have sufficient Balance to withdraw:");
	}
}
