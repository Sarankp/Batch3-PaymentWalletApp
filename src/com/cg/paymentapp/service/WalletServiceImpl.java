package com.cg.paymentapp.service;
import java.math.BigDecimal;
import java.util.List;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.exception.InvalidInputException;
import com.cg.paymentapp.repo.WalletRepo;
import com.cg.paymentapp.repo.WalletRepoImpl;
public class WalletServiceImpl implements WalletService{
     WalletRepo wa;
	public WalletServiceImpl() {
	wa = new WalletRepoImpl();
	}
	@Override
	public com.cg.paymentapp.beans.Customer createAccount(String name, String mobileno, BigDecimal amount) {
		// TODO Auto-generated method stub
		return wa.createAccount(name);
	   //return null;
	}
	@Override
	public com.cg.paymentapp.beans.Customer showBalance(String mobileno) {
		return wa.showBalance(mobileno);
		//return null;
		
	@Override
		public boolean save(Customer customer) throws InvalidInputException {
	        Customer customer1 = null;
	        customer1 = this.findOne(customer.getMobileNo());
	        if (customer1 == null) {
	          this.data.put(customer.getMobileNo(), customer);
	          return true;
	        }
	        this.data.remove(customer2.getMobileNo());
	        this.data.put(customer.getMobileNo(), customer);
	        return true;
	 	
		
	}
	private Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Customer> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer updateAccount(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer addMoney(Wallet wallet, double amount) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean save(Customer customer) throws InvalidInputException {
        Customer customer1 = null;
        customer1 = this.findOne(customer.getMobileNo());
        if (customer1 == null) {
            this.data.put(customer.getMobileNo(), customer);
            return true;
        }
        this.data.remove(customer2.getMobileNo());
        this.data.put(customer.getMobileNo(), customer);
        return true;
 
}