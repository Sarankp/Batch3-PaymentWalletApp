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
		public void addBillPaymentTestdth(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.DTH);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTestdth(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.DTH);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}
		
		
		
		@Test
		public void addBillPaymentTestMpre(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.MobilePrepaid);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTestMpre(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.MobilePrepaid);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}
		
		
		@Test
		public void addBillPaymentTestMpo(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.MobilePostpaid);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTestMpo(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.MobilePostpaid);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}
		
		
		@Test
		public void addBillPaymentTestCC(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.CreditCard);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTestCC(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.CreditCard);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}
		
		
		@Test
		public void addBillPaymentTestLIC(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.LICPremium);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTestLIC(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.LICPremium);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}
		
		
		@Test
		public void addBillPaymentTestLPG(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.LPG);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.addBillPayment(payment));
		}
		@Test
		public void viewBillPaymentTestLPG(){
			BillPayment payment = new BillPayment();
			payment.setAmount(399);
			payment.setBilltype(BillType.LPG);
			payment.setPaymentDate(LocalDate.parse("2020-11-05"));
			assertEquals(payment,billpayment.viewBillPayment(payment));
		
		}



}
