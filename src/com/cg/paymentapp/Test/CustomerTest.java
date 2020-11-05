package com.cg.paymentapp.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.paymentapp.beans.Customer;

class CustomerTest {

	@Test
	public void UserName()
	{
		Customer obj= new Customer();
		obj.setName("minho");
		 assertNotNull(obj.getName());
	}
	@Test
	public void UserMobileNo()
	{
		Customer obj1=new Customer();
		obj1.setMobileNo("9014836030");
		equals(obj1.getMobileNo());
	}
	@Test
	public void UserPassword()
	{
		Customer obj2=new Customer();
		obj2.setPassword("Venkat@412");
		equals(obj2.getPassword());
	}

}
