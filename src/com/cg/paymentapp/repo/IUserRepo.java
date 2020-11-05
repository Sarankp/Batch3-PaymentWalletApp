package com.cg.paymentapp.repo;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.exception.InvalidInputException;

public interface IUserRepo {

	public Customer validateLogin(String mobileNumber,String password) throws InvalidInputException;
}