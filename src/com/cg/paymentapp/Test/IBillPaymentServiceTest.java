package com.cg.paymentapp.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.beans.BillType;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.service.BillPaymentServiceImpl;
import com.cg.paymentapp.service.IBillPaymentService;

class IBillPaymentServiceTest {
	IBillPaymentService billpayment;
	@Before
	public void init() {
		billpayment= new BillPaymentServiceImpl();
		
	}
		@Test
		public void addBillPaymentTest(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.DTH);
			payment.setPaymentDate(LocalDate.parse("2020-11-04"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTest(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.DTH);
			payment.setPaymentDate(LocalDate.parse("2020-11-04"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}



}