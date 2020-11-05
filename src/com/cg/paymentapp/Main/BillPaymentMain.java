package com.cg.paymentapp.Main;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.beans.BillType;
import com.cg.paymentapp.service.BillPaymentServiceImpl;
import com.cg.paymentapp.service.IBillPaymentService;

public class BillPaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBillPaymentService pays = new BillPaymentServiceImpl();
		BillPayment pobj = new BillPayment();
		Scanner sc=new Scanner(System.in);
		
		
		//BillPayment payment1=pays.viewBillPayment(pobj);
		
		
		
		System.out.println("Select BillPayment type from below list");
		System.out.println("1. DTH");
		System.out.println("2. MobilePrepaid");
		System.out.println("3. MobilePostpaid");
		System.out.println("4. CreditCard");
		System.out.println("5. LICPremium");
		System.out.println("6. LPG");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			pobj.setBilltype(BillType.DTH);
			System.out.println("DTH");
			break;
		case 2:
			pobj.setBilltype(BillType.MobilePrepaid);
			System.out.println("MobilePrepaid");
			break;
		case 3:
			pobj.setBilltype(BillType.MobilePostpaid);
			System.out.println("MobilePostpaid");
			break;
		case 4:
			pobj.setBilltype(BillType.CreditCard);
			System.out.println("CreditCard");
			break;
		case 5:
			pobj.setBilltype(BillType.LICPremium);
			System.out.println("LICPremium");
			break;
		case 6:
			pobj.setBilltype(BillType.LPG);
			System.out.println("LPG");
			break;
		}
		
		
		
		
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		pobj.setAmount(amount); 
		BillPayment payment=pays.addBillPayment(pobj);
		System.out.println(payment.getAmount());
	
		
		
		LocalDate paymentDate = LocalDate.now();
		System.out.println(paymentDate);
		
		System.out.println("Payment Succesfull");
		
		/*System.out.println("Enter Billid");
		int BillId = sc.nextInt();
		pobj.setBillId(BillId);*/
		
		
		
	}

}

