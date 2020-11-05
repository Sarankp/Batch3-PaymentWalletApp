package com.cg.paymentapp.repo;

import java.time.LocalDate;
import java.util.List;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.exception.InvalidInputException;

public interface IBillPaymentRepository {

	public BillPayment addBillPayment(BillPayment payment) throws InvalidInputException;
	public BillPayment viewBillPayment(BillPayment payment) throws InvalidInputException;
	//public List<BillPayment> viewBillPaymentList(LocalDate paymentDate) throws InvalidInputException;
}
