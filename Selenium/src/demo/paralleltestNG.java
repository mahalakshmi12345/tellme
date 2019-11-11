package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.testng.annotations.Test;

public class paralleltestNG {
	WebDriver d;
	
	
	@Test
	public void test1()  {

		//System.out.println("i am the best   "+Thread.currentThread().getId() );
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
	     d=new ChromeDriver();
	     d.get("https://www.amazon.com/");
	     
		 //d.close();
		 
}
	@Test
	public void test2()  {
		
	//	System.out.println("i am the coolest person    "+Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		 d=new FirefoxDriver();
	     d.get("https://www.amazon.com/");
	  
		// d.close();
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}