package com.cg.paymentapp.repo;

import java.util.List;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.exception.InsufficientBalanceException;

public interface IAccountRepository {

	public Wallet addAccount(BankAccount bacc) throws InsufficientBalanceException;
	public Wallet removeAccount(BankAccount bacc)  throws InsufficientBalanceException;
	public Wallet viewAccount(BankAccount bacc)  throws InsufficientBalanceException;
	public List<Wallet> viewAllAccounts(Wallet wallet)  throws InsufficientBalanceException;
	
	
}