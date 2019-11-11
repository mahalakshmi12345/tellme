package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parallel2 {

	
	public void google() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	     d.get("https://www.facebook.com/");
	     Thread.sleep(3000);
		 d.close();
}
	
	public void bing() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	     d.get("https://www.bing.com/");
	     Thread.sleep(3000);
		 d.close();
}
	
	public void amazon() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		 d.get("https://www.amazon.com/");
	     Thread.sleep(3000);
}
	
	
}
