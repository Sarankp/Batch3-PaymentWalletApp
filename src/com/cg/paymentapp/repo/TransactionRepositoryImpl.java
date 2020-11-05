package com.cg.paymentapp.repo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import com.cg.paymentapp.beans.Transaction;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.exception.InvalidInputException;

public class TransactionRepositoryImpl implements ITransactionRepository {
	EntityManager manager;
	public TransactionRepositoryImpl(){
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		manager = f.createEntityManager();
		
	}
	
	@Override
	public Transaction addTransaction(Transaction transaction) throws InvalidInputException {
		if((transaction.getAmount())<0) {
			throw new InvalidInputException("Transaction cannot be added");
		}
		manager.getTransaction().begin();
		manager.persist(transaction);
		manager.getTransaction().commit();
		return transaction;	
		
		
	}

	@Override
	public List<Transaction> viewAllTransactions(Wallet wallet)  throws InvalidInputException {
//		CriteriaBuilder cb = manager.getCriteriaBuilder();
//		CriteriaQuery<Transaction> query = cb.createQuery(Transaction.class);
//		Root<Transaction> root = query.from(Transaction.class);
//		Join<Transaction, Wallet> joinUser = root.join("wallet_id"); 
//		query.where(cb.equal(joinUser.get("id"), wallet.getId()));
//		return manager.createQuery(query).getResultList();
		if(wallet.getId()<=0) {
			throw new InvalidInputException("Invalid wallet id");
		}
        TypedQuery<Transaction> query=manager.createQuery("select tx from Transaction tx where tx.wallet_id=:wid",Transaction.class);
   		query.setParameter("wid",wallet.getId());
   		List<Transaction> list=query.getResultList();
   		return list;
		
	}

	@Override
	public List<Transaction> viewTransactionsByDate(LocalDate from, LocalDate to)  throws InvalidInputException {
		if(from.isAfter(to)) {
			throw new InvalidInputException("From date is after to date");
		}
		
		
		TypedQuery<Transaction> query=manager.createQuery("select tx from Transaction tx where (tx.transactionDate>=:fromdate and tx.transactionDate<=:todate)",Transaction.class);
		query.setParameter("fromdate",Date.from(from.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		query.setParameter("todate",Date.from(to.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		List<Transaction> list=query.getResultList();
		return list;
	}
	
	@Override
	public List<Transaction>viewAllTransactions(String transactionType)  throws InvalidInputException {
		if(!transactionType.equalsIgnoreCase("credit") && !transactionType.equalsIgnoreCase("debit"))
		{
			throw new InvalidInputException("Enter valid transaction type");
		}
		TypedQuery<Transaction> query=manager.createQuery("select tx from Transaction tx where tx.transactionType=:type",Transaction.class);
		query.setParameter("type",transactionType);
		List<Transaction> list=query.getResultList();
		return list;
	}
	
	@Override
	 public Transaction viewTransaction(int id)  throws InvalidInputException {
		if(id<=0) {
			throw new InvalidInputException("Invalid Id");
		}
//		TypedQuery<Transaction> query=manager.createQuery("select all from Transaction tx where tx.transactionId=:id",Transaction.class);
//		query.setParameter("id",id);
//		List<Transaction> list=query.getResultList();
		return manager.find(Transaction.class, id);
	}
	
}