package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.BaseUtils;

public class BecomeAPartner extends BaseUtils {

	public static By lblTypeOfPartner = By.xpath("//h4[text()='Type of partner']");
	
	public static By typeOfPartnerOptions (String options) {
		return By.xpath("//label[@for=\""+options+"\"]"); 
	}
	
	public static By lblErrorMsg = By.xpath("//div[@class='ph-error-inner']");

	public static By btnGetAdemo_typeOfPartner = By.xpath("//div[@class='right flex-start']//a[text()='Get a demo']");

	
}
