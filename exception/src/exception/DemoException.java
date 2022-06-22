package exception;

import java.util.Scanner;

public class DemoException {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int i=sc.nextInt();
		System.out.println("Enter The 2nd Number");
		int j=sc.nextInt();
		try {
			int result=i/j;
			throw new UnsupportedOperationException();
	}catch(UnsupportedOperationException e) {
		e.printStackTrace();
		
	}
	}
}
	class UnsupportedOperationException extends RuntimeException{
		public UnsupportedOperationException() {
			super("This operation is not supported ");
		}
		
	}

