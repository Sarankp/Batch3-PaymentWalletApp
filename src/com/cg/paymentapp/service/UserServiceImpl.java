package com.cg.paymentapp.service;
import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.beans.Transaction;
import com.cg.paymentapp.exception.InvalidInputException;
import com.cg.paymentapp.repo.IUserRepo;
import com.cg.paymentapp.repo.UserRepoImpl;
import com.cg.paymentapp.repo.UserRepoImpl;

import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserServiceImpl implements IUserService  {
IUserRepo userrepo;
public UserServiceImpl()
{
	userrepo= new UserRepoImpl();
}
/***********************************
- Function Name	    :	validateLogin
- Input Parameters	:	String mobileNumber, String password
- Return Type		:	Customer
- Throws			:  	InvalidExceptionException
- Author			:	Pallavi Mondrety(Capgemini Trainee)
- Creation Date	    :	29/10/2020 to 04/11/2020
- Description		:   Login Validation in Service layer 
************************************/
	 
@Override
public Customer validateLogin(String mobileNumber, String password) {
	// TODO Auto-generated method stub

	// Regex to check valid mobile number. 
	 Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	 Matcher matcher = p.matcher(mobileNumber);
	// Regex to check valid password. 
	 String pattern = "(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}";
	   
		 if((matcher.matches()) && (password.matches(pattern)))    
		 {
		return userrepo.validateLogin(mobileNumber,password);
		 }
		else 
		{
			 throw new InvalidInputException("Invalid Login Credentials");
	    }
	 
}

}