package com.cg.paymentapp.service;


		import java.util.Scanner;
        import com.cg.paymentapp.beans.BankAccount;
        import com.cg.paymentapp.beans.Customer;
        import com.cg.paymentapp.beans.Wallet;

import antlr.collections.List;

		public class BankAccountMain {
			
			
			
		private static IAccountService service;
		private static BankAccount bacc;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the Bank Account Module!\n\n");
			String lastOption = "";
			while(!lastOption.equalsIgnoreCase("x")) {
				lastOption = displayMenu(sc);
			}
			
			System.out.println("\nExiting System...\n");
		}
		
		private static String  displayMenu(Scanner sc) {
			System.out.println("Please select an option:");
			System.out.println("1. addAccount");
			System.out.println("2. removeAccount");
			System.out.println("3. viewAccount");
			System.out.println("4. viewAllAccounts");
			System.out.println("X. Exit System.");
			System.out.println("Option: ");
			String option = sc.next();
			switch (option) {
				case "1": performAddAccount(sc);
						  return option;
				case "2": performRemoveAccount(sc);
						  return option;
				case "3": performViewAccount(sc);
						  return option;
				case "4": performViewAllAccounts();
						  return option;
				case "X": return option;
				case "x": return option;
				default: System.out.println("Invalid Option, Please re-enter");
						 return option;
			}
		}
		

		private static void performAddAccount(Scanner sc) {
			
			service = new AccountServiceImpl();
		      bacc = new BankAccount();
			
			System.out.println("Enter AccountDetails:");
			System.out.println("Enter accountNo");
			int accountNo = sc.nextInt();
			System.out.println("Enter ifscCode");
			String ifscCode = sc.next();
			System.out.println("Enter bankname");
			String bankName = sc.next();
			System.out.println("Enter balance");
			double balance = sc.nextDouble();
			
			bacc.setAccountNo(accountNo);
			bacc.setIfscCode(ifscCode);
			
			Wallet baccInstance =service.addAccount(bacc);
			
			System.out.println("Bank Account Added!!!");
			System.out.println("Added Account Details:");
			System.out.println(baccInstance.getAccountNo());
			System.out.println(baccInstance.getIfscCode());
			System.out.println(baccInstance.getBankName());
			System.out.println(baccInstance.getBalance());
		}
		
		
		private static void performRemoveAccount(Scanner sc) {
			
			service = new AccountServiceImpl();
			bacc = new BankAccount();
			
			System.out.println("\n\nRemoveAccount");
			System.out.println("Enter AccountNo to Remove from Account");
			int accountNo = sc.nextInt();
			
			Wallet baccInstance = service.viewAccount(bacc);
			
			service.removeAccount(bacc);
			
			System.out.println(baccInstance.getAccountNo() + "Removed from DataBase");
			
		}
      private static void performViewAccount(Scanner sc) {
			
			service = new AccountServiceImpl();
			bacc = new BankAccount();
			
			System.out.println("\n\nEnter AccountDetails to view");
			System.out.println("Enter accountNo to fetch results");
			int accountNo = sc.nextInt();
			
			Wallet baccInstance = service.viewAccount(bacc);
			
			System.out.println("View fetched accountDetails:");
			System.out.println(baccInstance.getAccountNo());
			System.out.println(baccInstance.getIfscCode());
			System.out.println(baccInstance.getBankName());
            System.out.println(baccInstance.getBalance());
			
		}
		
		private static void performViewAllAccounts() {
			
			service = new AccountServiceImpl();
		      bacc = new BankAccount();
			
			System.out.println("\n\nViewAllAccounts");
			List<Wallet> list = service.viewAllAccounts(bacc);
			for (Wallet Account : list) {
				System.out.println(Account);
			}
			
		}

}
