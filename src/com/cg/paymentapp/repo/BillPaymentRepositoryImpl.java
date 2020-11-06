package com.cg.paymentapp.repo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.exception.InvalidInputException;

public class BillPaymentRepositoryImpl implements IBillPaymentRepository{
	EntityManager em;
	public BillPaymentRepositoryImpl() {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		em=f.createEntityManager();
	}
	
	/************************************************************************************
	* Function Name	    :	BillPayment
	* Input Parameters  :	int Billid, double Amount, LoacalDate paymentDate
	* Return Type	    :	payment
	* Throws	    :  	InvalidInputException
	* Author	    :	Sarankumar Pagadala
	* Creation Date	    :	2020-10-29 to 2020-11-04
	* Description	    :	BillPayment in Repository
	*************************************************************************************/
	@Override
	public BillPayment addBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(payment);
		em.getTransaction().commit();
		return payment;
	}

	@Override
	public BillPayment viewBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		payment=em.find(BillPayment.class,payment.getBillId());
		return payment;
	}
	

}
