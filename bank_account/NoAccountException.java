package bank.exception;

public class NoAccountException extends Exception{
	public NoAccountException() {
		
	}
	
	public NoAccountException(int accountNo) {
		super("없는 계좌번호 : " + accountNo);
	}
}
