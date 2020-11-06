package com.cg.paymentapp.service;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.repo.BillPaymentRepositoryImpl;
import com.cg.paymentapp.repo.IBillPaymentRepository;

public class BillPaymentServiceImpl implements IBillPaymentService {
	IBillPaymentRepository pr;
	public BillPaymentServiceImpl() {
		pr=new BillPaymentRepositoryImpl();
	}
	
	/****************************************************************************
	* Function Name	    :	BillPayment
	* Input Parameters  :	int Billid, double Amount, LoacalDate paymentDate
	* Return Type	    :	payment
	* Throws	    :  	InvalidInputException extends RuntimeException
	* Author	    :	Sarankumar Pagadala
	* Creation Date	    :	2020-10-29 to 2020-11-04
	* Description	    :	BillPayment in Service
	****************************************************************************/
	@Override
	public BillPayment addBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		return pr.addBillPayment(payment);
	}

	@Override
	public BillPayment viewBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		return pr.viewBillPayment(payment);
	}

}
