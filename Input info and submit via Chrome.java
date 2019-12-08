
package thrmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		
		 String baseUrl = "http://192.168.10.66/THRM/Default.aspx"; 
		

		// launch Fire fox and direct it to the Base URL
		/*
		 * driver.get(baseUrl); // get the actual value of the title actualTitle =
		 * driver.getTitle();
		 * 
		 * 
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 * 
		 * if (actualTitle.contentEquals(expectedTitle)){
		 * System.out.println("Test Passed!"); } else {
		 * System.out.println("Test Failed"); }
		 * 
		 * //close Fire fox driver.manage().timeouts().implicitlyWait(5,
		 * TimeUnit.SECONDS); driver.close();
		 */
		// Get the WebElement corresponding to the Email Address(TextField)	
		driver.get(baseUrl);
		
        WebElement email = driver.findElement(By.id("ContentPlaceHolder1_txtUserId"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));							

      
    	
        email.sendKeys("sharmin");					
        password.sendKeys("sharmin");	
     
        WebElement submit = driver.findElement(By.id("ContentPlaceHolder1_btnLogin"));	
        
		submit.click();
		
		
	}
}