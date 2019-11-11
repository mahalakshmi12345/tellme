package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver.exe");
		
		WebDriver d=new ChromeDriver();
		//WebDriver d=new FirefoxDriver();
		d.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		d.manage().window().maximize();
		d.findElement(By.id("identifierId")).sendKeys("srinivasanaahana");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("allah@143");
		d.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//textarea[@id=':8q']")).sendKeys("kirubashan26@gmail.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id=':88']")).sendKeys("document");
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("i will be sending you the documents soon");
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=':7y']")).click();
		
	}

}
