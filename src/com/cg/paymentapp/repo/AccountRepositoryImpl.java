package com.cg.paymentapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.exception.InsufficientBalanceException;

public class AccountRepositoryImpl implements IAccountRepository  {
	EntityManager manager;
    public AccountRepositoryImpl(){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
        manager = f.createEntityManager();
	}
    Wallet wal=new Wallet();
	@Override
	public Wallet addAccount(BankAccount bacc) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(bacc);
		manager.getTransaction().commit();
		return wal;
	}
	@Override
	public Wallet removeAccount(BankAccount bacc)  throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.remove(bacc);
		manager.getTransaction().commit();
		return wal;
	}
	@Override
	public Wallet viewAccount(BankAccount bacc)  throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		BankAccount ba =manager.find(BankAccount.class, bacc.getAccountNo());
		return wal;
	}

	@Override
	public List<Wallet> viewAllAccounts(Wallet wallet) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		TypedQuery<Wallet> query = manager.createQuery("select account from Wallet wallet",Wallet.class);
		List<Wallet> list = query.getResultList();
		return list;
	}
}