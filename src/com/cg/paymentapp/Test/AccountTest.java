package com.cg.paymentapp.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.cg.paymentapp.service.AccountServiceImpl;
import com.cg.paymentapp.service.IAccountService;

class AccountTest {

	class IBeneficiaryDetailsServiceTest {
		@Nested
		@DisplayName("insertAccount :")
		class InsertAccountTest{
			@Test
			@DisplayName("Inserted Correctly") 
			void insertAccountCorrectly()  {

		
				IAccountService service = new AccountServiceImpl();
				Account account = new Account(123456789, "hdfc123456", "bankOfParis");
				assertEquals(Account, service.addAccount(account));
			}
			
			@Test
			@DisplayName("Account not null")
			void insertTicketBookingNotNull() {
				Account account = new Account(123456789, "hdfc123456", "bankOfParis");
				assertNotNull(account);
			}
			
		}

		@Nested
		@DisplayName("removeAccount :")
		
		class RemoveAccountTest{
			@Test
			@DisplayName("Removed Correctly :")
			void removeTicketBookingCorrectly()  {
				IAccountService service = new AccountServiceImpl();
				Account t=new Account(123456789, "hdfc123456", "bankOfParis");
			   
				assertEquals(t, service.removeAccount(t));
			}
			@Test
			@DisplayName("Account not null")
			void removeAccountNotNull() {
				Account AccountNo = new Account(123456789, "hdfc123456", "bankOfParis");
				assertNotNull(AccountNo);
				}
		}
	}
}