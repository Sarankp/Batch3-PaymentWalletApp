package com.cg.paymentapp.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.paymentapp.beans.Transaction;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.exception.InvalidInputException;
import com.cg.paymentapp.repo.ITransactionRepository;
import com.cg.paymentapp.repo.TransactionRepositoryImpl;

public class TransactionServiceImpl {

	public static void main(String[] args) {
		ITransactionRepository repo = new TransactionRepositoryImpl();  //create new repository
		ITransactionService service = new TransactionServiceImpl(repo); //create new 

		Scanner sc = new Scanner(System.in);
		
	try {
	addTx(sc, service);
	addTx(sc, service);
		addTx(sc, service);
       getTxByType(sc,service);
			Id(sc, service);
//	walletId(sc, service);
			datefromto(sc, service);
	} catch (InvalidInputException e) {
		e.printStackTrace();
	}

		
		sc.close();
	}

	public static void addTx(Scanner sc, ITransactionService service) throws InvalidInputException {
		Transaction tx = new Transaction();
		
		System.out.println("Enter amount");
		tx.setAmount(sc.nextDouble());
		
		System.out.println("Enter transaction type");
		tx.setTransactionType(sc.next());
		
		tx.setTransactionDate(Date.from(LocalDateTime.now()
//				.plusDays(20)
				.toInstant(OffsetDateTime.now().getOffset())));
		
		System.out.println("Enter description");
		tx.setDescription(sc.next());
		

		tx.setWallet(new Wallet());
		
		service.addTransaction(tx);
	}

	public static void getTxByType(Scanner sc, ITransactionService service) throws InvalidInputException {
		System.out.println("Choose Transaction Type");
		String type=sc.next();
		print(service.viewAllTransactions(type));
	}
	
	public static void Id(Scanner sc, ITransactionService service) throws InvalidInputException {
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println(service.viewTransaction(id).toString());
	}
		
		public static void walletId(Scanner sc, ITransactionService service) throws InvalidInputException {
			System.out.println("Enter walletid:");
			int id=sc.nextInt();
			Wallet w=new Wallet();
			w.setId(id);
			print(service.viewAllTransactions(w));
		}
		
		public static void print(List<Transaction> txs) throws InvalidInputException {
			for(Transaction tx : txs) {
				System.out.println(tx.toString());
			}
		}

		public static void datefromto(Scanner sc, ITransactionService service) throws InvalidInputException {
			LocalDate ld1= LocalDate.now().minusDays(1);
			LocalDate ld2= LocalDate.now().plusDays(1);
			
			print(service.viewTransactionsByDate(ld1,ld2));
		}
		
		public static void datefrom(Scanner sc, ITransactionService service) throws InvalidInputException {
			System.out.println("Enter from:");
			Scanner sr=new Scanner(System.in);
			System.out.println("Enter year");
			int year=sr.nextInt();
			System.out.println("Enter month:");
			int month=sr.nextInt();
			System.out.println("Enter date:");
			int date=sr.nextInt();	
}

		public static void dateto(Scanner sc, ITransactionService service) throws InvalidInputException {
			System.out.println("Enter to:");
			Scanner sr=new Scanner(System.in);
			System.out.println("Enter year");
			int year=sr.nextInt();
			System.out.println("Enter month:");
			int month=sr.nextInt();
			System.out.println("Enter date:");
			int date=sr.nextInt();	
		}
	}
//}