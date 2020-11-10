package Testcase3;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class keypress {

	public static void main (String args []) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver ();
		driver.navigate().to("http://the-internet.herokuapp.com/");
		
		Thread.sleep(3000);
		//Click on Keypresses
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[31]/a")).click();
		Thread.sleep(3000);
		
		//Key press and assert 1
		
		Robot r = new Robot ();
		
		r.keyPress(KeyEvent.VK_1);
	    if(driver.getPageSource().contains("1")) {
	    	System.out.println("Text Present");
	    }
	    
	    else {
	    	System.out.println("Text not present");
	    }
	    
	    Assert.assertTrue(driver.getPageSource().contains("1"));
	    
	    Thread.sleep(3000);
	    
	  //Key press and assert 2
	    r.keyPress(KeyEvent.VK_2);
	    if(driver.getPageSource().contains("2")) {
	    	System.out.println("Text Present");
	    }
	    
	    else {
	    	System.out.println("Text not present");
	    }
	    
	    Assert.assertTrue(driver.getPageSource().contains("2"));
	    
	    Thread.sleep(3000);
	    
	    //Key press and assert 3
		r.keyPress(KeyEvent.VK_3);
	    if(driver.getPageSource().contains("3")) {
	    	System.out.println("Text Present");
	    }
	    
	    else {
	    	System.out.println("Text not present");
	    }
	    
	    Assert.assertTrue(driver.getPageSource().contains("3"));
	    
	    Thread.sleep(3000);
	    
	    //Key press and assert 4
		r.keyPress(KeyEvent.VK_4);
		if(driver.getPageSource().contains("4")) {
	    	System.out.println("Text Present");
	    }
	    
	    else {
	    	System.out.println("Text not present");
	    }
	    
	    Assert.assertTrue(driver.getPageSource().contains("4"));
	    
	    Thread.sleep(3000);
}
}
