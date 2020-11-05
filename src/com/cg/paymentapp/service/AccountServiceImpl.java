package com.cg.paymentapp.service;

import java.util.List;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.repo.AccountRepositoryImpl;
import com.cg.paymentapp.repo.IAccountRepository;

public class AccountServiceImpl implements IAccountService {
    IAccountRepository repo;
    public AccountServiceImpl() {
    	repo=new AccountRepositoryImpl();
    }
    
	@Override
	public Wallet addAccount(BankAccount bacc) {
		// TODO Auto-generated method stub
		return repo.addAccount(bacc);
	}

	@Override
	public Wallet removeAccount(BankAccount bacc) {
		// TODO Auto-generated method stub
		return  repo.removeAccount(bacc);
	}

	@Override
	public Wallet viewAccount(BankAccount bacc) {
		// TODO Auto-generated method stub
		return  repo.viewAccount(bacc);
	}

	@Override
	public List<Wallet> viewAllAccounts(Wallet wallet) {
		// TODO Auto-generated method stub
		return  repo.viewAllAccounts(wallet);
	}

}