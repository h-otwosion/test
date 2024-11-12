package bank.account;

import java.util.List;

import bank.exception.InsufficientBalanceException;
import bank.exception.NoAccountException;

public class SJAccountService implements AccountService {
	
	private AccountDAO accountDAO;
	
	public SJAccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public boolean createAccount(String owner, int money) {
		int result = accountDAO.insert(owner, money);
		
		return result == 1 ? true : false;
		
	}
	
	@Override
	public List<AccountVO> listAll() {
		List<AccountVO> accountList;
		accountList = accountDAO.selectAll();
		if (accountList.isEmpty())
			return null;
		return accountList;
		
	}

	@Override
	public boolean deposit(int accountNo, int money) throws NoAccountException{
		//예금할 계좌정보 가져오기
		AccountVO ac = accountDAO.select(accountNo);
		if (ac == null) {
			throw new NoAccountException(accountNo);
		}
		int result = accountDAO.updateBalance(accountNo, ac.getBalance() + money);
		return result==1 ? true : false;
	}

	@Override
	public boolean withdraw(int accountNo, int money) throws NoAccountException, InsufficientBalanceException{
		AccountVO ac = accountDAO.select(accountNo);
		if (ac == null) {
			throw new NoAccountException(accountNo);
		}
		int new_balance = ac.getBalance() - money;
		if (new_balance < 0) {
			throw new InsufficientBalanceException(new_balance);
		}
		int result = accountDAO.updateBalance(accountNo, ac.getBalance() - money);
		return result==1 ? true : false;
	}

	@Override
	public boolean removeAccount(int accountNo) throws NoAccountException{
		AccountVO ac = accountDAO.select(accountNo);
		if (ac == null) {
			throw new NoAccountException(accountNo);
		}
		int result = accountDAO.delete(accountNo);
		return result == 1 ? true : false;
	}
	
	
}
