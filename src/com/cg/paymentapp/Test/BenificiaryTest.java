package com.cg.paymentapp.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.paymentapp.beans.BenificiaryDetails;
import com.cg.paymentapp.service.BenificiaryServiceImpl;
class BenificiaryTest {

class IBeneficiaryDetailsServiceTest {
	@Nested
	@DisplayName("addBeneficiaryDetails :")
	class addBeneficiaryDetailsTest{
		@Test
		@DisplayName("Added Correctly") 
		void addBeneficiaryCorrectly()  {

	
			BenificiaryServiceImpl service = new BenificiaryServiceImpl();
			BenificiaryDetails beneficiaryDetails = new BenificiaryDetails(4, "saru", "1234567890");
			assertEquals(beneficiaryDetails, service.addBenificiary(beneficiaryDetails));
		}
		
		@Test
		@DisplayName("BeneficiaryDetails  is NotNull")
		void addBeneficiaryDetailsNotNull() {
			BenificiaryDetails beneficiaryDetails = new BenificiaryDetails(4, "saru", "1234567890");
			assertNotNull(beneficiaryDetails);
		}
		
		
	}
	@Nested
	@DisplayName("updateBeneficiaryDetails :")
	class BeneficiaryDetailsTest{
		@Test
		@DisplayName("Updated Correctly")
		void updateBeneficiaryDetailsCorrectly()  {
			BenificiaryServiceImpl service = new BenificiaryServiceImpl();
			BenificiaryDetails beneficiaryDetails = new BenificiaryDetails(4, "saru", "1234567890");
			assertEquals(beneficiaryDetails, service.updateBenificiary(beneficiaryDetails));
			
		}
		@Test
		@DisplayName("BeneficiaryDetails is NotNull")
		
		void updateBeneficiaryDetailsNotNull() {
			BenificiaryDetails beneficiaryDetails = new BenificiaryDetails(4, "saru", "1234567890");
			assertNotNull(beneficiaryDetails);
		}
	}
	@Nested
	@DisplayName("ViewBeneficiaryDetails :")
	class ViewBeneficiaryDetailswithId{
		@Test
		
		@DisplayName("check if Id exits")
	   
			void viewBeneficiaryDetailsIdExits() {
				BenificiaryServiceImpl service = new BenificiaryServiceImpl();
				BenificiaryDetails beneficiaryDetails = service.viewBeneficiary(i);
				assertEquals(Id, beneficiaryDetails.getId());
			}
		}

			}
		
		
	
	@Nested
	@DisplayName("deleteBeneficiaryDetails:")
	
	 class DeleteBeneficiaryDetailsTest{
		@Test
		@DisplayName("Deleted Correctly :")
		void deleteBeneficiaryDetailsCorrectly()  {
			BenificiaryServiceImpl service = new BenificiaryServiceImpl();
			BenificiaryDetails t=new BenificiaryDetails(4, "saru", "1234567890");
		   
			assertEquals(t, service.deleteBenificiary(t));
		}
		@Test
		@DisplayName("BeneficiaryDetails NotNull")
		
		void deleteBeneficiaryDetailsNotNull() {
			BenificiaryDetails beneficiaryId = new BenificiaryDetails(4, "saru", "1234567890");
			assertNotNull(beneficiaryId);
			}
	

	}
}