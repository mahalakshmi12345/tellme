package demo;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class documentation {

	


	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Mahalakshmi");
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Srinivasan");
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("sri Hreeva appartment,B block,telugupalayam pirivu,coimbatore-641025");
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Mahalakshmi.17@yahoo.com");
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8667410633");
		WebElement femaleradiobutton = d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		femaleradiobutton.click();
		WebElement chk1 = d.findElement(By.id("checkbox1"));
		chk1.click();
		WebElement chk2 = d.findElement(By.id("checkbox2"));
		chk2.click();
		WebElement chk3 = d.findElement(By.id("checkbox3"));
		chk3.click();
	
		
		
	//WebElement arabic = d.findElement(By.xpath("//a[text='Arabic']")).click();
		//d.findElement(By.xpath("//a[text='Bulgarian']")).click();
	
		
		
		Select l=new Select(d.findElement(By.id("Skills")));
		l.selectByIndex(8);
		Select f=new Select(d.findElement(By.id("countries")));
		f.selectByVisibleText("India");
		
		//d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]")).click();
		 Thread.sleep(5000);
		Select x=new Select(d.findElement(By.xpath("//*[@id=\"country\"]")));
		  //Select x=new Select(d.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")));
		x.selectByIndex (7);
		
		//Actions e=new Actions(d);
		//e.moveToElement(d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"))).click().perform();
		//e.selectbyvisibletext("India");
		
		
		//Select u =new Select(d.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")));
		//u.selectByIndex(5);
		
		
		Thread.sleep(2000);
		
		Select c=new Select(d.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		c.selectByValue("1995");
		
		Select k=new Select(d.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
		k.selectByVisibleText("November");
		
	
		
		Select m=new Select(d.findElement(By.id("daybox")));
		m.selectByIndex(17);
		
		d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("allah@143");
		d.findElement(By.id("secondpassword")).sendKeys("allah@143");
		
		File mk=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(mk, new File("F:\\selenium\\Screenshots\\MMM.png"));
		
		JavascriptExecutor ml=(JavascriptExecutor)d;
		ml.executeScript("document.body.style.zoom='50'%");
		
		
	
		
	}

}
