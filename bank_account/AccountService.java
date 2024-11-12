package bank.account;

import java.util.List;

import bank.exception.InsufficientBalanceException;
import bank.exception.NoAccountException;

public interface AccountService {
	boolean createAccount(String owner, int money);
	List<AccountVO> listAll();
	boolean deposit(int accountNo, int money) throws NoAccountException;
	boolean withdraw(int accountNo, int money) throws NoAccountException, InsufficientBalanceException;
	boolean removeAccount(int accountNo) throws NoAccountException;
}
