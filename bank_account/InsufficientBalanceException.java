package bank.exception;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {}
	
	public InsufficientBalanceException(int money) {
		super("잔액 부족 : " + money + "원");
	}
}
