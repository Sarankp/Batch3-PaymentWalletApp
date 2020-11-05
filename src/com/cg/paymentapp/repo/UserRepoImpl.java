package com.cg.paymentapp.repo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.exception.InvalidInputException;

public class UserRepoImpl implements IUserRepo {
EntityManager manager;
public UserRepoImpl()
{
	EntityManagerFactory f= Persistence.createEntityManagerFactory("JPA-PU");
	manager=f.createEntityManager();
}

/***********************************
- Function Name	    :	validateLogin
- Input Parameters	:	String mobileNumber, String password
- Return Type		:	Customer
- Throws			:  	InvalidInputException
- Author			:	Pallavi Mondrety(Capgemini Trainee)
- Creation Date	    :	29/10/2020 to 04/11/2020
- Description		:	Login Validation in Repository
************************************/
 @Override
public Customer validateLogin(String mobileNumber, String password) throws InvalidInputException {
	// TODO Auto-generated method stub

     Query query = manager.createQuery("Select c from Customer c where c.mobileNo=:mobileNumber AND c.password=:password");
        query.setParameter("mobileNumber", mobileNumber);
        query.setParameter("password", password);
     Customer cust=(Customer) query.getSingleResult();
		return cust;
}
}