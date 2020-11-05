package com.cg.paymentapp.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TransactionTest {

	@Nested
	@DisplayName("addBeneficiaryDetails :")
	class addBeneficiaryDetailsTest{
		@Test
		@DisplayName("Added Correctly") 
		void addBeneficiaryCorrectly()  {

	
			BeneficiaryDetailsServiceImpl service = new BeneficiaryDetailsServiceImpl();
			BeneficiaryDetails beneficiaryDetails = new BeneficiaryDetails(4, "saru", "1234567890");
			assertEquals(beneficiaryDetails, service.addBeneficiary(beneficiaryDetails));
		}
		
		@Test
		@DisplayName("BeneficiaryDetails  is NotNull")
		void addBeneficiaryDetailsNotNull() {
			BeneficiaryDetails beneficiaryDetails = new BeneficiaryDetails(4, "saru", "1234567890");
			assertNotNull(beneficiaryDetails);
		}
		
		
	}
	@Nested
	@DisplayName("updateBeneficiaryDetails :")
	class BeneficiaryDetailsTest{
		@Test
		@DisplayName("Updated Correctly")
		void updateBeneficiaryDetailsCorrectly()  {
			BeneficiaryDetailsServiceImpl service = new BeneficiaryDetailsServiceImpl();
			BeneficiaryDetails beneficiaryDetails = new BeneficiaryDetails(4, "saru", "1234567890");
			assertEquals(beneficiaryDetails, service.updateBeneficiary(beneficiaryDetails));
			
		}
		@Test
		@DisplayName("BeneficiaryDetails is NotNull")
		
		void updateBeneficiaryDetailsNotNull() {
			BeneficiaryDetails beneficiaryDetails = new BeneficiaryDetails(4, "saru", "1234567890");
			assertNotNull(beneficiaryDetails);
		}
	}
	@Nested
	@DisplayName("ViewBeneficiaryDetails :")
	class ViewBeneficiaryDetailswithId{
		@Test
		
		@DisplayName("check if Id exits")
	   
			void viewBeneficiaryDetailsIdExits() {
				BeneficiaryDetailsServiceImpl service = new BeneficiaryDetailsServiceImpl();
				BeneficiaryDetails beneficiaryDetails = service.viewBeneficiary(i);
				assertEquals(Id, beneficiaryDetails.getId());
			}
		}

			}
		
		
	}
	@Nested
	@DisplayName("deleteBeneficiaryDetails:")
	
	 class DeleteBeneficiaryDetailsTest{
		@Test
		@DisplayName("Deleted Correctly :")
		void deleteBeneficiaryDetailsCorrectly()  {
			BeneficiaryDetailsServiceImpl service = new BeneficiaryDetailsServiceImpl();
			BeneficiaryDetails t=new BeneficiaryDetails(4, "saru", "1234567890");
		   
			assertEquals(t, service.deleteBeneficiary(t));
		}
		@Test
		@DisplayName("BeneficiaryDetails NotNull")
		
		void deleteBeneficiaryDetailsNotNull() {
			BeneficiaryDetails beneficiaryId = new BeneficiaryDetails(4, "saru", "1234567890");
			assertNotNull(beneficiaryId);
			}
	

	}

}
