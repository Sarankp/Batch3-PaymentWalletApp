package com.cg.paymentapp.Main;
//import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.service.*;
import com.cg.paymentapp.beans.*;

import java.util.List;
import java.util.Scanner;

public class BenificiaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     IBenificiaryService bds=new BenificiaryServiceImpl();
     BenificiaryDetails bdobj=new BenificiaryDetails(0, null, null);
     //Customer cus=new Customer();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter beneficiaryId:");
     int beneficiaryId=sc.nextInt();
     System.out.println("Enter name");
     String name=sc.next();
     System.out.println("Enter mobNo:");
     String mobNo=sc.nextLine();
     
     bdobj.setBeneficiaryId(beneficiaryId);
     bdobj.setName(name);
     bdobj.setMobileNumber(mobNo);
     BenificiaryDetails bd=bds.addBenificiary(bdobj);
    /* BeneficiaryDetails bdu=bds.updateBeneficiary(bdobj);
     BeneficiaryDetails bdd=bds.deleteBeneficiary(bdobj);
     BeneficiaryDetails bdv=bds.viewBeneficiary(bdobj);
     BeneficiaryDetails bdva=bds.viewAllBeneficiary(cus);*/
     System.out.println(bd.getBeneficiaryId());
     System.out.println(bd.getName());
     System.out.println(bd.getMobNo());
     
    
     /*System.out.println("Enter beneficiaryId");
     int beneficiaryId=sc.nextInt();
     bdobj.setBeneficiaryId(beneficiaryId);
     BeneficiaryDetails bd=bds.viewBeneficiary(bdobj);
     
     System.out.println("Enter name:");
     String name=sc.next();
     bd.setName(name);
     System.out.println("Enter mobileNumber:");
     String mobileNumber=sc.nextLine();
     bd.setMobileNumber(mobileNumber);
      BeneficiaryDetails bdu=bds.updateBeneficiary(bd);
      System.out.println(bdu.getBeneficiaryId());
      System.out.println(bdu.getName());
      System.out.println(bdu.getMobileNumber());
     sc.close();*/
     /*System.out.println("Enter  mobNo ");
     String mobNo =sc.next();
	List<BeneficiaryDetails> bdList=bds.viewBeneficiaryList(mobNo);
     for(BeneficiaryDetails beneficiarydetails: bdList) {
    	 System.out.println(beneficiarydetails);
     }*/
    
     sc.close();
	}

}