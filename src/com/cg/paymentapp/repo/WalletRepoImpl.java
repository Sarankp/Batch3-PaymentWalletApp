package com.cg.paymentapp.repo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.paymentapp.exception.InvalidInputException;
import com.cg.paymentapp.service.Customer;

public class WalletRepoImpl implements WalletRepo { 
	EntityManager manager;
	private Object data;
	
	public WalletRepoImpl() {
		EntityManagerFactory f= Persistence.createEntityManagerFactory("JPA-PU");
		manager=f.createEntityManager();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean save(Customer customer) throws InvalidInputException {
		// TODO Auto-generated method stub
		        Customer customer1 = null;
        customer1 = this.findOne(customer.getMobileNo());
        if (customer1 == null) {
             this.data.put(customer.getMobileNo(), customer);
            return true;
        }
        this.data.remove(customer1.getMobileNo());
        this.data.put(customer.getMobileNo(), customer);
        return true;
	}

	@Override
	public Customer findOne(String mobileNo) throws InvalidInputException {
		// TODO Auto-generated method stub
	  
        if  this.data).containsKey(mobileNo)) {
            return this.data.get(mobileNo);
        }
      

	}

	@Override
	public List<Customer> getList() throws InvalidInputException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean save(com.cg.paymentapp.beans.Customer customer) throws InvalidInputException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public com.cg.paymentapp.beans.Customer findOne(String mobileNo) throws InvalidInputException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean save1(com.cg.paymentapp.beans.Customer customer) throws InvalidInputException {
		// TODO Auto-generated method stub
		return false;
	}

}