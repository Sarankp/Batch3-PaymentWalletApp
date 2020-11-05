package com.cg.paymentapp.service;

import java.util.List;

import com.cg.paymentapp.beans.BenificiaryDetails;
import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.exception.InvalidInputException;
import com.cg.paymentapp.repo.BenificiaryRepositoryImpl;
import com.cg.paymentapp.repo.IBenificiaryRepository;

public class BenificiaryServiceImpl implements IBenificiaryService {
	IBenificiaryRepository bdr;
	public BenificiaryServiceImpl() {
		bdr=new BenificiaryRepositoryImpl();
	}
	@Override
	public BenificiaryDetails addBenificiary(BenificiaryDetails bd) throws InvalidInputException {
		// TODO Auto-generated method stub
		return bdr.addBeneficiary(bd);
	}

	
	
	@Override
	public BenificiaryDetails updateBenificiary(BenificiaryDetails bd) throws InvalidInputException {
		// TODO Auto-generated method stub
		return bdr.updateBeneficiary(bd);
	}

	@Override
	public BenificiaryDetails deleteBenificiary(BenificiaryDetails bd) throws InvalidInputException {
		// TODO Auto-generated method stub
		return bdr.deleteBeneficiary(bd);
	}

	@Override
	public BenificiaryDetails viewBenificiary(BenificiaryDetails bd) throws InvalidInputException{
		// TODO Auto-generated method stub
		return bdr.viewBeneficiary(bd);
	}
	

	@Override
	public List<BenificiaryDetails> viewAllBenificiary(Customer customer) throws InvalidInputException {
		// TODO Auto-generated method stub
		return bdr.viewAllBeneficiary(customer);
	}
}