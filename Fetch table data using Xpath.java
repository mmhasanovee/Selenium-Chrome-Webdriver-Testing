package thrmTest;

import java.io.IOException;
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
		String url = "http://demo.guru99.com/test/write-xpath-table.html";
		driver.get(url);
		
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
		
		System.out.println(text);
		driver.quit();

	}

}
