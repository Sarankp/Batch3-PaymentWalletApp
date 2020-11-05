package com.cg.paymentapp.service;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.repo.BillPaymentRepositoryImpl;
import com.cg.paymentapp.repo.IBillPaymentRepository;

public class BillPaymentServiceImpl implements IBillPaymentService {
	IBillPaymentRepository pr;
	public BillPaymentServiceImpl() {
		pr=new BillPaymentRepositoryImpl();
	}
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
