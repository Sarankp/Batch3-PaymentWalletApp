package com.cg.paymentapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.paymentapp.beans.BenificiaryDetails;
import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.exception.InvalidInputException;

public class BenificiaryRepositoryImpl implements IBenificiaryRepository {
	EntityManager manager;
	public BenificiaryRepositoryImpl() {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		manager = f.createEntityManager();
	}

	@Override
	public BenificiaryDetails addBeneficiary(BenificiaryDetails bd) throws InvalidInputException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(bd);
		manager.getTransaction().commit();
		return bd;
	}

	
	
	
	@Override
	public BenificiaryDetails updateBeneficiary(BenificiaryDetails bd)  throws InvalidInputException {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.merge(bd);
		manager.getTransaction().commit();
		return bd;
	}

	@Override
	public BenificiaryDetails deleteBeneficiary(BenificiaryDetails bd) throws InvalidInputException{
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.remove(bd);
		manager.getTransaction().commit();
		return bd;
		
	}

	@Override
	public BenificiaryDetails viewBeneficiary(BenificiaryDetails bd) throws InvalidInputException{
		// TODO Auto-generated method stub
	bd=manager.find(BenificiaryDetails.class,bd.getMobNo());
		return bd;
	}

	@Override
	public List<BenificiaryDetails> viewAllBeneficiary(Customer customer) throws InvalidInputException {
		// TODO Auto-generated method stub
		TypedQuery<BenificiaryDetails> query= manager.createQuery("select customer from BenificiaryDetails customer where customer.customer=:name", BenificiaryDetails.class);
		query.setParameter("name",customer);
		List<BenificiaryDetails> list=query.getResultList();
		return list;
	}
}