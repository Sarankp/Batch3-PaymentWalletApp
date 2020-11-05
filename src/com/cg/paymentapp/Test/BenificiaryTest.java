package com.cg.paymentapp.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.paymentapp.beans.BenificiaryDetails;
import com.cg.paymentapp.service.BenificiaryServiceImpl;

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
	class ViewBeneficiaryDetailswithMobNo{
		@Test
		
		@DisplayName("check if MobNo exits")
	   
			void viewBeneficiaryDetailsIdExits() {
				BenificiaryServiceImpl service = new BenificiaryServiceImpl();
				BenificiaryDetails beneficiaryDetails = new BenificiaryDetails(4, "saru", "1234567890");;
				assertEquals(beneficiaryDetails, service.viewBenificiary(beneficiaryDetails));
			}
		}

			}
		
		
	
	@Nested
	@DisplayName("deleteBeneficiaryDetails:")
	
	 class deleteBeneficiaryDetailsTest{
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
	
