package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import PageObjects.BecomeAPartner;
import PageObjects.HomePage;
import Utils.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseUtils {

   //HomePage homePage;
   //BecomeAPartner becomeAPartner;

   @Given("Launch the application")
    public void LaunchTheApplication() throws Exception {
	   openBrowser();
	   openURL("https://www.liberis.com/");
	   implicitlyWait();
	}

   @When("Click on the Get Demo button")
    public void ClickOnTheGetDemoButton() throws Exception {
	   clik(HomePage.btnHeaderGetADemo);
    }

    @Then("Verify user has landed on Partner Selection page")
    public void VerifyUserHasLandedOnPartnerSelectionPage() throws InterruptedException {
    	explicitWait(BecomeAPartner.lblTypeOfPartner);
    	Assert.assertEquals(true, isDisplay(BecomeAPartner.lblTypeOfPartner));
    }
    
    @Then("Verify Type of partner options")
    public void VerifyTypeOfPartnerOptions(List<Map<String, String>> Options) {
    
    	 for(Map<String, String> player : Options) {
    	        System.out.println(player.get("Options"));
    	        
    	        String str = player.get("Options");
    	        
    	        System.out.println(BecomeAPartner.typeOfPartnerOptions(str));
    	        
    	        System.out.println(isDisplay(BecomeAPartner.typeOfPartnerOptions(player.get("Options"))));
    	        
    	        Assert.assertEquals(true, isDisplay(BecomeAPartner.typeOfPartnerOptions(player.get("Options"))));
    	    }
    }
    
    
    
    @Then("Verify the validation message for Get Demo")
    public void VerifyTheValidationMessageForGetDemo() throws Exception { 
    	
 	   clik(BecomeAPartner.btnGetAdemo_typeOfPartner);
 	   
       Assert.assertEquals("Please select a type of partner", getText(BecomeAPartner.lblErrorMsg));


    }
    
}
