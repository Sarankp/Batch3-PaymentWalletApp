package com.cg.paymentapp.Main;
import java.math.BigDecimal;
import java.util.Scanner;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.service.WalletService;
import com.cg.paymentapp.service.WalletServiceImpl;

public class WalletMain {
          public static void main(String[] args) {
        	  WalletService ws=new WalletServiceImpl();
        	  Wallet wobj=new Wallet();
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter id");
        	  int Walletid=sc.nextInt();
        	  System.out.println("enter balance");
        	  BigDecimal balance=sc.nextBigDecimal();
        	  wobj.setWalletId(Walletid);
        	  wobj.setBalance(balance);
        	    
        	  Wallet w=ws.updateAccount(wobj);
        	  System.out.println(w.getWalletId());
        	  System.out.println(w.getBalance());
        	 
          }
}