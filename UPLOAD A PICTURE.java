package thrmTest;

import java.awt.Desktop.Action;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		String url = "https://picresize.com/#";
		driver.get(url);
		
		WebElement upload = driver.findElement(By.id("im_file"));
		
		upload.sendKeys("C:\\Users\\RIU\\Desktop\\index.jpg");
		driver.findElement(By.partialLinkText("CONTINUE TO EDIT")).click();
		
		
		
		
 }	
		 
}