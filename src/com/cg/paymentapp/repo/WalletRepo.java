package com.cg.paymentapp.repo;

import java.util.ArrayList;
import java.util.List;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.exception.InvalidInputException;

public interface WalletRepo {

	public boolean save(Customer customer) throws InvalidInputException;
	public Customer findOne(String mobileNo) throws InvalidInputException;
	public List<Customer> getList()throws InvalidInputException;
	boolean save1(Customer customer) throws InvalidInputException;
}
	
	/*public com.cg.paymentapp.service.Customer createAccount(String name);
	public com.cg.paymentapp.service.Customer showBalance(String mobileno);
}*/