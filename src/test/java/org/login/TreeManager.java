package org.login;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TreeManager extends UtilityBaseClass {
	
	@BeforeClass
	private void browserLaunch() {
     launchBrowser("Chrome");
	}
	
	@AfterClass
	private void closeBrowser() {
     quitBrowser();
	}
   @BeforeMethod
   private void startTime() {
   Date d=new Date();
   System.out.println(d);
}
   
   @AfterMethod
   private void endTime() {
	   Date d=new Date();
	   System.out.println(d);
}
   @Test
   private void Tc1() throws InterruptedException {
    launchUrl("http://54.206.66.198:8082/#/login");
    WebElement user = driver.findElement(By.id("username"));
    enterValue(user, "Shri");
    WebElement pass = driver.findElement(By.id("password"));
    enterValue(pass, "Admin@123");
    Thread.sleep(3000);
    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
    clickButton(login);
    Thread.sleep(5000);
    
}
   
   @Test
   private void Tc2() throws InterruptedException {
    launchUrl("http://54.206.66.198:8082/#/login");
    WebElement user = driver.findElement(By.id("username"));
    enterValue(user, "Sh12");
    WebElement pass = driver.findElement(By.id("password"));
    enterValue(pass, "Admin@123");
    
    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
    clickButton(login);
    Thread.sleep(3000);
    
}
   
   @Test
   private void Tc3() throws InterruptedException {
    launchUrl("http://54.206.66.198:8082/#/login");
    WebElement user = driver.findElement(By.id("username"));
    enterValue(user, "Shri");
    WebElement pass = driver.findElement(By.id("password"));
    enterValue(pass, "Admi123");
    
    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
    clickButton(login);
    
    Thread.sleep(3000);
}
   @Test
   private void Tc4() throws InterruptedException {
    launchUrl("http://54.206.66.198:8082/#/login");
    WebElement user = driver.findElement(By.id("username"));
    enterValue(user, "Shri123");
    WebElement pass = driver.findElement(By.id("password"));
    enterValue(pass, "Admin@13");
    
    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
    clickButton(login);
    Thread.sleep(3000);
    
}
   
   
   
   
   
   
}
