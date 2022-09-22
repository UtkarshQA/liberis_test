package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtils {

	public static WebDriver driver;

	public void openBrowser() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void openURL(String url) throws Exception {
		driver.get(url);
	}

	public void clik(By locators) throws Exception {
		driver.findElement(locators).click();
	}

	public boolean isDisplay(By locators) {
		return driver.findElement(locators).isDisplayed();
	}

	
	public String getText(By locators) {
		return driver.findElement(locators).getText();
	}
	
	
	public void explicitWait(By locators) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
	}
	
	
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	


}
