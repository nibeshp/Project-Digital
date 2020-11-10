package testcase2;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Scroll {
	

	
	public static void main (String args []) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver ();
		driver.navigate().to("http://the-internet.herokuapp.com/");
		
		Thread.sleep(3000);
		
		WebElement actualtext = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[26]/a")) ;
		String expectedtext= "Infinite Scroll" ;
		
		//Click on 
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[26]/a")).click();
		//Thread.sleep(3000);
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//Scroll up
		js.executeScript("window.scrollBy(0,-2500)", "");
		
		//Assert Infinite Scroll Text
		
		Assert.assertEquals(actualtext, expectedtext);
		//System.out.println("Text present");
		
		
	   // if(driver.getPageSource().contains("Infinite Scroll")) {
	    	//System.out.println("Text Present");
	   // }
	    
	    //else {
	    //	System.out.println("Text not present");
	   // }
	    
	    //Assert.assertTrue(driver.getPageSource().contains("Infinite Scroll"));
	       
	   
	    		 
	
	   
       
      
      
			
		}
		
		
		
		

}

